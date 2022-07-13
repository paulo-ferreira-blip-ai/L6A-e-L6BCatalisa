package L6A.L6B.Interface;

public class Triangulo implements FiguraGeometrica {
    @Override
    public void CalculoGeometrico() {
        double base = 40;
        double altura = 80;
        double areaTrian = 0;

        areaTrian = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + areaTrian);
    }
}
