
public class ReverterString {
    public static void main(String[] args) {
        String nome = "andre harris";
        int a = nome.length();

        for (int i=a-1; i>=0; i--) {
            System.out.println(nome.charAt(i));
        }
    }
}
