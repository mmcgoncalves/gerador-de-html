package br.fucapi.teste;

import java.util.ArrayList;
import java.util.List;

import br.fucapi.negocio.BarraLateral;
import br.fucapi.negocio.Cabecalho;
import br.fucapi.negocio.Comentario;
import br.fucapi.negocio.Miolo;
import br.fucapi.negocio.Pagina;
import br.fucapi.negocio.Post;
import br.fucapi.negocio.Rodape;

public class TestaPagina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cabecalho cabecalho = new Cabecalho();
		cabecalho.setNomeDaEmpresa("Leite do meu filho");
		cabecalho.setLogoMarca("bebê,mamando...");

		BarraLateral[] barra;
		barra = new BarraLateral[2];
		barra[0] = new BarraLateral();
		barra[0].setLado("Esquerdo");
		barra[1] = new BarraLateral();
		barra[1].setLado("Direito");

		List<Post> posts = new ArrayList<Post>();
		Post p = new Post();
		p.setTitulo("Post 1");
		p.setConteudo("Conteúdo Post 1");
		posts.add(p);

		List<Comentario> comentarios = new ArrayList<Comentario>();
		Comentario c1 = new Comentario();
		c1.setConteudo("Comentario1");
		Comentario c2 = new Comentario();
		c2.setConteudo("Comentario2");
		comentarios.add(c1);
		comentarios.add(c2);
		// p.setComentario(comentarios);

		Post p2 = new Post();
		p2.setTitulo("Post 2");
		p2.setConteudo("Conteúdo Post 2");
		posts.add(p2);

		Post p3 = new Post();
		p3.setTitulo("Post 3");
		p3.setConteudo("Conteúdo Post 3");
		posts.add(p3);

		Miolo miolo = new Miolo();
		miolo.setPost(posts);

		Rodape rodape = new Rodape();
		rodape.setTexto("_______Rodapé_________");

		Pagina minhaPagina = new Pagina();
		minhaPagina.setCabecalho(cabecalho);
		/*
		 * minhaPagina.setBarraLateral(barra); minhaPagina.setMiolo(miolo);
		 */
		minhaPagina.setRodape(rodape);

		minhaPagina.exibir();

		System.out.println("Click Post" + p.getTitulo());
		cabecalho.setNomeDaEmpresa("Mudar cabecalho");
		Pagina paginaPost = new Pagina();
		paginaPost.setCabecalho(cabecalho);
		paginaPost.setRodape(rodape);
		Miolo m1 = new Miolo();
		List<Post> post = new ArrayList<Post>();
		post.add(p);

		m1.setPost(post);

		// paginaPost.setMiolo(m1);
		paginaPost.setRodape(rodape);
		paginaPost.exibirPost();

		minhaPagina.exibir();
		paginaPost.exibirPost();

	}

}
