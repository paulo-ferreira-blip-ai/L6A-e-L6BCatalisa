package L6A.L6B.ClasseAbastrata;

public class Retangulo extends CalcuAreaGeo {
    public Retangulo(){
        super();
    }
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo();
        ret1.setAltura(7);
        ret1.setBase(10);
        ret1.areaRetang();
        System.out.println("A área do retângulo é: " + ret1.areaRetang());

    }

}
