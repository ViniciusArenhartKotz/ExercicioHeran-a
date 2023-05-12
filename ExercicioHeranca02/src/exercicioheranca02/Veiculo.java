/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca02;


public  abstract class Veiculo {
   private String  marca;
   private String modelo;
   private int ano;

   public abstract double calcularVelocidadeMaxima();
   
   
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", velocidade máx="+ calcularVelocidadeMaxima();
    }
   
   
}
