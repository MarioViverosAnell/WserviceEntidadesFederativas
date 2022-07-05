package com.mx.WsEntidadesFederativas.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="municipios")
public class Municipios {
	@Id
	private int id;
	private String municipio;
	
	 @JoinTable(
		        name = "estados_municipios",
		        joinColumns = @JoinColumn(name = "municipios_id"),
		        inverseJoinColumns = @JoinColumn(name="estados_id")
		    )

	@ManyToMany(cascade = CascadeType.ALL)
	public List<Estados> estados = new ArrayList<>();
	

	public Municipios() {
	}
	
	public Municipios(int id, String municipio) {
		this.id = id;
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return "\n Municipios [id=" + id + ", municipio=" + municipio + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	

	
	
}
