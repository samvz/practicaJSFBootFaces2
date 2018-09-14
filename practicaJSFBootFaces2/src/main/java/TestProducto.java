
import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
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
public class TestProducto {
    static ArrayList<Producto> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ProductoDAO prdao;
        prdao = new ProductoCtrlImpl();
        
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
//        
        // TODO code application logic here
    
        Producto pr=new Producto();
       
        pr.setId_producto("1");
        pr.setId_categoria("1");
        pr.setId_unimed("4");
        pr.setNombre("leche");
        pr.setDescripcion("blanco");
        pr.setCodigo("1111");
       if(prdao.createProducto(pr)){
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
