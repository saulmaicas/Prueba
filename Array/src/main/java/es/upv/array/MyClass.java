package es.upv.array;

import java.util.ArrayList;

public class MyClass {

    public static void main(String [] args) {

        ArrayList<Persona> p = new ArrayList<>();
        p.add(new Persona("Saul", 18));
        p.add(new Profesor("Jesus", 99, "Aplicaciones moviles"));
        p.add(new Alumno("manolo", 20, 3));

        for (Persona x:p) {
            x.mostrar();
        }

        //p.mostrar();

        /*String a[] = {"Hola", "mundo"};

        String b[] = new String[2];
        b[0] = "Hola";
        b[1] = "mundo";

        ArrayList<String> c = new ArrayList<>();
        c.add("Hola");
        c.add("mundo");


        for (int i = 0; i < c.size(); i++) {
            String x = c.get (i).toUpperCase();
            c.set(i,x);
            //System.out.println(x);
        }

        /*for (String x: b) {
            String y = x.toUpperCase();
            System.out.println(y);
        }

        for (String x: c){
            System.out.println(x.charAt(0));
        }

        System.out.println(c);

*/
    }

}