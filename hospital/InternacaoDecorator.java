public class InternacaoDecorator extends AtendimentoDecorator {
    public InternacaoDecorator(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String descricao() {
        return super.descricao() + " + Paciente internado";
    }
}
