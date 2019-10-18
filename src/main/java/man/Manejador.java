package man;

import est.Estudiante;
import est.NotaSet;

import java.util.ArrayList;
import java.util.List;

public class Manejador {

    List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre, double nota, int edad) {
        Estudiante e = new Estudiante();
        e.setNombre(nombre);
        e.setEdad(edad);
        e.setNota(nota);
        estudiantes.add(e);
    }

    public String listar() {
        StringBuilder cad = new StringBuilder();

        estudiantes.forEach(e -> {
            cad.append("============\n");
            cad.append("Nombre: " + e.getNombre() + "\n");
            cad.append("Edad: " + e.getEdad() + "\n");
            cad.append("Nota: " + e.getNota() + "\n");
            cad.append("============\n");
        });
        return cad.toString();
    }

    public NotaSet calculo() {
        NotaSet datos = new NotaSet();

        estudiantes.forEach(e -> {
            if ((double) e.getNota() >= 3.0) {
                datos.plus1Gana();
            } else if ((double) e.getNota() >= 2.0) {
                datos.plus1Habilitan();
            } else {
                datos.plus1Pierde();
            }
        });
        return datos;
    }

}
