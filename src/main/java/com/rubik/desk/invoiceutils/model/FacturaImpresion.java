/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubik.desk.invoiceutils.model;

import com.rubik.Base.PartidaObjectBase;
import com.rubik.model.Factura;
import java.util.Date;

/**
 *
 * @author GrucasDev
 */
public class FacturaImpresion {
    
    //Comprobante
    String no_certificado;
    String sello;
    String certificado;
    String fecha_emision;
    String lugar_expedicion;
    String tipo_comprobante;
    String forma_pago;
    String numero_cuenta_pago;
    String condificones_pago;
    
    //Emisor
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
    // RegimenFiscal
    String regimen;

    //Receptor
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
    
    // Complemento - TimbreFiscalDigital
    String UUID;
    String fecha_timbrado;
    String sello_CFD;
    String no_certificadoSAT;
    String selloSAT;
    
    //Opcionales
    String serie_factura;
    String numero_factura;
    String moneda;

    String expedido_calle;
    String expedido_numero_exterior;
    String expedido_numero_interior;
    String expedido_codigo_postal;
    String expedido_colonia;
    String expedido_municipio;
    String expedido_estado;
    String expedido_pais;
    
    Integer id;
    Date fecha_elaboracion;
    Date fecha_modificacion;
    Integer empresa_id;
    String empresa;
    Integer unidad_id;
    String unidad;
    Integer usuario_id;
    String usuario;
    String estado_doc;
    String estado;
    String folio;
    String serie;
    String observaciones;
    String tipo_documento;
    String tipo_archivo;
    String razon_cancelar;
    Integer cliente_id;
    String cliente;
    String cliente_rfc;
    String metodo_pago;
    
    Double importe;
    Double descuento;
    Double subtotal;
    Double iva;
    Double total;
    Integer porc_iva;
    
    String importe_letra;
    
    Boolean activo = true;
    Boolean isLogeable = false;
    
    private int documento_id;
    private int no_partida;
    private Date fecha_alta;
    private int cantidad;
    private Integer producto_id;
    private String descripcion;
    private String unidad_medida;
    private Double precio_unitario;
    private Double partida_importe;
    private Double partida_descuento;
    private Double partida_subtotal;
    private Double partida_iva;
    private Double partida_total;
    boolean is_service;

    public FacturaImpresion() {
    }
    
