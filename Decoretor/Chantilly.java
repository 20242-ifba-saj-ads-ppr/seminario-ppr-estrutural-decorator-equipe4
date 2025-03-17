public class Chantilly extends DecoradorDeCafe {
    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Chantilly";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 3.0; 
    }
}
