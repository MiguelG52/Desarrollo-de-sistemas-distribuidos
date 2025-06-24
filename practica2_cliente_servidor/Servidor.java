package practica2_cliente_servidor;

import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args){
        try{
        ServerSocket s = new ServerSocket(8000);
        s.setReuseAddress(true);
            System.out.println("Servicio iniciado.. esperando cliente..");
        for(;;){
            Socket cl = s.accept();
            System.out.println("Cliente conectado desde->"+cl.getInetAddress()+":"+cl.getPort());
            
            String msj ="Hola mundo desde el servidor..";
            byte[] b = msj.getBytes();
            //PrintWriter pw = new PrintWriter(new OutputStreamWriter(cl.getOutputStream()));
            BufferedOutputStream bos = new BufferedOutputStream(cl.getOutputStream());
            bos.write(b);
            bos.flush();

            bos.close();
            cl.close();
        }//for
    }catch(Exception e){
    e.printStackTrace();
    }//catch
    }
}