    public FacturaImpresion(Factura f, PartidaObjectBase p) {
        setId(f.getId());
        setFecha_elaboracion(f.getFecha_elaboracion());
        setFecha_modificacion(f.getFecha_modificacion());
        setEmpresa_id(f.getEmpresa_id());
        setEmpresa(f.getEmpresa());
        setUnidad_id(f.getUnidad_id());
        setUnidad(f.getUnidad());
        setUsuario(f.getUsuario());
        setUsuario_id(f.getUsuario_id());
        setEstado_doc(f.getEstado_doc());
        setEstado(f.getEstado());
        setFolio(f.getFolio());
        setSerie(f.getSerie());
        setObservaciones(f.getObservaciones());
        setTipo_documento(f.getTipo_documento());
        setTipo_archivo(f.getTipo_archivo());
        setRazon_cancelar(f.getRazon_cancelar());
        setCliente_id(f.getCliente_id());
        setCliente(f.getCliente());
        setCliente_rfc(f.getCliente_rfc());
        setMetodo_pago(f.getMetodo_pago());
        setImporte(f.getImporte());
        setDescuento(f.getDescuento());
        setSubtotal(f.getSubtotal());
        setIva(f.getIva());
        setTotal(f.getTotal());
        setPorc_iva(f.getPorc_iva());
        setImporte_letra(f.getImporte_letra());
        setActivo(f.getActivo());
        setIsLogeable(f.getIsLogeable());
        
        setNo_certificado(f.getNo_certificado());
        setSello(f.getSello());
        setCertificado(f.getCertificado());
        setFecha_emision(f.getFecha_emision());
        setLugar_expedicion(f.getLugar_expedicion());
        setTipo_comprobante(f.getTipo_comprobante());
        setForma_pago(f.getForma_pago());
        setNumero_cuenta_pago(f.getNumero_cuenta_pago());
        setCondificones_pago(f.getCondificones_pago());
        setEmisor_rfc(f.getEmisor_rfc());
        setEmisor_nombre(f.getEmisor_nombre());
        setEmisor_calle(f.getEmisor_calle());
        setEmisor_numero_exterior(f.getEmisor_numero_exterior());
        setEmisor_numero_interior(f.getEmisor_numero_interior());
        setEmisor_codigo_postal(f.getEmisor_codigo_postal());
        setEmisor_colonia(f.getEmisor_colonia());
        setEmisor_municipio(f.getEmisor_municipio());
        setEmisor_estado(f.getEmisor_estado());
        setEmisor_pais(f.getEmisor_pais());
        setRegimen(f.getRegimen());
        setReceptor_rfc(f.getReceptor_rfc());
        setReceptor_nombre(f.getReceptor_nombre());
        setReceptor_calle(f.getReceptor_calle());
        setReceptor_numero_exterior(f.getReceptor_numero_exterior());
        setReceptor_numero_interior(f.getReceptor_numero_interior());
        setReceptor_codigo_postal(f.getReceptor_codigo_postal());
        setReceptor_colonia(f.getReceptor_colonia());
        setReceptor_municipio(f.getReceptor_municipio());
        setReceptor_pais(f.getReceptor_pais());
        setUUID(f.getUUID());
        setFecha_timbrado(f.getFecha_timbrado());
        setSello_CFD(f.getSello_CFD());
        setNo_certificadoSAT(f.getNo_certificadoSAT());
        setSelloSAT(f.getSelloSAT());
        setSerie_factura(f.getSerie_factura());
        setNumero_factura(f.getNumero_factura());
        setMoneda(f.getMoneda());
        setExpedido_calle(f.getExpedido_calle());
        setExpedido_numero_exterior(f.getExpedido_numero_exterior());
        setExpedido_numero_interior(f.getExpedido_numero_interior());
        setExpedido_codigo_postal(f.getExpedido_codigo_postal());
        setExpedido_colonia(f.getExpedido_colonia());
        setExpedido_municipio(f.getExpedido_municipio());
        setExpedido_estado(f.getExpedido_estado());
        setExpedido_pais(f.getExpedido_pais());
        
        setDocumento_id(p.getDocumento_id());
        setNo_partida(p.getNo_partida());
        setFecha_alta(p.getFecha_alta());
        setCantidad(p.getCantidad());
        setProducto_id(p.getProducto_id());
        setDescripcion(p.getDescripcion());
        setUnidad_medida(p.getUnidad_medida());
        setPrecio_unitario(p.getPrecio_unitario());
        setPartida_importe(p.getImporte());
        setPartida_descuento(p.getDescuento());
        setPartida_subtotal(p.getSubtotal());
        setPartida_iva(p.getIva());
        setPartida_total(p.getTotal());
        setIs_service(p.getIs_service());
    }
    
    public FacturaImpresion(Factura f) {
        
    }    
    
    public int getDocumento_id() {
        return documento_id;
    }

    public void setDocumento_id(int documento_id) {
        this.documento_id = documento_id;
    }

    public int getNo_partida() {
        return no_partida;
    }

