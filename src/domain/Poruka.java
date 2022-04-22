/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Rusimovic
 */
public class Poruka implements Serializable{
    String poruka;
    Korisnik odKorisnika;
    Korisnik kaKorisniku;
    private LocalDateTime vreme;

    public LocalDateTime getVreme() {
        return vreme;
    }

    public void setVreme(LocalDateTime vreme) {
        this.vreme = vreme;
    }

    public Korisnik getKaKorisniku() {
        return kaKorisniku;
    }
    
    
    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Korisnik getOdKorisnika() {
        return odKorisnika;
    }

    public void setOdKorisnika(Korisnik odKorisnika) {
        this.odKorisnika = odKorisnika;
    }
    public void setKaKorisniku(Korisnik kaKorisniku) {
        this.kaKorisniku = kaKorisniku;
    }
    
    
}
