import personas.*;

import java.util.ArrayList;

    /**
     * Archivo que contiene los atributos y metodos que actuan como una agenda
     */
public class Agenda
{
    
    /**
     * Atributo que crea la composicion del ArrayList de Objetos tipo Persona
     */
    private ArrayList<Persona> p = new ArrayList<Persona>();

    /**
     * Atributo que crea la composicion del ArrayList de Objetos tipo GrupoPersonas
     */
    private ArrayList<GrupoPersonas> g = new ArrayList<GrupoPersonas>();

    /**
     * //////////Seccion Dedicada a Metodos relacionados con Contactos (Personas)/////////////////
     */

    /**
     * Metodo "crearContacto"
     * Este metodo crea e inserta un nuevo objeto tipo Persona al arraylist p
     * @param[in] int i: Parametro de entrada tipo int, representando el ID
     * @param[in] String nombre: Parametro de entrada tipo String, representando el nombre del contacto
     * @param[in] long t: Parametro de entrada tipo int, representando el telefono
     * @param[in] String d: Parametro de entrada tipo String, representando la direccion
     * 
     * @param[out] void Este metodo no regresa ningun valor 
     */
    public void crearContacto(int i, String n, long t, String d)
    {
        p.add(new Persona(i, n, t, d));
    }

    /**
     * Metodo "borrarContacto"
     * Este metodo elimina el objecto definido de la lista p y la lista g
     * @param[in] int PIndex: Parametro de Entrada representando el indice correspondiente al Objeto tipo Persona que se desea eliminar
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void borrarContacto(int PIndex )
    {
        String nombre=getNombrePersona(PIndex);
        int P1Index;
            for(int i=0; i<g.size(); i++)
            {
                P1Index= buscarNombrePersonaGrupo(i, nombre);
                if(P1Index!=-1)
                {
                    borrarContactoGrupo(i, P1Index);
                }
                
            }
        p.remove(PIndex);
    }

    /**
     * Metodo "borrarContactos"
     * Este metodo elimina todos los Objetos tipo Persona de todas las listas
     * @param[in] void No recibe ningun valor
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void borrarContactos()
    {
        p.clear();
        for(int i=0; i<g.size(); i++)
        {
            g.get(i).borrarPersonas();
        }

    }

    /**
     * Metodo "mostrarPersonas"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * @param[out] String output: Parametro de Salida tipo String que contiene la cadena mostrando las Personas
     */
    public String mostrarPersonas()
    {
        String output = "";
            for(int i = 0; i<p.size(); i++)
            {
                int j=getIDPersona(i);
                String IDs = Integer.toString(j);
                String Nombres = getNombrePersona(i);

                output += IDs + " "+ Nombres +"\n";       
            } 
        return output;
    }

    /**
     * Metodo "mostrarPersonasExtendido"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane. 
     * Contiene mayor informacion sobre las personas
     * 
     * Reemplazo el metodo "toString" en la practica original
     * 
     * @param[out] String output: Parametro de Salida tipo String que contiene la cadena mostrando las personas
     */
    public String mostrarPersonasExtendido()
    {
        String output = "";
            for(int i = 0; i<p.size(); i++)
            {
                int j=getIDPersona(i);
                String IDs = Integer.toString(j);
                String Nombres = getNombrePersona(i);
                long t=getTelefonoPersona(i);
                String Telefono = Long.toString(t);
                String Dir= getDireccionPersona(i);

                output += IDs + " "+ Nombres +" "+ Telefono +" " + Dir +"\n";       
            } 
        return output;
    }

    /**
     * Metodo "mostrarPersonaMiniA"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * Solo manda informacion de una persona especifica
     * 
     * @param[in] int i: Parametro de entrada que contiene el indice de la persona
     * 
     * @param[out] String output, Parametro de Salida tipo String que contiene la cadena mostrando la persona
     */
    public String mostrarPersonasMiniA(int i)
    {
        String output = "";
        int j=getIDPersona(i);
        String IDs = Integer.toString(j);
        String Nombres = getNombrePersona(i);
        long t=getTelefonoPersona(i);
        String Telefono = Long.toString(t);
        String Dir= getDireccionPersona(i);

        output += IDs + " "+ Nombres +" "+ Telefono +" " + Dir +"\n";        
        return output;
    }

