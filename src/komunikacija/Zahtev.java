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
public class Zahtev implements Serializable{
    int operacija;
    Map<String, Object> podaci;

    public Zahtev() {
        podaci = new HashMap<>();
    }

    
    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

   public Map<String, Object> getPodaci() {
        return podaci;
    }

    public void setPodaci(Map<String, Object> podaci) {
        this.podaci = podaci;
    }
      public Object getData(String key) {
        return podaci.get(key);
    }

    public void putData(String key, Object obj) {
       podaci.put(key, obj);
    }
    
    
}
