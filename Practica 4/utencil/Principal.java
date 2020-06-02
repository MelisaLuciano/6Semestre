import personas.*;

import javax.swing.*;///Importacion del paquete que permite el uso de JoptionPane


    /**
     * Programa disenado para demostrar el uso de las clases Agenda y Contacto, ademas de servir como
     * una clase que pone en prueba los metodos de ella y sus atributos
     */
public class Principal
{
	public static void main( String args[] )
	{
        Agenda A=new Agenda();///Creacion del objeto A tipo Agenda

        A.crearContacto(1, "Davila", 735, "Morelos");
        A.crearContacto(2, "Garcia", 736, "Cuerna");
        A.crearContacto(3, "Rivas", 737, "Toluca");
        A.crearContacto(4, "Claudia", 738, "DF");

        A.crearGrupo(33, "Conejos");
        A.crearGrupo(34, "Morsas");
        A.crearGrupo(36, "Ornitos");
        A.crearGrupo(37, "Orni");
        Persona x=A.getPersona(3);
        A.crearContactoGrupo(1, x);

        JOptionPane.showMessageDialog(null, "Agenda", "Agenda",JOptionPane.INFORMATION_MESSAGE); ///ventana de JOptionPane que indica que el objeto es un Agenda

        /**
         * Segmento que permite al usuario elegir una de las cuatro opciones diferentes que le permiten utilizar diferentes atributos y metodos
         * del objeto, estas opciones son:
         * Agregar Contacto","Eliminar Contacto","Modificar Contacto", "Buscar Contacto", "Ordenar Contactos (Numero de Serie)" y "Cancelar"
         */
        int n;
        Object[] op1 = {"Crear Contacto","Elegir Contacto","Eliminar Contactos", "Crear Grupo", "Elegir Grupo", "Eliminar Grupos", "Cancelar"};
        do
        {
            n=-2;
            n = JOptionPane.showOptionDialog(null,"Contactos:\n "+ A.mostrarPersonas() + "\nGrupos:\n "+ A.mostrarGrupos() +"\n Opciones:","Agenda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op1,op1[0]);

            switch(n)
            {
                /**
                 * Caso 0: Caso que aplica a Agregar Contacto
                 * Utiliza diferentes tipos de metodos en el paquete JOptionPane para mostrar el proceso de agregacion al usuario.
                 * El metodo central al proceso de agregacion es: agregar. El cual esta definido en Agenda
                 */
                case 0:
                    String nombre = JOptionPane.showInputDialog("Favor de definir el Nombre del Contacto"); 
                    if(nombre==null)
                        break;
                    String i = JOptionPane.showInputDialog("Favor de definir el ID del Contacto");
                    if(i==null)
                        break;
                    int ID;
                    ID = Integer.parseInt(i);
                    String tel = JOptionPane.showInputDialog("Favor de definir el Telefono del Contacto"); 
                    if(tel==null)
                        break;
                    long t;
                    t = Long.parseLong(tel);
                    String dir = JOptionPane.showInputDialog("Favor de definir la Direccion del Contacto"); 
                    if(dir==null)
                        break;
                    A.crearContacto(ID, nombre, t, dir);
                    JOptionPane.showMessageDialog(null, "Contacto Agregado", "Agenda",JOptionPane.INFORMATION_MESSAGE);
                    break;
                /**
                 * Caso 1: Caso que aplica los metodos para Elegir una Persona especifico
                 * Este tambien utiliza los metodos buscadores, ademas de los metodos modificadores, ya sea modificarNumSerie o modificarNombre
                 * 
                 */
                case 1:
                    int PIndex;
                    nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Contacto"); 
                    PIndex=A.buscarNombre(nombre);

                    Object[] op2 = {"Modificar Datos","Mostrar Datos", "Afiliar a Grupo", "Desafiliar de Grupo", "Borrar de Agenda", "Cancelar"};
                    int j=-1;
                    do{
                        
                        j = JOptionPane.showOptionDialog(null,"Contacto:\n"+ A.mostrarPersonasMiniB(PIndex) ,"Agenda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op2,op2[0]);

                        switch(j)
                        {
                            case 0://Modificar Datos
                                Object[] op3 = {"Modificar ID","Modificar Nombre","Modificar Telefono","Modificar Direccion","Cancelar"};
                                j=-1;
                                do{
                                    
                                    j = JOptionPane.showOptionDialog(null,"Contacto:\n"+ A.mostrarPersonasMiniA(PIndex) ,"Agenda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op3,op3[0]);
            
                                    switch(j)
                                    {
                                        case 0:
                                            i = JOptionPane.showInputDialog("Favor de introducir el nuevo ID del Contacto");
                                            ID=Integer.parseInt(i);
                                            A.setIDPersona(PIndex, ID);
                                            break;
            
                                        case 1:
                                            nombre = JOptionPane.showInputDialog("Favor de introducir el nuevo Nombre del Contacto");
                                            A.setNombrePersona(PIndex, nombre);
                                            break;

                                        case 2:
                                            tel = JOptionPane.showInputDialog("Favor de introducir el nuevo Telefono del Contacto");
                                            t=Long.parseLong(tel);
                                            A.setTelefonoPersona(PIndex, t);
                                            break;
                                        case 3:
                                            dir = JOptionPane.showInputDialog("Favor de introducir la nueva Direccion del Contacto");
                                            A.setDireccionPersona(PIndex, dir);
                                            break;
                                    }
            
                                }while(j!=4);
                                break;
                                

                            case 1://Mostrar Datos
                                JOptionPane.showMessageDialog(null, A.mostrarPersonasMiniA(PIndex), "Agenda",JOptionPane.INFORMATION_MESSAGE);
                                
                                break;

                            case 2://Afiliar
                                int GIndex;
                                nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Grupo");
                                GIndex=A.buscarNombreGrupo(nombre);
                                Persona aux=A.getPersona(PIndex);
                                A.crearContactoGrupo(GIndex, aux);
                                
                                break;
                            
                            case 3://Desafiliar
                                nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Grupo");
                                GIndex=A.buscarNombreGrupo(nombre);
                                int P1Index=A.buscarNombrePersonaGrupo(GIndex,A.getNombrePersona(PIndex));
                                if(P1Index==-1)
                                    JOptionPane.showMessageDialog(null, "Nombre Incorrecto", "Agenda",JOptionPane.INFORMATION_MESSAGE);
                                else
                                    A.borrarContactoGrupo(GIndex, P1Index);
                                
                                break;

                            case 4:
                                A.borrarContacto(PIndex);
                                j=5;
                                break;
                        }

                    }while(j!=5);
                    break;

                case 2://Eliminar Contactos
                    A.borrarContactos();
                    break;
                
                case 3://Crear Grupo
                    String nomGrupo = JOptionPane.showInputDialog("Favor de introducir el nombre del Grupo");
                    if(nomGrupo==null)
                        break;
                    i = JOptionPane.showInputDialog("Favor de introducir el ID del Grupo");
                    if(i==null)
                        break;
                    int idGrupo=Integer.parseInt(i);
                    A.crearGrupo(idGrupo, nomGrupo);
                    break;
                case 4://Elegir Grupo
                    int GIndex;
                    nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Grupo");
                    if(nombre==null)
                        break;
                    GIndex=A.buscarNombreGrupo(nombre);

                    Object[] op4 = {"Modificar Datos","Mostrar Datos", "Afiliar Contacto", "Desafiliar Contacto", "Borrar Grupo", "Cancelar"};
                    int j1=-1;
                    do{
                        
                        j1 = JOptionPane.showOptionDialog(null,"Grupo:\n"+ A.mostrarGrupoMini(GIndex) ,"Agenda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op4,op4[0]);

                        switch(j1)
                        {
                            case 0://Modificar Datos
                                Object[] op5 = {"Modificar ID","Modificar Nombre","Cancelar"};
                                j=-1;
                                do{
                                    
                                    j = JOptionPane.showOptionDialog(null,"Contacto:\n"+ A.mostrarGrupoMini(GIndex) ,"Agenda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,op5,op5[0]);
            
                                    switch(j)
                                    {
                                        case 0:
                                            i = JOptionPane.showInputDialog("Favor de introducir el nuevo ID del Grupo");
                                            ID=Integer.parseInt(i);
                                            A.setIDGrupo(GIndex, ID);
                                            break;
            
                                        case 1:
                                            nombre = JOptionPane.showInputDialog("Favor de introducir el nuevo Nombre del Grupo");
                                            A.setNombreGrupo(GIndex, nombre);
                                            break;
                                    }
            
                                }while(j!=2);
                                break;
                                

                            case 1://Mostrar Datos
                                JOptionPane.showMessageDialog(null, A.mostrarGrupoMiniPersonas(GIndex), "Agenda",JOptionPane.INFORMATION_MESSAGE);
                                
                                break;

                            case 2://Afiliar
                                nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Contacto");
                                PIndex=A.buscarNombre(nombre);
                                Persona aux=A.getPersona(PIndex);
                                A.crearContactoGrupo(GIndex, aux);

                                break;
                            
                            case 3://Desafiliar
                                nombre = JOptionPane.showInputDialog("Favor de definir el nombre del Contacto");
                                int P1Index=A.buscarNombrePersonaGrupo(GIndex, nombre);
                                A.borrarContactoGrupo(GIndex, P1Index);
                                
                                break;

                            case 4://Borrar
                                A.borrarGrupo(GIndex);
                                j1=5;
                                break;
                        }

                    }while(j1!=5);
                    break;
                
                case 5://Eliminar Grupos
                    A.borrarGrupos();
                    break;

            }
        }while(n!=6);
    }

}

