public class Planta{
	
	public String Nombre;
	public String Tipo;
	boolean estado;

	public Planta(){
		estado = true; //cuando el estado es TRUE la planta esta viva
	}
	
	public int florecer(){
		System.out.println("La planta esta floreciendo... Siga cuidandola... :) ");
		return 0;
	}
	
	public void morir(){
		estado=false;
		System.out.println("La planta se ha secado... :( ");
	}
}