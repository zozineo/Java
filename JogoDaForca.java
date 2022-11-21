import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {

    static Scanner sc = new Scanner(System.in);
    static Integer tentativas = 10;
    static String palavra = "forca";
    static String[] letrasReveladas = new String[palavra.length()];
    static boolean controle = false;
    static boolean vit = false;

    public static void main(String args[]) {
        for (int i = 0; i < palavra.length(); i++) {letrasReveladas[i] = " _ ";}

        while (true) {

            System.out.println("Qual letra quer tentar?");
            char letraEscolhida = sc.next().charAt(0);
            verificarLetra(letraEscolhida, palavra);

            if (!controle) {
                tentativas -= 1;
                System.out.printf("%s não está na palavra! \n Tente novamente \n Você tem %d tentativas \n", letraEscolhida, tentativas);
                System.out.println(Arrays.toString(letrasReveladas));
            } else if (controle) {
                System.out.printf("A letra %s está na palavra! \n Você ainda tem %d tentativas \n", letraEscolhida, tentativas);
                System.out.println(Arrays.toString(letrasReveladas));
            }

            if (tentativas == 0) {
                System.out.printf("\n Você perdeu :(( Suas tentativas acabaram \n A palavra era: %d \n", palavra);
                break;}

            vitoria(letrasReveladas);
            
            if (vit) {
                System.out.printf("\n Parabéns!!! Você ganhou!! \n A palavra era %s \n Além disso, você ainda tinha %d tentativas", palavra, tentativas);
                break;}

        }}

        public static void verificarLetra ( char letra, String palavra){
            int verif = 0;
            for (int i = 0; i < palavra.length(); i++) {
                char caractere = palavra.charAt(i);
                if (caractere == letra){
                    int posição = palavra.indexOf(letra);
                    letrasReveladas[posição] = " " + letra + " ";
                    verif++;}
            }

            if (verif == 0) {controle = false;} 
            else {controle = true;}
        }


        public static void vitoria (String[]palavra){
            int verif = 0;
            for (String l: palavra) {
                if (!(l.equals(" _ "))) {verif++;}
            }
            if (verif == palavra.length) {vit = true;} 
            else {vit = false;}

        }

    }
