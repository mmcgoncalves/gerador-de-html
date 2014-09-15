package br.fucapi.negocio;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
	private Cabecalho cabecalho;
	private Rodape rodape;
	private List<BarraLateral> barraLateral = new ArrayList<BarraLateral>();
	private List<Post> post = new ArrayList<Post>();

	public String getCabecalho() {
		return cabecalho.getNomeDaEmpresa() + " - " + cabecalho.getLogoMarca();
	}

	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}

	public String getRodape() {
		return rodape.getTexto();
	}

	public void setRodape(Rodape rodape) {
		this.rodape = rodape;
	}

	public void exibir() {
		System.out.println("Cabeçalho:" + this.getCabecalho());
		List<BarraLateral> barras = this.getBarraLateral();
		for (BarraLateral barraLateral : barras) {
			System.out.println("Descricao da barra lateral:"
					+ barraLateral.getLado());
		}

		List<Post> posts = this.getPost();
		for (Post post : posts) {
			System.out.println("Post Titulo:" + post.getTitulo());
			System.out.println("Post Conteudo:" + post.getConteudo());
		}

		System.out.println("Rodapé:" + this.getRodape());
	}

	public List<BarraLateral> getBarraLateral() {
		return barraLateral;
	}

	public void criarBarraLateral(BarraLateral barraLateral) {
		this.barraLateral.add(barraLateral);
	}

	public List<Post> getPost() {
		return post;
	}

	public void criarPost(Post post) {
		this.post.add(post);
	}

	public void exibirPost() {
		System.out.println("Cabeçalho:" + this.getCabecalho());
		List<Post> posts = this.getPost();
		for (Post post : posts) {
			System.out.println("Post Titulo:" + post.getTitulo());
			System.out.println("Post Conteudo:" + post.getConteudo());
			System.out.println("-----------------");
			List<Comentario> comentarios = post.getComentario();
			for (Comentario comentario : comentarios) {
				System.out.println(comentario.getConteudo());

			}
		}

		System.out.println("Rodapé:" + this.getRodape());
	}

	// public

}
