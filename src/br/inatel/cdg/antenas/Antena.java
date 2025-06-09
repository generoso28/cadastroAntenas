package br.inatel.cdg.antenas;

import br.inatel.cdg.interfaces.Configuravel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public abstract class Antena implements Configuravel {
    protected int id;
    protected long localizacaox;
    protected long localizacaoy;
    protected double frequencia;

    public Antena(int id, long localizacaox, long localizacaoy, double frequencia) {
        this.id = id;
        this.localizacaox = localizacaox;
        this.localizacaoy = localizacaoy;
        configurarFrequencia(frequencia);
    }
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + "," + id + "," + localizacaox + "," + localizacaoy + "," + frequencia;
    }
    public void save(){
        Path arquivo = Paths.get("antenas.txt");
        try{
            Files.writeString(arquivo, this + System.lineSeparator(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("Erro ao salvar a antena: " + e.getMessage());
        }
    }
    public static void read(){
        Path arquivo = Paths.get("antenas.txt");
        try{
            List<String> antenas = Files.readAllLines(arquivo);
            System.out.println("Antenas salvas:");
            for (String antena : antenas) {
                String[] partes = antena.split(",");
                if (partes.length == 5) {
                    String tipo = partes[0];
                    int id = Integer.parseInt(partes[1]);
                    long localizacaox = Long.parseLong(partes[2]);
                    long localizacaoy = Long.parseLong(partes[3]);
                    double frequencia = Double.parseDouble(partes[4]);
                    System.out.println("Tipo: " + tipo + ", ID: " + id + ", Localização: (" + localizacaox + ", " + localizacaoy + "), Frequência: " + frequencia);
                } else {
                    System.out.println("Formato inválido na linha: " + antena);
                }
            }
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
