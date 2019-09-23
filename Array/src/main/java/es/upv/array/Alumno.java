package es.upv.array;

public class Alumno extends Persona {
    private int suspensos;
    public Alumno(String nombre, int edad, int s)
    {
        super(nombre, edad);
        this.suspensos = s;
    }
    public void mostrar(){
        System.out.println(" ME llamo " + nombre + " y he suspendido " + suspensos + " asignaturas ");
    }
}
