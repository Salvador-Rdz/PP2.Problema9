/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema9;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        char Num[];
        //Resolución
        Num=getNum();
        print(Num);
    }
    public static char[] getNum () //Se recibe la información
    {
        Scanner getinf = new Scanner (System.in);
        String Number="";
        char Num[];
        System.out.println("**** Bienvenid@ ****");
        System.out.println("Ingrese el número que desea descomponer: ");
        Number=getinf.nextLine();
        Num = Number.toCharArray();
        return Num;
    }
    public static void print (char[] N)//Se refactoriza e imprime directamente.
    {
        double getNum;
        int exp=N.length; //El exponente es igual a la posición en la que se encuentra. 4567 sería [6][7][5][4].
        for (int i=0; i<N.length; ++i) 
        {   
            exp--;                                              //Se va disminuyendo cada ciclo.
            getNum=Integer.parseInt(String.valueOf(N[i]));      //Se convierte char>string>int. Y se guarda en getNum
            double numFinal=(getNum*Math.pow(10, (exp)));       //El número se eleva al exponente.
            if(numFinal!=0)                                     //Si no es 0, se imprime.
            {
                System.out.println(numFinal+" +");
            }
        }
    }
}
