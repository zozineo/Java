public class ContagemMeses {

    public static void main(String[] args) {
        String listaDeMeses = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
        String [] listaSplit = listaDeMeses.split(",");

        String primeiroMes = listaSplit[0];
        String segundoMes = listaSplit[1];
        String terceiroMes = listaSplit[2];

        String[] primeiroMesSplit = primeiroMes.split(": ");
        Integer primeiroNumero = Integer.valueOf(primeiroMesSplit[1]);

        String[] segundoMesSplit = segundoMes.split(": ");
        Integer segundoNumero = Integer.valueOf(segundoMesSplit[1]);

        String[] terceiroMesSplit = terceiroMes.split(": ");
        Integer terceiroNumero = Integer.valueOf(terceiroMesSplit[1]);

        Integer somatóriaDosMeses = primeiroNumero + segundoNumero + terceiroNumero;

        System.out.printf("\n %s \n %s \n %s \n A somatória é: %d \n", primeiroMes, segundoMes, terceiroMes,
                somatóriaDosMeses);
    }
}
