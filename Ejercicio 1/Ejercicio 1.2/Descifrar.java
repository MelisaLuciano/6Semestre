package escom4.poo.doscv2.Seguridad;//Paquete donde se encuentra el archivo punto class de esta clas

/**
* M.A: Publico 
* Tipo: Clase 
* Clase la cual descifra las cadenas cifradas de la cadena que 
* el usuario ingreso
*/
public class Descifrar{

     /**
     * M.A:Publico 
     * Tipo: String 
     * Método que descifra la cadena, recibe como parámetros texto y codigo que es el numero de
     * corrimiento que se le aplicará a la cada caracter
     * Se interpreta como código ASCII
     */
    public static String descifradoCesar(String texto, int codigo) {

             /**
              * M.A:Publico 
              * Tipo: StringBuilder
              * Objeto para almacenar la cadena cifrada
              */
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;

         /** 
         * Inicia el ciclo for que es el que va a recorrer 
         * Toda la cadena que da el usuario       
         */

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString(); // Regresa el método, la cadena cifrada, convierte el dato a String
    }
}
