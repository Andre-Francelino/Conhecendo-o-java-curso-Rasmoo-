
public class EstruturaCondicional {

    public static void main(String[] args) {

        //Aula sobre estruturas IF...ELSE
        String nomeAluno = "André";
        double media = 9.5;

        if (media >= 7) {
            System.out.println("Parabéns " + nomeAluno + ", você está aprovado!!");
        } else if (media >= 5) {
            System.out.println(nomeAluno + ", estude pois você está de recuperação!");
        } else {
            System.out.println("Infelizmente " + nomeAluno + ", você está reprovado.");
        }

        //Aula sobre estruturas SWITCH...CASE
        int mes = 4;
        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
