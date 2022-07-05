/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Sala;
import Service.IPeliculaService;
import Service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author luisc
 */

@Controller
public class SalaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/salas")
    public String index (Model model) {
        List<Sala> listaSala = salaService.getAllSala();
        model.addAttribute("titulo","Tabla Personas");
        model.addAttribute("salas", listaSala);
        return "salas";
    }
    
    @GetMapping("/salasN")
    public String crearSala (@ModelAttribute Sala sala) {
        List<Sala> listaSalas = salaService.listaSala();
        model.addAttribute("Sala",new Sala());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
    @GetMapping("/save")
    public String guardarSala (@ModelAttribute Sala sala) {
        salaService.saveSala(sala);
        return "redirect:/sala";
    }
    
}
