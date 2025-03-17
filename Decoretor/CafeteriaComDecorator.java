public class CafeteriaComDecorator {
      public static void main(String[] args) {
        Cafe cafe1 = new Expresso();
        System.out.println("Pedido 1: " + cafe1.getDescricao() + " | Preço: R$" + cafe1.getPreco());

        Cafe cafe2 = new Cappuccino();
        cafe2 = new Leite(cafe2);
        cafe2 = new Chantilly(cafe2);
        System.out.println("Pedido 2: " + cafe2.getDescricao() + " | Preço: R$" + cafe2.getPreco());

        Cafe cafe3 = new Expresso();
        cafe3 = new Leite(cafe3);
        cafe3 = new Chantilly(cafe3);
        cafe3 = new Caramelo(cafe3);
        System.out.println("Pedido 3: " + cafe3.getDescricao() + " | Preço: R$" + cafe3.getPreco());
    }
}

