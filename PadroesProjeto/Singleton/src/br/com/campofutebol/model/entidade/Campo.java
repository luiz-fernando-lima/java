package br.com.campofutebol.model.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
@Entity
@Table(name = "Camp0000")
public class Campo {
	@Id
	@GeneratedValue
	private Integer codigo;
	@Column(name = "descricao")
	private String nome;

	@Deprecated
	private Campo() {
	}

	public Campo(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
}