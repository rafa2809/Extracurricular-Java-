package C14EX01;

public class alunosAproRep {
    public static void alunos() {

        double notaFinal, falta;
        int cont1=0, cont2=0;
        for (int aux=1; aux<=50; aux++ ) {
            System.out.print("Informe sua nota final:");
            notaFinal = C14EX01.teclado.nextDouble();
            if (notaFinal < 0)
                break;
            System.out.print("Informe sua quantidade de faltas:");
            falta = C14EX01.teclado.nextDouble();
            if (notaFinal >= 65 && falta <= 16) {
                System.out.println("ALUNO APROVADO");
                cont1++;
            } else {
                System.out.println("ALUNO REPROVADO");
                cont2++;
            }
        }
        System.out.println("Quantidade de alunos aprovados:"+cont1);
        System.out.println("Quantidade de alunos reprovados:"+cont2);
    }
}
