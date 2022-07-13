package L6A.L6B.ClasseAbastrata;

public class Quadrado extends CalcuAreaGeo {
    public Quadrado() {
        super();
    }

    public static void main(String[] args) {
        Quadrado quad1 = new Quadrado();
        quad1.setLadosQuad(5);

        quad1.areaQuadrado();
        System.out.println("A área do quadra é: "+quad1.areaQuadrado());
    }
}


