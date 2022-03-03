import java.util.Random;
public class Dado {
    int caras;
    public Dado(int numcaras){
        caras = numcaras;
    }
    public int lanzar(){
        int min = 1;
        int max = caras;
        Random rand = new Random();
        int int_random = rand.nextInt(max + min) + min; 
        return int_random;
    }
}
