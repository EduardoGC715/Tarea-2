public class Ficha {
    int posicion=0;
    String color;
    Dado dado =new Dado(6);
    public Ficha(String color){
        this.color = color;
    }
    public void avanzar(){
        int pasos = dado.lanzar();
        posicion += pasos;
        System.out.println("La ficha "+color+" se ha movido a la posicion:"+posicion);
    }
}
