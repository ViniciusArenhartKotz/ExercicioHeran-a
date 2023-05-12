/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca02;


public class Moto extends Veiculo {
    private Boolean possuiPartidaEletrica;

    public Moto(Boolean possuiPartidaEletrica, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
    public Moto(Boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public Moto() {
    }

    public Boolean getPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(Boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
    public String exibirDetalhes() {
        return "Moto{" + super.exibirDetalhes()+ " possuiPartidaEletrica=" + possuiPartidaEletrica + '}';
    }
    @Override
    public double calcularVelocidadeMaxima() {
         return 180.0;
    }
    
    
}
