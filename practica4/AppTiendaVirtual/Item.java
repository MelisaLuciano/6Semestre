
public class Item{

	private int idProd;
	private int cantidad; 

	public Item(){

	}

	public Item (int idProd1, int  cant){
		this.idProd = idProd1;
		this.cantidad = cant;
	}

	public int getIdProdu(){
		return this.idProd;
	}

	public int getCantidad(){
		return this.cantidad;
	}

	public void setId(int id){
		this.idProd = id;
	}

	public void setCantidad(int cant){
		this.cantidad = cant;
	}
}