import java.util.ArrayList;

import clases.Videojuego;

public class App {
    public static void main(String[] args) throws Exception {
        

        ArrayList<Videojuego> videoJuego = new ArrayList<>();

        Videojuego videojuego1 = new Videojuego(0, "MK1", "Sega", 2, "Lucha");
        Videojuego videojuego2 = new Videojuego(1, "MK2", "Play 1", 2, "Lucha");
        Videojuego videojuego3 = new Videojuego(2, "MK3", "Play 2", 2, "Lucha");
        Videojuego videojuego4 = new Videojuego(3, "MK4", "Nintendo 64", 2, "Lucha");
        Videojuego videojuego5 = new Videojuego(4, "MK5", "Nintendo 64", 2, "Lucha");
        
        videoJuego.add(videojuego1);
        videoJuego.add(videojuego2);
        videoJuego.add(videojuego3);
        videoJuego.add(videojuego4);
        videoJuego.add(videojuego5);

        for (Videojuego videojuego : videoJuego) {
            System.out.println(videojuego.getTitulo() + '-' + videojuego.getConsola() + '-' + videojuego.getCantidadJugadores());
            
        }

        videoJuego.get(2).setTitulo("Mario Bross");
        videoJuego.get(2).setCantidadJugadores(3);

        videoJuego.get(4).setTitulo("Mario Bross 4");
        videoJuego.get(4).setCantidadJugadores(4);
        
        System.out.println("-------------------------");

        for (Videojuego videojuego : videoJuego) {
            System.out.println(videojuego.getTitulo() + '-' + videojuego.getConsola() + '-' + videojuego.getCantidadJugadores());
            
        }

        System.out.println("-------------------------");

        for (Videojuego videojuego : videoJuego) {
            if(videojuego.getConsola().equals("Nintendo 64")){
                System.out.println(videojuego.getTitulo() + '-' + videojuego.getConsola() + '-' + videojuego.getCantidadJugadores());
            }
            
            
        }


    }
}
