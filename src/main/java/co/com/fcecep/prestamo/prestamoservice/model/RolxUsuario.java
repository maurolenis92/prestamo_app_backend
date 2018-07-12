/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.fcecep.prestamo.prestamoservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "ROLXUSU")
public class RolxUsuario {
    
    @Id
    @Column(name = "ROLXUSU_ID")
    private Long rolxUsuId;
    @Column(name = "USUARIO_ID")
    private Long usuarioId;
    @Column(name = "ROL_ID")
    private Long rolId;

    public Long getRolxUsuId() {
        return rolxUsuId;
    }

    public void setRolxUsuId(Long rolxUsuId) {
        this.rolxUsuId = rolxUsuId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }
    
    
    
}
