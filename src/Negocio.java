import java.util.List;

public interface Negocio {
	
	public void agregarVehiculo(Vehiculo v);
		
	public int obtenerTama�oLista();
	
	public Vehiculo obtenerVehiculo(int i);
	
	public List<Vehiculo> obtenerListaVehiculos();

}
