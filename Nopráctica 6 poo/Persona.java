//package ipn.escom.poo.personas;

//P6
public abstract class Persona{
	protected int id;
	protected String nombre;
	protected long telefono;
	protected String direccion;

	public Persona(){
		
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public Persona(int id, String nombre, long telefono, String direccion){
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */	}

	public void setId(int id){
		this.id = id;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void setTelefono(long telefono){
		this.telefono = telefono;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public int getId(){
		return this.id;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String getNombre(){
		return this.nombre;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public long getTelefono(){
		return this.telefono;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String getDireccion(){
		return this.direccion;
	}
}