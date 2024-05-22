package rafaativ;
import java.util.Scanner;
import java.util.ArrayList;

public class EmpregadoAplicado {
    static ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("""
                    1 - Criar novo empregado
                    2 - Promover empregado
                    3 - Aumentar o salario do empregado
                    4 - Demitir empregado
                    5 - Fazer aniversário do empregado
                    6 - Mostrar detalhes dos empregados
                    7 - Sair
                    """);
            exibirEmpregados();
            System.out.println("Total de empregados: " + empregados.size());
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    Empregado empregado = new Empregado("a", 10, 10);
                    System.out.println("Digite o nome do empregado: ");
                    String nome = input.nextLine();
                    empregado.setNome(nome);
                    System.out.println("Digite a idade desse empregado: ");
                    int idade = input.nextInt();
                    empregado.setIdade(idade);
                    System.out.println("Digite o salario do empregado: ");
                    double salario = input.nextDouble();
                    empregado.setSalario(salario);
                    empregados.add(empregado);
                    System.out.println(empregados.toString() + " Foi criado com sucesso.");
                    System.out.println(empregados.size());
                    break;
                case 2:
                    exibirEmpregados();
                    System.out.println("Qual empregado você gostaria de promover?");
                    int promocao = input.nextInt();
                    promocao -= 1;
                    empregados.get(promocao).promover();
                    System.out.println("O empregado " + empregados.get(promocao).getNome()
                            + " foi promovido! E agora ganha " + empregados.get(promocao).getSalario());
                    break;
                case 3:
                    exibirEmpregados();
                    System.out.println("Você gostaria de aumentar o salário de que empregado?");
                    int aumento = input.nextInt();
                    aumento -= 1;
                    empregados.get(aumento).promover();
                    System.out.println(" O empregado " + empregados.get(aumento).getNome()
                            + " teve um aumento! E agora ganha " + empregados.get(aumento).getSalario() + "R$");
                    break;
                case 4:
                    exibirEmpregados();
                    System.out.println("Qual empregado gostaria de demitir?");
                    int demitido = input.nextInt();
                    demitido -= 1;
                    System.out.println("Qual o motivo da demissão?");
                    System.out.println("""
                            1: Justa causa.
                            2: Decisão do empregador.
                            3: Aposentadoria.
                                """);
                    int motivo = input.nextInt();
                    System.out.println(empregados.get(demitido).demitir(motivo));

                    System.out.println(" O empregado " + empregados.get(demitido).getNome()
                            + " foi demitido");
                    empregados.remove(demitido);
                    break;
                case 5:
                    exibirEmpregados();
                    System.out.println("Qual empregado está fazendo aniversário? ");
                    int aniversariante = input.nextInt();
                    aniversariante -= 1;
                    empregados.get(aniversariante).aniversario();
                    System.out.println("O empregado " + empregados.get(aniversariante).getNome()
                            + " fez anivesário, e agora tem " + empregados.get(aniversariante).getIdade() + " anos!!");
                    break;
                case 6:
                    exibirEmpregados();
                    break;
                default:
                    break;
            }
        } while (opcao != 7);
    }

    public static void exibirEmpregados() {
        System.out.println("Lista de empregados:");
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println("O Empregado de número = " + (i + 1) + " " + empregados.get(i).toString());
        }
    }
}
