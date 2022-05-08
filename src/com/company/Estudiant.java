package com.company;

import java.util.Map;
import java.util.HashMap;

public class Estudiant extends Persona {

    private final HashMap<String, Double> nota = new HashMap<>();

    public void posarNota(String assignatura, Double notaAssignada) throws Exception {

        if (notaAssignada > 10 | notaAssignada < 0) {
            throw new Exception("Nota incorrecta");
        }

        this.nota.put(assignatura, notaAssignada);

    }

    @Override
    public String obtenirDades() throws Exception {

        StringBuilder assignatures = new StringBuilder();

        for (Map.Entry<String, Double> entry : nota.entrySet()) {
            assignatures.append("Assignatura: ").append(entry.getKey()).append("Nota: ").append(entry.getValue());
        }

        return super.obtenirDades() + assignatures;
    }

    public void calculaNotaMesAlta() {

        Map.Entry<String, Double> max = null;

        for (Map.Entry<String, Double> entry : nota.entrySet()) {
            if (max == null || max.getValue() < entry.getValue()) {
                max = entry;
            }
        }

        assert max != null;
        System.out.println("La nota més alta és " + max.getValue() + ".");

    }

    public void calculaNotaMesBaixa() {

        Map.Entry<String, Double> min = null;

        for (Map.Entry<String, Double> entry : nota.entrySet()) {
            if (min == null || min.getValue() > entry.getValue())
                min = entry;
        }

        assert min != null;
        System.out.println("La pitjor nota és " + min.getValue());

    }

    public void calculaNotaMitjana() {

        Double sumaNotes = 0d;
        int sumaAssignatures;
        double mitjana;

        for(Map.Entry<String, Double> entry : nota.entrySet()) {
            sumaNotes += entry.getValue();
        }

        sumaAssignatures = nota.size();
        mitjana = sumaNotes / sumaAssignatures;
        System.out.println("Mitjana global: " + mitjana);

    }

}
