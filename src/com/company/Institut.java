package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import static com.company.Main.*;

public class Institut {

    private String nomInstitut;

    public void canviarNom(String nouNom) {
        this.nomInstitut = nouNom;
    }

    public String obtenirNom() {
        return "\nNom del institut: " + this.nomInstitut + "\n";
    }

    private final List<Persona> persones = new ArrayList<>();

    public void printInfo(boolean registre) throws Exception {

        String impresio;

        if (persones.stream().count() == 0) {
            impresio = "No hi han registrats ni professors ni alumnes";
        } else {
            impresio = this.nomInstitut + " te registrades aquestes persones:\n";

            for (Persona persona : this.persones) {

                if (registre) {
                    persona.setRegistre(true);
                }

                impresio += persona.obtenirDades() + "\n";

            }

        }

        System.out.println(impresio);

    }

    public void afegirPersona(Persona persona) {
        this.persones.add(persona);
    }

}
