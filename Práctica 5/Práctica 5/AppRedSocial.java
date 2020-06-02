import ipn.escom.poo.utencilios.Mensajero;


import javax.swing.*; ///Importacion del paquete que permite el uso de Jopti
   /**
     * Programa que simula una red social
     */

public class AppRedSocial{
	public static void main(String[] args){
		/**
		 * Atributos de la clase 
		 */
		boolean flag = true;
		Mensajero mensajero_obj = new Mensajero();
		int idContactoGuardado = 1;
		int idGrupoGuardado = 1;
		/**
		 * Menu que se muestra al usuario  para crear al usuario
		 */

		JOptionPane.showMessageDialog(null, "Bienvenido a la aplicacion de red social\n" +
											"Para comenzar debe crear su usuario");
		String pRed = JOptionPane.showInputDialog("Elige una red social\n" +
														"1.- ICQ\n" +
														"2.- WhatsApp\n" +
														"3.- Skype\n" );
		int pRedSocial = Integer.parseInt(pRed);

		String pNombreContacto = JOptionPane.showInputDialog("Ingresa tu nombre");
		pNombreContacto = pNombreContacto.toLowerCase();
					
		String pTelefono = JOptionPane.showInputDialog("Ingresa tu telefono");
					
		long primerTelefono = Long.parseLong(pTelefono);

		String pDireccion = JOptionPane.showInputDialog("Ingresa tu direccion");

		String pAvatar = JOptionPane.showInputDialog("Ingresa tu avatar");

		String pNickName = JOptionPane.showInputDialog("Ingresa tu nickName");

		boolean pOpcCrear = mensajero_obj.crearContacto(idContactoGuardado, pNombreContacto, primerTelefono, pDireccion, pAvatar, pNickName, pRedSocial);

		if (pOpcCrear) {
			JOptionPane.showMessageDialog(null, "Se creo tu usuario exitosamente\n" +
												"\n(Aparecera dentro de tu lista de contactos)\n");
			idContactoGuardado = mensajero_obj.numeroContactos() + 1;
		} else{
			JOptionPane.showMessageDialog(null, "Ocurrio un error");
		}

		/**
		 * Menu de opciones principal
		 */

		do{
			String opcion = JOptionPane.showInputDialog("Bienvenido a la red social :D\n" +
														"Elija el numero de la opcion deseada\n" +
														"1.- Crea un contacto\n" +
														"2.- Borrar contacto\n" +
														"3.- Modificar contacto\n" +
														"4.- Seleccionar un contacto\n" +
														"5.- Borrar todos los contactos de una red social\n" +
														"6.- Mostrar contactos\n" +
														"7.- Ingresar al menu de grupos\n" +
														"8.- Salir :C");
			int opcionUsuario = Integer.parseInt(opcion);
			
		/**
		 * Dependiendo de la opcion que elija el usuario
		 * Elprograma hará las operaciones correspondientes para 
		 * que se pueda manipular la información de cada uno
		 */
			switch(opcionUsuario){
				case 1:

					String redSocial = JOptionPane.showInputDialog("Elige la red social para el nuevo contacto\n" +
																	"1.- ICQ\n" +
																	"2.- WhatsApp\n" +
																	"3.- Skype\n" );
					int nRedSocial = Integer.parseInt(redSocial);

					String nNombreContacto = JOptionPane.showInputDialog("Ingresa el nombre para el nuevo contacto");
					nNombreContacto = nNombreContacto.toLowerCase();
					
					String telefono = JOptionPane.showInputDialog("Ingresa el telefono para el nuevo contacto");
					
					long nTelefono = Long.parseLong(telefono);

					String nDireccion = JOptionPane.showInputDialog("Ingresa la direccion del nuevo contacto");

					String nAvatar = JOptionPane.showInputDialog("Ingresa el avatar del nuevo contacto");

					String nNickName = JOptionPane.showInputDialog("Ingresa el nickName del nuevo contacto");

					boolean opcCrear = mensajero_obj.crearContacto(idContactoGuardado, nNombreContacto, nTelefono, nDireccion, nAvatar, nNickName, nRedSocial);

					if (opcCrear) {
						JOptionPane.showMessageDialog(null, "Se creo el contacto exitosamente");
						idContactoGuardado = mensajero_obj.numeroContactos() + 1;
					} else{
						JOptionPane.showMessageDialog(null, "Ocurrio un error");
					}
				break;

				case 2:
					if (idContactoGuardado == 2) {
						JOptionPane.showMessageDialog(null, "No existen contactos para borrar");
						break;
					}

					String borrar = JOptionPane.showInputDialog("Ingresa el id de contacto que deseas borrar");
					int idBorrar = Integer.parseInt(borrar);
					
					if (idBorrar == 1){
						JOptionPane.showMessageDialog(null, "No se puede borrar su usuario :v");
						break;
					}

					boolean contactoBorrado = mensajero_obj.borrarContacto(idBorrar);

					if (contactoBorrado) {
					 	JOptionPane.showMessageDialog(null, "Se borro el contacto exitosamente");
					 	idContactoGuardado = idBorrar;
					 } else {
					 	JOptionPane.showMessageDialog(null, "No se puedo borrar el contacto");
					 }
				break;

				case 3:
					String nombreBuscarModificar = JOptionPane.showInputDialog("Ingrese el nombre del contacto que desea modificar");
					nombreBuscarModificar = nombreBuscarModificar.toLowerCase();

					boolean hacer = mensajero_obj.contactoExiste(nombreBuscarModificar);
					
					if(hacer == true){
						String opcionM = JOptionPane.showInputDialog("¿Que desea hacer?\n" +
																	"1.- Modificar un dato del contacto\n" +
																	"2.- Modificar todos los datos\n" +
																	"(El id de un contacto no se puede modificar)");
						int opcionModificar = Integer.parseInt(opcionM);

						if (opcionModificar == 1) {

							String auxModificar = JOptionPane.showInputDialog("¿Que Dato deseas modificar?\n" +
																				"1.- Nombre\n" +
																				"2.- Telefono\n" +
																				"3.- Direccion\n" +
																				"4.- Avatar\n" +
																				"5.- NickName");
							int opcionModificarParametro = Integer.parseInt(auxModificar);

							switch(opcionModificarParametro){
								case 1:
									String cambiarNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre para el contacto");
									cambiarNombre = cambiarNombre.toLowerCase();
									boolean resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, cambiarNombre, 00000000, "", "", "");
									if (resultadoModificarContacto) {
										JOptionPane.showMessageDialog(null, "Se modifico el nombre correctamente");
									} else {
										JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el nombre");
									}
								break;

								case 2:
									String cambiarTel = JOptionPane.showInputDialog("Ingrese el nuevo telefono para el contacto");
									long cambiarTelefono = Long.parseLong(cambiarTel);
									resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, "", cambiarTelefono, "", "", "");
									if (resultadoModificarContacto) {
										JOptionPane.showMessageDialog(null, "Se modifico el Telefono correctamente");
									} else {
										JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el telefono");
									}
								break;

								case 3:
									String cambiarDireccion = JOptionPane.showInputDialog("Ingrese la nueva direccion para el contacto");
									resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, "", 00000000, cambiarDireccion, "", "");
									if (resultadoModificarContacto) {
										JOptionPane.showMessageDialog(null, "Se modifico la direccion correctamente");
									} else {
										JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar la direccion");
									}
								break;

								case 4:
									String cambiarAvatar = JOptionPane.showInputDialog("Ingrese el nuevo avatar para el contacto");
									resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, "", 00000000, "", cambiarAvatar, "");
									if (resultadoModificarContacto) {
										JOptionPane.showMessageDialog(null, "Se modifico el avatar correctamente");
									} else {
										JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el avatar");
									}
								break;

								case 5:
									String cambiarNickName = JOptionPane.showInputDialog("Ingrese el nuevo nickname para el contacto");
									resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, "", 00000000, "", "", cambiarNickName);
									if (resultadoModificarContacto) {
										JOptionPane.showMessageDialog(null, "Se modifico el nickname correctamente");
									} else {
										JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el nickname");
									}
								break;

								default:
									JOptionPane.showMessageDialog(null, "la opcion no es valida");
								break;
							}
						} else if(opcionModificar == 2){
							String cambiarNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre para el contacto");

							String cambiarTel = JOptionPane.showInputDialog("Ingrese el nuevo telefono para el contacto");
							long cambiarTelefono = Long.parseLong(cambiarTel);

							String cambiarDireccion = JOptionPane.showInputDialog("Ingrese la nueva direccion para el contacto");

							String cambiarAvatar = JOptionPane.showInputDialog("Ingrese el nuevo avatar para el contacto");

							String cambiarNickName = JOptionPane.showInputDialog("Ingrese el nuevo nickname para el contacto");

							boolean resultadoModificarContacto = mensajero_obj.modificarParametroContacto(nombreBuscarModificar, cambiarNombre, cambiarTelefono, cambiarDireccion, cambiarAvatar, cambiarNickName);
							
							if (resultadoModificarContacto) {
								JOptionPane.showMessageDialog(null, "Se moficaron los datos correctamente");
							} else {
								JOptionPane.showMessageDialog(null, "Ocurrio un error al tratar de cambiar los datos");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Lo opcion no es valida");
						}
					} else {
						JOptionPane.showMessageDialog(null, "El contacto que busca no existe en la lista de contactos");
					}
				break;

				case 4:
					
					String seleccionRedSocial = JOptionPane.showInputDialog("Elige la red social para el nuevo contacto\n" +
																	"1.- ICQ\n" +
																	"2.- WhatsApp\n" +
																	"3.- Skype\n" );
					int redSocialSeleccionada = Integer.parseInt(seleccionRedSocial);

					String nombresDeEsaRed = mensajero_obj.contactosRedSocial(redSocialSeleccionada);

					if (nombresDeEsaRed.equals("")) {
						JOptionPane.showMessageDialog(null, "No existen contactos de esa red social");
					}

					String contactoSeleccionado = JOptionPane.showInputDialog("Ingresa el nombre del contacto que deseas seleccionar \n" +
																				nombresDeEsaRed);
					contactoSeleccionado = contactoSeleccionado.toLowerCase();

					String nombreUsuario = mensajero_obj.getNombreUsuarioApp();
					
					if(nombreUsuario.equals(contactoSeleccionado)){
						JOptionPane.showMessageDialog(null, "No te puedes seleccionar :V");
						break;
					}

					String opcionSubMenu = JOptionPane.showInputDialog("¿Que desea hacer?\n" +
																		"1.- Enviar mensaje\n" +
																		"2.- Enviar imagen\n" +
																		"3.- Mostrar historial\n");
					int opElegirContacto = Integer.parseInt(opcionSubMenu);

					switch(opElegirContacto){
						case 1:
							String mensajeEnviar = JOptionPane.showInputDialog("Escribe el mensaje para enviar :3");

							boolean resultadoEnviarMensaje = mensajero_obj.enviarMensaje(contactoSeleccionado, mensajeEnviar);
						
							if (resultadoEnviarMensaje){
								JOptionPane.showMessageDialog(null, "Se envio el mensaje correctamente\n");
							} else if(resultadoEnviarMensaje == false){
								JOptionPane.showMessageDialog(null, "No se pudo enviar el mensaje");
							}
						break;

						case 2:
							String imagenEnviar = JOptionPane.showInputDialog("Escribe el nombre de la imagen para enviar :3");

							resultadoEnviarMensaje = mensajero_obj.enviarImagen(contactoSeleccionado, imagenEnviar);
						
							if (resultadoEnviarMensaje){
								JOptionPane.showMessageDialog(null, "Se envio la imagen correctamente\n");
							} else if(resultadoEnviarMensaje == false){
								JOptionPane.showMessageDialog(null, "No se pudo enviar la imagen");
							}
						break;

						case 3:
							String mensajem = mensajero_obj.mostrarHistorial(contactoSeleccionado);
							JOptionPane.showMessageDialog(null, "Historial de actividad con " + contactoSeleccionado + "\n" +
																mensajem);
						break;
					}
				break;

				case 5:
					String seleccionRedSocialBorrar = JOptionPane.showInputDialog("Elige la red social para eliminar los contactos\n" +
																	"1.- ICQ\n" +
																	"2.- WhatsApp\n" +
																	"3.- Skype\n" );
					int redSocialBorrar = Integer.parseInt(seleccionRedSocialBorrar);

					String nombresBorrar = mensajero_obj.contactosRedSocial(redSocialBorrar);

					JOptionPane.showMessageDialog(null, "Estos son los contactos que se borraran: \n" +
														nombresBorrar);

					mensajero_obj.borrarContactos(redSocialBorrar);

					switch(redSocialBorrar){
						case 1:
							JOptionPane.showMessageDialog(null, "Se han borrado todos los contactos de ICQ");
						break;

						case 2:
							JOptionPane.showMessageDialog(null, "Se han borrado todos los contactos de WhatsApp");
						break;

						case 3:
							JOptionPane.showMessageDialog(null, "Se han borrado todos los contactos de Skype");
						break;
					}
				break;

				case 6:
					String contactosMostrar = mensajero_obj.mostrarContactos();
					JOptionPane.showMessageDialog(null, "Estos son tus contactos: \n" +
														"Id|  Nombre  |    Telefono    |    Direccion    |    Avatar    |    NickName    |\n" +
														contactosMostrar); 
				break;

				case 7:
					boolean caso7 = true;
					do{
						String opcionMenuGrupo = JOptionPane.showInputDialog("Menu de Grupo\n" +
																				"Elige una opcion\n" +
																				"1.- Crear grupo\n" +
																				"2.- Borrar grupo\n" + 
																				"3.- Modificar grupo\n" +
																				"4.- Seleccionar un grupo\n" +
																				"5.- Volver al menu principal");
						int opcionMenuGrupoInt = Integer.parseInt(opcionMenuGrupo);

						switch(opcionMenuGrupoInt){
							case 1:
								String redSocialGrupoNuevo = JOptionPane.showInputDialog("Elige la red social para el nuevo contacto\n" +
																							"1.- ICQ\n" +
																							"2.- WhatsApp\n" +
																							"3.- Skype\n" );
								int nGrupoRedSocial = Integer.parseInt(redSocialGrupoNuevo);

								String nNombreGrupo = JOptionPane.showInputDialog("Ingresa el nombre para el nuevo grupo");
								nNombreGrupo = nNombreGrupo.toLowerCase();

								boolean opcCrearGrupo = mensajero_obj.crearGrupo(nNombreGrupo, idGrupoGuardado, nGrupoRedSocial);

								if (opcCrearGrupo) {
									JOptionPane.showMessageDialog(null, "Se creo el grupo exitosamente");
									idGrupoGuardado = mensajero_obj.numeroGrupos() + 1;
								} else{
									JOptionPane.showMessageDialog(null, "Ocurrio un error");
								}
							break;

							case 2:
								String idGrupoBorrarS = JOptionPane.showInputDialog("Ingresa el ID del grupo que deseas borrar");
								int idGrupoBorrar = Integer.parseInt(idGrupoBorrarS);

								boolean resultadoBorrarGrupo = mensajero_obj.borrarGrupo(idGrupoBorrar);

								if(resultadoBorrarGrupo){
									JOptionPane.showMessageDialog(null, "Se borro el grupo exitosamente");
									idGrupoGuardado = idGrupoBorrar;
								} else {
									JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar borrar el grupo");
								}
							break;

							case 3:
								String nombreBuscarModificarGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo que desea modificar");
								nombreBuscarModificarGrupo = nombreBuscarModificarGrupo.toLowerCase();

								boolean hacerModificacionGrupo = mensajero_obj.grupoExiste(nombreBuscarModificarGrupo);

								if(hacerModificacionGrupo == true){
								String opcionMG = JOptionPane.showInputDialog("¿Que desea hacer?\n" +
																				"1.- Modificar un dato del grupo\n" +
																				"2.- Modificar todos los datos\n" +
																				"(El id de un grupo no se puede modificar)");
								int opcionModificarGrupo = Integer.parseInt(opcionMG);

									if (opcionModificarGrupo == 1) {

										String auxModificarGrupo = JOptionPane.showInputDialog("¿Que Dato deseas modificar?\n" +
																								"1.- Nombre\n" +
																								"2.- Tipo de red social del grupo\n");
										int opcionModificarParametroGrupo = Integer.parseInt(auxModificarGrupo);

										switch(opcionModificarParametroGrupo){
											case 1:
												String cambiarNombreGrupo = JOptionPane.showInputDialog("Ingrese el nuevo nombre para el Grupo");
												cambiarNombreGrupo = cambiarNombreGrupo.toLowerCase();
												boolean resultadoModificarGrupo = mensajero_obj.modificarParametroGrupo(nombreBuscarModificarGrupo, cambiarNombreGrupo, 0);
												if (resultadoModificarGrupo) {
													JOptionPane.showMessageDialog(null, "Se modifico el nombre correctamente");
												} else {
													JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el nombre");
												}
											break;

											case 2:
												String cambiarTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de red social para el grupo" +
																									"1.- ICQ\n" +
																									"2.- WhatsApp\n" +
																									"3.- Skype");
												int cambiarTipoRedSocial = Integer.parseInt(cambiarTipo);

												resultadoModificarGrupo = mensajero_obj.modificarParametroGrupo(nombreBuscarModificarGrupo, "", cambiarTipoRedSocial);
												if (resultadoModificarGrupo) {
													JOptionPane.showMessageDialog(null, "Se modifico el Tipo de red social correctamente");
												} else {
													JOptionPane.showMessageDialog(null, "ocurrio un error al mofificar el tipo de red social");
												}
											break;

											default:
												JOptionPane.showMessageDialog(null, "la opcion no es valida");
											break;
										}

									} else if(opcionModificarGrupo == 2){
										String cambiarNombreGrupo = JOptionPane.showInputDialog("Ingrese el nuevo nombre para el Grupo");

										String cambiarTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de red social para el grupo");
										int cambiarTipoRedSocial = Integer.parseInt(cambiarTipo);

										boolean resultadoModificarGrupo = mensajero_obj.modificarParametroGrupo(nombreBuscarModificarGrupo, cambiarNombreGrupo, cambiarTipoRedSocial);
							
										if (resultadoModificarGrupo) {
											JOptionPane.showMessageDialog(null, "Se moficaron los datos correctamente");
										} else {
											JOptionPane.showMessageDialog(null, "Ocurrio un error al tratar de cambiar los datos");
										}
									} else {
										JOptionPane.showMessageDialog(null, "Lo opcion no es valida");
									}
								} else {
									JOptionPane.showMessageDialog(null, "El grupo que busca no existe en la lista de grupos");
								}
							break;

							case 4:
								String seleccionRedSocialGrupo = JOptionPane.showInputDialog("Elige la red social para el nuevo contacto\n" +
																							"1.- ICQ\n" +
																							"2.- WhatsApp\n" +
																							"3.- Skype\n" );
								int redSocialSeleccionadaGrupo = Integer.parseInt(seleccionRedSocialGrupo);

								String nombresDeEsaRedGrupo = mensajero_obj.gruposRedSocial(redSocialSeleccionadaGrupo);

								if (nombresDeEsaRedGrupo.equals("")) {
									JOptionPane.showMessageDialog(null, "No existen grupos de esa red social");
								}

								String grupoSeleccionado = JOptionPane.showInputDialog("Ingresa el nombre del grupo que deseas seleccionar \n" +
																				nombresDeEsaRedGrupo);
								grupoSeleccionado = grupoSeleccionado.toLowerCase();

								String opcionSubMenuGrupo = JOptionPane.showInputDialog("¿Que desea hacer?\n" +
																					"1.- Mostrar datos\n" +
																					"2.- Enviar mensaje al grupo\n" +
																					"3.- Enviar imagen al grupo\n" +
																					"4.- Agregar contacto\n" +
																					"5.- Borrar contacto\n" +
																					"6.- Borrar contactos");
								int opElegirGrupo = Integer.parseInt(opcionSubMenuGrupo);

								switch(opElegirGrupo){
									case 1:
										String informacionDelGrupo = mensajero_obj.mostrarInformacionGrupo(grupoSeleccionado);
										JOptionPane.showMessageDialog(null, "Informacion del grupo\n" +
																			"Id de grupo |  Nombre del grupo  |    Tipo de red social   |\n" +
																			informacionDelGrupo);
									break;

									case 2:
										

									break;

									case 3:

									break;

									case 4:
										String contactosParaAgregar = mensajero_obj.contactosRedSocial(redSocialSeleccionadaGrupo);
										String contactoAgregar = JOptionPane.showInputDialog("Estos son los contactos disponibles para agregar a este grupo\n" +
																								contactosParaAgregar);
										contactoAgregar = contactoAgregar.toLowerCase();

										boolean seAgregoContacto = mensajero_obj.agregarContactoGrupo(contactoAgregar, grupoSeleccionado);

										if (seAgregoContacto){
											JOptionPane.showMessageDialog(null, "Se agrego el contacto al grupo exitosamente");
										} else{
											JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar agregar el contacto al grupo");
										}
									break;

									case 5:
										String contactosParaBorrar = mensajero_obj.contactosEnGrupo(grupoSeleccionado);
										String contactoBorrar = JOptionPane.showInputDialog("Estos son los contactos disponibles para borrar en este grupo\n" +
																								contactosParaBorrar);
										contactoBorrar = contactoBorrar.toLowerCase();
										boolean borrarContactoGrupo = mensajero_obj.borrarContactoGrupo(contactoBorrar, grupoSeleccionado);

										if(borrarContactoGrupo){
											JOptionPane.showMessageDialog(null, "Se borro el contacto exitosamente");
										} else {
											JOptionPane.showMessageDialog(null, "Ocurrio un error");
										}

									break;

									case 6:

									break;
								}
							break;

							case 5:
								caso7 = false;
							break;
						}
					}while(caso7 != false);
				break;

				case 8:
					System.exit(0);
				break;
			}
		} while(flag != false);
	}
}