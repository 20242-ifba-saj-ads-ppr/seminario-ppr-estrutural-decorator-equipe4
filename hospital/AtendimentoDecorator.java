public abstract class AtendimentoDecorator implements Atendimento {
    protected Atendimento atendimento;

    public AtendimentoDecorator(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public String descricao() {
        return atendimento.descricao();
    }
}
