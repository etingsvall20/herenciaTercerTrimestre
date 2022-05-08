package com.company;

public class Persona {

    private String dni;
    private String nom;
    private boolean registre = false;

    public void canviarNomPersona(String nomAssignat) {
        nomAssignat = this.nom;
    }

    public void assignarDni(String dniAssignat) throws Exception {

        if (this.dni != null && !"".equals(this.dni)) {
            throw new Exception ("No es pot canviar un dni ja assignat.");
        }

        dniAssignat = this.dni;

    }

    public String obtenirDades() throws Exception {

        if (this.nom == null || !registre && "".equals(this.nom)) {
            throw new Exception("Aquesta persona no ha facilitat nom.");
        }

        if (this.dni == null || !registre && "".equals(this.dni)) {
            throw new Exception("Aquesta persona no ha facilitat dni.");
        }

        return "Nom: " + this.nom + "Dni: " + this.dni;

    }

    public void setRegistre (boolean registre) {
        this.registre = registre;
    }

}
