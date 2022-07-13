package L6A;

public class FuncAdministrativo extends Funcionario {
    private String funcaoAdmin;
    private String sionioridade;

    public FuncAdministrativo() {
        super();
    }

    public String getFuncaoAdmin() {

        return funcaoAdmin;
    }

    public void setFuncaoAdmin(String funcaoAdmin) {

        this.funcaoAdmin = funcaoAdmin;
    }

    public String getSionioridade() {
        return sionioridade;
    }

    public void setSionioridade(String sionioridade) {

        this.sionioridade = sionioridade;
    }

    //métodos status para mostrar dados:
    public void statusFunc() {
        System.out.println();
        System.out.println("-----Funcionario(a) Administrativo(a)-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Nº de registro: " + this.getRegistro());
        System.out.println("Orgão de Lotação: " + this.getOrgaoLotacao());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("Aumento de 10% no salario foi: R$ " + this.getSalario());
        System.out.println("Função Administrativa: " + this.getFuncaoAdmin());
        System.out.println("Senioridade: " + this.getSionioridade());
        System.out.println();
    }

    //método para aumento de salario:
    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.1);
    }
}
