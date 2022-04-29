package com.company;

import java.util.Date;

public class ProfessorSubstitut extends Professor {

    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio (Date Inici, Date Fi) {
        this.dataInici = Inici;
        this.dataFi = Fi;
    }

    @Override
    public void obtenirDades () throws Excepction {
        super.obtenirDades();
        System.out.println("Inici: " + this.dataInici);
        System.out.println("Fi: " + this.dataFi);
    }

}
