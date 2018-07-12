/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.fcecep.prestamo.prestamoservice.respository;

import co.com.fcecep.prestamo.prestamoservice.model.Rol;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author mauro
 */
public interface RolRepository extends JpaRepository<Rol, Long>{
    
    @Query("SELECT r FROM Rol r INNER JOIN RolxUsuario  x on x.rolId = r.rolId where x.usuarioId = :usuarioId")
    List<Rol> getRolxUsu(Long usuarioId);
}
