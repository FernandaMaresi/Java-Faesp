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
public class Teste5 {
    
     public static void main(String[] args){
        
        int matriz[][] ={ {1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        System.out.println("Matriz impressa");
        
        for(int i = 0; i < 3; i++)
	{
		// loop das linhas
		for(int j = 0; j < 3; j++)
		{
                     System.out.print(matriz[i][j]+" ");
                }
                  System.out.println(" ");  
                }
       
        
        
        // loop para passar a matriz para um vetor
	int[] vetor = new int[9]; // 3 x 3 = 9

	// passando a matriz para o vetor
	int n = 0;
	for(int l = 0; l < 3; l++)
	{
		// loop das linhas
		for(int c = 0; c < 3; c++)
		{
			// loop das colunas
			vetor[n] = matriz[l][c];
			n++;
		}
	}
        
        System.out.println("o vetor: \n");
        
	for( n = 0; n < 9; n++){
            System.out.print( vetor[n]);
	}

//	delete []vetor;
//	system("pause");
//	return 0;
//
//      
        System.out.println("teste");
    }
     
     public static void exibeMatriz(int[][] Mat){

        System.out.println("\nA Matriz ficou: \n");
        for(int linha=0 ; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 3 ; coluna ++){
                System.out.printf("\t %d \t",Mat[linha][coluna]);
            }
            System.out.println();
        }
    
    
    
            int[][] matriz = new int[3][3];
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Matriz M[3][3]\n");
            
            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                    matriz[linha][coluna]=entrada.nextInt();
                }
            }
            
            exibeMatriz(Mat);
            
     }
}
