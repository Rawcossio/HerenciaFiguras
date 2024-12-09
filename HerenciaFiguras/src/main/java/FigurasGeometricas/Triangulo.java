package FigurasGeometricas;

public class Triangulo extends Figura{

    //Atributos
    private int base, altura;
    //Metodos


    public Triangulo(int numlados, int base, int altura) {
        super(numlados);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetrro() {
        return base*getNumlados();
    }

    @Override
    public String toString() {
        return "EL Triangulo tiene " +super.getNumlados()+
                "base=" + base +
                ", altura=" + altura ;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
