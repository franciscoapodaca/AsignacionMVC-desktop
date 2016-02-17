/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignacionMVC.modelo.dao;

import com.asignacionMVC.modelo.dto.ArticuloDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Especificación logica del tipo de dato abstracto (Articulo Data Access Object) 
 * Elementos: Cinco propiedades con objetos del tipo String las cuales contienen consultas de base de datos. 
 * Estructura: Hay una relacion lineal entre los elementos. 
 * Dominio: En la estructura se haran diveras operaciones con atributos de tipo de objetos strings cadenas de texto.
 * 
 * @author Francisco Apodaca
 */
public class ArticuloDAO {

    private static final String SQL_INSERT = "INSERT INTO Articulo (claveArticulo, descripcion, precio, existencias) VALUES (?,?,?,?) ";
    private static final String SQL_SELECT = "SELECT claveArticulo, descripcion, precio, existencias FROM Articulo where claveArticulo = ?";
    private static final String SQL_SELECT_ALL = "SELECT claveArticulo, descripcion, precio, existencias FROM Articulo";
    private static final String SQL_UPDATE = "UPDATE Articulo SET descripcion = ?, precio = ?, existencias = ? WHERE claveArticulo = ?";
    private static final String SQL_DELETE = "DELETE FROM Articulo WHERE claveArticulo =?";

    /**
     * Utilidad: Metodo que sirve para insertar un registro en la tabla Articulo de una base de datos.
     * Entrada: Dos objetos uno de tipo ArticuloDTO y otro objeto de tipo Connection que se asignan como parametros al método.
     * Salida: Insertado de un registro en la tabla Articulo.
     * PreCondición: Declarar una propiedad del tipo de objeto String que servira a un objeto de tipo PreparedStatement para realizar una consulta sql.
     * PostCondición: Registro dentro de la base de datos.
     * @param dto instancia del objeto de ArticuloDTO
     * @param conn instancia del objeto de Connection
     * @throws java.sql.SQLException Excepción del tipo SQL
     */
    
