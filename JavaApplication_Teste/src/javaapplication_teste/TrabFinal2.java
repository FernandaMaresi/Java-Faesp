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
public class TrabFinal2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<Flor> flores = new ArrayList<Flor>();
        List<FlorTeste> flores_teste = new ArrayList<FlorTeste>();
         
        //IRIS SETOSA
        flores.add(new Flor("Iris-setosa",5.1 //comprimento sepala
        ,3.5 //largura da sepala
        ,1.4 //comprimento da sepala
        ,0.2 ));//largura da sepala
        flores.add(new Flor("Iris-setosa",4.9,3.0,1.4,0.2 ));
        flores.add(new Flor("Iris-setosa",4.7,3.2,1.3,0.2 ));
        flores.add(new Flor("Iris-setosa",4.6,3.1,1.5,0.2 ));
//        flores.add(new Flor("Iris-setosa",5.0,3.6,1.4,0.2 ));
//        flores.add(new Flor("Iris-setosa",5.4,3.9,1.7,0.4 ));
//        flores.add(new Flor("Iris-setosa",4.6,3.4,1.4,0.3 ));
//        flores.add(new Flor("Iris-setosa",5.0,3.4,1.5,0.2 ));
//        flores.add(new Flor("Iris-setosa",4.4,2.9,1.4,0.2 ));

        //IRIS VERSICOLOR
        flores.add(new Flor("Iris- Versicolor", 5.5, 2.4, 3.7, 1.0));
        flores.add(new Flor("Iris- Versicolor", 5.8, 2.7, 3.9, 1.2));
        flores.add(new Flor("Iris- Versicolor", 6.0, 2.7, 5.1, 1.6));
        flores.add(new Flor("Iris- Versicolor", 5.4, 3.0, 4.5, 1.5));
//        flores.add(new Flor("Iris- Versicolor", 6.0, 3.4, 4.5, 1.6));
//        flores.add(new Flor("Iris- Versicolor", 6.7, 3.1, 4.7, 1.5));
//        flores.add(new Flor("Iris- Versicolor", 6.3, 2.3, 4.4, 1.3));
//        flores.add(new Flor("Iris- Versicolor", 5.6, 3.0, 4.1, 1.3));
//        flores.add(new Flor("Iris- Versicolor", 5.5, 2.5, 4.0, 1.3));
       
        
        //IRIS VIRGINICA
        flores.add(new Flor("Iris- Virginica",  6.1, 3.0, 4.9, 1.8));
        flores.add(new Flor("Iris- Virginica",  6.4, 2.8, 5.6, 2.1));
        flores.add(new Flor("Iris- Virginica",  7.4, 2.8, 6.1, 1.9));
        flores.add(new Flor("Iris- Virginica",  7.9, 3.8, 6.4, 2.0));
//        flores.add(new Flor("Iris- Virginica",  7.2, 3.0, 5.8, 1.6));
//        flores.add(new Flor("Iris- Virginica",  7.7, 3.0, 6.1, 2.3));
//        flores.add(new Flor("Iris- Virginica",  6.3, 3.4, 5.6, 2.4));
//        flores.add(new Flor("Iris- Virginica",  6.4, 2.8, 5.6, 2.2));
//        flores.add(new Flor("Iris- Virginica",  6.3, 2.8, 5.1, 1.5));
       
         
        
                
        double[] flor = {4.9, 3.0, 1.4,0.2};
        
        
        //Classifier(flores, flor);
          flores.add(new Flor("Iris- Virginica",  6.1, 3.0, 4.9, 1.8));
        //}
        
        //IRIS SETOSA
        flores_teste.add(new FlorTeste("Iris-setosa",5.1 //comprimento sepala
        ,3.5 //largura da sepala
        ,1.4 //comprimento da sepala
        ,0.2 ));//largura da sepala
        
        flores_teste.add(new FlorTeste("Iris-setosa",5.1 //comprimento sepala
        ,3.5 //largura da sepala
        ,1.4 //comprimento da sepala
        ,0.2 ));//largura da sepala
        flores_teste.add(new FlorTeste("Iris-setosa",5.1 //comprimento sepala
        ,3.5 //largura da sepala
        ,1.4 //comprimento da sepala
        ,0.2 ));//largura da sepala
        
         System.out.println("A Flor é "+Classifier(flores, flores_teste));
         
         for(int i = 0; i<=flores_teste.size();i++){
             System.out.println("Lista teste"+flores_teste.get(i).Name);
         }
         
        
    }
    
    //Classificador da flor
    private static  String Classifier(List<Flor> flores, List<FlorTeste> flores_teste){
        
        double value = 0.0;
        double mimValue = Double.MAX_VALUE;
        String label = null;
        
        for(int i = 0 ;i < flores.size();i++){
            for(int j=0; j< flores_teste.size(); j++){
                value = Distance(flores.get(i).Features,flores_teste.get(j).Features);
            }
            
            if(value < mimValue){
                mimValue = value;
                label = flores.get(i).Name;
            }
            System.out.println("Distânce atual é : "+ value +" Flor : "+ flores.get(i).Name);
            
               
        }
       return label;
        
    }
    private static double Distance(double[] a, double[] b){
        double sum = 0;
        for(int i = 0; i<a.length;i++){
            for(int j= 0; j< b.length;j++){
                sum+= Math.pow(a[i] -  b[j],2);
                 
            }
           
           
        }
         return sqrt(sum);
    };
}
