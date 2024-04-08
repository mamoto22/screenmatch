package br.com.screenmatch.principal;

import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.screenmatch.models.Filme;
import br.com.screenmatch.models.Produto;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
       /* Filme meufilme =  new Filme("Avatar", 2023);
        meufilme.setDuracaoEmMinutos(135);
        meufilme.setIncluidoNoPlano(true);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(9);
        meufilme.avalia(8);
        meufilme.avalia(9);

      
        System.out.println("Média de avaliações do filme:" +meufilme.pegaMedia());

        CalculadoraDeTempo calculador = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();*/

        Produto produto = new Produto();
        ArrayList<String> nome = new ArrayList<>();
        nome.add("carne");

        ArrayList<Integer> preco = new ArrayList<Integer>();
        preco.add(10);
        System.out.println("Nome do produto "+nome.get(0) +" preço: " +preco.get(0));
    }

}