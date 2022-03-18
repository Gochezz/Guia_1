package Ejercicio_2;

import java.util.UUID;

public class Password {

    int longitud;
    String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = "";
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = "";
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String generarcontraseña(int longitud) {
        if (longitud / 2 == 0) {
            this.longitud = longitud / 2;
            String contraseña1 = "";
            String contraseña2 = "";
            contraseña1 = UUID.randomUUID().toString().toUpperCase().substring(0, this.longitud);
            contraseña2 = UUID.randomUUID().toString().substring(0, this.longitud);
            this.contraseña = contraseña1 + contraseña2;
            System.out.println(this.contraseña);
        } else {
            this.longitud = (longitud + 1) / 2;
            String contraseña1 = "";
            String contraseña2 = "";
            contraseña1 = UUID.randomUUID().toString().toUpperCase().substring(0, this.longitud);
            contraseña2 = UUID.randomUUID().toString().substring(0, (this.longitud - 1));
            this.contraseña = contraseña1 + contraseña2;
            System.out.println(this.contraseña);
        }
        return "";
    }

    public String esFuerte(String contraseña) {
        boolean c = false;
        if (contraseña.length() >= 11) {
            char d;
            int num = 0;
            int may = 0;
            int min = 0;
            for (int i = 0; i < contraseña.length(); i++) {
                d = contraseña.charAt(i);
                if (Character.isDigit(d)) {
                    num += 1;
                }
                if (Character.isUpperCase(d)) {
                    may += 1;
                }
                if (Character.isLowerCase(d)) {
                    min += 1;
                }
            }
            if (num >= 6 && may >= 3 && min >= 2) {
                c = true;
            }
        }
        System.out.println(c);
        return "";
    }

}
