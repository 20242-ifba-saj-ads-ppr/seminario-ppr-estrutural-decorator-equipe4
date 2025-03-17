
class Leite extends DecoradorDeCafe {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Leite";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.0;
    }
}
