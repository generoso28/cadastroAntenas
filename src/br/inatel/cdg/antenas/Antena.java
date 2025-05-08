package br.inatel.cdg.antenas;

import br.inatel.cdg.interfaces.Configuravel;

public abstract class Antena implements Configuravel {
    protected int id;
    protected long localizacaox;
    protected long localizacaoy;
    protected double frequencia;

    public Antena(int id, long localizacaox, long localizacaoy, double frequencia) {
        this.id = id;
        this.localizacaox = localizacaox;
        this.localizacaoy = localizacaoy;
        this.frequencia = frequencia;
    }
    public abstract String getTipo();
    public double getFrequencia(){
        return frequencia;
    }

}
