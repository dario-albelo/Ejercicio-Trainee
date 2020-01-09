import java.text.DecimalFormat;
import java.util.Collections;

public class Main {
	
	public static void main(String []args){
		
		Concesionaria miConcesionaria = new Concesionaria();
		DecimalFormat formato = new DecimalFormat("#,###.00");
		
		miConcesionaria.agregarVehiculo(new Auto("Peugeot", "206", 200000.00, "4"));
		miConcesionaria.agregarVehiculo(new Moto("Honda", "Titan", 60000.00, "125c"));
		miConcesionaria.agregarVehiculo(new Auto("Peugeot", "208", 250000.00, "5"));
		miConcesionaria.agregarVehiculo(new Moto("Yamaha", "YBR", 80500.50 , "160c"));
		
		for(int i=0; i < miConcesionaria.obtenerTama�oLista(); i++){
			System.out.println(miConcesionaria.obtenerVehiculo(i).toString()+ " // Precio: $" + formato.format(miConcesionaria.obtenerVehiculo(i).getPrecio()));
		}
		
		Collections.sort(miConcesionaria.obtenerListaVehiculos(), Collections.reverseOrder());
		
		System.out.println("=======================================");
		System.out.println("Veh�culo m�s caro: " + miConcesionaria.obtenerVehiculo(0).getMarca() + " " + miConcesionaria.obtenerVehiculo(0).getModelo());
		System.out.println("Veh�culo m�s barato: " + miConcesionaria.obtenerVehiculo(miConcesionaria.obtenerTama�oLista()-1).getMarca() + " " + miConcesionaria.obtenerVehiculo(miConcesionaria.obtenerTama�oLista()-1).getModelo());
		
		for(int i=0; i< miConcesionaria.obtenerTama�oLista(); i++) {
			if(miConcesionaria.obtenerVehiculo(i).getModelo().indexOf("Y")!=-1) {
				System.out.println("Veh�culo que contiene en el modelo la letra 'Y': " + miConcesionaria.obtenerVehiculo(i).getMarca() + " " + miConcesionaria.obtenerVehiculo(i).getModelo() + " " + formato.format(miConcesionaria.obtenerVehiculo(i).getPrecio()));
			}
		}
		
		System.out.println("=======================================");
		System.out.println("Veh�culos ordenados por precio de mayor a menor:");
		
		for(int i=0; i < miConcesionaria.obtenerTama�oLista(); i++){
			System.out.println(miConcesionaria.obtenerVehiculo(i).getMarca() + " "+ miConcesionaria.obtenerVehiculo(i).getModelo());
		
		}
		
	}

}
