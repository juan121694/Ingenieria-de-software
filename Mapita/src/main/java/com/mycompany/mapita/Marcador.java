package com.mycompany.mapita;
// Generated 5/02/2019 08:35:16 PM by Hibernate Tools 4.3.1



/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {


     private int idmarcador;
     private String descripcion;
     private Double longitud;
     private Double latitud;
     private int idusuario;

    public Marcador() {
    }

	
    public Marcador(int idmarcador, int idusuario) {
        this.idmarcador = idmarcador;
        this.idusuario = idusuario;
    }
    public Marcador(int idmarcador, String descripcion, Double longitud, Double latitud, int idusuario) {
       this.idmarcador = idmarcador;
       this.descripcion = descripcion;
       this.longitud = longitud;
       this.latitud = latitud;
       this.idusuario = idusuario;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
    public Double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }




}