    public void insertar(ArticuloDTO dto, Connection conn) throws SQLException {

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, dto.getClaveArticulo());
            ps.setString(2, dto.getDescripcion());
            ps.setDouble(3, dto.getPrecio());
            ps.setInt(4, dto.getExistencias());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
        }
    }

    /**
     * Utilidad: Metodo que sirve para obtener un registro de la tabla Articulo de una base de datos.
     * Entrada: Dos objetos uno de tipo ArticuloDTO y otro objeto de tipo Connection que se asignan como parametros al método.
     * Salida: Obtención de un registro en la tabla Articulo.
     * PreCondición: Declarar una propiedad del tipo de objeto String que servira a un objeto de tipo PreparedStatement para realizar una consulta sql.
     * PostCondición: Registro desde la base de datos.
     * @param dto instancia del objeto de ArticuloDTO
     * @param conn instancia del objeto de Connection
     * @return regresa nulo. 
     * @throws java.sql.SQLException Excepción del tipo SQL
     */
    
    public ArticuloDTO obtener(ArticuloDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, dto.getClaveArticulo());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return (ArticuloDTO) results.get(0);
            } else {
                return null;
            }
        } finally {
            cerrar(ps);
        }
    }

    /**
     * Utilidad: Metodo que sirve para obtener todos los registros de la tabla Articulo de una base de datos.
     * Entrada: Un objeto de tipo Connection.
     * Salida: Obtención de todos los registros de la tabla Articulo en una Lista.
     * PreCondición: Declarar una propiedad del tipo de objeto String con una cadena de texto de tipo consulta sql antes de invocar el método.
     * PostCondición: Registros desde la base de datos.
     * @param conn instancia del objeto de Connection
     * @return regresa vacio.
     * @throws java.sql.SQLException
     */
    
    public List obtenerTodos(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return results;
            } else {
                return null;
            }
        } finally {
            cerrar(ps);
        }
    }

    /**
     * Utilidad: Metodo que sirve para actualizar un registro en la tabla Articulo de una base de datos.
     * Entrada: Dos objetos uno de tipo ArticuloDTO y otro objeto de tipo Connection que se asignan como parametros al método.
     * Salida: Actualización de un registro en la tabla Articulo.
     * PreCondición: Declarar una propiedad del tipo de objeto String con una cadena de texto de tipo consulta sql antes de invocar el método.
     * PostCondición: Actualización de registro en la base de datos.
     * @param dto instancia del objeto de ArticuloDTO
     * @param conn instancia del objeto de Connection
     * @throws java.sql.SQLException
     */
    
    public void actualizar(ArticuloDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, dto.getDescripcion());
            ps.setDouble(2, dto.getPrecio());
            ps.setInt(3, dto.getExistencias());
            ps.setString(4, dto.getClaveArticulo());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
        }
    }

    /**
     * Utilidad: Metodo que sirve para eliminar un registro en la tabla Articulo de una base de datos.
     * Entrada: Dos objetos uno de tipo ArticuloDTO y otro objeto de tipo Connection que se asignan como parametros al método.
     * Salida: Eliminado de un registro en la tabla Articulo.
     * PreCondición: Declarar una propiedad del tipo de objeto String con una cadena de texto de tipo consulta sql antes de invocar el método.
     * PostCondición: Registro eiliminado dentro de la base de datos.
     * @param dto instancia del objeto de ArticuloDTO
     * @param conn instancia del objeto de Connection
     * @throws java.sql.SQLException
     */
    
    public void eliminar(ArticuloDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, dto.getClaveArticulo());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
        }
    }

    /**
     * Utilidad: Metodo que sirve para obtener una tabla de datos que representan un conjunto de resultados de base de datos.
     * Entrada: Un objeto de tipo ResultSet que se asigna como parametro al método.
     * Salida: Tabla de los datos que existen en la tabla Articulo de una base de datos.
     * PreCondición: Declarar una Lista del tipo ArrayList para obtener y guardar los datos de la tabla Articulo con sus campos correspondientes.
     * PostCondición: Tabla de datos de un conjunto de resultados de la tabla Articulo.
     */
    
    private List getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList();
        while (rs.next()) {
            ArticuloDTO dto = new ArticuloDTO();
            dto.setClaveArticulo(rs.getString("claveArticulo"));
            dto.setDescripcion(rs.getString("descripcion"));
            dto.setPrecio(rs.getDouble("precio"));
            dto.setExistencias(rs.getInt("existencias"));
            results.add(dto);
        }
        return results;
    }

    /**
     * Utilidad: Metodo que sirve para cerrar la consulta realizada a la base de datos.
     * Entrada: Un objeto de tipo PreparedStatement com parametro.
     * Salida: Conexión de la consulta finalizada.
     * PreCondición: Declarar un objeto en cualquier metodo del tipo PreparedStatement para verificar su correcta finalización.
     * PostCondición: Consulta cerrada.
     * @param ps instancia del objeto PreparedStatement
     * @throws java.sql.SQLException
     */
    
    public void cerrar(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            try {
                ps.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Utilidad: Metodo que sirve para cerrar el resultado de la tabla del conjunto de datos de la tabla Articulo.
     * Entrada: Un objeto de tipo ResultSet como parametro.
     * Salida: Conexión de los resultados finalizada.
     * PreCondición: Declarar un objeto en cualquier metodo del tipo ResultSet para verificar su correcta finalización.
     * PostCondición: Resultados cerrados.
     * @param rs instancia del objeto ResultSet
     * @throws java.sql.SQLException
     */
    
    public void cerrar(ResultSet rs) throws SQLException {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Utilidad: Metodo que sirve para cerrar la conexión a la base de datos.
     * Entrada: Un objeto de tipo Connection como parametro.
     * Salida: Conexión a la base de datos finalizada.
     * PreCondición: Aver declarado en los métodos la inicialización de la conexión para luego cerrarla con este metodo.
     * PostCondición: Conexión a la base de datos terminada.
     * @param cnn instancia del objeto de Connection
     * @throws java.sql.SQLException
     */
    
    public void cerrar(Connection cnn) throws SQLException {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (Exception e) {
            }
        }
    }

}
