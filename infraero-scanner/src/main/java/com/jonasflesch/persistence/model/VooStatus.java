package com.jonasflesch.persistence.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "VOO_STATUS_SEQ", initialValue = 1)
public class VooStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOO_STATUS_SEQ")
	private Long idVooStatus;

	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	@ManyToOne
	@JoinColumn(name = "idVoo", nullable = false, updatable = false)
	private Voo voo;

	public Long getIdVooStatus() {
		return idVooStatus;
	}

	public void setIdVooStatus(Long idVooStatus) {
		this.idVooStatus = idVooStatus;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
