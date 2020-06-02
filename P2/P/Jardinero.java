//Se hace publico porque se utiliza en otras clases
public class Jardinero{
	
	//Son los atributos de la clase
	boolean disp;
	
	//Es el constructor de la clase
	public Jardinero(){
		//indica la disponibilidad del jardinero
		disp = true;
	}
	
	//Se crea el método donde solo se imprime la accion que realiza el jardinero 
	public void sembrarPlanta(){
		System.out.println("La planta ha sido sembrada en la maceta");
	}
	
	//Se crea el método donde se imprime la acción que realiza el jardinero
	public void regarPlanta(){
		System.out.println("\nLa planta ha sido regada");
	}

	//Se crea el método donde se imprime la acción que realiza el jardinero
	public void abonarPlanta(){
		System.out.println("\nLa planta ha sido abonada");
	}
	
	//Se crea el método donde se imprime la acción que realiza el jardinero
	public void cambiarMaceta(Maceta m){
		System.out.println("\nLa planta ha sido cambiada de maceta");	
		//Se imprime el numero de la maceta del cual está libre la maceta ya que no contiene a la planta
		System.out.println("\nLa maceta " + m.numMac + " esta libre");
	}
	
	//Se crea el método donde se imprime la acción que realiza el jardinero
	public void retirarPlanta(){
		System.out.println("\nLa planta ha sido cambiada de maceta");
	}
}