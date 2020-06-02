import java.util.Scanner; 	//Se importa la clase de scanner para obtener información mediante teclado
public class Principal{ 	//Se crea la clase principal publica para que se pueda acceder 

//La clase principal es publica, aqui es donde está el main principal
	public static void main(String args[]){
//Se instancian los objetos de las clases que se utilizarán
/*primero se utiliza el nombre de la clase, después se pone el identificador del objeto y new es para crear el objeto; como es un método
se ponen los paréntesis hace referencia al constructor de la clase, en este caso como no recibe parámetros se deja vacio y así se hace para cada uno de 
los objetos*/
		Jardin gar = new Jardin();
		Planta pla = new Planta();
		Jardinero jar = new Jardinero();
		Maceta ma = new Maceta();
		
/*Se muestra el menu donde va a interactuar el usuario que es el "System" */		
		System.out.println("Seleccione la accion a realizar... \n 1.-Plantar \n 2.-Cuidar Planta \n 3.-Cambiar maceta\n\n");
		//"n" es la varible donde se va a guardar la opcion que elija el usuario
		int n;
		/*Se está utilizando la clase escaner y al objeto de esa clase se le llama lectura, se está instanciando un objeto del tipo Scanner
		System.in es un parametro que recibe el constructor Scanner*/
		Scanner lectura = new Scanner(System.in);
		/*Aqui se guarda la opcion que elige el usuario, lectura.nextInt() indica la lectura del entero que se ingresa por medio de teclado*/
		n = lectura.nextInt();
		
		//Se crea un switch donde tiene como parámetro n que es el que indica la opcion que selecciono el usuario para elegir el caso que está dentro del switch
		switch (n){
			/*En el primer caso se pone como condición que mientras la maceta esté libre y el jardin disponible se manda a llamar el método sembrar planta
			y de la clase jardin el metodo recibir planta del cual recibe como parametro la maceta */
			case 1:
				if(ma.Estado==false && jar.disp==true)
				jar.sembrarPlanta();
				gar.RecibirPlanta(ma);
				break;
			/*si se elije el caso dos se manda a llamar la clase planta donde debe ser cierto que exista y que el jardin esté disponible
			entonces se llama al objeto jardinero con el metodo regarplanta sin ningun parámetro*/		
			case 2:
				if(pla.estado==true && jar.disp==true){
				jar.regarPlanta(); 	
				jar.abonarPlanta(); 	//Se manda a llamar el objeto jardinero con el metodo abonar planta 
				pla.florecer();}		//El objeto planta con el metodo florecer 
					else if(pla.estado==false && jar.disp==true){ //Pero si la planta no está y el jardinero tampoco entonces 
						pla.morir();								//se utiliza el objeto planta con el método morir
					}
					break;
			/*En este ultimo caso se crea un nuevo objeto que se llama m2 de la clase Maceta el cual se le asigna un valor 
			para indicar el nombre del nuevo objeto maceta creado*/		
			case 3:
				Maceta m2 = new Maceta();
				m2.numMac=2;
				/*si el nuevo objeto m2 no existe y el jardinero está, entonces el objeto jardinero llamará al metodo cambiar maceta, el cual recibira como parametro
				ma y el jardin llamará al metodo recibir planta el cual tendrá como parámetro el nuevo objeto que se creo */
				if(m2.Estado==false && jar.disp==true)
				jar.cambiarMaceta(ma);
				gar.RecibirPlanta(m2);
				break;	
		}
	}
}