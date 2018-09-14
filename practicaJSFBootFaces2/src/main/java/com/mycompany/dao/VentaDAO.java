/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Venta;
import java.util.ArrayList;

/**
 *
 * @author Shamu
 */
public interface VentaDAO {
    
    public boolean createVenta(Venta vn);
    public ArrayList<Venta> readVenta();
    public boolean updateVenta(Venta vn);
    public boolean deleteVenta(String id);

    public void createVenta();
    
}
