/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Shamu
 */
public interface ClienteDAO {
     public boolean createCliente(Cliente cl);
    public ArrayList<Cliente> readCliente();
    public boolean updateCliente(Cliente cl);
    public boolean deleteCliente(String id);

    public void createCliente();
}
