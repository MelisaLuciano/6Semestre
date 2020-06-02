import java.util.Scanner;

public class Encendedor{

	Scanner sc = new Scanner(System.in);
	String color = "rojo";
	int medida = 3;
	int contenido = 10;
	int resta = contenido - 1; 

	public int contiene (){
		System.out.println("El contenido del encendedor es: " + contenido + "ml");
		return resta;
	}


	public boolean apagar(){
		System.out.println ("Desea apagarlo? \nEscriba S para si y N para no");
		String resp1 = sc.nextLine();
		boolean apagar = true;
		

		if (resp1.equals("s")){

			System.out.println ("El encendedor está apagado con " + resta + "ml");
		}else{
			System.out.println ("El encendor se va a acabar ehh!!");
		}
		return false;
	}

	public boolean encender(){

		if(resta != 0){

			System.out.println ("Desea encender el encendedor? \nEscriba S para si o N para no");
			String resp = sc.nextLine();
			boolean enciende= true;
					
			if (resp.equals("s")){

			System.out.println ("Se encendio el encendedor :o");
			
			}else{
			System.out.println ("No se encendio :v");
			}
			return enciende;
		}
		return false;
	}

}