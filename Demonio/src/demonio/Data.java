/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonio;

/**
 *
 * @author maian
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public String toString()
    {
        String ret = "";
        ret = dia+"/"+mes+"/"+ano;
        return ret;
    }
    
    public String getData()
    {
        return this.toString();
    }
    
    public void setData(String data){
        
    }
}
