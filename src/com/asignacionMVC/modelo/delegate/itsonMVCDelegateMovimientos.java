/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignacionMVC.modelo.delegate;

import com.asignacionMVC.modelo.dto.MovimientosDTO;
import com.asignacionMVC.modelo.facade.MovimientosFacade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Especificación logica del tipo de dato abstracto (itson Modelo Vista
 * Controlador Bussines Delegación Movimientos) que tiene por objetivo el
 * agruparar las acciones para cada uno de los modulos de la aplicación, ademas
 * de reducir el acoplamiento entre los usuarios y la capa de presentación.
 * Elementos: Dos propiedades una del tipo de objeto Connection y otra propiedad
 * del tipo de objeto MovimientosFacade Estructura: Hay una relacion lineal
 * entre los elementos. Dominio: En la estructura se haran diveras operaciones
 * con los elementos.
 *
 * @author Francisco Apodaca
 */
public class itsonMVCDelegateMovimientos {

    private Connection cnn;
    private MovimientosFacade movFacade;

    /**
     * Utilidad: Metodo que obtiene una conexion a la base de datos, la cual se
     * pasa como parametro a la instancia de MovimientosFacade que se crea.
     * Entrada: Elementos de conexión a la base de datos (usuario,password,url y
     * driver. Salida: Elementos inicializados al valor de sus parametros.
     * PreCondición: Declarar los elementos antes de metodo e invocarlos como
     * parametros. PostCondición: Metodo invocando una conexión a la base de
     * datos y una instancia de la fachada de Articulo.
     */
    public itsonMVCDelegateMovimientos() {
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/itsonMVC";
        String mySqlDriver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(mySqlDriver);
            cnn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        movFacade = new MovimientosFacade(cnn);
    }

    /**
     * Utilidad: Metodo que instancia la función del método insertar de la
     * Fachada Entrada: Objeto del tipo MovimientosDTO inicializado al parametro
     * del método. Salida: Abstración del metodo de la clase MovimientosDTO
     * PreCondición: Previamente tener el método en la clase MovimientosDTO
     * PostCondición: Fachada del método insertar de la clase MovimientosDTO
     * establecida una conexión.
     */
    public void crearMovimientosDelegate(MovimientosDTO dto) throws SQLException {
        movFacade.crearFachada(dto);
    }

    /**
     * Utilidad: Metodo que instancia la función del método obtenerTodos de la
     * Fachada Entrada: Objeto del tipo MovimientosDTO inicializado al parametro
     * del método. Salida: Lista con todos los registros encontrados.
     * PreCondición: Previamente tener el método en la clase MovimientosDTO
     * PostCondición: Fachada del método obtenerTodos de la clase MovimientosDTO
     * establecida una conexión.
     */
    public List listarMovimientosDelegate() throws SQLException {
        return movFacade.obtenerTodosFachada();
    }

    /**
     * Utilidad: Metodo que instancia la función del método obtener un articulo
     * de la Fachada Entrada: Objeto del tipo MovimientosDTO inicializado al
     * parametro del método. Salida: Abstración del metodo de la clase
     * MovimientosDTO PreCondición: Previamente tener el método en la clase
     * MovimientosDTO PostCondición: Fachada del método obtener un articulo de
     * la clase MovimientosDTO establecida una conexión.
     */
    public MovimientosDTO obtenerDelegate(MovimientosDTO dto) throws SQLException {
        return movFacade.obtener(dto);
    }

    /**
     * Utilidad: Metodo que instancia la función del método actualizar de la
     * Fachada Entrada: Objeto del tipo MovimientosDTO inicializado al parametro
     * del método. Salida: Abstración del metodo de la clase MovimientosDTO
     * PreCondición: Previamente tener el método en la clase MovimientosDTO
     * PostCondición: Fachada del método actualizar de la clase MovimientosDTO
     * establecida una conexión.
     */
    public void actualizaDelegate(MovimientosDTO dto) throws SQLException {
        movFacade.actualizaFachada(dto);
    }

    /**
     * Utilidad: Metodo que instancia la función del método eliminar de la clase
     * Fachada Entrada: Objeto del tipo MovimientosDTO inicializado al parametro
     * del método. Salida: Abstración del metodo de la clase MovimientosDTO
     * PreCondición: Previamente tener el método en la clase MovimientosDTO
     * PostCondición: Fachada del método eliminar de la clase MovimientosDTO
     * establecida una conexión.
     */
    public void eliminaDelegate(MovimientosDTO dto) throws SQLException {
        movFacade.eliminaFachada(dto);
    }

}
