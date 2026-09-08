public class Sistema {

    private static final double MEDIA_MINIMA_APROVACAO = 6;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;

        double media = calcularMedia(nota1, nota2);
        boolean aprovado = verificarAprovacao(media);

        exibirResultado(nomeAluno, media, aprovado);
    }

    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    private static boolean verificarAprovacao(double media) {
        return media >= MEDIA_MINIMA_APROVACAO;
    }

    private static void exibirResultado(String nomeAluno, double media, boolean aprovado) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(aprovado ? "Aprovado" : "Reprovado");
    }
}
