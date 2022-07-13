package L6A;

import java.util.Collections;
import java.util.List;

public abstract class Funcionario {
    //Atributos comuns:
    private String nome;
    private String cpf;
    private int registro;
    private String orgaoLotacao;
    private double salario;

    //Constructo:
    public Funcionario() {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    //método aumento de salário de 10% para professores e funcionarios administrativos:
    public int aumentoSalario() {
        return (int) (salario = this.salario * 0.1);

    }

    //Get e set:
    public List<String> getNome() {
        return Collections.singletonList(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Criando método abstrato para aumento de salario:
    public abstract void aumentoDeSalario();

}
