package biblioteca.acervo;

public interface InterfaceItemAcervo {
	void alugar();
	void devolver();
	boolean estaPago();
	void reservar(int codigoUsuario);
}
