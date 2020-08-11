/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ferfe
 */
public class JavaTrabAndre {
    
     String linha = "";
    String csvDiv = ";";


    /**
     * @param
     */
    public static void main(String[] args) {
            
       //abre um arquivo e cria um file
       File arquivo1 = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\iris2.csv");
       File arquivo2 = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\irisTeste.csv");
       
        double[] base = new double[200];
        try{
            
            //cria um scanner para ler o arquivo
            Scanner ler1 = new Scanner(arquivo1);
            Scanner ler2 = new Scanner(arquivo2);
            
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivoArmazenadas1 = new String();
            String linhasDoArquivoArmazenadas2 = new String();
            
            //ignora a primeira linha do arquivo
            ler1.nextLine();
             ler2.nextLine();
            
            //percorre todo o arquivo
            System.out.println("====================  Base de dados ============================");
            while(ler1.hasNext()){
                
                //recebe cada linha do arquivo
                linhasDoArquivoArmazenadas1 = ler1.nextLine();
                
                //separa os campos entre as virgulas de cada linha
                String[] virgulas = linhasDoArquivoArmazenadas1.split(",");
                
                //imprime a coluna que quiser
                
                System.out.println(virgulas[0]
                +"   "+virgulas[1]
                +"   "+virgulas[2]
                +"   "+virgulas[3] 
                +"   "+virgulas[4]);
                //Double.parseDouble(linhasDoArquivoArmazenadas1);
            }
            
            for(int i =0; i< 30; i++){
                System.out.println(base[i]);
            }
            System.out.println(" ");
            System.out.println("============================Base de teste============================");
            System.out.println("=============== ");

            
            while(ler2.hasNext()){
                
                //recebe cada linha do arquivo
                linhasDoArquivoArmazenadas2 = ler2.nextLine();
                
                //separa os campos entre as virgulas de cada linha
                String[] virgulas2 = linhasDoArquivoArmazenadas2.split(",");
                
                //imprime a coluna que quiser
                System.out.println(virgulas2[0]
                +"   "+virgulas2[1]
                +"   "+virgulas2[2]
                +"   "+virgulas2[3] 
                +"   "+virgulas2[4]);

            }
        
        }catch(FileNotFoundException e){
            
        }
        
       
        
        System.out.println(" ===============================================");
        System.out.println(" ======= Cálculo das bases============");
        
        
    }
    
    
}
