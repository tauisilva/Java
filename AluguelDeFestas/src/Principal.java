
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String opcao;
		Tema tema = new Tema();
		Aluguel aluguel = new Aluguel();
		
	
		do {
			System.out.println("Agenda de Contatos\n"
					+ "1 - Listar tema\n"
					+ "2 - Consultar tema\n"
					+ "3 - Cadastrar aluguel\n"
					+ "4 - Imprimir aluguel\n"
					+ "0 - Sair");
			opcao = c.next();
			switch(opcao) {
				case "1":
					tema.listarTemas();
					break;
				case "2":
					System.out.println("Informe um tema: ");
					String nomeTema=c.next();
					tema.consultarTema(nomeTema);
					break;
				case "3":
				aluguel.cadastrarAluguel("Taui", "(61)99999-9999", "Brasilia", "73000-000", "Planaltina", "V.Amanhecer", "casa", "DF", "111", "carros", "29/10/2022", "18:00", "23:00",190);
					break;
				case "4":
					aluguel.imprimirAluguel();
					break;
				case "0":
					System.out.println("OK! Saindo, ate a proxima. Bye!");
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(opcao!="0");
		
		
	}

}