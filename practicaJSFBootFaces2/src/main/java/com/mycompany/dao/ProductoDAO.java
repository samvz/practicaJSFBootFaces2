/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import java.util.ArrayList;
import com.mycompany.model.Producto;

/**
 *
 * @author Shamu
 */
public interface ProductoDAO {
    public boolean createProducto(Producto pr);
    public ArrayList<Producto> readProducto();
    public boolean updateProducto(Producto pr);
    public boolean deleteProducto(String id);

    public void createProducto();
    
}
