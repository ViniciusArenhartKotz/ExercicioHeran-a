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
public class Administrativo extends Funcionario {
    private String setor;

    public Administrativo(String setor, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    
    public Administrativo(String setor) {
        this.setor = setor;
    }

    public Administrativo() {
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
 @Override
    public String exibirDetalhes() {
        return "Administrativo{" +  super.exibirDetalhes()+ "setor=" + setor + '}';
    }
    @Override
    public double calcularBonusSalario() {
       return super.getSalario()*0.05;
    }
    
}
