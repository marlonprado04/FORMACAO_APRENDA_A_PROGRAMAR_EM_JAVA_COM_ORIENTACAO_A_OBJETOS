public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;

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
