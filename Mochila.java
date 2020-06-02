import java.util.Scanner;

public class Mochila{

	Scanner sc = new Scanner(System.in);
	public String color;
	public int tam;
	public int peso;

	public boolean abrir (){
		System.out.println ("¿Va a abrir la mochila? Oprima S para si y N para no");
		String opcion = sc.nextLine();
		boolean b = true;

		if (opcion.equals("s")){
			System.out.println ("La mochila esta abierta");
			b = true;
		}else{
			System.out.println("La mochila esta cerrada");
			b = false;
		}
		return b;
	}
	
	public boolean almacenar (boolean abierto){

		if (abierto == true){
			boolean book = false;
			boolean pencil = false;

			System.out.println ("¿Desea guardar su lapiz? S para si y N para no");
			String opc =sc.nextLine();
			if(opc.equals("s")){
				System.out.println ("Guardo su lapiz :D");
				pencil = true;
			}else{
				System.out.println ("No se guardo lapiz");
			}

			System.out.println ("¿Desea guardar su libro? S para si y N para no");
			opc =sc.nextLine();
			if(opc.equals("s")){
				System.out.println ("Guardo su libro :D");
				book = true;
			}else{
				System.out.println ("No se guardo libro");
			}
		}else{
			System.out.println ("La mochila esta cerrada, no se puede ingresar nada");
		}
		
		return false;
	}
}