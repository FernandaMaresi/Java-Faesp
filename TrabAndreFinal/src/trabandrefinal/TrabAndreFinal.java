/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabandrefinal;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static trabandrefinal.TrabAndreFinal.distancias;

/**
 *
 * @author ferfe
 */
public class TrabAndreFinal {

    /**
     * @param args the command line arguments
     */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        List<Flor> flores = new ArrayList<Flor>();
       List<Double> lista = new ArrayList<Double>();
       List<Flor> lista_itens = new ArrayList<Flor>();
         
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
       
         
//        double [] textoParaOrdenar;
//        //IRIS SETOSA
//        //double[] flor_teste1 = {5.1, 3.5, 1.4,0.2};
        double[] flor_teste0 = new double[4];
         flor_teste0[0] = 4.8;
         flor_teste0[1] = 3.5;
         flor_teste0[2] = 1.4;
         flor_teste0[3] = 0.2;
//        
//         Arrays.sort(flor_teste0);
//         
//         for(double i: flor_teste0){
//             System.out.println(" Testando"+i);
//         }
//         
//          double[] flor_teste2 = new double[4];
//         flor_teste2[0] = 4.7;
//         flor_teste2[1] = 3.2;
//         flor_teste2[2] = 1.3;
//         flor_teste2[3] = 0.2;
//        
//         Arrays.sort(flor_teste2);
//        //double[] flor_teste2 = {4.7, 3.2, 1.3,0.2};
// 
//         for(double i: flor_teste2){
//             System.out.println(" Testando"+i);
//         }
//         double[] flor_teste1 = new double[4];
//         flor_teste1[0] = 5.1;
//         flor_teste1[1] = 3.5;
//         flor_teste1[2] = 1.4;
//         flor_teste1[3] = 0.2;
//        
//         Arrays.sort(flor_teste1);
//         
//         for(double i: flor_teste1){
//             System.out.println(" Testando"+i);
//         }
////         
//         int k = 5;
//        System.out.println("verificando K = " + k);
//        for (int i = 0; i < k; i++) {
//            if (flor_teste0[i] != 0.0) {
//                System.out.println(" Resultado " + flor_teste0[i]);
//            } else {
//                k = k ++;
//            }
////        }
        //double[] flor_teste0 = {5.1, 3.5, 1.4,0.2};
       double[] flor_teste1 = {5.1, 3.5, 1.4,0.2};
       double[] flor_teste2 = {4.7, 3.2, 1.3,0.2};
       double[] flor_teste3 = {4.8, 3.0, 1.3,0.2};

      
        
        //IRIS VERSICOLOR
        double[] flor_teste4 = {6.6, 3.0, 4.4,1.4};
        double[] flor_teste5 = {6.8, 2.8, 4.8,1.4};
        double[] flor_teste6 = {6.7, 3.0, 5.0,1.7};
//        
        //IRIS VIRGINICA
        double[] flor_teste7 = {6.7, 3.0, 5.2,2.3};
        double[] flor_teste8 = {6.3, 2.5, 5.0,1.9};
       double[] flor_teste9 = {6.5, 3.0, 5.2,2.0};
//

        
      
       //lista.add(ClassificacaoOrdenar(flores, flor_teste0));
      //lista.add(ClassificacaoOrdenar(flores, flor_teste4));
      // lista.add(ClassificacaoOrdenar(flores, flor_teste7));
       
        System.out.println("As distâncias classificadas são: "+lista);
        
        
        System.out.println("A Flor é "+Classifier(flores, flor_teste0)+"\n");
//        System.out.println(" AS DISTÂNCIAS SÃO: ");
//        
        System.out.println("A Flor é "+Classifier(flores, flor_teste1));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste2));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste3));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste4));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste5));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste6));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste7));
        System.out.println(" ===================================================");
        System.out.println("A Flor é "+Classifier(flores, flor_teste8));
        System.out.println(" ===================================================");
       System.out.println("A Flor é "+Classifier(flores, flor_teste9));
        
        //Classifier(flores, flor);
          //flores.add(new Flor("Iris- Virginica",  6.1, 3.0, 4.9, 1.8));
        //for(int i=0;i<flores.size();i++){
            //System.out.println(ListaAlunos.get(i).getDados()); 
            //Flor temp = flores.get(i);
           
        //}
        
        
    }
    static List<Double> distancias = new ArrayList<>();
//       int l ;
//            
//            (for l = 0 ;l<= distancias.size();l++){
//                
//            }
    //Classificador da flor
    private static  String Classifier(List<Flor> flores, double [] features){
         System.out.println("=====================================================================");
        System.out.println("                  Calculo das distâncias");
        double value = 0.0;
        double mimValue = Double.MAX_VALUE;
        String label = null;
        //double menorValor = 0.0;
        
        for (int i =0; i< flores.size();i++) {
            value = Distance(flores.get(i).Features,features);
            distancias.add(value);
            if(value < mimValue){
                mimValue = value;
                label = flores.get(i).Name;
        }   
           System.out.println("Distânce atual é : "+ value +" Flor : "+ flores.get(i).Name);
            System.out.println("Distância Encontrada: "+distancias.get(i));   
           System.out.println(" ");
           Collections.reverse(distancias);
         
           
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
    
//   private static  double ClassificacaoOrdenar(List<Flor> flores, double [] features){
//        System.out.println("=====================================================================");
//        System.out.println("                  Calculo das distâncias sem ordenação                ");
//        double value = 0.0;
//        double mimValue = Double.MAX_VALUE;
//        String label = null;
//        //double menorValor = 0.0;
//        
//        for (Flor flore : flores) {
//            value = Distance(flore.Features,features);
//            if(value < mimValue){
//                mimValue = value;
//                label = flore.Name;
//        }   
//           System.out.println("Os valores das distâncias são : "+ value+ label);
//           System.out.println(" ");
//               
//        }
//       return value;
//        
//    }
   
    
}
    
//    private static String
//    
//}

    

