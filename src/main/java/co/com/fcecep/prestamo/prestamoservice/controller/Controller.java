/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.fcecep.prestamo.prestamoservice.controller;

import co.com.fcecep.prestamo.prestamoservice.model.Equipo;
import co.com.fcecep.prestamo.prestamoservice.model.Prestamo;
import co.com.fcecep.prestamo.prestamoservice.model.Rol;
import co.com.fcecep.prestamo.prestamoservice.model.Usuario;
import co.com.fcecep.prestamo.prestamoservice.respository.EquipoRepository;
import co.com.fcecep.prestamo.prestamoservice.respository.PrestamoRepository;
import co.com.fcecep.prestamo.prestamoservice.respository.RolRepository;
import co.com.fcecep.prestamo.prestamoservice.respository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauro
 */
@Service
@RestController
@RequestMapping("/gestion-prestamo")
public class Controller {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
    @Autowired
    private EquipoRepository equipoRepository;
    
    @Autowired
    private PrestamoRepository prestamoRepository;
    
    @Autowired
    private RolRepository rolRepository;
    
    @GetMapping("/consultarUsuarios")
    private List<Usuario> getUsuarios(){
        List<Usuario> listaRespuesta = null;
        
        try {
            listaRespuesta = usuarioRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaRespuesta;
    }
    
    @GetMapping("/consultarUsuario")
    private Usuario getUsuario(@RequestParam("id") String id){
        Usuario respuesta = null;
        try {
            respuesta = usuarioRepository.findByUsuarioId(Long.parseLong(id));
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    @PostMapping("/saveUsuario")
    private void saveUsuario(@RequestBody Usuario usuario){
        
        try {
            usuarioRepository.save(usuario);
        } catch (Exception e) {
        }
        
    }
    
    @GetMapping("/consultarEquipos")
    private List<Equipo> getEquipos(){
        
        List<Equipo> listaRespuesta = null;
        
        try {
            listaRespuesta = equipoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaRespuesta;
    }
    
    @GetMapping("/consultarEquipo")
    private Equipo getEquipo(@RequestParam("id")String id){
        Equipo respuesta = null;
        
        try {
            respuesta = equipoRepository.findByEquipoId(Long.parseLong(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return respuesta;
    }
    
    @CrossOrigin
    @PostMapping("/saveEquipo")
    private void saveEquipo(@RequestBody Equipo equipo){
    
        try {
            equipoRepository.save(equipo);
        } catch (Exception e) {
        }
    }
    
    @GetMapping("/consultarPrestamos")
    private List<Prestamo> getPrestamos(){
        List<Prestamo> listaRespuesta = null;
        
        try {
            listaRespuesta = prestamoRepository.findAll();
            
        } catch (Exception e) {
        }
        
        return listaRespuesta;
    }
    
    @PostMapping("/savePrestamo")
    private void savePrestamo(@RequestBody Prestamo prestamo){
        try {
            prestamoRepository.save(prestamo);
        } catch (Exception e) {
        }
    }
    
    @GetMapping("/consultarPrestamo")
    private Prestamo getPrestamo(@RequestParam("id")String id){
        Prestamo respuesta = null;
        try {
            respuesta = prestamoRepository.findByPrestamoId(Long.parseLong(id));
        } catch (Exception e) {
        }
        
        return respuesta;
    }
    
    @CrossOrigin
    @GetMapping("/login")
    private Usuario login(@RequestParam("id")String id, @RequestParam("clave")String clave){
        Usuario respuesta = null;
        
        try {
            respuesta = usuarioRepository.findByUsuarioIdAndClave(Long.parseLong(id), clave);
        } catch (Exception e) {
        }
        
        return respuesta;
    }
    
    @CrossOrigin
    @GetMapping("/rol-usuario")
    private List<Rol> getRolxUsuario(@RequestParam("id")String id){
        List<Rol> listaRespuesta = null;
        
        try {
            listaRespuesta = rolRepository.getRolxUsu(Long.parseLong(id));
        } catch (Exception e) {
        }
        
        return listaRespuesta;
    }
}
