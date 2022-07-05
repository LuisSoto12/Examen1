/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Pelicula;
import Entity.Sala;
import Repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luisc
 */
@Service
public class PeliculaService implements IPeliculaService{

    
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Override
    public List<Pelicula> listPelicula() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }

    @Override
    public List<Sala> getAllSala() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
