package br.inatel.cdg.antenas;

import br.inatel.cdg.exceptions.FrequenciaInvalidaException;

public class Antena5g extends Antena {
    public Antena5g(int id, long localizacaox, long localizacaoy, double frequencia) {
        super(id, localizacaox, localizacaoy, frequencia);
    }

    @Override
    public String getTipo() {
        return "Antena 5G";
    }

    @Override
    public void configurarFrequencia(double frequencia){
        boolean faixaSub6GHz = frequencia >= 3300 && frequencia <= 4200;
        boolean faixaMmWave = frequencia >= 24250 && frequencia <= 52600;

        try {
            if (faixaSub6GHz || faixaMmWave) {
                this.frequencia = frequencia;
            } else {
                throw new FrequenciaInvalidaException("Frequência inválida para antena 5G.");
            }
        }
        catch (FrequenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
