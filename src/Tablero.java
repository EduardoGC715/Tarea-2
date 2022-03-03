import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {
    int casillas=40;
    int jugadores;
    ArrayList <Ficha> fichas =new ArrayList<Ficha>();
    public Tablero(int jugadores){
        this.jugadores=jugadores;
    }
    public void colorjugadores(){
        int cont=1;
        while (cont<=jugadores){
            Scanner colorScanner = new Scanner(System.in);
            System.out.println("Digite el color de la ficha "+cont);
            String color = colorScanner.nextLine();
            Ficha ficha = new Ficha(color);
            fichas.add(ficha);
            cont++;
        }

    }
    public void ciclojuego(){
        boolean jugar = true;
        while (jugar == true){
            for (Ficha ficha : fichas){
                ficha.avanzar();
                if (ficha.posicion>=casillas){
                    System.out.println("Gano la ficha: "+ficha.color);
                    jugar=false;
                    break;
                }
            }
        }
    }
}
