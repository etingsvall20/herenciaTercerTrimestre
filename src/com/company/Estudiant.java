package com.company;

public class Estudiant extends Persona {

    private Double nota;

    public void posarNota (Double notaAssignada) throws Exception {

        String missatge;

        if (notaAssignada > 10 | notaAssignada < 0) {
            throw new Exception("nota incorrecta");
        }

        notaAssignada = this.nota;
    }

    @Override
    public void obtenirDades throws Exception () {
        super.obtenirDades();
        System.out.println(this.nota);
    }

}
