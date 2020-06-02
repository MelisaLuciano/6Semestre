//package ipn.escom.poo.personas;
//import ipn.escom.poo.personas.Persona;

//p6
import java.util.ArrayList;
///Se creará como clase abstracta
public abstract class ContactoVirtual extends Persona{
	protected String avatar;
	protected String nickName;
	private ArrayList<String> listaMsj = new ArrayList<String>();
	private ArrayList<String> listaImg = new ArrayList<String>();
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public ContactoVirtual(){
		super();
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public ContactoVirtual(int id, String nombre, long telefono, String direccion){
		super(id, nombre, telefono, direccion);
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public ContactoVirtual(int id, String nombre, long telefono, String direccion, String avatar, String nickName){
		super(id, nombre, telefono, direccion);
		this.avatar = avatar;
		this.nickName = nickName;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void agregarListaMsj(String mensaje){
		this.listaMsj.add(mensaje);
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String obtenerMensaje(){
		String mensajes = "";
		for(int i = 0; i < listaMsj.size(); i++){
			mensajes = mensajes + listaMsj.get(i) + "\n";
		}
		return mensajes;
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
	public boolean enviarImagen(int idDest, String img){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void recibirImagen(int idOrigen, String img){

	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean enviarMensaje(int idDest, String msj){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void recibirMensaje(int idOrigen, String msj){

	}

	public void mostrarHistorial(){

	}
}