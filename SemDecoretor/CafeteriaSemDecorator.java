public class CafeteriaSemDecorator  {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Expresso", 7.0);
        PedidoCafe pedido1 = new PedidoCafe(cafe1, false, false, false);
        System.out.println("Pedido 1: " + pedido1.getDescricao() + " | Preço: R$" + pedido1.getPreco());

        Cafe cafe2 = new Cafe("Cappuccino", 12.00);
        PedidoCafe pedido2 = new PedidoCafe(cafe2, true, true, false);
        System.out.println("Pedido 2: " + pedido2.getDescricao() + " | Preço: R$" + pedido2.getPreco());

        Cafe cafe3 = new Cafe("Expresso", 7.0);
        PedidoCafe pedido3 = new PedidoCafe(cafe3, true, true, true);
        System.out.println("Pedido 3: " + pedido3.getDescricao() + " | Preço: R$" + pedido3.getPreco());
    }
}
