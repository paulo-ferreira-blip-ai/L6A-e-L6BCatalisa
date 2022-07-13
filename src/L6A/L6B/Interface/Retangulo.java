package L6A.L6B.Interface;

public class Retangulo implements FiguraGeometrica {
    @Override
    public void CalculoGeometrico() {
        double base = 10;
        double altura = 30;
        double areaRetang = 0;

        areaRetang = base * altura;
        System.out.println("A área do retangulo é: " + areaRetang);
    }
}
