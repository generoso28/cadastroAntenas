package br.inatel.cdg.antenas;

import br.inatel.cdg.exceptions.FrequenciaInvalidaException;

public class Antena4g extends Antena {

    public Antena4g(int id, long localizacaox, long localizacaoy, double frequencia) {
        super(id, localizacaox, localizacaoy, frequencia);
    }

    @Override
    public String getTipo() {
        return "Antena 4G";
    }

    @Override
    public void configurarFrequencia(double frequencia){
        try {
            if (frequencia >= 700 && frequencia <= 2600) { // faixa típica de 4G
                this.frequencia = frequencia;
            } else {
                throw new FrequenciaInvalidaException("Frequência inválida para antena 4G.");
            }
        }
        catch (FrequenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
