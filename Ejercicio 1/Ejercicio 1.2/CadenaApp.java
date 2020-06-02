import escom4.poo.doscv2.Seguridad.Cifrar;
import escom4.poo.doscv2.Seguridad.Descifrar;
import escom4.poo.doscv2.Datos.Cadena;

import javax.swing.*; ///Importacion del paquete que permite el uso de JoptionPane

public class CadenaApp{
   /**
     * Programa para cifrar una cadena que ingrese el usuario.
     * También se puede decifrar la cadena que se cifro.
     */
	public static void main (String [] args){
		/**
		 * Creación de objetos que se utilizarán en el programa
		 */
		Cifrar cifrado = new Cifrar();
		Descifrar descifrar = new Descifrar();
		Cadena dato1 = new Cadena();
		/**
		 * Variables que recibirán valores a través de JOptionPane
		 */
		boolean flag = true;
		String datos;
		int t = 0;
		/**
		 * Menu principal donde se le pide al usuario ingresar una cadena 
		 * para cifrarla, posteriormente se muestra una pantalla donde 
		 * está la cadena descifrada
		 */
		do{

			dato1.obtenerDato();
			datos = dato1.getDato();

			String cadCifrada = cifrado.cifradoCesar(datos, 3);
			t = dato1.setDato(cadCifrada);
			JOptionPane.showMessageDialog(null, "El texto cifrado es: " + dato1.getDato());
			
			datos = dato1.getDato();
			String cadDescifrada = descifrar.descifradoCesar(datos, 3);
			t = dato1.setDato(cadDescifrada);
			JOptionPane.showMessageDialog(null, "El texto descifrado es: " + dato1.getDato());

			int ax = JOptionPane.showConfirmDialog(null, "Desea ingresar otra cadena?");

	        if(ax == JOptionPane.YES_OPTION){
	        	flag = true;
	        } else if (ax == JOptionPane.NO_OPTION) {
	        	flag = false;
	        }
	    }while (flag == true); //Termina el do
	}
}