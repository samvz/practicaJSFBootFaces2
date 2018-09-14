
import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.model.Venta;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shamu
 */
public class TestVenta {
    static ArrayList<Venta> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         VentaDAO vndao;
        vndao = new VentaCtrlImpl();
        
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
//        
        // TODO code application logic here
    
        Venta vn=new Venta();
       
        vn.setId_venta("1");
        vn.setFecha("14/09/2018");
        vn.setConcepto("0");
        vn.setIgv("2");
        vn.setTotal("4");
        vn.setSub_total("2");
        vn.setId_cliente_direccion("2");
        vn.setId_vendedor("2");
       if(vndao.createVenta(vn)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       }
        
 
//        if(prdao.deleteProducto("5")){
//            System.out.println("elimado");
//        }else{
//        System.out.println("error al eliminar");
//        }
    }
    
}
