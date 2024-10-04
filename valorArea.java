package C14EX01;

public class valorArea {
    public static void area(){

        double area, raio;
        for (int aux=1; aux<=10; aux++) {
            System.out.println("Informe o valor de raio:");
            raio = C14EX01.teclado.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.println("área =" + area);
        }
    }
}
