package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Empresa {
	private String nombre;
	private HashSet<Empleado> empleados;
	private HashSet<Puerta> puertas;
	private HashSet<Credencial> credenciales;
	private HashSet<Acceso> accesos;
	//private HashSet<Contrato> contratos;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new HashSet<Empleado>();
		this.puertas = new HashSet<Puerta>();
		this.credenciales = new HashSet<Credencial>();
		this.accesos = new HashSet<Acceso>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashSet<Empleado> empleados) {
		this.empleados = empleados;
	}

	public HashSet<Puerta> getPuertas() {
		return puertas;
	}

	public void setPuertas(HashSet<Puerta> puertas) {
		this.puertas = puertas;
	}

	public HashSet<Credencial> getCredenciales() {
		return credenciales;
	}

	public void setCredenciales(HashSet<Credencial> credenciales) {
		this.credenciales = credenciales;
	}

	public HashSet<Acceso> getAccesos() {
		return accesos;
	}

	public void setAccesos(HashSet<Acceso> accesos) {
		this.accesos = accesos;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void agregarCredencial(Credencial credencial) {
		this.credenciales.add(credencial);
	}

	public void agregarPuerta(Puerta puerta) {
		this.puertas.add(puerta);
	}

}