    /**
     * Metodo "mostrarPersonaMiniB"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * Solo manda informacion basica de una persona especifica
     * 
     * @param[in] int i: Parametro de entrada que contiene el indice de la persona
     * 
     * @param[out] String output, Parametro de Salida tipo String que contiene la cadena mostrando la persona
     */
    public String mostrarPersonasMiniB(int i)
    {
        String output = "";
        int j=getIDPersona(i);
        String IDs = Integer.toString(j);
        String Nombres = getNombrePersona(i);

        output += IDs + " "+ Nombres +"\n";       
        return output;
    }

    /**
     * Metodo "getPersona"
     * Este metodo regresa la referencia del Objeto Persona indicado por el indice
     * 
     * @param[in] int i: Parametro de entrada que representa el indice de la persona deseada
     * 
     * @param[out] Persona : Parametro de Salida tipo Persona
     */
    public Persona getPersona(int i)
    {
        return p.get(i);
    }
    
    /**
     * Metodo "getNombrePersona"
     * Este metodo regresa el nombre del Objeto Persona definida
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del persona deseado
     * 
     * @param[out] String nombre: Parametro de Salida tipo String que contiene la cadena que es el nombre del Persona
     */
    public String getNombrePersona(int i)
    {
        return p.get(i).getNombre();
    }

    /**
     * Metodo "getIDPersona"
     * Este metodo regresa el ID del Objeto Persona definido
     * 
     * @param[in] int i, Parametro de entrada que representa el indice del Persona deseado
     * 
     * @param[out] int ID, Parametro de Salida tipo String que contiene el ID del Persona
     */
    public int getIDPersona(int i)
    {
        return p.get(i).getID();
    }

    /**
     * Metodo "getTelefonoPersona"
     * Este metodo regresa el Telefono del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * 
     * @param[out] long: Parametro de Salida tipo String que contiene el Telefono del Persona
     */
    public long getTelefonoPersona(int i)
    {
        return p.get(i).getTelefono();
    }

    /**
     * Metodo "getDireccionPersona"
     * Este metodo regresa el Direccion del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * 
     * @param[out] String: Parametro de Salida tipo String que contiene el Direccion del Persona
     */
    public String getDireccionPersona(int i)
    {
        return p.get(i).getDireccion();
    }

