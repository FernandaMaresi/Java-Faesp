/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
        //Classifier(animals, cat);
        System.out.println("Animal é "+Classifier(animals, cat));
    }
    //void
    private static  String Classifier(List<Animal> animals, double [] features){
        
        double value = 0.0;
        double mimValue = Double.MAX_VALUE;
        String label = null;
        
        for(int i = 0 ;i < animals.size();i++){
            value = Distance(animals.get(i).Features,features);
            if(value < mimValue){
                mimValue = value;
                label = animals.get(i).Name;
            }
           // System.out.println("Distânce atual é : "+ value+ "  Animal : "+ animals.get(i).Name);
                //Distânce atual é : 0.51478150704935  Animal : gato
                //Distânce atual é : 6.700186564566692  Animal : cachorro
                //Distânce atual é : 1.5066519173319364  Animal : gato
        }
       return label;
        
    }
    private static double Distance(double []a, double[]b){
        double sum = 0;
        for(int i = 0; i<a.length;i++){
            sum+= Math.pow(a[i] -  b[i],2);
           
        }
         return sqrt(sum);
    };
    
}
    
