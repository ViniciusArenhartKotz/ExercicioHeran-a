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
public class Main {

    
    public static void main(String[] args) {
        
      
        Produto produto1 = new Livro("vini", "moliver", 150.44);
        Produto produto2 = new CD("jose", "pedra", 20.67);
        
        
        
        System.out.println(produto1.exibirDetalhes());
        System.out.println(produto2.exibirDetalhes());
        
    }
    
}
