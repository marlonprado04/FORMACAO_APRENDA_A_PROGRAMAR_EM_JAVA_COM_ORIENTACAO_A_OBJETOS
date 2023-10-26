package br.com.marlonprado.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDeAvaliacoes;
     private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano? " + incluindoNoPlano);
        System.out.println("Última avaliação: " + somaDeAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    void avalia(double nota){
        somaDeAvaliacoes +=nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
}
