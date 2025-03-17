abstract class DecoradorDeCafe implements Cafe {
    protected Cafe cafe;

    public DecoradorDeCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public double getPreco() {
        return cafe.getPreco();
    }
}

