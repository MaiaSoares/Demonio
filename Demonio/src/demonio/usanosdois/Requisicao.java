/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonio.usanosdois;

import demonio.usanosdois.Comando;
import java.io.Serializable;

/**
 *
 * @author Neka
 */
public class Requisicao implements Serializable{
    Comando comando;
    Object[] pacote;
}
