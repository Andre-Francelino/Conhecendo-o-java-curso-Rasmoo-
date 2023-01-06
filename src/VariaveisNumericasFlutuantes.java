public class VariaveisNumericasFlutuantes {

    public static void main(String[] args) {
        int idadeAndre = 30;

        //int salario = 1550.50; não armazena valor de casa decimal em um tipo int
        // float -> armazena 32 bits
        // double -> armazena 64 bits

        double nota1 = 10;
        double nota2 = 9.5;
        double nota3 = 7.5;

        System.out.println("A minha primeira nota foi " + nota1);
        System.out.println("A minha segunda nota foi " + nota2);
        System.out.println("A minha terceira nota foi " + nota3);

        double mediaNotas = (nota1 + nota2 + nota3)/3;
        System.out.println("Minha média foi de " + mediaNotas);

        double resultadoDivisao = 21.0/2;
        //int resultado = 7.5;

        System.out.println(resultadoDivisao);
    }
}
