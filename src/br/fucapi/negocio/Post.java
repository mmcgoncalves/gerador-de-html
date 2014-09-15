package br.fucapi.negocio;

import java.util.ArrayList;
import java.util.List;

public class Post {
	private String titulo;
	private String conteudo;
	private List<Comentario> comentario = new ArrayList<Comentario>();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void criarComentario(Comentario comentario) {
		this.comentario.add(comentario);
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void exibirComentario() {
		System.out.println("titulo:" + this.getTitulo());
		System.out.println(this.getConteudo());
		List<Comentario> comentarios = this.getComentario();
		for (Comentario c : comentarios) {
			System.out.println("Comentario:" + c.getConteudo());
		}
	}

}
