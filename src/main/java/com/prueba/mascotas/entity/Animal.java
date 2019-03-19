package com.prueba.mascotas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codigo;
	
	@NotNull
	@Size(max = 64)
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	@Column(name="estado")
	private Estado estado;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="nacimiento")
	private Date nacimiento;
	
	@NotNull
	@Column(name="visitas")
	private int visitas;
	
//	@NotNull
//	@Size(max = 64)
//	@Column(name="nom_propietario")
//	private String nomPropietario;
//	
//	@NotNull
//	@Size(max = 64)
//	@Column(name="apel_propietario")
//	private String apelPropietario;
	
	@NotNull
	private Propietario propietario;
	
	@NotNull
	@Size(max = 64)
	@Column(name = "descripcion")
	private String descripcion;
	
	public Animal() {
	}

	public Animal(int codigo, String nombre, Estado estado, Date nacimiento, int visitas, Propietario propietario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.nacimiento = nacimiento;
		this.visitas = visitas;
		this.propietario = propietario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Animal [codigo=" + codigo + ", nombre=" + nombre + ", estado=" + estado + ", nacimiento=" + nacimiento
				+ ", visitas=" + visitas + "]";
	}
	
	public abstract String descripcion();
	
}
