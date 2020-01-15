package com.distribuida.servicios;

import java.util.List;
import com.distribuida.clases.Singer;

public interface SingerServicioI {

	List<Singer> listar();

	Singer buscarSinger(int id);

	void crearSinger(Singer cantante);

	void editarSinger(int idCantante);

	void borrarSinger(int idCantante);
}
