package com.company;

public class Estudiant extends Persona {

    private Double nota;

    public void posarNota(Double notaAssignada) throws Exception {

        if (notaAssignada > 10 | notaAssignada < 0) {
            throw new Exception("Nota incorrecta");
        }

        notaAssignada = this.nota;

    }

    @Override
    public void obtenirDades() throws Exception {
        super.obtenirDades();
        System.out.println("Nota: " + this.nota);
    }

}
