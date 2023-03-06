/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.lmp.Repository;


import com.portfolio.lmp.Entity.habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHabilidades extends JpaRepository<habilidades, Integer>{
    
    Optional<habilidades> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
    
}