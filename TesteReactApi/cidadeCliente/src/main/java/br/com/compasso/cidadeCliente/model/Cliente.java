package br.com.compasso.cidadeCliente.model;





import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;




@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String sexo;
	private Date dataDeNascimento;
	private int idade;
	@OneToOne
	private Cidade cidade;
	
	public Cliente() {}
	
	public Cliente(String nome, String sexo, Date dataDeNascimento, int idade, Cidade cidade) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.idade = idade;
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public Cidade getCidade() {
		return cidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
}
