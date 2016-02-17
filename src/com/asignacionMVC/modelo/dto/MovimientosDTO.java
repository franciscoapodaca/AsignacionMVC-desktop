/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignacionMVC.modelo.dto;

import java.io.Serializable;
import objetosServicio.Fecha;

/**
 * Especificación logica del tipo de dato abstracto (Movimientos Data Transfer
 * Object) que implementa Serializable para que los datos sean enviados o
 * recibidos a traves de red o sockets en formato de bytes. Elementos: Tres
 * propiedades del tipo de objeto String, una propiedad del tipo de objeto Fecha
 * y una propiedad del tipo de dato primitivo entero. Estructura: Hay una
 * relacion lineal entre los elementos. Dominio: En la estructura se haran
 * diveras operaciones con los elementos.
 *
 * @author Francisco Apodaca
 */
public class MovimientosDTO implements Serializable {

    private String folio;
    private Fecha fecha;
    private String tipoMov;
    private int cantidad;
    private String claveArticulo;

    /**
     * Utilidad: Constructor por ausencia el cual será invocado cada vez que se
     * construya un objeto sin especificar ningún argumento. Entrada: elementos
     * de la clase. Salida: Constructor de invocación. PreCondición: Declarar
     * variables antes del constructor por ausencia. PostCondición: Constructor
     * invocado sin parametros
     */
    public MovimientosDTO() {
    }

    /**
     * Utilidad: Constructor que inicializa los parametros a su valor y al
     * invocar este constructor los parametros estaran inicializados. Entrada:
     * Elementos de la clase Articulo Data Transfer Object. Salida: Elementos
     * inicializados al valor de uss parametros. PreCondición: Declarar los
     * elementos antes del constructor e invocarlos como parametros.
     * PostCondición: Constructor invocado con elementos al valor de sus
     * parametros.
     */
    public MovimientosDTO(String folio, Fecha fecha, String tipoMov, int cantidad, String claveArticulo) {
        this.folio = folio;
        this.fecha = fecha;
        this.tipoMov = tipoMov;
        this.cantidad = cantidad;
        this.claveArticulo = claveArticulo;
    }

    /**
     * Utilidad: Metodo de acceso que obtiene el folio de un movimiento.
     * Entrada: Elemento del tipo de objeto String de nombre folio Salida:
     * Obtención de un folio del movimiento. PreCondición: Declarar atributo del
     * tipo de objeto String antes del método de acceso. PostCondición: Obtener
     * folio del movimiento.
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Utilidad: Método de acceso que establece un folio de un movimiento.
     * Entrada: Parametro del tipo de objeto String de nombre folio Salida:
     * Folio del movimiento establecido. PreCondición: Declarar atributo del
     * tipo de objeto String antes del método de acceso. PostCondición:
     * Establecer folio del movimiento.
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * Utilidad: Metodo de acceso que obtiene la fecha de un movimiento Entrada:
     * Elemento del tipo de objeto fecha de nombre fecha. Salida: Obtención de
     * la fecha de un movimiento. PreCondición: Declarar atributo del tipo de
     * objeto fecha antes del método de acceso. PostCondición: Obtener fecha del
     * movimiento.
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Utilidad: Método de acceso que establece una fecha de un movimiento.
     * Entrada: Elemento del tipo de objeto fecha de nombre fecha. Salida:
     * Existencia del articulo establecida. PreCondición: Declarar atributo del
     * tipo de objeto fecha antes del método de acceso. PostCondición:
     * Establecer fecha de un movimiento.
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Utilidad: Metodo de acceso que obtiene el tipo de movimiento de un
     * movimiento. Entrada: Elemento del tipo de objeto String de nombre
     * tipoMov. Salida: Obtención del tipo de movimiento de un movimiento.
     * PreCondición: Declarar atributo del tipo de objeto String antes del
     * método de acceso. PostCondición: Obtener tipoMov del movimiento.
     */
    public String getTipoMov() {
        return tipoMov;
    }

    /**
     * Utilidad: Método de acceso que establece un tipo de movimiento de un
     * movimiento. Entrada: Elemento del tipo de objeto String de nombre tipoMov
     * Salida: Tipo de movimiento del movimiento establecido. PreCondición:
     * Declarar atributo del tipo de objeto String antes del método de acceso.
     * PostCondición: Establecer tipoMov del movimiento.
     */
    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    /**
     * Utilidad: Metodo de acceso que obtiene la cantidad de un movimiento.
     * Entrada: Elemento del tipo pirmitivo entero de nombre cantidad. Salida:
     * Obtención de la cantidad de un movimiento. PreCondición: Declarar
     * atributo del tipo primitivo entero antes del método de acceso.
     * PostCondición: Obtener cantidad del articulo.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Utilidad: Método de acceso que establece una existencia de un articulo.
     * Entrada: Elemento del tipo pirmitivo entero de nombre cantidad. Salida:
     * Cantidad de movimiento establecido. PreCondición: Declarar atributo del
     * tipo primitivo entero antes del método de acceso. PostCondición:
     * Establecer cantidad de un movimiento.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Utilidad: Metodo de acceso que obtiene la clave de un articulo ligado a
     * un movimiento. Entrada: Elemento del tipo de objeto String de nombre
     * claveArticulo Salida: Obtención de la clave del articulo ligado a un
     * movimiento. PreCondición: Declarar atributo del tipo de objeto String
     * antes del método de acceso. PostCondición: Obtener clave del articulo
     * ligado a un movimiento.
     */
    public String getClaveArticulo() {
        return claveArticulo;
    }

    /**
     * Utilidad: Método de acceso que establece una clave de un articulo ligado
     * a un movimiento. Entrada: Parametro del tipo de objeto String de nombre
     * claveArticulo Salida: Clave del articulo establecida ligada a un
     * movimiento. PreCondición: Declarar atributo del tipo de objeto String
     * antes del método de acceso. PostCondición: Establecer clave del articulo
     * ligaro a un movimiento..
     */
    public void setClaveArticulo(String claveArticulo) {
        this.claveArticulo = claveArticulo;
    }

    /**
     * Utilidad: Metodo toString que establece los atributos a cadena de textos
     * para mostrarlos en consola. Entrada: Elementos de la clase inicializados.
     * Salida: Elementos de la clase en consola. PreCondición: Declarar
     * variables antes del método. PostCondición: Cadenas de texto con los
     * elementos de la clase.
     */
    @Override
    public String toString() {
        return "\nFolio: " + getFolio() + "\nFecha: " + getFecha() + "\nTipo de Movimiento: " + getTipoMov()
                + "\nCantidad: " + getCantidad() + "\nClave de Articulo: " + getClaveArticulo();
    }

}
