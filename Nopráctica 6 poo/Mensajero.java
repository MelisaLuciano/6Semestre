//package ipn.escom.poo.utencilios;
//import ipn.escom.poo.personas.*;
//import web.personas.*;
//import ipn.escom.poo.utencilios.*;

//p6
import java.util.ArrayList;
import java.util.Date;

public class Mensajero{
	private ArrayList<ContactoVirtual> listaContactos = new ArrayList<ContactoVirtual>();
	private ArrayList<GrupoContacto> listaGrupos = new ArrayList<GrupoContacto>();
	private String nombre;
	private long telefono;
/**
 * M.A:Publico 
 * Tipo: Constructor de la clase
 * No recibe parámetros
 */
	public Mensajero(){

	}
/**
 * M.A:Publico 
 * Tipo: Constructor de la clase
 * Recibe como parámetros nombre y telefono
 */
	public Mensajero(String nombre, long telefono){
		this.nombre = nombre;
		this.telefono = telefono;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este metodo puede modificar el valor de los atributos
 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este metodo puede cambiar el valor del telefono
 */
	public void setTelefono(long telefono){
		this.telefono = telefono;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Con este metodo se obtiene el nombre
 */
	public String getNombre(){
		return this.nombre;
	}
/**
 * M.A:Publico 
 * Tipo: long
 * Este metodo se puede obtener el telefono
 */
	public long getTelefono(){
		return this.telefono;
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo hace la creación de los contactos, donde recibe como parámetros 
 * id, nombre, telefono, direccion, avatar, nickname y la red social a la que pertenecen
 */
	public boolean crearContacto(int id, String nombre, long telefono, String direccion, String avatar, String nickName, int redSocial){
		///Con la bandera utilizada para cambiar el valor del boleano 
		boolean flag = false;
		switch(redSocial){
			case 1:
				ContactoICQ contactoICQ = new ContactoICQ(id, nombre, telefono, direccion, avatar, nickName);
				listaContactos.add(contactoICQ);
				flag = true;
			break;

			case 2:
				ContactoWhatsApp contactoWhatsApp = new ContactoWhatsApp(id, nombre, telefono, direccion, avatar, nickName);
				listaContactos.add(contactoWhatsApp);
				flag = true;
			break;

			case 3:
				ContactoSkype contactoSkype = new ContactoSkype(id, nombre, telefono, direccion, avatar, nickName);
				listaContactos.add(contactoSkype);
				flag = true;
			break;
		}
		return flag;
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo es para borrar contactos que se tengan en la lista
 * Pidiendo como parametros el id
 * Utilizando la variable boleana para cambiar el valor 
 * y que se pueda ejecutar
 */
	public boolean borrarContacto(int id){
		boolean resultado = false;
		int idObj;
		ContactoVirtual aux = new ContactoVirtual();

		for(int cont = 0; cont < listaContactos.size(); cont++){
			aux = listaContactos.get(cont);
			idObj = aux.getId();

			if (idObj == id) {
				listaContactos.remove(cont);
				resultado = true;
				break;	
			} else if(listaContactos.size() == (cont + 1)){
				resultado = false;
			}
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este metodo borra contactos
 */
	public void borrarContactos(int tipoRedSocial){
		int idContacto = 0;
		for (ContactoVirtual contacto : listaContactos){
			idContacto = contacto.getId();
			if ((contacto.getClass().getName()).equals("ContactoICQ") && tipoRedSocial == 1 && idContacto != 1){
				listaContactos.remove(contacto);
				break;
			} else if((contacto.getClass().getName()).equals("ContactoWhatsApp") && tipoRedSocial == 2 && idContacto != 1){
				listaContactos.remove(contacto);
				break;
			} else if((contacto.getClass().getName()).equals("ContactoSkype") && tipoRedSocial == 3 && idContacto != 1){
				listaContactos.remove(contacto);
				break;
			}
		}
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este método crea los grupos para la red social
 */
	public boolean crearGrupo(String nombre, int id, int tipoRedSocial){
		
		GrupoContacto nuevoGrupo = new GrupoContacto(nombre, id, tipoRedSocial);
		listaGrupos.add(nuevoGrupo);

		return true;
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo borra los grupos que existan
 */
	public boolean borrarGrupo(int id){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public void borrarGrupos(){

	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo es utilizado para enviar mensajes
 */
	public boolean enviarMensaje(String nombre, String mensaje){ // cambie recibir el id por el nombre
		int idUsuarioDestino = 0;
		boolean arregloFinal = false;

		for(ContactoVirtual contacto : listaContactos){
			if ((contacto.getNombre()).equals(nombre)) {
				idUsuarioDestino = contacto.getId();
				arregloFinal = true;
				break;
			}
		}

		if(arregloFinal == false){
			return arregloFinal;
		}

		boolean resultado = recibirMensaje(1, idUsuarioDestino, mensaje);

		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo es para recibir los mensajes
 * Como parametros usa el origen el destino y el mensaje que se va a enviar
 */
	public boolean recibirMensaje(int idOrigen, int idDestino, String mensaje){
		Date fecha = new Date();
		boolean resultado = false;
		String mensajeCompleto = "Id origen: " + idOrigen + " | Fecha: " + fecha + " | Mensaje: " + mensaje;
		boolean flag = true;
		int cont = 0;
		ContactoVirtual aux = new ContactoVirtual();

		
		while(flag == true){
			aux = listaContactos.get(cont);

			if((aux.getId()) == idDestino){
				aux.agregarListaMsj(mensajeCompleto);//aux.listaMsj.add(mensajeCompleto);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if((listaContactos.size()) == (cont + 1)){
				resultado = false;
			}
			cont ++;
		}
		
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean enviarImagen(String nombre, String imagen){
		int idUsuarioDestino = 0;
		boolean arregloFinal = false;

		for(ContactoVirtual contacto : listaContactos){
			if ((contacto.getNombre()).equals(nombre)) {
				idUsuarioDestino = contacto.getId();
				arregloFinal = true;
				break;
			}
		}

		if(arregloFinal == false){
			return arregloFinal;
		}

		imagen = imagen + ".jpg";
		boolean resultado = recibirImagen(1, idUsuarioDestino, imagen);

		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean recibirImagen(int idOrigen, int idDestino, String img){
		Date fecha = new Date();
		boolean resultado = false;
		String mensajeCompleto = "Id origen: " + idOrigen + " | Fecha: " + fecha + " | Mensaje: " + img;
		boolean flag = true;
		int cont = 0;
		ContactoVirtual aux = new ContactoVirtual();

		while(flag){
			aux = listaContactos.get(cont);
			if((aux.getId()) == idDestino){
				aux.agregarListaMsj(mensajeCompleto);//aux.listaMsj.add(mensajeCompleto);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
			} else if((listaContactos.size()) == (cont + 1)){
				resultado = false;
			}
			cont ++;
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String mostrarHistorial(String nombre){
		ContactoVirtual nuevo = new ContactoVirtual();

		for(ContactoVirtual contacto : listaContactos){
			if ((contacto.getNombre()).equals(nombre)) {
				nuevo = contacto;
				break;
			}
		}

		String men = nuevo.obtenerMensaje();

		return men;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean hacerLlamada(int idDest){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean recibirLlamada(int idOrigen, String llamada){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean enviarVideoLlamada(int idDest){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean recibirVideoLlamada(int idOrigen, String video){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean enviarMensajeGrupo(String nombreGrupo){ //cambie idGrupo por nombreGrupo
		
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean enviarImagenGrupo(int idGrupo){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean mostrarHistorialContacto(String idContacto){
		return true;
	}
/**
 * M.A:Publico 
 * Tipo: boolean
 * Este metodo es para modificar algun dato de los contactos que se tienen
 */
	public boolean modificarParametroContacto(String nombreCambiar, String nombre, long telefono, String direccion, String avatar, String nickName){
		boolean resultado = false;
		String nomObj = "";
		int cont = 0;
		boolean flag = true;
		ContactoVirtual aux = new ContactoVirtual();

		while(flag){
			aux = listaContactos.get(cont);
			nomObj = aux.getNombre();

			if (nomObj.equals(nombreCambiar) && (nombre.equals("")) == false) {
				aux.setNombre(nombre);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;	
			} else if(nomObj.equals(nombreCambiar) && (telefono != 0)){
				aux.setTelefono(telefono);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(nomObj.equals(nombreCambiar) && (direccion.equals("")) == false) {
				aux.setDireccion(direccion);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(nomObj.equals(nombreCambiar) && (avatar.equals("")) == false){
				aux.setAvatar(avatar);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(nomObj.equals(nombreCambiar) && (nickName.equals("")) == false){
				aux.setNickName(nickName);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(nomObj.equals(nombreCambiar) && (nombre.equals("")) == false && (telefono != 0) && (direccion.equals("")) == false && (avatar.equals("")) == false && (nickName.equals("")) == false ) {
				aux.setNombre(nombre);
				aux.setTelefono(telefono);
				aux.setDireccion(direccion);
				aux.setAvatar(avatar);
				aux.setNickName(nickName);
				listaContactos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(listaContactos.size() == (cont + 1)){
				resultado = false;
				flag = false;
			}
			cont ++;
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: boleano
 * Este metodo es para modificar algun parametro de los grupos como el nombre o la red social
 */
	public boolean modificarParametroGrupo(String nombreCambiar, String nombre, int tipoRedSocial){
		boolean resultado = false;
		String nomObj = "";
		int cont = 0;
		boolean flag = true;
		GrupoContacto aux = new GrupoContacto();

		while(flag){
			aux = listaGrupos.get(cont);
			nomObj = aux.getNombre();

			if (nomObj.equals(nombreCambiar) && (nombre.equals("")) == false) {
				aux.setNombre(nombre);
				listaGrupos.set(cont, aux);
				resultado = true;
				flag = false;
				break;	
			} else if(nomObj.equals(nombreCambiar) && (tipoRedSocial != 0)){
				aux.setTipoRedSocial(tipoRedSocial);
				listaGrupos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(nomObj.equals(nombreCambiar) && (nombre.equals("")) == false && (tipoRedSocial != 0)) {
				aux.setNombre(nombre);
				aux.setTipoRedSocial(tipoRedSocial);
				listaGrupos.set(cont, aux);
				resultado = true;
				flag = false;
				break;
			} else if(listaGrupos.size() == (cont + 1)){
				resultado = false;
				flag = false;
			}
			cont ++;
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: int
 * Este metodo devuelve el numero de contactos registrados
 */
	public int numeroContactos(){
		return this.listaContactos.size();
	}
/**
 * M.A:Publico 
 * Tipo: int
 * Este metodo regresa el numero de grupos 
 */
	public int numeroGrupos(){
		return this.listaGrupos.size();
	}
/**
 * M.A:Publico 
 * Tipo: int
 * Este metodo devuelve el indice de un objeto
 */
	public int idObjeto(int indice){
		ContactoVirtual prueba = new ContactoVirtual();
		prueba = listaContactos.get(indice);
		return prueba.getId();
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el nombre del objeto 
 */
	public String nomObjeto(int indice){
		return prueba.getNombre();
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean contactoExiste(String nombre){
		boolean resultado = false;
		String nomObj;
		ContactoVirtual aux = new ContactoVirtual();

		for(int cont = 0; cont < listaContactos.size(); cont++){
			aux = listaContactos.get(cont);
			nomObj = aux.getNombre();

			if (nomObj.equals(nombre)) {
				resultado = true;
				break;	
			} else if(listaContactos.size() == (cont + 1)){
				resultado = false;
			}
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean grupoExiste(String nombre){
		boolean resultado = false;
		String nomObj;
		GrupoContacto aux = new GrupoContacto();

		for(int cont = 0; cont < listaGrupos.size(); cont++){
			aux = listaGrupos.get(cont);
			nomObj = aux.getNombre();

			if (nomObj.equals(nombre)) {
				resultado = true;
				break;	
			} else if(listaGrupos.size() == (cont + 1)){
				resultado = false;
			}
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String contactosRedSocial(int tipoRedSocial){
		String nombreContacto;
		String todosNombres = "";

		for (ContactoVirtual contacto : listaContactos){
			nombreContacto = contacto.getNombre();

			if ((contacto.getClass().getName()).equals("ContactoICQ") && tipoRedSocial == 1){
				todosNombres = todosNombres + nombreContacto + "\n";
			} else if((contacto.getClass().getName()).equals("ContactoWhatsApp") && tipoRedSocial == 2){
				todosNombres = todosNombres + nombreContacto + "\n";
			} else if((contacto.getClass().getName()).equals("ContactoSkype") && tipoRedSocial == 3){
				todosNombres = todosNombres + nombreContacto + "\n";
			}
		}
		return todosNombres;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String gruposRedSocial(int tipoRedSocial){
		String nombreGrupo;
		String todosNombres = "";

		for (GrupoContacto grupo : listaGrupos){
			nombreGrupo = grupo.getNombre();

			if (grupo.getTipoRedSocial() == 1 && tipoRedSocial == 1){
				todosNombres = todosNombres + nombreGrupo + "\n";
			} else if(grupo.getTipoRedSocial() == 2 && tipoRedSocial == 2){
				todosNombres = todosNombres + nombreGrupo + "\n";
			} else if(grupo.getTipoRedSocial() == 3 && tipoRedSocial == 3){
				todosNombres = todosNombres + nombreGrupo + "\n";
			}
		}
		return todosNombres;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo muestra los contactos que se tengan 
 */
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
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String mostrarInformacionGrupo(String nombre){
		int idGrupo, tipoRedSocial;
		String nombreGrupo;
		String informacionGrupo = "";
		String infoContactos = "";

		for (GrupoContacto grupo : listaGrupos){
			idGrupo = grupo.getId();
			nombreGrupo = grupo.getNombre();
			tipoRedSocial = grupo.getTipoRedSocial();
			infoContactos = grupo.mostrarContactos();

			if (nombreGrupo.equals(nombre) && tipoRedSocial == 1){
				informacionGrupo = informacionGrupo + idGrupo + "|    " + nombreGrupo + "    |  ICQ  |\n" + 
									"Id|  Nombre  |    Telefono    |    Direccion    |    Avatar    |    NickName    |\n" +
									infoContactos;

			}else if(nombreGrupo.equals(nombre) && tipoRedSocial == 2){
				informacionGrupo = informacionGrupo + idGrupo + "|    " + nombreGrupo + "    |  WhatsApp  |\n" + 
									"Id|  Nombre  |    Telefono    |    Direccion    |    Avatar    |    NickName    |\n" +
									infoContactos;
			} else if(nombreGrupo.equals(nombre) && tipoRedSocial == 3){
				informacionGrupo = informacionGrupo + idGrupo + "|    " + nombreGrupo + "    |  Skype  |\n" + 
									"Id|  Nombre  |    Telefono    |    Direccion    |    Avatar    |    NickName    |\n" +
									infoContactos;
			}	
		}
		return informacionGrupo;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public String getNombreUsuarioApp(){
		String nombreUsuario = (listaContactos.get(0)).getNombre();
		return nombreUsuario;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean agregarContactoGrupo(String nombreContacto, String nombreGrupo){
		boolean resultado = false;
		boolean flag = true;
		int contador = 0;
		String nomObj;
		ContactoVirtual aux = new ContactoVirtual();
		GrupoContacto grupo = new GrupoContacto();

		while(flag){
			grupo = listaGrupos.get(contador);
			if((grupo.getNombre().equals(nombreGrupo))){
				flag = false;
			}
		}

		for(int cont = 0; cont < listaContactos.size(); cont++){
			aux = listaContactos.get(cont);
			nomObj = aux.getNombre();

			if (nomObj.equals(nombreContacto)) {
				grupo.afiliarContacto(aux);
				resultado = true;
				break;	
			} else if(listaContactos.size() == (cont + 1)){
				resultado = false;
			}
		}
		return resultado;
	}
/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
	public boolean borrarContactoGrupo(String nombreContacto, String nombreGrupo){
		boolean flag = true;
		boolean resultado = true;
		boolean aux = true;
		int cont = 0;
		int idContacto = 0;

		while(flag){
			if((listaContactos.get(cont).getNombre()).equals(nombreContacto)){
				idContacto = listaContactos.get(cont).getId();
				flag = false;
			} else if(listaContactos.size() == (cont + 1)){
				resultado = false;
				aux = false;
				flag = false;
			}
			cont ++;
			
		}

		if(aux == true){
			flag = true;
			cont = 0;
			while(flag){
				if((listaGrupos.get(cont).getNombre()).equals(nombreGrupo)){
					resultado = listaGrupos.get(cont).borrarContacto(idContacto);
					flag = false;
				}
				cont ++;
			}
		}
			
		return resultado;
	}

	/**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */public String contactosEnGrupo(String nombreGrupo){
		boolean flag = true;
		int cont = 0;
		String resultado = "";
		while(flag){
			if((listaGrupos.get(cont).getNombre()).equals(nombreGrupo)){
				resultado = (listaGrupos.get(cont)).mostrarContactos();
				flag = false;
			}
			cont ++;
		}
		return resultado;
	}
}