public class ExameDecorator extends AtendimentoDecorator {
    public ExameDecorator(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String descricao() {
        return super.descricao() + " + Exame realizado";
    }
}
