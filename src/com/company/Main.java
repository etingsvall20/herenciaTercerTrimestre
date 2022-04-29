package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception{

        try {
            // Persona
            Persona persona = new Persona();

            persona.canviarNom("Joe");
            persona.assignarDni("66655544j");

            //persona.assignarDni("");

            persona.obtenirDades();

            // Estudiants
            Estudiant estudiant1 = new Estudiant();

            estudiant1.canviarNom("Victor");
            estudiant1.assignarDni("99944477V");
            estudiant1.posarNota(7.5);

            Estudiant estudiant2 = new Estudiant();

            estudiant2.canviarNom("Jaime");
            estudiant2.assignarDni("44044016F");
            estudiant2.posarNota(0d);

            // Professor
            Professor professor = new Professor();

            professor.canviarNom("David");
            professor.assignarDni("11155533D");
            //professor.canviarSou(-0.5);

            //professor1.obtenirDades();

            // Professor Substitut
            ProfessorSubstitut professorSubstitut = new ProfessorSubstitut();
            professorSubstitut.assignarSubstitucio(new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-20"));

            professorSubstitut.canviarNom("Alex");
            professorSubstitut.assignarDni("66677788A");
            professorSubstitut.canviarSou(1923.87);

            // Institut
            Institut institut = new Institut();

            institut.afegirProfessor(professor);
            institut.afegirEstudiant(estudiant1);
            institut.afegirEstudiant(estudiant2);
            institut.afegirProfessor(professorSubstitut);

            institut.imprimirInformacio();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
