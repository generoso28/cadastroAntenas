import br.inatel.cdg.antenas.Antena;
import br.inatel.cdg.antenas.Antena4g;
import br.inatel.cdg.antenas.Antena5g;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes Antena4g e Antena5g
        Antena4g antena4g = new Antena4g(1, 100, 200, 1800); // Frequência válida para 4G
        System.out.println(antena4g.getTipo());
        Antena4g antena4g2 = new Antena4g(2, 150, 400, 2800); //frequência inválida para 4G
        System.out.println(antena4g2.getTipo());
        Antena5g antena5g = new Antena5g(3, 300, 400, 3500); // Frequência válida para 5G
        System.out.println(antena5g.getTipo());

        antena5g.save();
        antena4g2.save();
        antena4g.save();
        Antena.read();
    }
}