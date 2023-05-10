package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Credencial;
import ar.edu.unlam.pb2.dominio.Empresa;

public class TestEmpresa {

	@Test
	public void queSePuedaCrearUnaEmpresa() {
		String nombre = "Queremos Aprobar";

		Empresa empresa = new Empresa(nombre);

		assertNotNull(empresa);
	}
	
	@Test
	public void queSePuedaCrearUnaCredencial() {
		Integer iDCredencial = 1;
		Credencial credencial = new Credencial(iDCredencial);

		assertNotNull(credencial);
	}
}
