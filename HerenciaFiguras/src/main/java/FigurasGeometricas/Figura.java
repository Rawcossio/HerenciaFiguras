package FigurasGeometricas;

public class Figura {
    //Atributos
    private int numlados;

    //Metodos

    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetrro(){
        return 0;
    }

    @Override
    public String toString() {
        return "La Figura"+ numlados + "lados";
    }//toString me trae el nombre de la clase y los valores de los atributos

    public Figura(int numlados) {
        this.numlados = numlados;
    }

    public int getNumlados() {
        return numlados;
    }

    public void setNumlados(int numlados) {
        this.numlados = numlados;
    }
}
