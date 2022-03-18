package Ejercicio_1;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String dui;
    private String sexo;
    private double peso;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona() {
        this.nombre = "Gochez";
        this.edad = 18;
        this.dui = generadui();
        this.sexo = "h";
        this.peso = 60;
        this.altura = 1.75;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dui = generadui();
        this.peso = 70;
        this.altura = 1.50;
    }

    public Persona(String nombre, int edad,String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dui = generadui();
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(double peso, double altura) {
        int V;
        double IMC = (peso / (altura * altura));
        
        String texto = "";
        if (IMC < 20) {
            V = -1;
            texto += "Peso ideal";
        }
        if (IMC >= 20 && IMC <= 25) {
            V = 0;
            texto += "por debajo del peso ideal";
        }
        if (IMC > 25) {
            V = 1;
            texto += "sobrepeso";
        }
        return texto;
    }

    public boolean esMayordeEdad(int edad) {
        boolean a = true;
        if (edad >= 18) {
            a = true;
        }
        if (edad < 18) {
            a = false;
        }
        return a;
    }

    public String comprobarsexo(String sexo) {
        String txt = "m";
        String txtt= "h";
        if ((sexo.equals(txt))||(sexo.equals(txtt))) {
            sexo+="";
        } else {
            sexo = "h";
        }
        return sexo;
    }

    public String generadui() {
        String texto = "";
        for (int i = 0; i < 8; i++) {
            int a = (int) (Math.random() * 9);
            texto += a;
        }
        return texto;
    }

    public void mostrardatos(String calcularIMC, boolean esMayordeEdad) {
        System.out.println(calcularIMC);
        System.out.println(esMayordeEdad);

    }
   
    @Override
    public String toString(){
        System.out.print("nombre = "+nombre+"\nedad = "+edad+"años"+"\nsexo = "+comprobarsexo(sexo)+"\npeso = "+peso+"Kg"+"\naltura = "+altura+"m"+"\nDUI = "+generadui()+"\n");
    return "";
    }            
            
}
