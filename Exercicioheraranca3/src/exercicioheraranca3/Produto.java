/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheraranca3;

/**
 *
 * @author Escola
 */
public abstract class Produto {
     private String titulo;
    private double preco;
    
    public abstract double calcularDesconto();

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String exibirDetalhes() {
        return "Produto{" + "titulo=" + titulo + ", preco=" + calcularDesconto()+ '}';
    }
    
}

