package br.fucapi.teste;

import br.fucapi.negocio.BarraLateral;
import br.fucapi.negocio.Cabecalho;
import br.fucapi.negocio.Comentario;
import br.fucapi.negocio.Pagina;
import br.fucapi.negocio.Post;
import br.fucapi.negocio.Rodape;

public class TestaServico {

	public static void main(String[] args) {

		Cabecalho cabecalho = new Cabecalho();
		cabecalho.setNomeDaEmpresa("Leite do meu filho");
		cabecalho.setLogoMarca("bebê,mamando...");

		BarraLateral barralateral1 = new BarraLateral();
		barralateral1.setLado("Direita");

		BarraLateral barralateral2 = new BarraLateral();
		barralateral2.setLado("Esquerda");

		Post p1 = new Post();
		p1.setTitulo("T1");
		p1.setConteudo("Conteudo - T1");

		Post p2 = new Post();
		p2.setTitulo("T2");
		p2.setConteudo("Conteudo - T2");
		Comentario c1 = new Comentario();
		c1.setConteudo("Comentário 1");
		Comentario c2 = new Comentario();
		c2.setConteudo("Comentário 2");
		Comentario c3 = new Comentario();
		c3.setConteudo("Comentário 3");
		p2.criarComentario(c1);
		p2.criarComentario(c2);
		p2.criarComentario(c3);

		Post p3 = new Post();
		p3.setTitulo("T3");
		p3.setConteudo("Conteudo - T3");

		Rodape rodape = new Rodape();
		rodape.setTexto("_______Rodapé_________");

		Pagina pagina = new Pagina();

		pagina.setCabecalho(cabecalho);
		pagina.setRodape(rodape);
		pagina.criarBarraLateral(barralateral1);
		pagina.criarBarraLateral(barralateral2);
		pagina.criarPost(p1);
		pagina.criarPost(p2);
		pagina.criarPost(p3);

		pagina.exibir();

		System.out.println("------Post 2------");
		Pagina paginaPost = new Pagina();
		paginaPost.setCabecalho(cabecalho);
		paginaPost.setRodape(rodape);
		paginaPost.criarPost(p2);
		paginaPost.exibirPost();

	}
}
