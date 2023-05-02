package com.rgibert.ta27_ex2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto {

	// Atributos
	@Id
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;

	@OneToMany
	@JoinColumn(name = "id")
	private List<AsignadoA> asignadoA;

	// Constructores
	public Proyecto() {

	}

	public Proyecto(String id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;

	}

// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras() {
		return horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignadoA=" + asignadoA + "]";
	}

}
