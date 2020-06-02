public class ContactoSpotify extends ContactoVirtual{

//p6
 /**
 * M.A:Publico 
 * Tipo: String
 * Este metodo devuelve el avatar
 */
		public ContactoSpotify(int id, String nombre, long telefono, String direccion, String avatar, String nickName){
		super(id, nombre, telefono, direccion, avatar, nickName);
	}

	/**
 * M.A:Publico 
 * Tipo: constructor
 * Este es un constructor de la clase 
 * No recibe parámetros
 */
	public ContactoSpotify(){
		super();
	}

/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setId(int id){
		this.id = id;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setTelefono(long telefono){
		this.telefono = telefono;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

/**
 * M.A:Publico 
 * Tipo: vacio
 * Este es un método del tipo setter
 * Con este se da el Id
 */
	public void setNickName(String nickName){
		this.nickName = nickName;
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

}