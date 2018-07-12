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
@Entity
@Table(name = "PRESTAMO")
public class Prestamo {

    @Id
    @Column(name = "PRESTAMO_ID")
    private Long prestamoId;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_HORA")
    private Date fechaHora;
    @Column(name = "USU_PREST_ID")
    private String userPrestId;
    @Column(name = "ESCENARIO_ID")
    private String escenarioId;
    @Column(name = "ESTADO_PREST")
    private String estadoPrestamo;
    @Column(name = "USU_ENTRE_ID")
    private String userEntreId;
    @Column(name = "HORA_INICIO")
    private String horaInicio;
    @Column(name = "HORA_FIN")
    private String horaFin;

    public Long getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(Long prestamoId) {
        this.prestamoId = prestamoId;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUserPrestId() {
        return userPrestId;
    }

    public void setUserPrestId(String userPrestId) {
        this.userPrestId = userPrestId;
    }

    public String getEscenarioId() {
        return escenarioId;
    }

    public void setEscenarioId(String escenarioId) {
        this.escenarioId = escenarioId;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public String getUserEntreId() {
        return userEntreId;
    }

    public void setUserEntreId(String userEntreId) {
        this.userEntreId = userEntreId;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
    
    
    
    
    
}
