/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author wilme
 */
 
public class Lista {
    ArrayList<String> list=new ArrayList<String>();
    private String letraUno;
    private String jlist;

    /**
     * Este metodo obtiene la letra en formato String
     * @return String obtiene una palabra la cual es concatenada
     */
    public String getLetraUno() {
        return letraUno;
    }

    /**
     * Este metodo envia la letra en formato String
     * @param letraUno letra requerdiad para enviar String
     */
    public void setLetraUno(String letraUno) {
        list.add(letraUno);
    }

    /**
     * Este metodo obtiene la lista en formato String
     * @return String obtiene un listado de palabras
     */
    public String getJlist() {
        return jlist;
    }
  
    /**
     * Este metodo envia la lista en formato String
     * @param jlist lista requerdiad para enviar String
     */
    public void setJlist(String jlist) {
        this.jlist = jlist;
    }

    /**
     * Este metodo permite almacenar los datos retornando la lista
     * @return ArrayList alamacena un texto 
     */
    public ArrayList returnList(){
        return this.list;
    }
}
