/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ferfe
 */
public class Teste6 {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       ArrayList<String> bandas = new ArrayList<String> ();
       ArrayList<String> arrayBase = new ArrayList<String> ();
       ArrayList<String> arrayTeste = new ArrayList<String> ();
            
            bandas.add("Rush");
            System.out.print( "Adicionando a banda Rush: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
           
            System.out.print( "Quem está na índice 0: " );
            System.out.println( bandas.get(0) );
            
        System.out.println("======================== Base ==========================================");
        File arquivoBase = new File("C:\\Users\\ferfe\\OneDrive\\Documentos\\iris2.csv");
        
        try {
            //ler o arquivo e imprime
            FileReader ler = new FileReader(arquivoBase);
            BufferedReader lerb = new BufferedReader(ler);
            
            //salva as linhas do arquivo
            String linha = lerb.readLine();
             
//            while(linha != null){
//                //retira o token (,)
//               String[] virgulas = linha.split(",");
//               arrayBase.add(linha);
//                linha = lerb.readLine();
//                System.out.println(virgulas[0]
//                +"   "+virgulas[1]
//                +"   "+virgulas[2]
//                +"   "+virgulas[3]
//                +"   "+virgulas[4]);
//                //recebe cada linha do arquivo
                //separa os campos entre as virgulas de cada linha
                //imprime a coluna que quiser
           
            //}
             String[] token = linha.split(",");
            while(linha != null){
               
               
                linha = lerb.readLine();
//                System.out.println(token[0]
//                +"   "+token[1]
//                +"   "+token[2]
//                +"   "+token[3]
//                +"   "+token[4]);
                for(int i = 0; i<token.length; i++) {
                System.out.println(token[i]);
                    }
                  arrayTeste.add(linha);
                int i = 0;
                  System.out.println(arrayTeste.get(i) );
                   System.out.println("Teste concluido");
             System.out.println(arrayTeste.get(0) );
            }
             
            
            //String nome = "Fernanda;Borges";
//            String [] nomes = nome.split(";");
//            System.out.println(nomes[1]);
           
           
             lerb.close();  
        } catch (FileNotFoundException ex) {
            System.out.println("erro ao ler a base");
        }  
        
        
        
        
    }
}
