/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asignacionMVC.modelo.dto;

import java.io.Serializable;

/**
 * Especificación logica del tipo de dato abstracto (Articulo Data Transfer Object) 
 * que implementa Serializable para que los datos sean enviados o recibidos a traves de red o sockets en formato de bytes.
 * Elementos: Dos propiedades del tipo de objetos String, Una propiedad del tipo primitivo doble y una propiedad mas del tipo primitivo entero.
 * Estructura: Hay una relacion lineal entre los elementos. 
 * Dominio: En la estructura se haran diveras operaciones con los elementos.
 * 
 * @author Francisco Apodaca
 */
public class ArticuloDTO implements Serializable {

    private String claveArticulo;
    private String descripcion;
    private double precio;
    private int existencias;

    /**
     * Utilidad: Constructor por ausencia el cual será invocado cada vez que se construya un objeto sin especificar ningún argumento.
     * Entrada: elementos de la clase.
     * Salida: Constructor de invocación.
     * PreCondición: Declarar variables antes del constructor por ausencia.
     * PostCondición: Constructor invocado sin parametros
     */
    public ArticuloDTO() {
    }
    /**
     * Utilidad: Constructor que inicializa los parametros a su valor y al invocar este constructor los parametros estaran inicializados.
     * Entrada: Elementos de la clase Articulo Data Transfer Object.
     * Salida: Elementos inicializados al valor de uss parametros.
     * PreCondición: Declarar los elementos antes del constructor e invocarlos como parametros.
     * PostCondición: Constructor invocado con elementos al valor de sus parametros.
     */
    
    public ArticuloDTO(String claveArticulo, String descripcion, double precio, int existencias) {
        this.claveArticulo = claveArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

     /**
     * Utilidad: Metodo de acceso que obtiene la clave de un articulo.
     * Entrada: Elemento del tipo de objeto String de nombre claveArticulo
     * Salida: Obtención de la clave del articulo.
     * PreCondición: Declarar atributo del tipo de objeto String antes del método de acceso.
     * PostCondición: Obtener clave del articulo.
     */
    
    public String getClaveArticulo() {
        return claveArticulo;
    }

     /**
     * Utilidad: Método de acceso que establece una clave de un articulo.
     * Entrada: Parametro del tipo de objeto String de nombre claveArticulo
     * Salida: Clave del articulo establecida.
     * PreCondición: Declarar atributo del tipo de objeto String antes del método de acceso.
     * PostCondición: Establecer clave del articulo.
     */
    
    public void setClaveArticulo(String claveArticulo) {
        this.claveArticulo = claveArticulo;
    }
    
     /**
     * Utilidad: Metodo de acceso que obtiene la descripción de un articulo.
     * Entrada: Elemento del tipo de objeto String de nombre descripcion.
     * Salida: Obtención de la descripcion del articulo.
     * PreCondición: Declarar atributo del tipo de objeto String antes del método de acceso.
     * PostCondición: Obtener descripción del articulo.
     */
    
    public String getDescripcion() {
        return descripcion;
    }

     /**
     * Utilidad: Método de acceso que establece una descripcion de un articulo.
     * Entrada: Parametro del tipo de objeto String de nombre descripcion
     * Salida: Descripción del articulo establecida.
     * PreCondición: Declarar atributo del tipo de objeto String antes del método de acceso.
     * PostCondición: Establecer descripción del articulo.
     */
      public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Utilidad: Metodo de acceso que obtiene la precio de un articulo.
     * Entrada: Elemento del tipo primitivo doble de nombre precio
     * Salida: Obtención del precio del articulo.
     * PreCondición: Declarar atributo del tipo primitivo doble antes del método de acceso.
     * PostCondición: Obtener precio del articulo.
     */
    
    public double getPrecio() {
        return precio;
    }
    /**
     * Utilidad: Método de acceso que establece un precio de un articulo.
     * Entrada: Parametro del tipo primitivo doble de nombre precio
     * Salida: Precio del articulo establecido.
     * PreCondición: Declarar atributo del tipo primitivo doble antes del método de acceso.
     * PostCondición: Establecer el precio del articulo.
     */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Utilidad: Metodo de acceso que obtiene la existencia de un articulo.
     * Entrada: Elemento del tipo primitivo entero de nombre existencias
     * Salida: Obtención de las existencias del articulo.
     * PreCondición: Declarar atributo del tipo primitivo entero antes del método de acceso.
     * PostCondición: Obtener existencias del articulo.
     */
    
    public int getExistencias() {
        return existencias;
    }
    /**
     * Utilidad: Método de acceso que establece una existencia de un articulo.
     * Entrada: Elemento del tipo primitivo entero de nombre existencias
     * Salida:  Existencia del articulo establecida.
     * PreCondición: Declarar atributo del tipo primitivo entero antes del método de acceso.
     * PostCondición: Establecer existencia del articulo.
     */
    
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    /**
     * Utilidad: Metodo toString que establece los atributos a cadena de textos para mostrarlos en consola.
     * Entrada: Elementos de la clase inicializados.
     * Salida: Elementos de la clase en consola.
     * PreCondición: Declarar variables antes del método.
     * PostCondición: Cadenas de texto con los elementos de la clase.
     */
    
    @Override
    public String toString() {
        return "\nClave Articulo: " + getClaveArticulo() + "\nDescripción Articulo: " + getDescripcion() + 
                "\nPrecio Articulo: " + getPrecio() + "\nExistencias Articulo: " + getExistencias();
    }

}
