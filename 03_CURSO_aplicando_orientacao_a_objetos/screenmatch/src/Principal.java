public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefinho";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.somaDeAvaliacoes = 10;
        meuFilme.incluindoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.exibeFichaTecnica();

        System.out.println(meuFilme.pegaMedia());
    }
}
