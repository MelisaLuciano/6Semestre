package escom4.poo.doscv2.Datos; //paquete donde se encentra la el punto class de esta clase

import javax.swing.*; ///Importacion del paquete que permite el uso de JoptionPane

/**
 * M.A:Publico 
 * Tipo: Clase 
 * Esta clase representa la cadena que el usuario va a ingresar
 */

public class Cadena{
	
	 /**
	 * M.A:Privado
	 * Tipo: String 
	 * Atributo que recibirá la clase principal
	 */
	private String dato;

	 /**
	 * M.A:Publico 
	 * Tipo: String 
	 * Este es un metodo "getter" el cual obtiene el dato 
	 */
	public String getDato(){
		return this.dato;
	}

	 /**
	 * M.A:Publico 
	 * Constructor de la clase  
	 * No tiene parametros 
	 */
	public Cadena(){
		this.dato = "";
	}

	/**
	 * M.A:Publico 
	 * Tipo: Entero
	 * Este es un metodo "setter" el cual asigna un valor al atributo dato de la clase
	 */
	public int setDato(String dato){
		this.dato = dato;
		return 1;
	}

	 /**
	 * M.A:Publico 
	 * Tipo: void
	 * Este es un metodo el cual obtiene el dato y muestra 
	 * una ventana 
	 */
	public void obtenerDato(){
		this.dato = JOptionPane.showInputDialog("Bienvenido a cifrado de cadena\n" + "Ingrese una cadena para cifrar:");
	}
}