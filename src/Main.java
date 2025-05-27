public class Main {
    public static void main(String[] args) {
        InventarioMock inventario = new InventarioMock();

        for (Laptops l : inventario.getListaDeLaptops()) {
            System.out.println("Marca: " + l.getBrand());
            System.out.println("Modelo: " + l.getModel());
            System.out.println("Plano: " + l.getPlan());
            System.out.println("Preço: R$" + l.getPlanPrice());
            System.out.println("-------------------------");
        }
    }
}
