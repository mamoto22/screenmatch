package br.com.screenmatch.calculo;

import br.com.screenmatch.models.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();

    }
}
