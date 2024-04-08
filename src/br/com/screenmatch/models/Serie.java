package br.com.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epiPorTemporada;
    private int minutosPorEpi;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpiPorTemporada() {
        return epiPorTemporada;
    }

    public void setEpiPorTemporada(int epiPorTemporada) {
        this.epiPorTemporada = epiPorTemporada;
    }

    public int getMinutosPorEpi() {
        return minutosPorEpi;
    }

    public void setMinutosPorEpi(int minutosPorEpi) {
        this.minutosPorEpi = minutosPorEpi;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epiPorTemporada * minutosPorEpi;
    }
}
