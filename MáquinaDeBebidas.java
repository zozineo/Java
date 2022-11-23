import java.util.Scanner;

public class MáquinaDeBebidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Coca-Cola - R$ 5\n" +
                "2 - Coca-Cola 0 - R$ 4.50\n" +
                "3 - Pepsi - R$ 4,40\n" +
                "4 - Guaraná Antarctica - R$ 3,50\n" +
                "5 - Fanta Laranja - R$ 4,23\n" +
                "Água - R$ 2,50");
        System.out.println("Escolha sua bebida: \n");

        var entrada = sc.next();
        int bebidaEscolhida;

        try{bebidaEscolhida = Integer.valueOf(entrada);}
        catch (Exception e) {bebidaEscolhida = 6;}

        if (bebidaEscolhida==1) {System.out.println("Você escolheu a Coca, que custa R$ 5");}
        else if (bebidaEscolhida==2) {System.out.println("Você escolheu a Coca 0, que custa R$ 4.50");}
        else if (bebidaEscolhida==3) {System.out.println("Você escolheu a Pepsi, que custa R$ 4.40");}
        else if (bebidaEscolhida==4) {System.out.println("Você escolheu o Guaraná, que custa R$ 3.50");}
        else if (bebidaEscolhida==5) {System.out.println("Você escolheu a Fanta Laranja, que custa R$ 4.23");}
        else if (bebidaEscolhida==6) {System.out.println("Você escolheu a Água, que custa R$ 2.50");}
        else {System.out.println("Escolha uma bebida válida");}
        }
    }
