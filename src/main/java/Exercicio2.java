public class Exercicio2 {

    public static void main(String[] args) {
        String mensagem = "A vida é um sopro";
        int tamanho = mensagem.length();
        int quantidade = 0;

        for (int i = 0; i < tamanho; i++) {
            if (mensagem.charAt(i) == 'a' || mensagem.charAt(i) == 'A'){
                quantidade++;
            }
        }

        System.out.println("Quantidade de ocorrência da letra a/A: " + quantidade);
    }
}
