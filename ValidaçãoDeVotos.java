import java.util.Scanner;

public class ValidaçãoDeVotos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();


        String resultado = (idade>=18 && idade<70) ? "Voto obrigatório" :
        (idade>=16 && idade <18) ? "Voto facultativo" : "Sem direito a votar";

        System.out.println(resultado);

    }
}
