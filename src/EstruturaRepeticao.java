//Aula1: Estrutura WHILE
//Aula2: Estrutura FOR
//Aula3: Estrutura DO...WHILE

public class EstruturaRepeticao {

    public static void main(String[] args) {

        System.out.println("---------- Usando estrutura WHILE ----------");
        int contador = 0;
        while(contador <= 5){
            System.out.println(contador);
            //contador = contador + 1;
            //contador += 1;
            contador++;
        }

        System.out.println("---------- Usando estrutura DO...WHILE ----------");

        int contagem = 0;
        do{
            System.out.println(contagem);
            contagem++;
        } while(contagem <=5);

        System.out.println("---------- Usando estrutura FOR ----------");

        for(int count = 0; count <= 5; count++){
            System.out.println(count);
        }

        System.out.println("----- Contagem Regressiva com estrutura FOR -----");

        for(int contagemRegressiva = 5; contagemRegressiva >= 0; contagemRegressiva--){
            System.out.println(contagemRegressiva);
        }
    }
}
