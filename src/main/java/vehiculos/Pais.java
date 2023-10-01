package vehiculos;
import java.util.*;

public class Pais {
	
	static ArrayList<Pais> paises =new ArrayList<>();
	private String nombre;
	int cont;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais mas = paises.get(0);
		for(int i=1; i < paises.size(); i++) {
			if(mas.cont < paises.get(i).cont) {
				mas = paises.get(i);
			}
		}
	return mas;
	}
	
}
