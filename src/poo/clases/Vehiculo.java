package poo.clases;

public class Vehiculo {
    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected int year;
    protected double cc;
    protected boolean sport;
    protected int speed;

    // 2. constructores

    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }

    // 3. métodos

    public void acelerar(int quantity){
        this.speed += quantity;
    }
}
