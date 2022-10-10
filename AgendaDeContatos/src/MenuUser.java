import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuUser {
    Agenda cct;
    Contato ct;

    public MenuUser() {
        super();
        this.cct = new Agenda();
        this.ct = new Contato();
    }

    public void meuMenu() {
        Scanner dado = new Scanner(System.in);
        int escolha;
        String opcoes = "[      Menu de Opcoes      ]"
                + "\n1- Adiconar novo Contato"
                + "\n2- Atualizar Contato"
                + "\n3- Listar Contatos"
                + "\n4- Listar pelo ID"
                + "\n5- Listar pelo Nome"
                + "\n6- Remover um Contato pelo ID"
                + "\n0- Sair do sistema"
                + "\n\nEscolha uma das opcoes";
        do {
        escolha = Integer.parseInt(JOptionPane.showInputDialog(opcoes));        
        switch (escolha) {
            case 1: {
                
                System.out.println("Adicionar contato: "
                        + "\nNome: ");                
                ct.setNome(dado.nextLine());
                System.out.println("Telefone: ");
                ct.setTelefone(dado.nextLine());
                System.out.println("Email: ");
                ct.setEmail(dado.nextLine());
                
                cct.adicionar(ct);
                break;
            }
            case 2: {
                cct.consultaTudo();
                ct.setId(Integer.parseInt(JOptionPane.showInputDialog(
                        "Entre com o ID do contato que deseja atualizar")));     
                System.out.println("Atualizar contato: "
                        + "\nNome: ");                
                ct.setNome(dado.nextLine());
                System.out.println("Telefone: ");
                ct.setTelefone(dado.nextLine());
                System.out.println("Email: ");
                ct.setEmail(dado.nextLine());                
                
                cct.atualizar(ct);
                break;
            }
            case 3: {
                cct.consultaTudo();                
                break;
            }
            case 4: {
                cct.consultaID(Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Informe o ID do Contato: ")));
                break;
            }
            case 5: {
                cct.consultaNome(JOptionPane.showInputDialog(
                        "Digite o nome ou parte dele: "));
                break;
            }
            case 6: {
                cct.consultaTudo();
                cct.remover(Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Informe o ID do Contato que deseja remover: ")));
                break;
            }
            case 0: {
                System.out.println("Ok, Bye!");
                System.exit(0);
                break;
            }
            default:
                escolha = 0;
                break;
        }        
        }while(escolha !=0);
        dado.close();
    }

}
