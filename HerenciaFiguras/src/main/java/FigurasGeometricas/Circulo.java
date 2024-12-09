package FigurasGeometricas;

public class Circulo extends Figura{
    //Atributos
    int radio;
    final double pi=3.1416;

    //Metodos

    public Circulo(int numlados, int radio) {
        super(numlados);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi*(radio*radio);
    }

    @Override
    public double calcularPerimetrro() {

        return 2*pi*radio;
    }

    @Override
    public String toString() {
        return "El Circulo tiene" +
                " un radio=" + radio ;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }
}
