package L6A;

import java.util.List;

public class Coordenadores extends Funcionario {

    //atributo do coordenador:
    private List<String> professoresSupervisionados;

    //sobrepondo aumento de salario de 5% para cordenadores:
    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.05);
    }

    //get e set:
    public List<String> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<String> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    //método para adicionar um professor na lista de professores supervisionados pelos coordenadores:
    public void adicionarProfessor(Professor professor) {
        this.professoresSupervisionados = (List<String>) professor;
    }

    public void statusCord() {
        System.out.println();
        System.out.println("-----Coordenador(a)-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Nº de registro: " + this.getRegistro());
        System.out.println("Orgão de Lotação: " + this.getOrgaoLotacao());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Aumento de 5% no salario foi: R$" + this.getSalario());
        System.out.println("Professores supervisionados: " +this.professoresSupervisionados);
        System.out.println();

    }
}
