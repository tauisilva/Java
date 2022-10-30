
import java.util.ArrayList;
import java.util.List;

public class Tema {
	private String nome;
	private double valorAluguel;
	private String corToalha;
	private List<ItemTema> itens = new ArrayList<ItemTema>();
	private List<Tema> listaTemas = new ArrayList<Tema>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public String getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}
	public List<ItemTema> getItens() {
		return itens;
	}
	public void setItens(List<ItemTema> itens) {
		this.itens = itens;
	}
	
	
	public void listarTemas() {
		Tema temaPrincesas = new Tema();
		temaPrincesas.setCorToalha("rosa");
		temaPrincesas.setNome("princesas");
		temaPrincesas.setValorAluguel(599.99d);
		itens.add(new ItemTema("Castelo"));
		itens.add(new ItemTema("Balao"));
		itens.add(new ItemTema("Poster"));
		itens.add(new ItemTema("Mesas"));
		temaPrincesas.setItens(itens);
		
		Tema temaNemo = new Tema();
		temaNemo.setCorToalha("azul");
		temaNemo.setNome("nemo");
		temaNemo.setValorAluguel(300d);
		itens = new ArrayList<>();
		itens.add(new ItemTema("Aquario"));
		itens.add(new ItemTema("Peixe"));
		itens.add(new ItemTema("Fantasia"));
		temaNemo.setItens(itens);
		
		Tema temaCarros = new Tema();
		temaCarros.setCorToalha("vermelho");
		temaCarros.setNome("carros");
		temaCarros.setValorAluguel(200d);
		itens = new ArrayList<>();
		itens.add(new ItemTema("pneu"));
		itens.add(new ItemTema("autodromo"));
		itens.add(new ItemTema("relampago"));
		temaCarros.setItens(itens);
		
		listaTemas.add(temaPrincesas);
		listaTemas.add(temaNemo);
		listaTemas.add(temaCarros);
		listaTemas.forEach(tema ->{
			System.out.println("Nome do Tema: "+tema.getNome());
			System.out.println("Valor do Aluguel: "+tema.getValorAluguel());
			System.out.println("Cor da Toalha: "+tema.getCorToalha());
			System.out.println("----------------------------------------");
		});
	}
	
	public void consultarTema(String nomeTema) {
		for (Tema tema : listaTemas) {
			if(tema.getNome().equals(nomeTema)) {
				System.out.println("Nome do Tema: "+tema.getNome());
				System.out.println("Valor do Aluguel: "+tema.getValorAluguel());
				System.out.println("Cor da Toalha: "+tema.getCorToalha());
				System.out.println("----------------------------------------");
				tema.getItens().forEach(item -> {
					System.out.println("Itens: ");
					System.out.println(item.getItem());					
				});
			}
		}	
	}
	
}