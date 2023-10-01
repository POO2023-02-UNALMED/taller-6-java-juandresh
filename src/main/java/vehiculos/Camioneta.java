package vehiculos;
public class Camioneta extends Vehiculo{
	
	public static int camionetas = 0;
	private boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90 , nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		camionetas++;
	}
	
	private boolean isVolco() {
		return this.volco;
	}
	private void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCamionetas() {
		return camionetas;
	}
}
