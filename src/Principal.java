import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.screenmatch.models.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme meufilme =  new Filme();

        meufilme.setNome("The Matrix");
        meufilme.setAnoDeLancamento(1999);
        meufilme.setDuracaoEmMinutos(135);
        meufilme.setIncluidoNoPlano(true);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(9);
        meufilme.avalia(8);
        meufilme.avalia(9);

      
        System.out.println("Média de avaliações do filme:" +meufilme.pegaMedia());

        CalculadoraDeTempo calculador = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

    }

}