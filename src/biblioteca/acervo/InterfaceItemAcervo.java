package biblioteca.acervo;

import biblioteca.usuario.Usuario;

public interface InterfaceItemAcervo {
	void alugar(Usuario user);
	void devolver();
	boolean estaPago();
	void reservar(int codigoUsuario);
}
