public class Main {
    public static void main(String[] args) {
        InventarioMock inventario = new InventarioMock();
        inventario.carregarInventario(); // Preenche a lista de laptops

        for (Laptops l : inventario.getListaDeLaptops()) {
            System.out.println("Marca: " + l.getBrand());
            System.out.println("Modelo: " + l.getModel());
            System.out.println("Plano: " + l.getPlan().getServicePlan());
            System.out.println("Tipo do plano: " + l.getPlan().getServiceTypePlan());
            System.out.println("Descrição do plano: " + l.getPlan().getServicePlanDesc());
            System.out.println("Preço: $" + l.getPlanPrice());
            System.out.println("-------------------------");
        }
    }
}
