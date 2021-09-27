import java.util.ArrayList;
import java.util.Scanner;

public class MainSistema {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        FilaDeAtendimento f1 = new FilaDeAtendimento();

        byte escolha;

        do{
            System.out.println("Digite sua opção:");
            System.out.println("1 - Adicionar um cliente na fila");
            System.out.println("2 - Ver cliente da fila");
            System.out.println("3 - Ver quantidade de clientes que estão na fila");
            System.out.println("4 - Atender um cliente");
            System.out.println("5 - Pesquisar um cliente pelo CPF");
            System.out.println("6 - Pesquisar clientes pelo interesse");
            System.out.println("7 - Retirar todos os clientes da fila");
            System.out.println("0 - Sair");
            escolha = ler.nextByte();
        
            switch(escolha) {
                case 1:
                     Pessoa p1 = new Pessoa ();
                     System.out.println("Informe o nome do cliente: ");
                     p1.setNome(ler.next());

                    do{
                        System.out.println("Informe o CPF do cliente: ");
                        p1.setCpf(ler.next());
                        if(p1.getCpf().length() != 11) {
                            System.out.println("Erro, CPF Inválido.");
                        }
                        } while (p1.getCpf().length() != 11);
                        do{
                            System.out.println("Informe o interesse do cliente");
                            System.out.println("1 - Pagamento de Conta");
                            System.out.println("2 - Recebimento de Salário");
                            System.out.println("3 - Outra Operação");
                            p1.setInteresse(ler.nextByte());
                            if(p1.getInteresse() < 1 | p1.getInteresse() > 3) {
                                System.out.println("Erro, inválido.");
                            }
                        } while (p1.getInteresse() < 1 | p1.getInteresse() > 3);
                        f1.adicionarPessoa(p1);
                        System.out.println("Pessoa adcionada na fila com  sucesso.");
                        break;
                case 2:
                     if(f1.getFila().isEmpty()){
                        System.out.println("Não há cliente na fila.");
                     }else{
                        System.out.println(f1);
                     }
                case 3:
                     System.out.println("Total de cliente na fila: " + f1.obterQuantidadeDePessoas());
                     break;
                case 4:
                     if(f1.getFila().isEmpty()){
                        System.out.println("Não há cliente para atender.");
                     }else {
                        System.out.println("Cliente: " + f1.atenderPessoa());
                    }
                    break;
                case 5: 
                       System.out.println("Informe o CPF do cliente para efetuar a pesquisa");
                       String nome = ler.next();
                       Pessoa resultado = f1.pesquisarPeloCPF(nome);
                       if(resultado == null){
                        System.out.println("Não há este cliente na fila");
                       }else {
                        System.out.println(resultado);
                       }
                       break;
                case 6: 
                      System.out.println("Informe o interesse para listar os clientes");       
                      System.out.println("1 - Pagamento de Conta");
                      System.out.println("2 - Recebimento de Salário");
                      System.out.println("3 - Outras Operações");
                      byte pesquisa = ler.nextByte();
                      ArrayList<Pessoa> lista = f1.pesquisarPessoasPeloInteresse(pesquisa);
                      if(lista.isEmpty()) {
                        System.out.println("Não há clientes com esse interesse");
                      }else{
                        System.out.println(lista);
                      }
                      break;
                case 7:
                      if(f1.getFila().isEmpty()) {
                        System.out.println("Não há clientes na fila");
                      }else{
                          f1.apagarTodos();
                          System.out.println("Clientes removidos da fila");
                      }            
                      break;
                case 0:
                System.out.println("Sistema Encerrado");
                break;
                default:
                System.out.println("Opção inválida"); 
                break;               
            }
            } while(escolha != 0);
    }
}