/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabandrematriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ferfe
 */
public class TrabAndreMatriz {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String token [] [] = new String [30] [30];
        String token2 [] [] =  new String [30] [30];
        int total [] [] = new int [30] [30];
                System.out.println("teste");
        double soma = 0;
     
        
          System.out.println("======================== Base ==========================================");
        File arquivoBase = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\iris2.csv");
        
        try {
            //ler o arquivo e imprime
            FileReader ler = new FileReader(arquivoBase);
            BufferedReader lerb = new BufferedReader(ler);
            //salva as linhas do arquivo
             String linha = lerb.readLine();
             int k =0;
            while(linha != null){    
                token[k] = linha.split(",");
                linha = lerb.readLine();
                //arrayTeste.add;
                System.out.println(token[0]+"    "+token[1]+"   "+token[2]+"   "+ token[3]+"    "+token[4]);
                k++;
            }
           
            lerb.close();  
        } catch (FileNotFoundException ex) {
            System.out.println("erro ao ler a base");
        }  
    
    
          System.out.println("======================== Teste ==========================================");
        File arquivoTeste = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\irisTeste.csv");
        
        try {
            //ler o arquivo e imprime
            FileReader ler2 = new FileReader(arquivoTeste);
            BufferedReader lerb2 = new BufferedReader(ler2);
            //salva as linhas do arquivo
             String linha = lerb2.readLine();
             int k1 = 0;
            while(linha != null){    
                token2[k1]  = linha.split(",");
                 
                linha = lerb2.readLine();
                //arrayTeste.add;
                //System.out.println(token2[0]+"    "+token2[1]+"   "+token2[2]+"   "+ token2[3]+"    "+token2[4]);   
                k1++;
            }
           
            lerb2.close();  
        } catch (FileNotFoundException ex) {
            System.out.println("erro ao ler a base");
        }  
        
        for(int i = 0; i<= 28; i++){
            for(int j = 0; j<= token[j].length;j++){
                
                       double value1 = Math.pow(Double.valueOf(token2[i][0]).doubleValue()- Double.valueOf(token [j][0]).doubleValue(),2);
                       double value2 = Math.pow(Double.valueOf(token2[i][1]).doubleValue()- Double.valueOf(token [j][1]).doubleValue(),2);
                       double value3 = Math.pow(Double.valueOf(token2[i][2]).doubleValue()- Double.valueOf(token [j][2]).doubleValue(),2);
                       double value4 = Math.pow(Double.valueOf(token2[i][3]).doubleValue()- Double.valueOf(token [j][3]).doubleValue(),2);
                       

             soma = value1+ value2+ value3+ value4;
             soma = Math.sqrt(soma);
             
             //total  [i][j] = soma;
              System.out.println("As distâncias são: "+total[i][j]+" ");
              
   
            }      
       
        }
    
    }
    
}
