package L6A.L6B.Interface;

public class Circulo implements FiguraGeometrica {
    @Override
    public void CalculoGeometrico() {
        double pi = 3.14;
        double raioCirculo = 300;
        double areaCirculo = 0;

        areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.println("A área do circulo é : " + areaCirculo);

    }
}
