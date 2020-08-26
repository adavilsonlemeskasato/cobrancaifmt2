package edu.ifmt.cobrancaifmt2.model;

public enum StatusTitulo {
	Pendente("Pendente"), Recebido("Recebido");

	private String descricao;

	StatusTitulo(String descricao) {

		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
