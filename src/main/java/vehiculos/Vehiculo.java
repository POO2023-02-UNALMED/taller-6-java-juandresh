package vehiculos;
public class Vehiculo {
	
	protected static int cantidadVehiculos = 0;
	protected String placa; //ya
	protected int puertas; //ya
	protected int velocidadMaxima; //ya
	protected String nombre; //ya
	protected int precio; //ya
	protected int peso; //ya
	protected String traccion; //ya
	protected Fabricante fabricante; //ya
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, 
					int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre =nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
	}
	
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		cantidadVehiculos = cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return("Automoviles: "+ Automovil.getAutomoviles() +"\nCamionetas: "+ Camioneta.getCamionetas() +"\nCamiones: "+ Camion.getCamiones());
	}
}
