import java.util.Scanner;

public class Gato{

	Scanner sc = new Scanner(System.in);
	String chiquito;
	String suave;
	String ojos;
	String orejas;


	public boolean saltar(){

		System.out.println ("Quiere que el gato salte? \nElija S para si o N para no");
		String answer = sc.nextLine();
		boolean salta= true;

		if(answer.equals("s")){
			System.out.println ("El gato salto :o ");
		}else{
			System.out.println ("El gato no salto :(");
		}
		return salta;	
	}

	public boolean jugarConElGato(){

		System.out.println("Quiere jugar con el gato? \nElija S para si o N para no");
		String answer2 = sc.nextLine();
		boolean juega = true;

		if (answer2.equals("s")){
			System.out.println ("El gato no quiere jugar :v");
			juega = false; 
			
		}else{
			System.out.println ("El gato quiere jugar pero no juagará :vv");
			juega = true;
		}
		return juega;
	}
}

