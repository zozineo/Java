import java.util.Scanner;

public class NúmeroDaSorte {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite sua idade:");
        Integer idade = sc.nextInt();

        Double númeroDaSorte = (double) idade + 0.023;
        System.out.println("Seu número da sorte é: " + númeroDaSorte);

    }
}