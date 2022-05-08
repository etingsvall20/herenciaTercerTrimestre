package com.company;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception{

            //Institut
            Institut institut1 = new Institut();
            institut1.canviarNom("La Guineueta.");

            // Persona
            Persona persona1 = new Persona();

            persona1.canviarNomPersona("Joe");
            persona1.assignarDni("66655544J");

            // Estudiants
            Estudiant estudiant1 = new Estudiant();

            estudiant1.canviarNomPersona("Victor");
            estudiant1.assignarDni("99944477V");
            estudiant1.posarNota("Fusteria", 7.5);

            Estudiant estudiant2 = new Estudiant();

            estudiant2.canviarNomPersona("Rodrigo");
            estudiant2.assignarDni("44044016F");
            estudiant2.posarNota("Llenguatge de marques", 0d);

            // Professor
            Professor professor1 = new Professor();

            professor1.canviarNomPersona("David");
            professor1.assignarDni("11155533D");
            professor1.canviarSou(1500.3);

            // Professor Substitut
            ProfessorSubstitut professorSubstitut1 = new ProfessorSubstitut();
            professorSubstitut1.assignarSubstitucio(new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10"), new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-30"));

            professorSubstitut1.canviarNomPersona("Laura");
            professorSubstitut1.assignarDni("66677788L");
            professorSubstitut1.canviarSou(1923.87);

            // Afegim persones a l'institut
            institut1.afegirPersona(professor1);
            institut1.afegirPersona(estudiant1);
            institut1.afegirPersona(estudiant2);
            institut1.afegirPersona(professorSubstitut1);

            // Proves i excepcions
            Persona persona2 = new Persona();

            persona2.canviarNomPersona("Lucas");
            persona2.assignarDni("55779911L");
            persona2.assignarDni("77779911L");


            Professor professor2 = new Professor();

            professor2.canviarNomPersona("Michael");
            professor2.assignarDni("77993311M");
            //professor2.canviarSou(3500d);
            //professor2.canviarSou(-5000.5);


            Estudiant estudiant3 = new Estudiant();

            estudiant3.canviarNomPersona("Aitor");
            estudiant3.assignarDni("64649797A");
            estudiant3.posarNota("Docker", 4.5);
            estudiant3.posarNota("Python", 3d);
            estudiant3.posarNota("Java", 3d);
            estudiant3.posarNota("JavaString", 3d);
            estudiant3.posarNota("StackOverFlow", 9.9);
            estudiant3.calculaNotaMesAlta();
            estudiant3.calculaNotaMesBaixa();
            estudiant3.calculaNotaMitjana();


            Persona persona3 = new Persona();

            persona3.canviarNomPersona("Pepito");


            Persona persona4 = new Persona();

            persona4.assignarDni("64973152P");

    }

}
