package es.upv.array;

public class Profesor extends Persona{
    private String asignaturas;
    public Profesor (String nombre, int edad, String asignatura)
    {
        super(nombre, edad);
        this.asignaturas  = asignatura;
    }
    public void mostrar (){
        System.out.println("ME llamo " + nombre + " y doy la asignatura " + asignaturas);
    }


}
