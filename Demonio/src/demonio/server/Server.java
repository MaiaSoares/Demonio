/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonio.server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author maian
 */
public class Server extends Thread {
    public void run()
    {
        try 
        {
            ServerSocket server = new ServerSocket(8000);
            while(true)
            {
                System.out.println("Server aguardando conexao");
                Socket socket = server.accept();
                System.out.println("Conexao recebida");
                //GerencConect gc = new GerencConect(socket, this);
                //conexoes.add(gc);
                
            }
        } catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
    
    
}
