package L6A.L6B.ClasseAbastrata;

public abstract class CalcuAreaGeo {
    private double ladosQuad;
    private double base;
    private double altura;
    private double pi;
    private int raioCirc;


    //Constructor:


    public CalcuAreaGeo() {
        this.pi = 3.14;

    }


    //métodos:
    public double areaQuadrado(){
        return this.ladosQuad * this.ladosQuad;
    }

    public double areaRetang(){
        return this.base * this.altura;
    }

    public double areaTriang(){
        return (this.base * this.altura) / 2;
    }

    public double areaCirc(){
        return this.pi * (this.raioCirc * this.raioCirc);
    }

    //get e set:

    public double getLadosQuad() {
        return ladosQuad;
    }

    public void setLadosQuad(double ladosQuad) {
        this.ladosQuad = ladosQuad;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRaioCirc() {
        return raioCirc;
    }

    public void setRaioCirc(int raioCirc) {
        this.raioCirc = raioCirc;
    }
}
