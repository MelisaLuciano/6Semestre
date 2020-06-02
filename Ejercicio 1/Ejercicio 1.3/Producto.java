
public class Producto implements Comparable<Producto>{

	private String nombre;
	private int precio;
	private String descripcion;


	public Producto(){

	}

	public Producto(String nombre, int precio, String descripcion){
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int getPrecio(){
		return this.precio;
	}

	public String getDesc(){
		return this.descripcion;
	}
	
	public void setNombre(String nomb){
		this.nombre = nomb;
	}

	public void setPrecio(int prec){
		this.precio = prec;
	}

	public void setDesc(String descrip){
		this.descripcion = descrip;
	}

	@Override
   		public int compareTo(Producto o) {
        String a = new String(String.valueOf(this.getNombre()));
        String b = new String(String.valueOf(o.getNombre()));
        return a.compareTo(b);
    }
}