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
      verificarLera(letraEscolhida, palavra);
      
      if (!verificarLetra) {
          tentativas-=1;
          System.out.printf ("%s não está na palavra! \n Tente novamente \n Você tem %d tentativas \n", letraEscolhida, tentativas);
          System.out.println (Array.toSting(letrasReveladas));
      }
      else if (verificarLetra) {
          System.out.printf("A letra %s está na palavra! \n Você ainda tem %d tentativas", letraEscolhida, tentativas);
          System.out.println(Array.toSting(letrasReveladas));
      }
        
    if (tentativas==0){
        System.out.printf ("\n Você perdeu :(( Suas tentativas acabaram \n A palavra era: %d", palavra);
        break;}
    
    vitoria (palavra);
    if (vitoria) {
        System.out.printf("\n Parabéns!!! Você ganhou!! \n A palavra era %s \n Além disso, você ainda tinha %d tentativas", palavra, tentativas);
        break;}
      
    }
    
    public static boolean verificarLetra (char letra, palavra){
        int verif = 0;
        for (String l : palavra){
            if (letra.equals(l)){
                int posição = palavra.indexOf(l);
                letrasReveladas[posição] = " " + l + " ";
                verif++;}}
        if (verif == 0) {return false;}
        else {return true;}
    }
    
    
    public static boolean vitoria (String[] palavra){
        int verif=0;
        for (l:palavra){
            if l.equals(!" _ ") {verif++;}
        }
        if (verif==palavra.lenght){return true;}
        else {return false;}
            
    }
    
}
