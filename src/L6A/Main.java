package L6A;


public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.setNome("Ricardo Silva Pereira");
        p1.setCpf("094.530.403-64");
        p1.setRegistro(1030);
        p1.setOrgaoLotacao("SEDUC");
        p1.setSalario(27140);
        p1.setNivelGraduacao("Superior");
        p1.setDiciplinaMinistrada("Matemática");
        p1.setQtdAlunos(70);
        p1.setQtdTurmas(2);
        p1.aumentoDeSalario();
        p1.statusProf();


        Professor p2 = new Professor();
        p2.setNome("Marcos Santos Sousa");
        p2.setCpf("034.554.234-12");
        p2.setRegistro(1031);
        p2.setOrgaoLotacao("SEDUC");
        p2.setSalario(17950);
        p2.setNivelGraduacao("Superior");
        p2.setDiciplinaMinistrada("Português");
        p2.setQtdAlunos(70);
        p2.setQtdTurmas(2);
        p2.aumentoDeSalario();
        p2.statusProf();


        Coordenadores c1 = new Coordenadores();
        c1.setNome("João Carlos Silva");
        c1.setCpf("336.453.954-55");
        c1.setRegistro(2020);
        c1.setOrgaoLotacao("SEDUC");
        c1.setSalario(3200);
        c1.aumentoDeSalario();
        c1.setProfessoresSupervisionados(p1.getNome());
        c1.statusCord();

        FuncAdministrativo f1 = new FuncAdministrativo();
        //f1.setNome();
        //f1.setCpf();
        //f1.setRegistro();
        //f1.setOrgaoLotacao();
        //f1.setSalario();
        //f1.setFuncaoAdmin();
        //f1.setSionioridade();
        f1.statusFunc();
    }
}



