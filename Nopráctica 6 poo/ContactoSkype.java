//package web.personas;
//import ipn.escom.poo.personas.*;
//p6
import java.util.ArrayList;

public class ContactoSkype extends ContactoVirtual{
	public ArrayList<String> ListaVideosLlamadas = new ArrayList<String>();

/**
 * M.A: Publico 
 * Tipo: Constructor
 * Pide parametros 
 * Con super ejecuta el constructor de la clase padre 
 */
	public ContactoSkype(int id, String nombre, long telefono, String direccion, String avatar, String nickName){
		super(id, nombre, telefono, direccion, avatar, nickName);
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este método asigna el id
 */
		public void setId(int id){
		this.id = id;
	}
/**
 * M.A:Publico 
 * Tipo: void
 * Este metodo asigna el nombre
 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
/**
 * M.A:Publico 
 * Tipo: void
 * Este metodo asigna el telefono
 */
	public void setTelefono(long telefono){
		this.telefono = telefono;
	}
/**
 * M.A:Publico 
 * Tipo: void
 * Este metodo asigna la direccion
 */
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
/**
 * M.A:Publico 
 * Tipo: void
 * Este metodo asigna el avatar
 */
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}
/**
 * M.A:Publico 
 * Tipo: void
 * Este metodo asigna el nickName
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
 * Este metodo devuelve el nickName
 */
	public String getNickName(){
		return this.nickName;
	}
/**
 * M.A:Publico 
 * Tipo: int
 * Este metodo devuelve el id
 */
	public int getId(){
		return this.id;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el nombre
 */
	public String getNombre(){
		return this.nombre;
	}
/**
 * M.A:Publico 
 * Tipo: long
 * Este metodo devuelve el telefono
 */
	public long getTelefono(){
		return this.telefono;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve la direccion
 */
	public String getDireccion(){
		return this.direccion;
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo 
 */
	public boolean enviarVideoLlamada(int idDest, String video){
		return true;
	}

	public void recibirVideoLlamada(int idOrigen, String video){

	}

	public String toString(){
		return "true";
	}
}