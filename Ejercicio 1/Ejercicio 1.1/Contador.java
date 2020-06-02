import escom2.poo2.doscv22.Contador11.Contador1;

import javax.swing.*;///Importacion del paquete que permite el uso de JoptionPane

    /**
     * Programa diseniado para demostrar la utilizacion de la clase Contador, ademas de servir como
     * una clase que pone en prueba los metodos de ella y sus atributos
     */
public class Contador
{
	public static void main( String args[] )
	{
        Contador1 c=new Contador1();///Creacion del objeto c tipo Contador1
        JOptionPane.showMessageDialog(null, "Contador", "Contador",JOptionPane.INFORMATION_MESSAGE); ///ventana de JOptionPane que indica que el objeto es un contador

        /**
         * Segmento que permite al usuario elegir si quiere que el contador sea un Contador Nuevo, es decir que los valores esten en zeros, o uno
         * que el punto de comienzo sea especificado por es usuario
         */
        Object[] op = {"Nuevo Contador","Contador con valor especifico"};
        int n = JOptionPane.showOptionDialog(null,"Escoja el tipo de contador","Tipo de Contador",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, op,op[0]);
        if (n==1)
        {
            String inputValue = JOptionPane.showInputDialog("Favor de definir el valor inicial"); 
            int i = Integer.parseInt(inputValue);
            c.setValor(i);
        }

        /**
         * Segmento que permite al usuario elegir una de las cuatro opciones diferentes que le permiten utilizar diferentes atributos y metodos
         * del objeto, estas opciones son:
         * Mostrar Valor Inicial: Muestra valorInicial ya sea que haya sido por default o definido por el usuario
         */
        Object[] op2 = {"Mostrar Valor Inicial","Avanzar en la cuenta","Reiniciar", "Salir"};
        do
        {
            n=-2;
            n = JOptionPane.showOptionDialog(null,"Cantidad Actual: "+ c.getValorActual()+"\n Opciones:","Contador",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op2,op2[0]);

            switch(n)
            {
                /**
                 * Caso 0: Caso que aplica a Mostrar  Valor inicial.
                 * Llama al metodo mostrarValorInicial que utiliza JOptionPane para mostrar este valor.
                 */
                case 0:
                    c.mostrarValorInicial();
                    break;

                /**
                 * Caso 1: Caso que aplica para Avanzar el contador
                 * Contiene un switch anidado que permite al usuario decidir si quiere avanzar por unidad o una cantidad definida por el usuario
                 */
                case 1:
                    Object[] op3 = {"Avanzar una sola unidad","Avanzar una cifra especifica","Cancelar"};
                    int j;
                    do{
                        
                        j = JOptionPane.showOptionDialog(null,"Cantidad Actual: "+ c.getValorActual() ,"Contador",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op3,op3[0]);

                        switch(j)
                        {
                            case 0:
                                int a=1;
                                c.avanzar(a);
                                break;
                            case 1:
                                int i;
                                String inputValue = JOptionPane.showInputDialog("Favor de definir la cifra"); 
                                i = Integer.parseInt(inputValue);
                                c.avanzar(i);
                                break;
                        }

                    }while(j!=2);
                    break;

                /**
                 * Caso 2: Caso que aplica los metodos para reiniciar los valores del contador.
                 */
                case 2:
                    Object[] op4 = {"Reiniciar a Zero","Reiniciar a una cifra especifica","Cancelar"};
                    int k;
                    k = JOptionPane.showOptionDialog(null,"Cantidad Actual: "+ c.getValorActual() ,"Reiniciar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op4,op4[0]);
                    if(k==0)
                    {
                        c.reiniciar();
                    }
                    else if(k==1)
                    {
                        int r;
                        String inputValue = JOptionPane.showInputDialog("Favor de definir la cifra"); 
                        r = Integer.parseInt(inputValue);
                        c.reiniciar(r);
                    }
                    else
                        break;
            }
        }while(n!=3);
            

	}
}