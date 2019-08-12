/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Modelo.Lista;
import java.util.ArrayList;
/**
 *
 * @author wilme
 */
public class Controlador {
   Lista model =new Lista();
   ArrayList<Lista> save = new ArrayList<Lista>();
  
   /**
    * Este metodo agrega la palabra a la lista
    * @param item obtiene y guarda la palabra
    */
   public void addItem(String item){
       save.get(0).setLetraUno(item);
   }


    public Controlador() {
        save.add(model);
    }
    
    /**
     * Este metodo retorna los datos que se han guardado
     * @return muestra la lista de palabras
     */
   public ArrayList returnList(){
       return save.get(0).returnList();
   }
}
