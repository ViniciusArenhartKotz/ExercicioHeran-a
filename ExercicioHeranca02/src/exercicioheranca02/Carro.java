/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca02;


public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(int numeroDePortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public Carro(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public double calcularVelocidadeMaxima() {
         return 200.0;
    }  
         public String exibirDetalhes() {
        return "Carro{" + super.exibirDetalhes()+ " numeroPortas=" + numeroDePortas + '}';
    }
    
    
}
