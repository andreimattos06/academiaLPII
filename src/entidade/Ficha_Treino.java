
package entidade;


public class Ficha_Treino {
    
    
    private enum TipoTreino {TreinoA, TreinoB, TreinoC};
    
    private Aluno aluno;
    private Instrutor instrutor;
    private String horario;
    private TipoTreino[] dias_semana = new TipoTreino[6];
    private int id;

    public Ficha_Treino(Aluno aluno, Instrutor instrutor, String horario, int id, TipoTreino[] dias_semana) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.horario = horario;
        this.id = id;
        this.dias_semana = dias_semana;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public TipoTreino[] getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(TipoTreino[] dias_semana) {
        this.dias_semana = dias_semana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
