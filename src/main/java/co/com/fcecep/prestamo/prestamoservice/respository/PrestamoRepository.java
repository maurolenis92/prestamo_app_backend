/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.fcecep.prestamo.prestamoservice.respository;

import co.com.fcecep.prestamo.prestamoservice.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mauro
 */
public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{
    
    Prestamo findByPrestamoId(Long prestamoId);
    
}
