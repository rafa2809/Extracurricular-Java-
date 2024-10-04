package C14EX01;

public class numDIVISIVEL5E7 {
    public static void divisivel(){

        int cont=0;

        int vet[] = new int[10];
        for (int aux=0; aux<vet.length; aux++) {
            System.out.print("Informe um número inteiro:");
            vet[aux]= C14EX01.teclado.nextInt();
        }
        for (int aux=0; aux<vet.length; aux++) {
            if (vet[aux] % 5 == 0 && vet[aux] % 7 ==0 )
                cont++;

        }
        System.out.printf("Quantidade de divisores de 5 e 7 ao mesmo tempo:"+cont);

    }

}

