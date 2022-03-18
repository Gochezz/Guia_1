package Ejercicio_1;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String p1n = JOptionPane.showInputDialog("Ingrese su nombre persona1: ");
        String p2n = JOptionPane.showInputDialog("Ingrese su nombre persona2: ");
        int p1e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad persona 1: "));
        int p2e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad persona2: "));
        String p1s = JOptionPane.showInputDialog("Ingrese su sexo persona1 H es hombre y M es mujer: ");
        String p2s = JOptionPane.showInputDialog("Ingrese su sexo persona2 H es hombre y M es mujer: ");
        double p1p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en Kg: "));
        double p1a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese ña altura en metros: "));
        
        Persona p1 = new Persona(p1n,p1e,p1s,p1p,p1a);
        String IMC = p1.calcularIMC(p1p, p1a);
        boolean ME = p1.esMayordeEdad(p1e);
        System.out.println("Persona 1");
        p1.mostrardatos(IMC, ME);
        p1.toString();

        Persona p2 = new Persona(p2n,p2e,p2s);
        p2.setPeso(p2.getPeso());
        p2.setAltura(p2.getAltura());
        String IMC2 = p2.calcularIMC(p2.getPeso(), p2.getAltura());
        boolean ME2 = p2.esMayordeEdad(p2e);
        System.out.println("Persona 2");
        p2.mostrardatos(IMC2, ME2);
        p2.toString();
        
        Persona p3 = new Persona();
        p3.setNombre(p3.getNombre());
        p3.setEdad(p3.getEdad());
        p3.setSexo(p3.getSexo());
        p3.setPeso(p3.getPeso());
        p3.setAltura(p3.getAltura());
        String IMC3 = p3.calcularIMC(p3.getPeso(), p3.getAltura());
        boolean ME3 = p3.esMayordeEdad(p3.getEdad());
        System.out.println("Persona 3");
        p3.mostrardatos(IMC3, ME3);
        p3.toString();
    }

}
