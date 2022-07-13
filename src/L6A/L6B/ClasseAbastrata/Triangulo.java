package L6A.L6B.ClasseAbastrata;

public class Triangulo extends CalcuAreaGeo {
    public Triangulo(){
        super();
    }

    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        tri1.setAltura(30);
        tri1.setBase(10);
        tri1.areaTriang();
        System.out.println("A área do triângulo é: "+ tri1.areaTriang());
    }
}
