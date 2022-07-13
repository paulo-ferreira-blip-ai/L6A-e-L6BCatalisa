package L6A;

import java.util.List;

public class Professor extends Funcionario {

    //Atributos professor:
    private String nivelGraduacao;
    private String diciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    private List<String> turmas;

    //Constructor:

    public Professor(String nivelGraduacao, String diciplinaMinistrada, int qtdAlunos, int qtdTurmas, List<String> turmas) {
        this.nivelGraduacao = nivelGraduacao;
        this.diciplinaMinistrada = diciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.turmas = turmas;
    }

    public Professor() {

    }

    @Override
    public void aumentoDeSalario() {

        this.setSalario(this.getSalario() * 0.1);
    }

    public void statusProf() {
        System.out.println();
        System.out.println("-----Professor(a)-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Nº de registro: " + this.getRegistro());
        System.out.println("Orgão de Lotação: " + this.getOrgaoLotacao());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Nível de Graduação: " + this.getNivelGraduacao());
        System.out.println("Diciplina ministrada: " + this.getDiciplinaMinistrada());
        System.out.println("Quatidade de Alunos: " + this.getQtdAlunos());
        System.out.println("Quantidade de Turmas: " + this.getQtdTurmas());
        System.out.println("Aumento de 10% no salario foi: R$" + this.aumentoSalario());
        System.out.println();

    }


    //Get e set:

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDiciplinaMinistrada() {
        return diciplinaMinistrada;
    }

    public void setDiciplinaMinistrada(String diciplinaMinistrada) {
        this.diciplinaMinistrada = diciplinaMinistrada;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Integer getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(Integer qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    //método para adicionar turma:

    public void adicionaTurma(String turmasAno) {
        this.turmas.add(turmasAno);
    }
}





