/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacija;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rusimovic
 */
public class Odgovor implements Serializable{
    private String greska;
    private Map<String, Object> podaci;
    private int operacija;
   

    public Odgovor() {
        podaci=new HashMap<>();
    }
    

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }
      public Object getData(String key) {
        return podaci.get(key);
    }

   

    public String getGreska() {
        return greska;
    }

    public void setGreska(String greska) {
        this.greska = greska;
    }

    public Map<String, Object> getPodaci() {
        return podaci;
    }

    public void setPodaci(Map<String, Object> podaci) {
        this.podaci = podaci;
    }

    public void putData(String korisnik, Object k) {
        podaci.put(korisnik, k);
        
    }
    
    
}
