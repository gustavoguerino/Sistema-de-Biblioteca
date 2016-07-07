package biblioteca.acervo;

public interface InterfaceItemAcervo {
	void alugar();
	double devolver();
	boolean estaPago();
	void reservar(int codigoUsuario);
}
