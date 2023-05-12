/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexercicioheranca;

/**
 *
 * @author Escola
 */
public class Main {

 

    public static void main(String[] args) {
        Funcionario funcionario1 = new Professor("Programação","João",50,100);
         Funcionario funcionario2= new Administrativo ("Programação","Vagner",65,100);
         
         
         System.out.println(funcionario1.exibirDetalhes());
         System.out.println(funcionario2.exibirDetalhes());
    }
    
}
