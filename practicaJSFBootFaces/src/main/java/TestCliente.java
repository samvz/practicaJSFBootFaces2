
import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.model.Cliente;
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
public class TestCliente {
    static ArrayList<Cliente> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ClienteDAO cldao;
        cldao = new ClienteCtrlImpl();
        //list = cldao.readCliente();
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
//        
        // TODO code application logic here
    
        Cliente cl=new Cliente();
       
        cl.setNombres_razon_social("richard");
        cl.setTelefono("56421");
        cl.setCorreo("samuel");
        cl.setDni_ruc("154523");
       if(cldao.createCliente(cl)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       }
    }
    
}
