package biblioteca.acervo;

public class ItemAcervo implements InterfaceItemAcervo {
	private double custo;
	private String dataAlguel;
	private String dataDevolucao;
	private boolean pago = true;

	//Metódos Getters and Setters
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getDataAlguel() {
		return dataAlguel;
	}
	public void setDataAlguel(String dataAlguel) {
		this.dataAlguel = dataAlguel;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}



	//Métodos do acervo
	public ItemAcervo(){}
	
	public void alugar(){};
	
	public double devolver(){
		//só pro programa parar de reclamar, depois atualiza
		return 13212;
	}
	public boolean estaPago(){
		return pago;
	};
	
	public void reservar(int codigoUsuario){};

}
