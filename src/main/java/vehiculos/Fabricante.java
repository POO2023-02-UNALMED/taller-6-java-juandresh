package vehiculos;
import java.util.*;

public class Fabricante {
	
	static ArrayList<Fabricante> fabricantes =new ArrayList<>();
	private String nombre;
	private Pais pais;
	int cont;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais =pais;
		fabricantes.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
		
	public static Fabricante fabricaMayorVentas() {
		Fabricante mas = fabricantes.get(0);
		for(int i=1; i < fabricantes.size(); i++) {
			if(mas.cont < fabricantes.get(i).cont) {
				mas = fabricantes.get(i);
			}
		}
	return mas;
	}
}