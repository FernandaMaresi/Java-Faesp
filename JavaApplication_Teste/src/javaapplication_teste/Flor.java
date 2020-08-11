/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_teste;

/**
 *
 * @author ferfe
 */
public class Flor {
    public double [] Features;
    public String Name;
    public Flor(){}
   
    //comprimento sepala, largura da sepala, comprimento da sepala , largura da sepala, nome
    Flor(String name, double sepalLength, double sepalWidth, double petalLength, double petalWidth){   
        Features = new double[4];
        this.Name = name;
        Features[0] = sepalLength;
        Features[1] = sepalWidth;
        Features[2] = petalLength;
        Features[3] = petalWidth;
    }

}
