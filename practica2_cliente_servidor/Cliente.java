package practica2_cliente_servidor;

import java.io.BufferedInputStream;
import java.net.*;

public class Cliente {
    public static void main(String[] args){
      try{

          Socket cl = new Socket("localhost",8000);
          System.out.println("Conexion con servidor establecida.. recibiendo datos");

          BufferedInputStream bis = new BufferedInputStream(cl.getInputStream());
          byte[] b= new byte[1024];
          int n= bis.read(b);
          String datos = new String(b,0,n);
          
          System.out.println("\nMensaje recibido: "+datos);

          bis.close();
          cl.close();
      }catch(Exception e){
          e.printStackTrace();
      }
  }//main    
}
