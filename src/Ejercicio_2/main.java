
package Ejercicio_2;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
    int dimension=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del array"));
    int longi=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña"));
    Password p[]=new Password[dimension];
    for(int i=0;i<p.length;i++){
    p[i]= new Password(longi);
    }
    for(int i=0;i<p.length;i++){
    System.out.println(p[i].generarcontraseña(longi)+p[i].esFuerte(p[i].getContraseña()));
    }
    }
}
