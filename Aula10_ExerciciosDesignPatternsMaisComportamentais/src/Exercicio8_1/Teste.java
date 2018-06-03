package Exercicio8_1;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		new Consumidor("Pedro Bilal", noticiario);
		noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Topicos interessantes!");
		new Consumidor("John", noticiario);
		noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Topico ruim");

	}
}
