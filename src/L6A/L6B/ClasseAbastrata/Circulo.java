package L6A.L6B.ClasseAbastrata;

public class Circulo extends CalcuAreaGeo {
    public Circulo(){
        super();
    }

    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        cir1.setRaioCirc(300);
        cir1.areaCirc();
        System.out.println("A área do ciruclo é: "+cir1.areaCirc());
    }

}
