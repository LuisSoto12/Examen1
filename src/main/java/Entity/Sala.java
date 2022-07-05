/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author luisc
 */

@Entity
@Table(name="Salas")
public class Sala {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private int Maximo_personas;
    private int Numero_sala;
    private String Pelicula_sala;
    
    @ManyToOne
    @JoinColumn (name= "Pelicula_de_sala_id")
    private Pelicula pelicula;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaximo_personas() {
        return Maximo_personas;
    }

    public void setMaximo_personas(int Maximo_personas) {
        this.Maximo_personas = Maximo_personas;
    }

    public int getNumero_sala() {
        return Numero_sala;
    }

    public void setNumero_sala(int Numero_sala) {
        this.Numero_sala = Numero_sala;
    }

    public String getPelicula_sala() {
        return Pelicula_sala;
    }

    public void setPelicula_sala(String Pelicula_sala) {
        this.Pelicula_sala = Pelicula_sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
}
