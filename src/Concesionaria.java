import java.util.ArrayList;
import java.util.List;

public class Concesionaria implements Negocio {
	
private List<Vehiculo> lista;
	
	public Concesionaria(){
		lista = new ArrayList<Vehiculo>();
	}
	
	public void agregarVehiculo(Vehiculo v){
		lista.add(v);
	}
	
	public int obtenerTamañoLista(){
		int tamaño = lista.size();
		return tamaño;
	}
	
	public Vehiculo obtenerVehiculo(int i){
		return lista.get(i);
	}
	
	public List<Vehiculo> obtenerListaVehiculos(){
		return lista;
	}

}
