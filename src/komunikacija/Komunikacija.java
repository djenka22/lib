/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;

/**
 *
 * @author Rusimovic
 */
public class Komunikacija {
    Socket socket;
    ObjectInputStream in;
    ObjectOutputStream out;
    
    public Komunikacija (Socket socket) throws IOException{
        
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        out.reset();
        in = new ObjectInputStream(socket.getInputStream());
       
    }
    
    public Object procitaj() throws IOException, ClassNotFoundException{
      return  in.readObject();
    }
    public void posalji(Object object) throws IOException{
        out.writeObject(object);
    }
    public void prekiniKomunikaciju(){
        try {
            socket.close();
        } catch (IOException ex) {
           
        }
    }
}
