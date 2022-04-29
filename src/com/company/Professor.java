package com.company;

public class Professor extends Persona{

    private Double sou;

    public void canviarSou (Double souAssignat) throws Exception {

        if (souAssignat > 3000 | souAssignat < 0) {
            throw new Exception ("Sou incorrecte.");
        }

        souAssignat = this.sou;

    }

    @Override
    public void obtenirDades() throws Exception {
        super.obtenirDades();
        System.out.println("Sou: " + this.sou);
    }

}
