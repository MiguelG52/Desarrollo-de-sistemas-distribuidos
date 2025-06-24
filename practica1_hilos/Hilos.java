package practica1_hilos;

public class Hilos {
    
    public void ejecutaHiloConcurrente() {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        
        h1.start();
        h2.start();
        
        try {
            h1.join(); 
            h2.join(); 
            System.err.println("Hilos ejecutados concurrentemente");
        } catch (InterruptedException e) {
            System.out.println("Error en la ejecución de los hilos");
        }
    }
    public void ejecutaHiloSecuencial(){
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        
        h2.start(); 
        try {
            h2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Error en la ejecución de Hilo1");
        }

        h1.start(); 
        try {
            h1.join();
        } catch (InterruptedException e) {
            System.out.println("Error en la ejecución de Hilo2");
        }
        System.err.println("Hilos ejecutados secuencialmente");
    }
    public static void main(String[] args) {
        Hilos h = new Hilos();
        h.ejecutaHiloConcurrente();
        System.err.println("\n");
        h.ejecutaHiloSecuencial();
    }
}

class Hilo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo 1: " + i);
        }
        System.out.println("Hilo 1 terminado");
    }
}

class Hilo2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo 2: " + i);
        }
        System.out.println("Hilo 2 terminado");
    } 
}
