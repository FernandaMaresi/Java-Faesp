/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ferfe
 */
public class Animal {
    
    public double [] Features;
    public String Name;
    //name , altura,peso
    public Animal(){}
    Animal(String name, double height, double weight, double age, double width, double filhote){
        
        Features = new double[5];
        this.Name = name;
        Features[0] = height;
        Features[1] = weight;
        Features[2] = age;
        Features[3] = width;
        Features[4] = filhote;
       
        
    }
}


