/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.model.Venta;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shamu
 */
@ManagedBean (name = "ventaCtrl")
@SessionScoped
public class VentaCtrl implements Serializable { 
    
    private Venta selected;
    private boolean est;
    VentaDAO vndao;
    private ArrayList<Venta> list = new ArrayList<>();
    
    public VentaCtrl() {
        this.selected = new Venta();
        this.vndao = new VentaCtrlImpl();
    }
    
    public void createVenta(){
        if(vndao.createVenta(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
    public ArrayList<Venta> getList(){
    //cldao = new ClienteCtrlImpl();
    list = vndao.readVenta();
    return list;
            
    }
    public void updateVenta(){
      System.out.println("Venta = "+selected.getId_venta());  
      System.out.println("valor de edit = "+selected.getConcepto());  
    if(vndao.updateVenta(selected)){
        System.out.println("actualizado");
    }else{
    System.out.println("error al momento de actualizar");
    }
    }
    
    public void deleteVenta(String id){
    if(vndao.deleteVenta(id)){
    System.out.println("elimado"+id);
    }else{
    System.out.println("error al momento de eliminar");
    }
}

    public Venta getSelected() {
        return selected;
    }

    public void setSelected(Venta selected) {
        this.selected = selected;
    }
    
    
}


