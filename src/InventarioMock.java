import java.util.ArrayList;
import java.util.List;

public class InventarioMock {
    private List<Laptops> listaDeLaptops;

    public InventarioMock() {
        listaDeLaptops = new ArrayList<>();
        carregarDadosMock();
    }

    private void carregarDadosMock() {
        Laptops laptop1 = new Laptops();
        laptop1.setBrand("Dell");
        laptop1.setModel("XPS 13");
        laptop1.setPlan("Premium");
        laptop1.setPlanPrice(199.99);

        Laptops laptop2 = new Laptops();
        laptop2.setBrand("Lenovo");
        laptop2.setModel("ThinkPad X1");
        laptop2.setPlan("Business");
        laptop2.setPlanPrice(149.99);

        listaDeLaptops.add(laptop1);
        listaDeLaptops.add(laptop2);
    }

    public List<Laptops> getListaDeLaptops() {
        return listaDeLaptops;
    }
}
