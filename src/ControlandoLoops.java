//Apostila Java POO - Caleum/Alura
public class ControlandoLoops {
    public static void main(String[] args) {
        // Parar o Loop com palavra-chave CONTINUE
        for(int i = 0; i < 100; i++){
            if(i > 50 && i < 60){
                continue;
            }
            System.out.println(i);
        }
    }
}
