/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Entity.Pelicula;
import Entity.Sala;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author luisc
 */
@Service
public interface IPeliculaService {
    
    public List<Pelicula> listPelicula();
    
    public List<Sala> getAllSala();
    
}
