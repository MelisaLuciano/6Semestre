

public class Producto{

	private int id;
	private float precio;
	private String descripcion;
	private int cantidad;
	private String departamento;

	public Producto(){

	}

	public Producto(int idProd, float prec, String desc, int cant, String dep){

		this.id = idProd;
		this.precio = prec;
		this.descripcion = desc;
		this.cantidad = cant;
		this.departamento = dep;
	}

	public int getIdProdu(){
		return this.id;
	}

	public void setProdu(){

	}

	public float getPrec(){
		return this.precio;
	}

	public void setPrecio(){

	}	

	public String getDesc(){
		return this.descripcion;
	}

	public int getCant(){
		return this.cantidad;
	}

	public void setCant(int nuevaCant){

	}

	public String getDepartamento(){
		return this.departamento;
	}

}