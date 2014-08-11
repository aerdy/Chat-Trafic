/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chattrafict;

import javax.swing.JFrame;
import javax.xml.crypto.Data;

/**
 *
 * @author mrroot
 */
public class ChatTrafict extends  JFrame{

    public static void main(String []args){
       
          PieChart demo = new PieChart("Smartphone", "Traffic 2012/2013");
          demo.pack();
          demo.setVisible(true);
    }
    
}
