package com.company;

public class Persona {

    private String dni;
    private String nom;

    public void canviarNom(String nomAssignat) {
        nomAssignat = this.nom;
    }

    public void assignarDni(String dniAssignat) throws Exception {

        if (this.dni != null) {
            throw new Exception ("No es pot canviar un dni ja assignat.");
        }

        dniAssignat = this.dni;

    }

    public void obtenirDades() throws Exception {

        if (this.nom == null) {
            throw new Exception ("Aquesta persona no ha facilitat nom.");
        }

        if (this.dni == null) {
            throw new Exception ("Aquesta persona no ha facilitat dni.");
        }

        System.out.println("Nom: " + this.nom);
        System.out.println("Dni: " + this.dni);
    }
}
