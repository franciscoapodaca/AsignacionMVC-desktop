/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignacionMVC.modelo.facade;

import com.asignacionMVC.modelo.dao.MovimientosDAO;
import com.asignacionMVC.modelo.dto.MovimientosDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Especificación logica del tipo de dato abstracto (Movimientos Fachada) que
 * tiene por objetivo el abstraer una capa de otra, de forma que si una capa
 * cambia no hace falta cambiar la otra. Elementos: Dos propiedades una del tipo
 * de objeto Connection y otra propiedad del tipo de objeto MovimientosDAO.
 * Estructura: Hay una relacion lineal entre los elementos. Dominio: En la
 * estructura se haran diveras operaciones con los elementos.
 *
 * @author Francisco Apodaca
 */
public class MovimientosFacade {

    private Connection cnn;
    private MovimientosDAO dao;

    /**
     * Utilidad: Metodo que inicializa un objeto del tipo Conexion y crea una
     * instancia de la clase MovimientosDAO Entrada: Propiedad Connection y
     * MovimientosDAO Salida: Elementos inicializados al valor de sus
     * parametros. PreCondición: Declarar los elementos antes de metodo e
     * invocarlos como parametros. PostCondición: Metodo invocando una conexión
     * y una instancia de la clase MovimientosDAO.
     */
    public MovimientosFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new MovimientosDAO();
    }

    /**
     * Utilidad: Metodo que instancia la función del método insertar de la clase
     * MovimientosDTO Entrada: Objeto del tipo MovimientosDTO inicializado al
     * parametro del método. Salida: Abstración del metodo de la clase
     * MovimientosDTO PreCondición: Previamente tener el método en la clase
     * MovimientosDTO PostCondición: Fachada del método insertar de la clase
     * MovimientosDTO establecida una conexión.
     */
    public void crearFachada(MovimientosDTO dto) throws SQLException {
        dao.insertar(dto, cnn);
    }

    /**
     * Utilidad: Metodo que instancia la función del método actualizar de la
     * clase MovimientosDTO Entrada: Objeto del tipo MovimientosDTO inicializado
     * al parametro del método. Salida: Abstración del metodo de la clase
     * MovimientosDTO PreCondición: Previamente tener el método en la clase
     * MovimientosDTO PostCondición: Fachada del método actualizar de la clase
     * MovimientosDTO establecida una conexión.
     */
    public void actualizaFachada(MovimientosDTO dto) throws SQLException {
        dao.actualizar(dto, cnn);
    }

    /**
     * Utilidad: Metodo que instancia la función del método eliminar de la clase
     * MovimientosDTO Entrada: Objeto del tipo MovimientosDTO inicializado al
     * parametro del método. Salida: Abstración del metodo de la clase
     * MovimientosDTO PreCondición: Previamente tener el método en la clase
     * MovimientosDTO PostCondición: Fachada del método eliminar de la clase
     * MovimientosDTO establecida una conexión.
     */
    public void eliminaFachada(MovimientosDTO dto) throws SQLException {
        dao.eliminar(dto, cnn);
    }

    /**
     * Utilidad: Metodo que instancia la función del método obtenerTodos de la
     * clase MovimientosDTO Entrada: Objeto del tipo MovimientosDTO inicializado
     * al parametro del método. Salida: Lista con todos los registros
     * encontrados. PreCondición: Previamente tener el método en la clase
     * MovimientosDTO PostCondición: Fachada del método obtenerTodos de la clase
     * MovimientosDTO establecida una conexión.
     */
    public List obtenerTodosFachada() throws SQLException {
        return dao.obtenerTodos(cnn);
    }

    /**
     * Utilidad: Metodo que instancia la función del método obtener un articulo
     * de la clase MovimientosDTO Entrada: Objeto del tipo MovimientosDTO
     * inicializado al parametro del método. Salida: Abstración del metodo de la
     * clase MovimientosDTO PreCondición: Previamente tener el método en la
     * clase MovimientosDTO PostCondición: Fachada del método obtener un
     * articulo de la clase MovimientosDTO establecida una conexión.
     */

    public MovimientosDTO obtener(MovimientosDTO dto) throws SQLException {
        return dao.obtener(dto, cnn);
    }

}
