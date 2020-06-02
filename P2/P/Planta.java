//Se declara publica la clase planta porque se utiliza en otras clases 
public class Planta{
	
	//Son los atributos de la clase planta
	public String Nombre;
	public String Tipo;
	boolean estado;

	//Se hace el constructor planta
	public Planta(){
		estado = true; //cuando el estado es TRUE la planta esta viva
	}

	//Se hace un metodo el cual regresará un valor entero (El tipo de dato)
	public int florecer(){
		//Se muestra la accion cuando se manda a llamar a este metodo
		System.out.println("La planta esta floreciendo... Siga cuidandola... :) ");
		return 0; //Regresa un cero
	}
	
	//Se hace un metodo que no regresa nada
	public void morir(){
		//indica el estado de la planta
		estado = false;
		System.out.println("La planta se ha secado... :( ");
	}
}