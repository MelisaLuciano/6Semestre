package escom4.poo.doscv2.Seguridad;

import java.io.IOException;
import java.util.Scanner;
/**
 * M.A:Publico 
 * Tipo: Clase 
 * Esta clase cifrara la cadena recibida por el usuario 
 */
public class Cifrar{

     /**
     * M.A:Publico 
     * Tipo: String 
     * Método que cifra la cadena, recibe como parámetros texto y codigo que es el numero de
     * corrimiento que se le aplicará a la cada caracter
     * Se interpreta como código ASCII
     */
    public String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
}