    /**
     * Metodo "setNombrePersona"
     * Este metodo cambia el nombre del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * @param[out] String j: Parametro de entrada que representa el nombre nuevo
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void setNombrePersona(int i,String j)
    {
        p.get(i).setNombre(j);
    }

    /**
     * Metodo "setIDPersona"
     * Este metodo cambia el ID del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * @param[out] int k: Parametro de entrada que representa el ID nuevo
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void setIDPersona(int i, int k)
    {
        p.get(i).setID(k);
    }

    /**
     * Metodo "setTelefonoPersona"
     * Este metodo cambia el Telefono del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * @param[out] int k: Parametro de entrada que representa el Telefono nuevo
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void setTelefonoPersona(int i, long k)
    {
        p.get(i).setTelefono(k);
    }

    /**
     * Metodo "setDireccionPersona"
     * Este metodo cambia el Direccion del Objeto Persona definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Persona deseado
     * @param[out] int k: Parametro de entrada que representa el Direccion nuevo
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void setDireccionPersona(int i, String d)
    {
        p.get(i).setDireccion(d);
    }

    /**
     * Metodo "buscarNombre"
     * Este metodo busca un Objeto Persona definido por su nombre
     * 
     * @param[in] String j: Parametro de entrada que representa el nombre del Objeto Persona que se desea
     * 
     * @param[out] int i: Numero de indice en donde se encuentra el Persona deseado
     */
    public int buscarNombre(String j) 
    {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) !=null && p.get(i).getNombre().equals(j)) 
            {
                return i;
            }
        }
        return -1;//No se encuentra en la lista
    }

    /**
     * Metodo "buscarID"
     * Este metodo busca un Objeto Persona definido por su ID
     * 
     * @param[in] String j: Parametro de entrada que representa el ID del Objeto Persona que se desea
     * 
     * @param[out] int i: Numero de indice en donde se encuentra el Persona deseado
     */
    public int buscarID(int k) 
    {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) !=null && p.get(i).getID()==k) 
            {
                return i;
            }
        }
        return -1;//No se encuentra en la lista
    }

    /**
     * Metodo "ordenarID"
     * Este metodo ordena la lista p por su ID
     * 
     * @param[in] void
     * 
     * @param[out] void
     */
    public void ordenarID()
    {
        
        for (int i = 0; i <p.size() ; i++) 
        {
            for(int j=0; j<p.size() ; j++)
            {
                if (p.get(j).getID()<p.get(i).getID())
                {
                    Persona aux = p.get(j);
                    p.set(j, p.get(i));
                    p.set(i, aux);
                }
            }
            
        }
    }

    /**
     * //////////Seccion Dedicada a Metodos relacionados con Grupos /////////////////
     */


    /**
     * Metodo "crearGrupo"
     * Este metodo crea e inserta un nuevo objeto tipo Persona al arraylist p
     * @param[in] int idGrupo: Parametro de entrada tipo int, representando el ID
     * @param[in] String nombre: Parametro de entrada tipo String, representando el nombre del grupo
     * 
     * @param[out] void Este metodo no regresa ningun valor 
     */
    public void crearGrupo(int idGrupo, String nomGrupo)
    {
        g.add(new GrupoPersonas(idGrupo, nomGrupo));
    }

    /**
     * Metodo "crearContacto"
     * Este metodo crea e inserta un nuevo objeto tipo Persona al arraylist p
     * @param[in] int i: Parametro de entrada tipo int, representando el grupo
     * @param[in] Persona p: Referencia del Objeto Persona que se desea agregar
     * 
     * @param[out] void Este metodo no regresa ningun valor 
     */
    public void crearContactoGrupo(int i, Persona p )
    {
        g.get(i).agregarPersona(p);
    }

    /**
     * Metodo "borrarContactoGrupo"
     * Este metodo elimina el objeto Persona que se indica
     * @param[in] int i: Parametro de Entrada representando el indice correspondiente al grupo que se desea accesar
     * @param[in] int P1index: Parametro de Entrada representando el indice correspondiente al Objeto tipo Persona que se desea eliminar
     * 
     * @param[out] void, Este metodo no regresa ningun valor
     */
    public void borrarContactoGrupo(int GIndex, int P1Index )
    {
        g.get(GIndex).borrarPersona(P1Index);
    }

    /**
     * Metodo "borrarGrupo"
     * Este metodo elimina el grupo deseado
     * @param[in] int i, Parametro de Entrada representando el indice correspondiente al Objeto tipo GrupoPersonas que se desea eliminar
     * 
     * @param[out] void, Este metodo no regresa ningun valor
     */
    public void borrarGrupo(int i )
    {
        g.remove(i);
    }

    /**
     * Metodo "borrarGrupos"
     * Este metodo elimina todos los grupos existentes
     * @param[in] void
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void borrarGrupos()
    {
       g.clear();
    }

    /**
     * Metodo "mostrarGrupos"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * @param[out] String output, Parametro de Salida tipo String que contiene la cadena mostrando los Grupos
     */
    public String mostrarGrupos()
    {
        String output = "";
            for(int i = 0; i<g.size(); i++)
            {
                int j=getIDGrupo(i);
                String IDs = Integer.toString(j);
                String Nombres = getNombreGrupo(i);

                output += IDs + " "+ Nombres +"\n";       
            } 
        return output;
    }

    /**
     * Metodo "mostrarPersonas"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * @param[out] String output, Parametro de Salida tipo String que contiene la cadena mostrando los Personas
     */
    public String mostrarGrupoMini(int i)
    {
        String output = "";
        int j=getIDGrupo(i);
        String IDs = Integer.toString(j);
        String Nombres = getNombreGrupo(i);

        output += IDs + " "+ Nombres +"\n";       
        return output;
    }

    /**
     * Metodo "mostrarPersonaMiniA"
     * Este metodo crea un tipo de dato String que se pueda mostrar por JOptionPane
     * 
     * Solo manda informacion de un grupo especifico
     * 
     * @param[in] int i: Parametro de entrada que contiene el indice del grupo
     * 
     * @param[out] String output, Parametro de Salida tipo String que contiene la cadena
     */
    public String mostrarGrupoMiniPersonas(int i)
    {
        String output = "";
        int j=getIDGrupo(i);
        String IDs = Integer.toString(j);
        String Nombres = getNombreGrupo(i);
        String Personas=g.get(i).mostrarPersonas();

        output += IDs + " "+ Nombres +":\n"+ Personas;       
        return output;
    }

    /**
     * Metodo "getNombreGrupo"
     * Este metodo regresa el nombre del grupo
     * 
     * @param[in] int i, Parametro de entrada que representa el indice del grupo
     * 
     * @param[out] String Representa el valor del nombre del grupo
     */
    public String getNombreGrupo(int i)
    {
        return g.get(i).getNombre();
    }

    /**
     * Metodo "setNombreGrupo"
     * Este metodo cambia el nombre del Grupo definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Grupo
     * @param[out] String j: Parametro de entrada que representa el nombre nuevo
     * 
     * @param[out] void, Este metodo no regresa ningun valor
     */
    public void setNombreGrupo(int i,String j)
    {
        g.get(i).setNombre(j);
    }

    /**
     * Metodo "getIDPGrupo"
     * Este metodo regresa el ID del Objeto Grupo definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Grupo deseado
     * 
     * @param[out] int ID: Parametro de Salida tipo String que contiene el ID del Grupo
     */
    public int getIDGrupo(int i)
    {
        return g.get(i).getID();
    }

    /**
     * Metodo "setIDGrupo"
     * Este metodo cambia el ID del Objeto Grupo definido
     * 
     * @param[in] int i: Parametro de entrada que representa el indice del Grupo deseado
     * @param[out] int k: Parametro de entrada que representa el ID nuevo
     * 
     * @param[out] void Este metodo no regresa ningun valor
     */
    public void setIDGrupo(int i, int k)
    {
        g.get(i).setID(k);
    }

    /**
     * Metodo "buscarNombreGrupo"
     * Este metodo busca un Objeto Grupo definido por su nombre
     * 
     * @param[in] String j: Parametro de entrada que representa el nombre del Objeto Grupo que se desea
     * 
     * @param[out] int i: Numero de indice en donde se encuentra el Grupo deseado
     */
    public int buscarNombreGrupo(String j) 
    {
        int i;
        for ( i = 0; i < g.size(); i++) 
        {
            if (g.get(i) !=null && g.get(i).getNombre().equals(j)) 
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo "buscarIDGrupo"
     * Este metodo busca un Objeto Grupo definido por su ID
     * 
     * @param[in] String j: Parametro de entrada que representa el ID del Objeto Grupo que se desea
     * 
     * @param[out] int i: Numero de indice en donde se encuentra el Grupo deseado
     */
    public int buscarIDGrupo(int k) 
    {
        for (int i = 0; i < g.size(); i++) {
            if (g.get(i) !=null && g.get(i).getID()==k) 
            {
                return i;
            }
        }
        return -1;//No se encuentra en la lista
    }

    /**
     * Metodo "buscarNombrePersonaGrupo"
     * Este metodo busca el nombre del Objeto Persona que se encuentra en un Grupo especifico
     * 
     * @param[in] String j: Parametro de entrada que representa el nombre del Objeto Persona que se desea
     * @param[in] int GIndex: Parametro de entrada que representa el indice del Grupo deseado
     * 
     * @param[out] int i: Numero de indice en donde se encuentra el Persona deseado
     */
    public int buscarNombrePersonaGrupo(int GIndex, String nombre) 
    {
        return g.get(GIndex).buscarNombre(nombre);
    }

}