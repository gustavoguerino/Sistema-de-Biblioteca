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

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	//Construtor
	public ItemAcervo(){}

	public boolean estaPago(){
		return pago;
	}
	
	//Implementacao da logica de inserir uma data para alugar e devolver.
	public LocalDate diaAlugado(int ano, int mes, int dia){
		LocalDate alugado = LocalDate.of(ano, mes, dia);
		return alugado;
	}
	public LocalDate diaDevolucao(int ano, int mes, int dia){
		LocalDate alugado = LocalDate.of(ano, mes, dia);
		return alugado;
	}

}
