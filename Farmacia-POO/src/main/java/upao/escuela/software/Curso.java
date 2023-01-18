package upao.escuela.software;

import upao.alumnos.Alumno;

import java.util.ArrayList;

public class Curso {
    // Atributos
    private String nombre;
    private int id;
    private String descripcion;
    private String nroHoras;

    private ArrayList<Alumno> alumnos;

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNroHoras() {
        return nroHoras;
    }

    public void setNroHoras(String nroHoras) {
        this.nroHoras = nroHoras;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void reportarAlumnosInscritos() {
        System.out.println("Los alumnos que están en el curso son: ");
        for (Alumno alumno : alumnos) {
            System.out.println(" - " + alumno.getNombres() + " " + alumno.getApellidoPaterno() + " " +
                    alumno.getApellidoMaterno() + ". Ciclo: " + alumno.getCiclo());
        }
    }

    private void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Curso() {
        this.setAlumnos(new ArrayList<>());
    }

    public Curso(int id) {
        this.id = id;
        this.setAlumnos(new ArrayList<>());
    }
}
