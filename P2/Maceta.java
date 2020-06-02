public class Maceta
{
    public boolean Estado;
	public int tamanio;
	int numMac;
    public Maceta()
    {
        Estado=false; //La maceta esta disponible en estado false(No esta ocupada)
		numMac = numMac+1;
	}

    public void LlenarEspacio()
    {
        Estado=true;
    }
	
	public void LiberarEspacio(){
		Estado=false;
	}
    
}