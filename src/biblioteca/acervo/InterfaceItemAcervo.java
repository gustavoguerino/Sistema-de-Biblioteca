package biblioteca.acervo;

import java.time.LocalDate;

import biblioteca.usuario.Usuario;

public interface InterfaceItemAcervo {
	boolean estaPago();
	public LocalDate diaAlugado();
	public LocalDate diaDevolucao();
	public boolean dataEntrega(LocalDate diaDevolucao, LocalDate diaAlugado);
}
