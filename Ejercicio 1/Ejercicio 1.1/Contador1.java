package escom2.poo2.doscv22.Contador11;
import javax.swing.*;///Importacion del paquete javax.swing para el uso de JOtionPane

/**
 * M.A:Publico 
 * Tipo: Clase 
 * Esta clase representa el ente de un contador que tiene ciertos tipos de habilidades tales como Mostrar Valores, Avanzar y Reiniciar
 */
public class Contador1

{
    /**
     * M.A: Privado 
     * Tipo:entero
     * Atributo correspondiente a el valor inicial del contador
     */
    private int valorInicial;
    
    /**
     * M.A: Provado 
     * Tipo: entero
     * Atributo correspondiente a el valor actual del contador
     */
    private int valorActual;
    
    /**
     * Constructor por default que provoca en el momento de creacion del objeto que los valores sean
     * puestos en sus valores basicos, es decir, en ceros.
     */
    public Contador1()
    {
        valorInicial=0;///Atributos del Objeto
        valorActual=0;
    }

    /**
     * M.A:Publico
     * Retorno: void
     * Argumentos: Un solo entero llamado "i"
     * Metodo que permite la modificacion a los atributos del objeto, cambia los dos atributos del objeto a cualquiera
     * especifique el usuario
     */
    public void setValor(int i)
    {
        valorInicial=i;
        valorActual=i;
    }

    /**
     * M.A: Publico
     * Retorno: void
     * Argumentos: N/A
     * Metodo que activa una ventana JOptionPane, tipo Message Dialog, la cual muestra el valor inicial del contador
     */
    public void mostrarValorInicial()
    {
        JOptionPane.showMessageDialog(null, "El valor inicial de este contador fue: " + valorInicial);
    }

    /**
     * M.A: Publico
     * Retorno: void
     * Argumentos: N/A
     * Metodo que activa una ventana JOptionPane, tipo Message Dialog, la cual muestra el valor actual del contador
     */
    public void mostrarValorActual()
    {
        JOptionPane.showMessageDialog(null, "El valor actual de este contador es: " + valorActual);
    }

    /**
     * M.A: Publico
     * Retorno: entero
     * Argumentos: N/A
     * Metodo que esta diseniado para retornar el valor del atributo para su utilizacion por parte de otras clases
     */
    public int getValorActual()
    
    {
        return valorActual;
    }

    /**
     * M.A: Publico
     * Retorno: void
     * Argumentos: N/A
     * Metodo que regresa los valores a zero.
     */
    public void reiniciar()
    {
        valorActual=0;
        valorInicial=0;
    }

    /**
     * M.A: Publico
     * Retorno: void
     * Argumentos: N/A
     * Metodo sobrecargado que reinicia los valores a valores definidos por el usuario
     */
    public void reiniciar(int r)
    {
        valorActual=r;
        valorInicial=r;
    }

    /**
     * M.A: Publico
     * Retorno: void
     * Argumentos: Un solo entero
     * Metodo que le suma a valorActual la cantidad recibida por parte del entero "a"
     */
    public void avanzar(int a)
    {
        valorActual+=a;
    }

}