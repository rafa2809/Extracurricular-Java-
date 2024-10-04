package C14EX01;

import java.util.*;
public class C14EX01 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        // Faça um programa (classe com método main) em Java que chame pelo menos 5 programas (classes) das listas de exercícios dos conteúdos anteriores. Escolha a seu gosto. Primeiro você deverá transformar estes programas anteriores, em classes comuns (sem o método main e em arquivos separados – configuração 2), a fim de chamá-las no programa (classe) principal (menu) que você irá criar.
        //
        //Dica: Use como modelo o Menu1 dos exemplos anteriores.
        //
        //Observação: Crie um projeto a parte (ProjetoAEDI) para guardar todas estas classes e a classe principal que contém o método main (programa principal, o menu do projeto).

        int opcao = 0;
        while (opcao!=6) {
            System.out.println("Informe a opção desejada:");
            System.out.println("1- Números divisiveis por 5 e 7");
            System.out.println("2- Números elevado ao quadrado");
            System.out.println("3- Calcular o valor da area");
            System.out.println("4- Alunos saprovados e reprovados");
            System.out.println("5- Números divisiveis por 3 e 4");
            System.out.println("6- sair");
            System.out.println(">>> ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: numDIVISIVEL5E7.divisivel(); break;
                case 2: numELEVADO2.elevado();break;
                case 3: valorArea.area(); break;
                case 4: alunosAproRep.alunos(); break;
                case 5: numDIVISIVEL3E4.div3e4(); break;
                case 6: break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");break;
            }
        }
        System.out.println("FIM DO PROGRAMA");
        teclado.close();
    }
}
