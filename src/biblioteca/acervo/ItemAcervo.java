package biblioteca.acervo;
import biblioteca.usuario.Usuario;
import java.time.*;


/**
 * @author Mauro
 *
 */
public class ItemAcervo implements InterfaceItemAcervo {

	private double custo;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private LocalDate reservaLivro;
	private Period diasDevolucao;
	private boolean pago = true;
	private boolean disponivel = true;


	//Met�dos Getters and Setters, eles est�o ocultos, qualquer coisa clique no "+"
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
	public LocalDate getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(LocalDate dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	//Construtor
	public ItemAcervo(){}




	public boolean estaPago(){
		
		return pago;
	}



}
