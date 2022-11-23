import java.util.Scanner;

public class SeparadorDeNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual seu nome inteiro?");
        String nomeInteiro = sc.nextLine();

        String primeiraLetra = "!" + nomeInteiro.substring(0,1);
        String restoDoNome = nomeInteiro.substring(1);
        nomeInteiro = primeiraLetra + restoDoNome.replace(" ", " !");
        System.out.println(nomeInteiro);}
}
