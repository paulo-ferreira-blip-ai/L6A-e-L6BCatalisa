package L6A.L6B.Interface;

public class MainFiguras {
    public static void main(String[] args) {
        Quadrado quad1 = new Quadrado();
        quad1.CalculoGeometrico();

        Retangulo ret1 = new Retangulo();
        ret1.CalculoGeometrico();

        Triangulo trig1 = new Triangulo();
        trig1.CalculoGeometrico();

        Circulo cir1 = new Circulo();
        cir1.CalculoGeometrico();
    }
}
