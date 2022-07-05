/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Entity.Sala;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luisc
 */
public interface ISalaService extends CrudRepository<Sala, Long>{
    
    public List<Sala> getAllSala();
    public Sala getSalabyId (long id);
    public void saveSala(Sala sala);
    public void delete (long id);
}
