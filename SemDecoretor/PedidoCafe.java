public class PedidoCafe {
    private Cafe cafe;
    private boolean comLeite;
    private boolean comChantilly;
    private boolean comCaramelo;

    public PedidoCafe(Cafe cafe, boolean comLeite, boolean comChantilly, boolean comCaramelo) {
        this.cafe = cafe;
        this.comLeite = comLeite;
        this.comChantilly = comChantilly;
        this.comCaramelo = comCaramelo;
    }

    public String getDescricao() {
        String descricao = cafe.getDescricao();
        if (comLeite) descricao += ", com Leite";
        if (comChantilly) descricao += ", com Chantilly";
        if (comCaramelo) descricao += ", com Caramelo";
        return descricao;
    }

    public double getPreco() {
        double preco = cafe.getPreco();
        if (comLeite) preco += 2.0;
        if (comChantilly) preco += 3.0;
        if (comCaramelo) preco += 1.5;
        return preco;
    }
} 

