/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabandrefinal;

/**
 *
 * @author ferfe
 */
public class Arquivo {
    
   // public static void main(String [] args){
        
        String ArqConfig = "conf.con";
        
        String nome = "Gilberto";
        String login = "admin";
        String versao = "1.0.5";
        
        String print = nome+";"+login+";"+versao;
        //Arquivo2.Write(ArqConfig,print);
        
        
        String conteudo = Arquivo2.Read(ArqConfig);
        String c1 = conteudo.split(";")[0];
        String c2 = conteudo.split(";")[1];
        String c3 = conteudo.split(";")[2];
      
        
//        System.out.println("Nome: "+c1);
//        System.out.println("Login: "+c2);
//       System.out.println("Versão: "+c3);
    
}
