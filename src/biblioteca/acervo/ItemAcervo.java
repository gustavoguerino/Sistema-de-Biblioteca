package biblioteca.acervo;
import biblioteca.usuario.Usuario;
import java.time.*;


/**
 * @author Mauro
 *
 */
public class ItemAcervo implements InterfaceItemAcervo {

	private double custo;
	private boolean pago = true;
	private boolean disponivel = true;

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	//Construtor
	public ItemAcervo(){}
	
	//Implementacao da logica de inserir uma data para alugar e devolver.
	public LocalDate diaAlugado(){
		LocalDate alugado = LocalDate.now();
		return alugado;
	}
	public LocalDate diaDevolucao(){
		//o usuario vai poder alugar o livro por 15 dias
		LocalDate alugado = LocalDate.now().plusDays(15);
		return alugado;
	}
	
	//logica para verificar se o usuario est� devendo ou nao
	public boolean dataEntrega(LocalDate diaDevolucao, LocalDate diaAlugado){
		boolean noprazo = false;
		Period data_entrega = Period.between(diaAlugado, diaDevolucao);
		if(data_entrega.getDays() > 0){
			noprazo = true;
		}
		return noprazo;
	}

}