    public void setNo_partida(int no_partida) {
        this.no_partida = no_partida;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public boolean isIs_service() {
        return is_service;
    }

    public void setIs_service(boolean is_service) {
        this.is_service = is_service;
    }

    public Double getPartida_importe() {
        return partida_importe;
    }

    public void setPartida_importe(Double partida_importe) {
        this.partida_importe = partida_importe;
    }

    public Double getPartida_descuento() {
        return partida_descuento;
    }

    public void setPartida_descuento(Double partida_descuento) {
        this.partida_descuento = partida_descuento;
    }

    public Double getPartida_subtotal() {
        return partida_subtotal;
    }

    public void setPartida_subtotal(Double partida_subtotal) {
        this.partida_subtotal = partida_subtotal;
    }

    public Double getPartida_iva() {
        return partida_iva;
    }

    public void setPartida_iva(Double partida_iva) {
        this.partida_iva = partida_iva;
    }

    public Double getPartida_total() {
        return partida_total;
    }

    public void setPartida_total(Double partida_total) {
        this.partida_total = partida_total;
    }

    public String getNo_certificado() {
        return no_certificado;
    }

    public void setNo_certificado(String no_certificado) {
        this.no_certificado = no_certificado;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getLugar_expedicion() {
        return lugar_expedicion;
    }

    public void setLugar_expedicion(String lugar_expedicion) {
        this.lugar_expedicion = lugar_expedicion;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getNumero_cuenta_pago() {
        return numero_cuenta_pago;
    }

    public void setNumero_cuenta_pago(String numero_cuenta_pago) {
        this.numero_cuenta_pago = numero_cuenta_pago;
    }

    public String getCondificones_pago() {
        return condificones_pago;
    }

    public void setCondificones_pago(String condificones_pago) {
        this.condificones_pago = condificones_pago;
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

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getFecha_timbrado() {
        return fecha_timbrado;
    }

    public void setFecha_timbrado(String fecha_timbrado) {
        this.fecha_timbrado = fecha_timbrado;
    }

    public String getSello_CFD() {
        return sello_CFD;
    }

    public void setSello_CFD(String sello_CFD) {
        this.sello_CFD = sello_CFD;
    }

    public String getNo_certificadoSAT() {
        return no_certificadoSAT;
    }

    public void setNo_certificadoSAT(String no_certificadoSAT) {
        this.no_certificadoSAT = no_certificadoSAT;
    }

    public String getSelloSAT() {
        return selloSAT;
    }

    public void setSelloSAT(String selloSAT) {
        this.selloSAT = selloSAT;
    }

    public String getSerie_factura() {
        return serie_factura;
    }

    public void setSerie_factura(String serie_factura) {
        this.serie_factura = serie_factura;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getExpedido_calle() {
        return expedido_calle;
    }

    public void setExpedido_calle(String expedido_calle) {
        this.expedido_calle = expedido_calle;
    }

    public String getExpedido_numero_exterior() {
        return expedido_numero_exterior;
    }

    public void setExpedido_numero_exterior(String expedido_numero_exterior) {
        this.expedido_numero_exterior = expedido_numero_exterior;
    }

    public String getExpedido_numero_interior() {
        return expedido_numero_interior;
    }

    public void setExpedido_numero_interior(String expedido_numero_interior) {
        this.expedido_numero_interior = expedido_numero_interior;
    }

    public String getExpedido_codigo_postal() {
        return expedido_codigo_postal;
    }

    public void setExpedido_codigo_postal(String expedido_codigo_postal) {
        this.expedido_codigo_postal = expedido_codigo_postal;
    }

    public String getExpedido_colonia() {
        return expedido_colonia;
    }

    public void setExpedido_colonia(String expedido_colonia) {
        this.expedido_colonia = expedido_colonia;
    }

    public String getExpedido_municipio() {
        return expedido_municipio;
    }

    public void setExpedido_municipio(String expedido_municipio) {
        this.expedido_municipio = expedido_municipio;
    }

    public String getExpedido_estado() {
        return expedido_estado;
    }

    public void setExpedido_estado(String expedido_estado) {
        this.expedido_estado = expedido_estado;
    }

    public String getExpedido_pais() {
        return expedido_pais;
    }

    public void setExpedido_pais(String expedido_pais) {
        this.expedido_pais = expedido_pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getUnidad_id() {
        return unidad_id;
    }

    public void setUnidad_id(Integer unidad_id) {
        this.unidad_id = unidad_id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado_doc() {
        return estado_doc;
    }

    public void setEstado_doc(String estado_doc) {
        this.estado_doc = estado_doc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getTipo_archivo() {
        return tipo_archivo;
    }

    public void setTipo_archivo(String tipo_archivo) {
        this.tipo_archivo = tipo_archivo;
    }

    public String getRazon_cancelar() {
        return razon_cancelar;
    }

    public void setRazon_cancelar(String razon_cancelar) {
        this.razon_cancelar = razon_cancelar;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente_rfc() {
        return cliente_rfc;
    }

    public void setCliente_rfc(String cliente_rfc) {
        this.cliente_rfc = cliente_rfc;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPorc_iva() {
        return porc_iva;
    }

    public void setPorc_iva(Integer porc_iva) {
        this.porc_iva = porc_iva;
    }

    public String getImporte_letra() {
        return importe_letra;
    }

    public void setImporte_letra(String importe_letra) {
        this.importe_letra = importe_letra;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getIsLogeable() {
        return isLogeable;
    }

    public void setIsLogeable(Boolean isLogeable) {
        this.isLogeable = isLogeable;
    }
    
}