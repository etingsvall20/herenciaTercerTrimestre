package com.company;

public class Persona {

    private String dni;
    private String nom;

    public void canviarNom(nomAssignat) {
        nomAssignat = this.nom;
    }

    public void assignarDni(dniAssignat) {

        if (!"".equals(this.dni) && this.dni != null) {
            throw new Exception ("No es pot canviar un dni ja assignat.")
        }

        dniAssignat = this.dni;

    }

    public void obtenirDades throws Exception () {

        if ("".equals(this.nom) | this.nom == null) {
            throw New Exception ("Aquesta persona no ha facilitat nom.")
        }

        if ("".equals(this.dni) | this.dni == null) {
            throw New Exception ("Aquesta persona no ha facilitat dni.")
        }

        System.out.println("Nom: " + this.nom);
        System.out.println("Dni: " + this.dni);

    }

}
