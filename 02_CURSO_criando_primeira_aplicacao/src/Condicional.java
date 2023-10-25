public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false;
        double notaFilme = 8.5;
        String tipoDoPlano = "plus";

        // If
        if (anoDeLancamento > 2022){
            System.out.println("Lançamentos: ");
        }else {
            System.out.println("Filme retrô:");
        }

        if (incluidoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Contratar plano");
        }

    }
}
