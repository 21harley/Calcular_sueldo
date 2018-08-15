/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;
import  java.io.*;
import calculo.*;
/**
 *
 * @author CASA
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       DataInputStream lector=new DataInputStream(System.in);
        int e=0;
        Suma a=new Suma();
       do{
         a.cargar_datos();
         a.mostrar_datos();
         try{
          System.out.println("¿Quiere salir 1=si 2=no?");
           e=Integer.parseInt(lector.readLine());
         }catch(NumberFormatException t){
             System.out.println("Ingreso mal los datos");
         };
       }while(e==0);
    }
    
}
