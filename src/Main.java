import br.inatel.cdg.antenas.Antena;
import br.inatel.cdg.antenas.Antena4g;
import br.inatel.cdg.antenas.Antena5g;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes Antena4g e Antena5g
        Antena4g antena4g = new Antena4g(1, 100, 200, 1800);
        System.out.println(antena4g.getTipo());
        antena4g.configurarFrequencia(1800); // Frequência válida para 4G

        Antena5g antena5g = new Antena5g(2, 300, 400, 3500);
        System.out.println(antena5g.getTipo());
        antena5g.configurarFrequencia(3500); // Frequência válida para 5G

        antena5g.save();
        antena4g.save();
        Antena.read();






    }
}