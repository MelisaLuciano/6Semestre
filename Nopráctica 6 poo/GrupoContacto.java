//package ipn.escom.poo.utencilios;
//import ipn.escom.poo.personas.*;

//p6
import java.util.ArrayList;

public class GrupoContacto{
	private ArrayList<ContactoVirtual> listaContactos = new ArrayList<ContactoVirtual>();
	private String nombre;
	private int id;
	private int tipoRedSocial;
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public GrupoContacto(){

	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public GrupoContacto(String nombre, int id, int tipoRedSocial){
		this.nombre = nombre;
		this.id = id;
		this.tipoRedSocial = tipoRedSocial;
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
	public void setId(int id){
		this.id = id;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void setTipoRedSocial(int tipoRedSocial){
		this.tipoRedSocial = tipoRedSocial;
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
	public int getId(){
		return this.id;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public int getTipoRedSocial(){
		return this.tipoRedSocial;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean afiliarContacto(ContactoVirtual contacto){
		this.listaContactos.add(contacto);
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean borrarContacto(int id){
		boolean flag = true;
		int cont = 0;
		boolean res = false;

		while(flag){
			if((listaContactos.get(cont).getId()) == id){
				listaContactos.remove(cont);
				res = true;
				flag = false;
			}
			cont ++;
		}
		return res;
	}

	public void borrarContactos(){

	}

	public boolean enviarMensaje(){
		return true;
	}

	public boolean enviarImagen(){
		return true;
	}

	public String toString(){
		return "true";
	}

	public String mostrarContactos(){
		int i = 0;
		int idContacto;
		long telefonoContacto;
		String nombreContacto, direccionContacto, avatarContacto, nickNameContacto;
		String id, telefono;
		String informacionContacto = "";

		for (ContactoVirtual contacto : listaContactos){
			idContacto = contacto.getId();
			telefonoContacto = contacto.getTelefono();
			nombreContacto = contacto.getNombre();
			direccionContacto = contacto.getDireccion();
			avatarContacto = contacto.getAvatar();
			nickNameContacto = contacto.getNickName();

			id = Integer.toString(idContacto);
			telefono = Long.toString(telefonoContacto);

			informacionContacto = informacionContacto + id + "|    " + nombreContacto + "    |  " + telefono + "    |  " + direccionContacto + "    |  " + avatarContacto + "    |  " + nickNameContacto + "  |\n"; 
		}
		return informacionContacto;
	}
}