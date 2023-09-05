package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@SequenceGenerator(name = "seq_clie", sequenceName = "seq_clie", allocationSize = 1)
	@GeneratedValue(generator = "seq_clie", strategy = GenerationType.SEQUENCE)
	@Column(name = "clie_id")
	private Integer id;

	@Column(name = "clie_nombre")
	private String nombre;

	@Column(name = "clie_apellido")
	private String apellido;

	@Column(name = "clie_edad")
	private Integer edad;

	@Column(name = "clie_correo")
	private String correo;

	@Column(name = "clie_cédula")
	private String cedula;

	@Column(name = "clie_dirección")
	private String direccion;
	
	@Column(name="clie_contraseña")
	private String contrasenia;
	
	@Column(name= "clie_usuario")
	private String usuarioGeneral;

	
	
	// SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getUsuarioGeneral() {
		return usuarioGeneral;
	}

	public void setUsuarioGeneral(String usuarioGeneral) {
		this.usuarioGeneral = usuarioGeneral;
	}



}
