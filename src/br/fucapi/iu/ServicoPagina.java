package br.fucapi.iu;

import br.fucapi.negocio.Cabecalho;
import br.fucapi.negocio.Pagina;
import br.fucapi.negocio.Rodape;

public class ServicoPagina {
	private Pagina pagina;

	/*
	 * public void criarPost(Post post) { //this.pagina.setPost(post); }
	 */

	public void criarCabecalho(Cabecalho cabecalho) {
		this.pagina.setCabecalho(cabecalho);
	}

	public void criarRodape(Rodape rodape) {
		this.pagina.setRodape(rodape);
	}

	/*
	 * public void criarBarraLateral(BarraLateral[] barralateral) {
	 * //this.pagina.setBarraLateral(barralateral); }
	 */

	public void exibir() {
		this.pagina.exibir();
	}

	public void ListarPost() {
		this.pagina.getPost();
	}

}
