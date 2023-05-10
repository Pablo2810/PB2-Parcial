package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Credencial {
	private Integer id;
	private HashSet<Integer> permisos;
	//Private Enum tipoCredencial;
	
	public Credencial(Integer idCredencial) {
		this.id = idCredencial;
		this.permisos = new HashSet<Integer>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HashSet<Integer> getPermisos() {
		return permisos;
	}

	public void setPermisos(HashSet<Integer> permisos) {
		this.permisos = permisos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credencial other = (Credencial) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
