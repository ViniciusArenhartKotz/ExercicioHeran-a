/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexercicioheranca;


 
public class Professor extends Funcionario{
    
   private String disciplina;

   
    public Professor(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String disciplina, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String exibirDetalhes() {
        return "Professor{" + super.exibirDetalhes()+  "disciplina=" + disciplina + '}';
    }

    @Override
    public double calcularBonusSalario() {
       return super.getSalario()*0.1;
    }
   
   
}
