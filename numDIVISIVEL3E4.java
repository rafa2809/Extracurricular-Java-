package C14EX01;

public class numDIVISIVEL3E4 {
    public static void div3e4(){

        int numero, cont=0, soma=0;
        for (int aux = 1; aux <=10; aux++ ) {
            System.out.println("Informe um número inteiro: ");
            numero = C14EX01.teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é impar");
            }
            if (numero % 4 ==0) {
                soma += numero;
            }if (numero % 3 ==0) {
                cont++;
            }
        }
        System.out.println("Soma dos numeros divisiveis por 4="+soma);
        System.out.println("Quantidade de numeros divisiveis por 3="+cont);
    }
}
