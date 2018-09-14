/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author Shamu
 */
@ManagedBean (name = "productoCtrl")
@SessionScoped
public class ProductoCtrl implements Serializable { 
    
    private Producto selected;
    private boolean est;
    ProductoDAO prdao;
    private ArrayList<Producto> list = new ArrayList<>();
    
    public ProductoCtrl() {
        this.selected = new Producto();
        this.prdao = new ProductoCtrlImpl();
    }
    
    public void createProducto(){
        if(prdao.createProducto(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
    public ArrayList<Producto> getList(){
    //cldao = new ClienteCtrlImpl();
    list = prdao.readProducto();
    return list;
            
    }
    public void updateProducto(){
      System.out.println("Producto = "+selected.getId_producto());  
      System.out.println("valor de edit = "+selected.getNombre());  
    if(prdao.updateProducto(selected)){
        System.out.println("actualizado");
    }else{
    System.out.println("error al momento de actualizar");
    }
    }
    
    public void deleteCliente(String id){
    if(prdao.deleteProducto(id)){
    System.out.println("elimado"+id);
    }else{
    System.out.println("error al momento de eliminar");
    }
}

    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
    
}

