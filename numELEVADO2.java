package C14EX01;

public class numELEVADO2 {
    public static void elevado() {

        double n2 = 0;

        int vet[] = new int[10];
        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiros:");
            vet[aux] = C14EX01.teclado.nextInt();
        }
        for (int aux = 0; aux < vet.length; aux++) {

            n2 = Math.pow(vet[aux], 2);

            System.out.println("Números elevado ao quadrado:" + n2);

        }
    }
}


