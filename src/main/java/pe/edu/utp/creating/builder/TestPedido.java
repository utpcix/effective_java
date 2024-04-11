package pe.edu.utp.creating.builder;

public class TestPedido {

    // 2. Consider a builder when objects has many parameters

    public static void main(String[] args) {

        HotWings pedido = new HotWings.Builder(9)
                .withFries()
                .withSoda()
                .name("Juan")
                .build();

        System.out.println("pedido = " + pedido);
    }
}
