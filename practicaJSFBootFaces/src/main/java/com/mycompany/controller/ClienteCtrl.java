/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shamu
 */
@ManagedBean (name = "clienteCtrl")
@SessionScoped
public class ClienteCtrl implements Serializable { 
    
    private Cliente selected;
    private boolean est;
    ClienteDAO cldao;
    private ArrayList<Cliente> list = new ArrayList<>();
    
    public ClienteCtrl() {
        this.selected = new Cliente();
        this.cldao = new ClienteCtrlImpl();
    }
    
    public void createCliente(){
        if(cldao.createCliente(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
    public ArrayList<Cliente> getList(){
    //cldao = new ClienteCtrlImpl();
    list = cldao.readCliente();
    return list;
            
    }

    public Cliente getSelected() {
        return selected;
    }

    public void setSelected(Cliente selected) {
        this.selected = selected;
    }
    
    
}

