package com.rgibert.ta27_ex3.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "maquina_id")
	private MaquinaRegistradora maquinaRegistradora;

	@ManyToOne
	@JoinColumn(name = "cajero_id")
	private Cajero cajero;

	// Constructores
	public Venta() {

	}

	public Venta(int id, Producto producto, MaquinaRegistradora maquinaRegistradora, Cajero cajero) {
		this.id = id;
		this.producto = producto;
		this.maquinaRegistradora = maquinaRegistradora;
		this.cajero = cajero;
	}

	// Getters
	public int getId() {
		return id;
	}

	public Producto getProducto() {
		return producto;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public Cajero getCajero() {
		return cajero;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + producto + ", maquinaRegistradora=" + maquinaRegistradora
				+ ", cajero=" + cajero + "]";
	}

}
