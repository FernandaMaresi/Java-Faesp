/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

import java.util.Scanner;

/**
 *
 * @author ferfe
 */
public class arrayPraMetodo {
    public static void exibeMatriz(int[][] Mat){

        System.out.println("\nA Matriz ficou: \n");
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("\t %d \t",Mat[linha][coluna]);
            }
            System.out.println();
        }
    }
    
    public static void exibeMatriz1(int[][] Mat){

        System.out.println("\nA Matriz ficou: \n");
        for(int linha=0 ; linha < 30 ; linha++){
            for(int coluna = 0; coluna < 30 ; coluna ++){
                System.out.printf("\t %d \t",Mat[linha][coluna]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
            int[][] total = new int[3][3];
            
            System.out.println("Matriz M[3][3]\n");
            
            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                   // total[linha][coluna]= soma.nextInt();
                }
            }
            
            exibeMatriz(total);
            
           
        }

}
