package escom3.poo3.doscv23.Fracciones;
import java.lang.Math;
/**
 * M.A:Publico 
 * Tipo: Clase 
 * Esta clase representa las fracciones
 */
public class Fraccion{
	private int numerador;
	private int denominador;

	 /**
     * Constructor por default que crea una fraccion con valor cero 
     */
	public Fraccion(){
		numerador = 0;
		denominador = 1;
	}
	 /**
     * Constructor que define el usuario
	 * parametros de entrada "x" y "y"
	 * numerador y denominador 
     */
	public Fraccion(int x, int y){
		numerador = x;
		denominador = y;
	}
    /**
     * M.A: publico
     * Tipo: entero
     * Sin parametros de entrada
     * Devuelve el valor del numerador 
     */
	public int getNumerador(){
		return this.numerador;
	}
    /**
     * M.A: publico
     * Tipo que devuelve: entero
     * Sin parametros de entrada
     * Devuelve el valor del denominador 
     */
	public int getDenominador(){
		return this.denominador;
	}
    /**
     * M.A: publico
     * Tipo que devuelve: Fraccion
     * Con parametros de entrada: dos objetos de tipo fraccion
     * Devuelve la suma de las fracciones de entrada  
     */
	public Fraccion sumar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.denominador + b.numerador * a.denominador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}
    /**
     * M.A: publico
     * Tipo que devuelve: Fraccion
     * Con parametros de entrada: dos objetos de tipo fraccion
     * Devuelve la resta de las fracciones de entrada  
     */
	public Fraccion restar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.denominador - b.numerador * a.denominador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}
    /**
     * M.A: publico
     * Tipo que devuelve: Fraccion
     * Con parametros de entrada: dos objetos de tipo fraccion
     * Devuelve la multiplicación de las fracciones de entrada  
     */
	public Fraccion multiplicar(Fraccion a, Fraccion b){
		Fraccion c = new Fraccion();
     	c.numerador = a.numerador * b.numerador;
     	c.denominador = a.denominador * b.denominador;
     	return c;
	}
    /**
     * M.A: publico
     * Tipo que devuelve: Fraccion
     * Con parametros de entrada: dos objetos de tipo fraccion
     * Devuelve la división de las fracciones de entrada  
     */
	public Fraccion dividir(Fraccion a, Fraccion b){
		return new Fraccion(a.numerador * b.denominador, a.denominador * b.numerador);
	}
    /**
     * M.A: private
     * Tipo que devuelve: entero
     * sin parámetros de entrada
     * Devuelve el máximo común divisor entre dos números
     * Utilizada en la simplificación  
     */
	private int mcd(){
     	int u = Math.abs(numerador);
     	int v = Math.abs(denominador);
     	if(v == 0){
        	return u;
     	}
     	int r;
     	while(v != 0){
          	r = u % v;
          	u = v;
          	v = r;
     	}
     	return u;
  	}
    /**
     * M.A: publico
     * Tipo que devuelve: Fraccion
     * Sin parámetros de entrada
     * Devuelve la simplificación de una fracción  
     */
  	public Fraccion simplificar(){
     	int dividir = mcd();
     	numerador /= dividir;
     	denominador /= dividir;
     	return this;
  	}

}