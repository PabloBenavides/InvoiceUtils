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
public class Emisor implements Serializable{
    
    String emisor_rfc;
    String emisor_nombre;
    String emisor_calle;
    String emisor_numero_exterior;
    String emisor_numero_interior;
    String emisor_codigo_postal;
    String emisor_colonia;
    String emisor_municipio;
    String emisor_estado;
    String emisor_pais;
    String regimen;

    public Emisor() {
    }

    public String getEmisor_rfc() {
        return emisor_rfc;
    }

    public void setEmisor_rfc(String emisor_rfc) {
        this.emisor_rfc = emisor_rfc;
    }

    public String getEmisor_nombre() {
        return emisor_nombre;
    }

    public void setEmisor_nombre(String emisor_nombre) {
        this.emisor_nombre = emisor_nombre;
    }

    public String getEmisor_calle() {
        return emisor_calle;
    }

    public void setEmisor_calle(String emisor_calle) {
        this.emisor_calle = emisor_calle;
    }

    public String getEmisor_numero_exterior() {
        return emisor_numero_exterior;
    }

    public void setEmisor_numero_exterior(String emisor_numero_exterior) {
        this.emisor_numero_exterior = emisor_numero_exterior;
    }

    public String getEmisor_numero_interior() {
        return emisor_numero_interior;
    }

    public void setEmisor_numero_interior(String emisor_numero_interior) {
        this.emisor_numero_interior = emisor_numero_interior;
    }

    public String getEmisor_codigo_postal() {
        return emisor_codigo_postal;
    }

    public void setEmisor_codigo_postal(String emisor_codigo_postal) {
        this.emisor_codigo_postal = emisor_codigo_postal;
    }

    public String getEmisor_colonia() {
        return emisor_colonia;
    }

    public void setEmisor_colonia(String emisor_colonia) {
        this.emisor_colonia = emisor_colonia;
    }

    public String getEmisor_municipio() {
        return emisor_municipio;
    }

    public void setEmisor_municipio(String emisor_municipio) {
        this.emisor_municipio = emisor_municipio;
    }

    public String getEmisor_estado() {
        return emisor_estado;
    }

    public void setEmisor_estado(String emisor_estado) {
        this.emisor_estado = emisor_estado;
    }

    public String getEmisor_pais() {
        return emisor_pais;
    }

    public void setEmisor_pais(String emisor_pais) {
        this.emisor_pais = emisor_pais;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }
    
}