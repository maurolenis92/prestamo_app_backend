/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.fcecep.prestamo.prestamoservice.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mauro
 */
@Table(name = "EQUIPO")
@Entity
public class Equipo {
    
    @Id
    @Column(name = "EQUIPO_ID")
    private Long equipoId;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Column(name = "TIPO_EQUIPO_ID")
    private Long tipoEquipoId;
    @Column(name = "SERIAL")
    private String serial;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_REG")
    private Date fechaReg;
    @Column(name = "FOTO")
    private String foto;

    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getTipoEquipoId() {
        return tipoEquipoId;
    }

    public void setTipoEquipoId(Long tipoEquipoId) {
        this.tipoEquipoId = tipoEquipoId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
}
