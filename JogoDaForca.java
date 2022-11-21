import java.util.Scanner;

public class JogoDaForca {
    
    public static void main(String args[]) {
        
      Scanner sc = new Scanner (System.in);
      Integer tentativas = 10;
      String palavra = "urubu";
      
      String[] letrasReveladas = new String[palavra.length];
      for (int i; i<=palavra.length; i++){
          letrasReveladas[i] = " _ ";}
      
      while (true){
          
      System.out.println ("Qual letra quer tentar?");
      String letraEscolhida = sc.next();
      verificarLera(letraEscolhida);
      
      if (!verificarLetra) {
          tentativas-=1;
          System.out.printf ("%s não está na palavra! \n Tente novamente \n Você tem %d tentativas", letraEscolhida, tentativas);
          System.out.println (Array.toSting(letrasReveladas));
      }
      else if (verificarLetra) {
          System.out.printf("A letra %s está na palavra! \n Você ainda tem %d tentativas", letraEscolhida, tentativas);
          System.out.println(letrasReveladas);
      }
        
    if (tentativas==0){
        System.out.println ("Você perdeu :(( Suas tentativas acabaram");
        break;}
    
        }
      
    }
    
    public static boolean verificarLetra (char letra){
        int verif = 0;
        for (String l : palavra){
            if (letra.equals(l)){
                posição = palavra.indexOf(l);
                l = letrasReveladas[posição];
                verif++;}}
        if (verif == 0) {return false;}
        else {return true;}
    }
    
}