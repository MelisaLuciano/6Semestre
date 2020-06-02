public class Jardinero{
	
	boolean disp;
	
	public Jardinero(){
		disp=true;
	}
	
	public void sembrarPlanta(){
		System.out.println("La planta ha sido sembrada en la maceta");
	}
	
	public void regarPlanta(){
		System.out.println("\nLa planta ha sido regada");
	}
	public void abonarPlanta(){
		System.out.println("\nLa planta ha sido abonada");
	}
	
	public void cambiarMaceta(Maceta m){
		System.out.println("\nLa planta ha sido cambiada de maceta");	
		System.out.println("\nLa maceta " + m.numMac + " esta libre");
	}
	
	public void retirarPlanta(){
		System.out.println("\nLa planta ha sido cambiada de maceta");
		
	}
}