/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferfe
 */
public class JavaApplication_Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Cria um diretório
//        File file  = new File("novo diretório");
//        //file.mkdir();
//        //apaga um diretório
//        file.delete();


        //Cria um arquivo com qualquer extensão
//        //File arquivo = new File("arquivo.txt");
//        //try{
//            //arquivo.createNewFile();
//            arquivo.delete();
//       // }   
//        //catch(IOException ex){
//             // System.out.println("Erro ao criar o arquivo");      
//            //}



            //Ler o arquivo e imprime 
//            File arquivo = new File("arquivo.txt");         
//        try {
//            FileReader ler = new FileReader(arquivo);
//            
//            BufferedReader lerb = new BufferedReader(ler);
//            //for para ler
//            String linha = lerb.readLine();
//            
//           while(linha != null){
//               System.out.println(linha);
//               linha = lerb.readLine();
//           }
//        } catch (FileNotFoundException ex) {
//            
//        }


            //Escrever em um arquivo
            File arquivo= new File("arquivo.txt");
            
            try{
                FileReader ler = new FileReader(arquivo);
                
                FileWriter fileWriter = new FileWriter(arquivo,true);
                BufferedWriter escrever = new BufferedWriter(fileWriter);
                escrever.write("escrevendo"); 
                escrever.newLine();
                
                escrever.close();
                fileWriter.close();
                
                BufferedReader lerb = new BufferedReader(ler);
                String linha = lerb.readLine();
                
                while(linha != null){
                    System.out.println(linha);
                    linha = lerb.readLine();
                }
                //Mostrar todos os diretórios
                File fil = new File("/");

                File fi[] = fil.listFiles();
                
                for(int i = 0 ; i< fi.length;i++){
                    //System.out.println(fi[i]);
                }
            }catch(IOException ex){
                
            }
            
//                  
    }
    
}

//Cria um Diretório 
//Cria um arquivo
//Apagar um diretório /arquivo 
//Ler arquivos e diretórios
//Escrever em arquivos 

//File; file arquivo 
//FileWriter; writer = escrever
//BufferWriter

//String nome = "Fernanda;Borges";
//            String [] nomes = nome.split(";");
//            System.out.println(nomes[1]);