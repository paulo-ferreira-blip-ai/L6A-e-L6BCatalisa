package L6A.L6B.Interface;

public class Quadrado implements FiguraGeometrica {
    @Override
    public void CalculoGeometrico() {

        double ladoQuad = 10;
        double areaQuad = 0;

        areaQuad = ladoQuad * ladoQuad;
        System.out.println("A área do quadrado é:" + areaQuad);


    }

}
