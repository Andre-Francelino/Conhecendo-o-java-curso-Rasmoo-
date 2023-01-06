public class VariaveisBooleanas {
    public static void main(String[] args) {
        boolean usuarioAtivo = true;
        int idadeAndre = 30;

        // Operadores de igualdade
        // == é igual à...
        //!= é diferente de...

        // Operadores relacionais
        // > maior que...
        // >= maior ou igual que...
        // < menor que...
        //<= menor ou igual que...

        // Operadores lógicos
        // && E (and)...
        // || OU (or)...

        System.out.println(usuarioAtivo);
        System.out.println(idadeAndre > 30);
        System.out.println(idadeAndre == 30);

        System.out.println(usuarioAtivo == true && idadeAndre > 29);
        System.out.println(usuarioAtivo == false && idadeAndre == 30);

        System.out.println(usuarioAtivo == false || idadeAndre < 31);

        boolean usuarioAtivoMenorQue40 = usuarioAtivo == true && idadeAndre <= 40;
        System.out.println("Usuário está ativo e tem menos que 40 anos? " + usuarioAtivoMenorQue40);
    }
}
