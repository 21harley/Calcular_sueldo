/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;
import java.io.*;
/**
 *
 * @author CASA
 */
public class Suma {
    private double numero;
    private int nn;
    public Suma(){
        this.numero=0.0F;
        this.nn=0;
    }
    public Suma(double numero,int nn){
        this.numero=numero;
        this.nn=nn;
    }
    void cargar_datos() throws IOException{
        DataInputStream lector = new DataInputStream(System.in);
        System.out.println("Ingrese los proximos datos personales ");
        System.out.println("Sueldo");
        this.numero=Float.parseFloat(lector.readLine());
        System.out.println("Edad");
        this.nn=Integer.parseInt(lector.readLine());
    }
}
