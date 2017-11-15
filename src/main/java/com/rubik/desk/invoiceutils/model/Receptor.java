/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.invoiceutils.model;

import java.io.Serializable;

/**
 *
 * @author GrucasDev
 */
public class Receptor implements Serializable{
    
    String receptor_rfc;
    String receptor_nombre;
    String receptor_calle;
    String receptor_numero_exterior;
    String receptor_numero_interior;
    String receptor_codigo_postal;
    String receptor_colonia;
    String receptor_municipio;
    String receptor_estado;
    String receptor_pais;

    public Receptor() {
    }

    public String getReceptor_rfc() {
        return receptor_rfc;
    }

    public void setReceptor_rfc(String receptor_rfc) {
        this.receptor_rfc = receptor_rfc;
    }

    public String getReceptor_nombre() {
        return receptor_nombre;
    }

    public void setReceptor_nombre(String receptor_nombre) {
        this.receptor_nombre = receptor_nombre;
    }

    public String getReceptor_calle() {
        return receptor_calle;
    }

    public void setReceptor_calle(String receptor_calle) {
        this.receptor_calle = receptor_calle;
    }

    public String getReceptor_numero_exterior() {
        return receptor_numero_exterior;
    }

    public void setReceptor_numero_exterior(String receptor_numero_exterior) {
        this.receptor_numero_exterior = receptor_numero_exterior;
    }

    public String getReceptor_numero_interior() {
        return receptor_numero_interior;
    }

    public void setReceptor_numero_interior(String receptor_numero_interior) {
        this.receptor_numero_interior = receptor_numero_interior;
    }

    public String getReceptor_codigo_postal() {
        return receptor_codigo_postal;
    }

    public void setReceptor_codigo_postal(String receptor_codigo_postal) {
        this.receptor_codigo_postal = receptor_codigo_postal;
    }

    public String getReceptor_colonia() {
        return receptor_colonia;
    }

    public void setReceptor_colonia(String receptor_colonia) {
        this.receptor_colonia = receptor_colonia;
    }

    public String getReceptor_municipio() {
        return receptor_municipio;
    }

    public void setReceptor_municipio(String receptor_municipio) {
        this.receptor_municipio = receptor_municipio;
    }

    public String getReceptor_estado() {
        return receptor_estado;
    }

    public void setReceptor_estado(String receptor_estado) {
        this.receptor_estado = receptor_estado;
    }

    public String getReceptor_pais() {
        return receptor_pais;
    }

    public void setReceptor_pais(String receptor_pais) {
        this.receptor_pais = receptor_pais;
    }
    
}