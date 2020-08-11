/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferfe
 */
public class Principal {
    
    public static void main(String [] args){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("gato", 0.15 //altura em metros
        ,1.2 //peso em kilos
        ,2.0 //iade em anos
        ,0.25 //metros
        ,0.0)); // filhote 0 - false && 1 true
        
        animals.add(new Animal("cachorro", 0.45, 7.0, 5.0, 0.6, 0.0));
        animals.add(new Animal("gato", 0.1, 0.8, 0.5, 0.2, 1.0));
        
        double[] cat = {0.2, 1.3, 1.5,0.3,0.0};
        double[] cachorrinho = {0.2, 1.3, 1.5,0.3,0.0};
        Classifier(animals, cat);
        Classifier(animals, cachorrinho);
    }
    
     private static  void Classifier(List<Animal> animals, double [] features){
        
        double value = 0.0;
        for(int i = 0 ;i < animals.size();i++){
            value = Distance(animals.get(i).Features,features);
            System.out.println("Distânce atual é : "+ value+" "+animals.get(i).Name);
        }
       
        
    }
    private static double Distance(double []a, double[]b){
        double sum = 0;
        for(int i = 0; i<a.length;i++){
            sum+= Math.pow(a[i] -  b[i],2);
           
        }
         return sqrt(sum);
    };
    
}
    
