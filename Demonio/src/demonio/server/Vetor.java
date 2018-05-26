/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonio.server;

/**
 *
 * @author maian
 */
public class Vetor {
    private String[] cidade = new String[5];
    private int[][] matriz = new int[5][5];
    
    public Vetor()
    {
        cidade[0] = "Miami";
        cidade[1] = "Orlando";
        cidade[2] = "Fost Lauderdale";
        cidade[3] = "Atlanta";
        cidade[4] = "Nova Orleans";
        
        for(int i = 0; i<5; i++)
        {
            for(int j=0; j<5; j++)
                matriz[i][j] = 0;
        }
        matriz[0][1] = 440;
        matriz[0][4] = 470;
        matriz[1][2] = 180;
        matriz[1][3] = 230;
        matriz[1][4] = 640;
        matriz[2][3] = 30;
        matriz[3][4] = 860;
        for(int i = 0; i<5; i++)
        {
            for(int j=0; j<i; j++)
                matriz[i][j] = matriz[j][i];
        }
        
    }
    
    private int getPosicaoCidade(String cidade){
        int posicao;
        int i=0;
        
        while(true){
            if(cidade.equals(this.cidade[i]))
            {
                posicao = i;
                break;
            }
                
            i++;
        }
        
        return posicao;  
    }  
    
    public String[] getMenorCaminho(String cidade){
        
        int posicao = this.getPosicaoCidade(cidade);
        
        
        return null; 
    }
}
