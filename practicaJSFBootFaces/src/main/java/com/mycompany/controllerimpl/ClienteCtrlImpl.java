/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompany.configbd.Conexionbd;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shamu
 */
public class ClienteCtrlImpl implements ClienteDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Cliente> listDatos;

    public ClienteCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createCliente(Cliente cl) {
        sql="INSERT INTO public.cliente( nombres_razon_social, telefono, correo, dni_ruc)"
                + "VALUES('"+cl.getNombres_razon_social()+"','"+cl.getTelefono()+"','"+cl.getCorreo()+"','"+cl.getDni_ruc()+"')";
        
    return cx.executeInsertUpdate(sql);   
    }

    @Override
    public ArrayList<Cliente> readCliente() {
        listDatos =new ArrayList<>();

        sql = "SELECT id_cliente, nombres_razon_social, telefono, correo, dni_ruc"
                + "    FROM public.cliente";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Cliente(rs.getString("id_cliente"),rs.getString("nombres_razon_social"),rs.getString("telefono"),rs.getString("correo"),rs.getString("dni_ruc")));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

//    @Override
//    public boolean updateCliente(Cliente cl) {
//         sql="UPDATE public.persona SET"
//                +" first_name='"+per.getId_persona()+"', dni='"+per.getDni()+"' "
//                + " WHERE id_persona="+per.getId_persona()+" ";      
//    return false;    
//    }

    @Override
    public boolean deleteCliente(String id) {
        sql="DELETE FROM public.cliente"
                + "WHERE id_cliente="+id+"";
    return cx.executeInsertUpdate(sql);    
    }

    @Override
    public void createCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCliente(Cliente cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
    
}
