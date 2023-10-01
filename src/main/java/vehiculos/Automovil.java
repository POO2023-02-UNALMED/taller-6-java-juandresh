package vehiculos;
public class Automovil extends Vehiculo{

	public static int automoviles = 0;
	private int puestos;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		automoviles++;
	}
	
	private int getPuestos() {
		return this.puestos;
	}
	private void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getAutomoviles() {
		return automoviles;
	}
}
