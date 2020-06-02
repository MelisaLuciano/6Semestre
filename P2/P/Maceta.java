//Se declara publica esta clase porque se utiliza en la clase principal y en otras clases
public class Maceta{
	//Estos son los atributos de la clase Maceta
    public boolean Estado;
	public int tamanio;
	int numMac;

	//Se crea este constructor para especificar que el objeto está disponible, en este caso la maceta
    public Maceta(){

        Estado = false; //La maceta esta disponible en estado false(No esta ocupada)
		numMac = numMac + 1; //Se indica el numero de la maceta 
	}

	//Este es el método el cual modifica el estado, ya que tiene false por default 
    public void LlenarEspacio(){
    	//Con esta linea se modifica el estado del espacio
        Estado = true;
    }
	
	//Es un método que no regresa nada el cual modifica el estado que ya tiene por default
	public void LiberarEspacio(){
		//En este caso vuelve false al "Estado"
		Estado = false;
	}
    
}