package com.company;

import java.sql.Array;
import java.util.arrayList;
import java.util.List;

public class Institut {

    private String nom;
    private final List<Persona> personas = new ArrayList<>();

    public static void afegirProfe(Professor professor) {
        this.personas.add(professor);
    }

    public void afegirEstudiant (Estudiant estudiant) {
        this.personas.add(estudiant);
    }

    public void imprimirInformacio() throws Exception {

        for (Persona persona : this.personas) {
            persona.obtenirDades();
        }

    }

}
