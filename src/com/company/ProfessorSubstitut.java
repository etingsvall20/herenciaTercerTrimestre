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
    public String obtenirDades () throws Exception {
        return super.obtenirDades() + "Inici: " + this.dataInici + "Fi: " + this.dataFi;
    }

}
