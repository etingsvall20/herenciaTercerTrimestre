package com.company;

public class Professor extends Persona{

    private Double sou;

    public void canviarSou (Double souAssignat) throws Exception {

        if (3000 < souAssignat || 0 > souAssignat) {
            throw new Exception ("Sou incorrecte.");
        }

        souAssignat = this.sou;

    }

    @Override
    public String obtenirDades() throws Exception {
        return super.obtenirDades() + "Sou: " + this.sou;
    }

}
