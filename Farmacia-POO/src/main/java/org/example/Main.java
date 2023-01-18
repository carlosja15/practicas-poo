package org.example;

import upao.alumnos.Alumno;
import upao.escuela.software.Curso;

public class Main {
    public static void main(String[] args) {
        // Instanciar las clases Alumno y Curso
        Alumno objAlumno1 = new Alumno(1);
        Alumno objAlumno2 = new Alumno(2);
        Curso objCurso1 = new Curso(1);

        // Asignar los valores a los atributos
        objAlumno1.setNombres("Carlos");
        objAlumno1.setApellidoPaterno("Jara");
        objAlumno1.setApellidoMaterno("Carpio");
        objAlumno1.setCiclo("2");

        objAlumno2.setNombres("Mackael");
        objAlumno2.setApellidoPaterno("Rojas");
        objAlumno2.setApellidoMaterno("Reyes");
        objAlumno2.setCiclo("2");

        objCurso1.setNombre("Estructuras de datos");
        objCurso1.setDescripcion("Curso de estructuras de datos en Java");
        objCurso1.setNroHoras("500");

        // Agregar los valores de los alumnos a los cursos
        objCurso1.agregarAlumno(objAlumno1);
        objCurso1.agregarAlumno(objAlumno2);

        // Reportamos el curso
        System.out.println("En el curso " + objCurso1.getNombre() + " hay " + objCurso1.getAlumnos().size() +
                " alumnos, los cuales son:");
        objCurso1.reportarAlumnosInscritos();
    }
}