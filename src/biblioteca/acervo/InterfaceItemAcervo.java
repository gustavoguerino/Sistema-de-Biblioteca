package biblioteca.acervo;

import java.time.LocalDate;

import biblioteca.usuario.Usuario;

public interface InterfaceItemAcervo {
	boolean estaPago();
	public LocalDate diaAlugado(int ano, int mes, int dia);
	public LocalDate diaDevolucao(int ano, int mes, int dia);
}
