
package ejerciciointegrador_videjojuegos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioIntegrador_VidejoJuegos {

    public static void main(String[] args) {
        
        List<VideoJuego> juegos = new ArrayList<>();
        
        juegos.add(new VideoJuego(1, "Contra", "NES", 2, "Guerra"));
        juegos.add(new VideoJuego(2, "The Legend of Zelda: Tears of the Kingdom", "Nintendo Switch", 1, "Aventura / Mundo Abierto"));
        juegos.add(new VideoJuego(3, "Elden Ring", "PS5", 4, "RPG de Acción"));
        juegos.add(new VideoJuego(4, "Mortal Kombat", "Xbox Series X/S", 2, "Lucha"));
        juegos.add(new VideoJuego(5, "Gran Turismo 7", "PS5", 2, "Carreras / Simulación"));
        
        
        System.out.println("-----------5 VIDEOJUEGOS----------");
        System.out.println(" ");
        
        for (VideoJuego j : juegos) {
            System.out.println("Titulo: " + j.getTitulo() + ", Consola: "
                    + j.getConsola() + ", Cantidad de Jugadores: " + j.getCantidadJugadores());
        }
        
        System.out.println(" ");
        System.out.println("-----------2 Titulos Cambiados----------");
        System.out.println(" ");
        
        juegos.get(0).setTitulo("Super Mario 64");
        juegos.get(0).setConsola("Nintendo 64");
        juegos.get(0).setCantidadJugadores(4);
        
        juegos.get(4).setTitulo("The Legend of Zelda: Ocarina of Time");
        juegos.get(4).setConsola("Nintendo 64");
        juegos.get(4).setCantidadJugadores(1);
        
        for (VideoJuego ju : juegos) {
            if (ju.getConsola().equals("Nintendo 64")) {
                System.out.println(ju.toString());
            }
        }
        System.out.println(" ");
        
    }
    
}
