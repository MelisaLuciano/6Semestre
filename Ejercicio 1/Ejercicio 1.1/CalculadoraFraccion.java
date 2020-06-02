import javax.swing.*; ///Importacion del paquete que permite el uso de JoptionPane
import escom3.poo3.doscv23.Fracciones.Fraccion;
   /**
     * Programa para resolver operaciones básicas 
     * con fracciones utilizando sobrecarga de métodos
     */

public class CalculadoraFraccion{
	public static void main(String args[]){
		/**
		 * Objetos de tipo fraccion
		 */
		Fraccion f1 = new Fraccion();
		Fraccion f2 = new Fraccion();
		Fraccion f3 = new Fraccion();
		Fraccion resultado = new Fraccion();

		/**
		 *variables que el usuario ingresa
		 */
		int numeradorResultado;
		int denominadorResultado;
		String auxOperacion;
		int numeroRepetirOperacion;
		String ciclo;
		String ciclo2;
		int flag = 1;
		int flag2 = 1;
		 /**
          * Menu principal que aparece en el inicio del programa
          * donde se elige el numero de fracciones que va a utilizar 
          */
		do{
			String opcion = JOptionPane.showInputDialog("Bienvenido a calculadora de fraccion\n" +
														"Elija el numero de la opcion deseada\n" +
														"Cuantas fracciones desea utilizar?\n" +
														"1.- Una\n" +
														"2.- Dos\n" +
														"3.- Tres");
			int numeroFracciones = Integer.parseInt(opcion);
		/**
		 * Verificacion de seleccion del numero de fracciones que se va a utilizaar
		 * Dependiendo del nuemero de fracciones son las operaciones que se van a utilizar 
		 */
			switch(numeroFracciones){
				case 1:
					String aux1 = JOptionPane.showInputDialog("Ingrese numerador de la fraccion: ");
					int numerador1 = Integer.parseInt(aux1);

					String aux2 = JOptionPane.showInputDialog("Ingrese denominador de la fraccion: ");
					int denominador1 = Integer.parseInt(aux2);

					f1 = new Fraccion(numerador1, denominador1);
					break;

				case 2:
					aux1 = JOptionPane.showInputDialog("Ingrese numerador de la primera fraccion: ");
					numerador1 = Integer.parseInt(aux1);

					aux2 = JOptionPane.showInputDialog("Ingrese denominador de la primera fraccion: ");
					denominador1 = Integer.parseInt(aux2);

					String aux3 = JOptionPane.showInputDialog("Ingrese numerador de la segunda fraccion: ");
					int numerador2 = Integer.parseInt(aux3);

					String aux4 = JOptionPane.showInputDialog("Ingrese denominador de la segunda fraccion: ");
					int denominador2 = Integer.parseInt(aux4);

					f1 = new Fraccion(numerador1, denominador1);
					f2 = new Fraccion(numerador2, denominador2);
					break;

				case 3:
					aux1 = JOptionPane.showInputDialog("Ingrese numerador de la primera fraccion: ");
					numerador1 = Integer.parseInt(aux1);

					aux2 = JOptionPane.showInputDialog("Ingrese denominador de la primera fraccion: ");
					denominador1 = Integer.parseInt(aux2);

					aux3 = JOptionPane.showInputDialog("Ingrese numerador de la segunda fraccion: ");
					numerador2 = Integer.parseInt(aux3);

					aux4 = JOptionPane.showInputDialog("Ingrese denominador de la segunda fraccion: ");
					denominador2 = Integer.parseInt(aux4);

					String aux5 = JOptionPane.showInputDialog("Ingrese numerador de la tercera fraccion: ");
					int numerador3 = Integer.parseInt(aux5);

					String aux6 = JOptionPane.showInputDialog("Ingrese denominador de la tercera fraccion: ");
					int denominador3 = Integer.parseInt(aux6);

					f1 = new Fraccion(numerador1, denominador1);
					f2 = new Fraccion(numerador2, denominador2);
					f3 = new Fraccion(numerador3, denominador3);
					break;
			/**
			 * En el caso de que el usuario no defina algún numero exacto de las anteriores
			 * Por default serán tres y su valor será de uno.
			 */
				default:
					JOptionPane.showMessageDialog(null, "La opcion no es valida\n\n Nota: Los valores de las fracciones seran 0/1");
					f1 = new Fraccion(0 , 1);
					f2 = new Fraccion(0 , 1);
					f3 = new Fraccion(0 , 1);
					break;
			}
			
			/**
			* Si el usuario desea hacer otras operaciones con los mismos valores que 
			* ingreso el usuario, se hace de nuevo el menu donde pregunta lo que desea hacer con las 
			* fracciones 
			*/
			do{
				String opcion2 = JOptionPane.showInputDialog("Que desea hacer con la/las fracciones?\n" +
															"Elija el numero de la opcion deseada\n" + 
															"1.- Sumar\n" +
															"2.- Restar\n" + 
															"3.- Multiplicar\n" +
															"4.- Dividir\n");
				int opcionOperacion = Integer.parseInt(opcion2);

				switch(opcionOperacion){
					case 1:
						switch(numeroFracciones){
							case 1:
								auxOperacion = JOptionPane.showInputDialog("Cuantas veces desea sumar la fraccion?\n\n" +
																			"Nota: Si su opcion es '1'\n" +
																			"el resultado sera la fraccion original");
								numeroRepetirOperacion = Integer.parseInt(auxOperacion);

								resultado = resultado.sumar(f1, f1);
								
								if (numeroRepetirOperacion == 1) {
									resultado = new Fraccion(f1.getNumerador(), f1.getDenominador());
								} else{
									for (int i = 1; i < numeroRepetirOperacion - 1; i++) {
										resultado = resultado.sumar(resultado, f1);
									}
									resultado = resultado.simplificar();
								}

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La suma de la fraccion es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 2:
								resultado = resultado.sumar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La suma de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 3:
								resultado = resultado.sumar(f1, f2);
								resultado = resultado.sumar(resultado, f3);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La suma de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							default:
								resultado = resultado.sumar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La suma de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
						}
						break;
					case 2:
						switch(numeroFracciones){
							case 1:
								auxOperacion = JOptionPane.showInputDialog("Cuantas veces desea restar la fraccion?\n\n" +
																			"Nota: Si su opcion es '1'\n" +
																			"el resultado sera la fraccion original");
								numeroRepetirOperacion = Integer.parseInt(auxOperacion);

								resultado = resultado.restar(f1, f1);

								if (numeroRepetirOperacion == 1) {
									resultado = new Fraccion(f1.getNumerador(), f1.getDenominador());
								} else{
									for (int i = 1; i < numeroRepetirOperacion - 1; i++) {
										resultado = resultado.restar(resultado, f1);
									}
									resultado = resultado.simplificar();
								}

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La resta de la fraccion es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 2:
								resultado = resultado.restar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La resta de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 3:
								resultado = resultado.restar(f1, f2);
								resultado = resultado.restar(resultado, f3);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La resta de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							default:
								resultado = resultado.restar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La resta de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
						}
						break;
					case 3:
						switch(numeroFracciones){
							case 1:
								auxOperacion = JOptionPane.showInputDialog("Cuantas veces desea multiplicar la fraccion?\n\n" +
																			"Nota: Si su opcion es '1'\n" +
																			"el resultado sera la fraccion original");
								numeroRepetirOperacion = Integer.parseInt(auxOperacion);

								resultado = resultado.multiplicar(f1, f1);
								
								if (numeroRepetirOperacion == 1) {
									resultado = new Fraccion(f1.getNumerador(), f1.getDenominador());
								} else{
									for (int i = 1; i < numeroRepetirOperacion - 1; i++) {
										resultado = resultado.multiplicar(resultado, f1);
									}
									resultado = resultado.simplificar();
								}

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La multiplicacion de la fraccion es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 2:
								resultado = resultado.multiplicar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La multiplicacion de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 3:
								resultado = resultado.multiplicar(f1, f2);
								resultado = resultado.multiplicar(resultado, f3);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La multiplicacion de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							default:
								resultado = resultado.multiplicar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La multiplicacion de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
						}
						break;
					case 4:
						switch(numeroFracciones){
							case 1:
								auxOperacion = JOptionPane.showInputDialog("Cuantas veces desea dividir la fraccion?\n\n" +
																			"Nota: Si su opcion es '1'\n" +
																			"el resultado sera la fraccion original");
								numeroRepetirOperacion = Integer.parseInt(auxOperacion);

								resultado = resultado.dividir(f1, f1);

								if (numeroRepetirOperacion == 1) {
									resultado = new Fraccion(f1.getNumerador(), f1.getDenominador());
								} else{
									for (int i = 1; i < numeroRepetirOperacion - 1; i++) {
										resultado = resultado.dividir(resultado, f1);
									}
									resultado = resultado.simplificar();
								}

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La division de la fraccion es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 2:
								resultado = resultado.dividir(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La division de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							case 3:
								resultado = resultado.dividir(f1, f2);
								resultado = resultado.dividir(resultado, f3);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La division de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
							default:
								resultado = resultado.sumar(f1, f2);
								resultado = resultado.simplificar();

								numeradorResultado = resultado.getNumerador();
								denominadorResultado = resultado.getDenominador();

								JOptionPane.showMessageDialog(null, "La division de las fracciones es: " + numeradorResultado + "/" + denominadorResultado);
								break;
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
						break;
				}

				ciclo2 = JOptionPane.showInputDialog("Desea hacer otra operacion con las mismas fracciones?\n" +
													"1.- Si\n" +
													"2.- No");
				flag = Integer.parseInt(ciclo2);
			}while(flag == 1); //Acaba el segundo "do"
			
			ciclo = JOptionPane.showInputDialog("Desea nuevas fracciones?\n" +
												"1.- Si\n" +
												"2.- No (Terminara el programa)");
			flag2 = Integer.parseInt(ciclo); 
		}while(flag2 == 1); //Termina el do principal
	}
}