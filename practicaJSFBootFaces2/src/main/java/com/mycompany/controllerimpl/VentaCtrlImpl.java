/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompany.configbd.Conexionbd;
import com.mycompany.dao.VentaDAO;
import com.mycompany.model.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shamu
 */
public class VentaCtrlImpl implements VentaDAO{
       Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Venta> listDatos;

    public VentaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createVenta(Venta vn) {
        sql="INSERT INTO public.venta( id_venta, fecha, concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor)"
                + "VALUES('"+vn.getFecha()+"',"+vn.getConcepto()+","+vn.getIgv()+",'"+vn.getTotal()+"','"+vn.getSub_total()+"',"+vn.getId_cliente_direccion()+","+vn.getId_vendedor()+")";
        
    return cx.executeInsertUpdate(sql); 
    }

    @Override
    public ArrayList<Venta> readVenta() {
        listDatos =new ArrayList<>();

        sql = "SELECT id_venta, fecha, concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor"
                + "    FROM public.venta";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Venta(rs.getString("id_venta"),rs.getString("fecha"),rs.getString("concepto"),rs.getString("igv"),rs.getString("total"),rs.getString("sub_total"),rs.getString("id_cliente_direccion"),rs.getString("id_vendedor")));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateVenta(Venta vn) {
         sql="UPDATE public.venta SET"
                +" concepto='"+vn.getId_venta()+"', codigo='"+vn.getFecha()+"' "
                + " WHERE id_venta="+vn.getId_venta()+" ";      
    return false;    
    }

    @Override
    public boolean deleteVenta(String id) {
        sql="DELETE FROM public.venta "
                + "WHERE id_venta="+id+"";
    return cx.executeInsertUpdate(sql);    
    }



    @Override
    public void createVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}

