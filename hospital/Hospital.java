public class Hospital {
    public static void main(String[] args) {
        Atendimento atendimento = new AtendimentoBase();
        System.out.println(atendimento.descricao());

        atendimento = new ExameDecorator(atendimento);
        System.out.println(atendimento.descricao());

        atendimento = new InternacaoDecorator(atendimento);
        System.out.println(atendimento.descricao());
    }
}
