package FigurasGeometricas;

public class Rectangulo extends Figura{

    //Atributos
    private int lado1,lado2;

    public Rectangulo(int numlados, int lado1, int lado2) {
        super(numlados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @Override
    public double calcularPerimetrro() {
        return 2*(lado1+lado2);
    }

    @Override
    public String toString() {
        return "El Rectangulo tiene" +super.getNumlados()+
                "lado1=" + lado1 +
                ", lado2=" + lado2 ;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
}
