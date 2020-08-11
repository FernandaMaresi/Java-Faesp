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
public class Teste2 {
    //cria o array da linha
    String linha = "";
    //cria o divisor
    String csvDiv = ";";


    /**
     * @param
     */
    public static void main(String[] args) {
            
       //abre um arquivo e cria um file
       File arquivo1 = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\iris2.csv");
       
        try{
            
            //cria um scanner para ler o arquivo
            Scanner ler1 = new Scanner(arquivo1);
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivoArmazenadas1 = new String(); 
            //ignora a primeira linha do arquivo
            ler1.nextLine();
             
            
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
                

            }

            
          
        }catch(FileNotFoundException e){
            
        }
    
        
    }
    
}
