package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {

	@NotBlank // NotBlank.requisicaoNovoPedido.nomeProduto=O campo nome do produto é obrigatório
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagem;
	
	private String descricao;

	public RequisicaoNovoPedido(String nomeProduto, String urlProduto, String urlImagem, String descricao) {
		this.nomeProduto = nomeProduto;
		this.urlProduto = urlProduto;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}
	
	public RequisicaoNovoPedido() {
		
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido(nomeProduto, null, null, urlProduto, urlImagem, descricao );
		
		return pedido;
	}
	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
