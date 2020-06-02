import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pesa{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int pesoP = 20;
	String color;


	public int pesoUsuario(){
		System.out.println ("Ingrese su peso: ");
		String pesoU = br.readLine();
		int pesoUsuario = Integer.parseInt(pesoU);

		if (pesoUsuario <= 50){
			System.out.println ("Usted no puede cargar la pesa, está muy delgado");
		}else{
			System.out.println ("Pesa levantada sin esfuerzo B)");
		}
		return 0;
	}

}