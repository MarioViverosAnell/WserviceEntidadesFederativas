package com.mx.WsEntidadesFederativas.entidades;

import javax.persistence.*;

@Entity
@Table(name="estados_municipios")
public class EstadosMunicipios {

	@Id
	private int id;
	private int estados_id;
	private int municipios_id;
	

	public EstadosMunicipios() {
	}

	public EstadosMunicipios(int id) {
		this.id = id;
	}

	public EstadosMunicipios(int id, int estados_id, int municipios_id) {
		this.id = id;
		this.estados_id = estados_id;
		this.municipios_id = municipios_id;
		
	}

	@Override
	public String toString() {
		return "EstadosMunicipios [id=" + id + ", estados_id=" + estados_id + ", municipios_id=" + municipios_id
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstados_id() {
		return estados_id;
	}

	public void setEstados_id(int estados_id) {
		this.estados_id = estados_id;
	}

	public int getMunicipios_id() {
		return municipios_id;
	}

	public void setMunicipios_id(int municipios_id) {
		this.municipios_id = municipios_id;
	}
	
	
	
	

}
