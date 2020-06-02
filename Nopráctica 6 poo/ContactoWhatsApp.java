//package web.personas;
//import ipn.escom.poo.personas.*;

//p6
import java.util.ArrayList;

public class ContactoWhatsApp extends ContactoVirtual{
	private ArrayList<String> ListaLlamadas = new ArrayList<String>();

/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public ContactoWhatsApp(int id, String nombre, long telefono, String direccion, String avatar, String nickName){
		super(id, nombre, telefono, direccion, avatar, nickName); //Se invoca al constructor de la clase padre 
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
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
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String getAvatar(){
		return this.avatar;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String getNickName(){
		return this.nickName;
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
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean hacerLlamada(int idDest, String llamada){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void recibirLlamada(int idOrigen, String llamada){

	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String toString(){
		return "true";
	}
}