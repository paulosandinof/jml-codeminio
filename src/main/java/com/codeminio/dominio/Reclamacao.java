package com.codeminio.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Reclamacao extends AuditedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RECLAMACAO")
	@SequenceGenerator(name = "SEQ_RECLAMACAO", sequenceName = "id_seq_reclamacao", allocationSize = 1)
	private Integer id;
	
	@Column()
	private String titulo;

	@Column(columnDefinition = "TEXT")
	private String texto;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario morador;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
	    return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getMorador() {
		return morador;
	}

	public void setMorador(Usuario morador) {
		this.morador = morador;
	}
}
