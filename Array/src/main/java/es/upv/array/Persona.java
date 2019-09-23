package es.upv.array;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println(" Me llamo " + nombre + " y tengo " + edad + " años ");
    }



}
