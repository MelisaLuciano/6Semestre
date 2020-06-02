package Persona;
/**
 * M.A:Publico 
 * Tipo: Clase 
 * Esta clase representa los datos de una persona
 */
public class Persona{
	/**
     * M.A: Publico 
     * Tipo:entero
     * Atributo correspondiente a la edad de la persona
     */
	public int edad;
	/**
     * M.A: Publico 
     * Tipo:String
     * Atributo correspondiente al nombre de la persona
     */
	public String nombre;
	/**
     * M.A: Publico 
     * Tipo:String
     * Atributo correspondiente a la  ocupacion de la persona
     */
	public String ocupacion;
	/**
     * M.A: Privado 
     * Tipo:String
     * Atributo correspondiente al genero de la persona
     */
	public String sexo;
	
	 /**
     * Constructor por default que provoca en el momento de creacion del objeto que los valores sean
     * puestos en sus valores por defecto.
     */
	public Persona()
	{
		
	}
	 /**
     * Constructor de modo de  registro basico
	 * parametros de entrada simples
	 * nombre y edad
     */
	public Persona(String n, int e)
	{
	  nombre = n;
	  edad = e;
	}
    /**
     * Constructor de modo de registro avanzado
	 * parametros de entrada completos
	 * nombre, edad, ocupacion, genero
     */
	public Persona(String n, int e, String o, String s)
	{
	  nombre = n;
	  edad = e;
	  ocupacion = o;
	  sexo = s;
	}
	
 }
