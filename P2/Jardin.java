import java.util.*;

public class Jardin
{
    public int NumMacetas;

    public void RecibirPlanta(Maceta m)
    {
        m.LlenarEspacio();
		System.out.println("La maceta "  + m.numMac + " esta ocupada");
    }

    
}
