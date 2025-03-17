public class Caramelo extends DecoradorDeCafe {
    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Caramelo";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 1.5; 
    }
}
