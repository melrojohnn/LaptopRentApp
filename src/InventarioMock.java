import java.util.ArrayList;
import java.util.List;

public class InventarioMock {
    private final List<Laptops> listaDeLaptops = new ArrayList<>();

    public List<Laptops> carregarInventario() {
        // Criando um objeto do tipo CPU
        CPU cpu = new CPU();
        cpu.setBrand("Intel");
        cpu.setModel("i7-12700H");

        // Criando um objeto do tipo GPU
        GPU gpu = new GPU();
        gpu.setBrand("NVIDIA");
        gpu.setModel("RTX 3060");

        // Criando o plano
        Plan plano = new Plan();
        plano.setServicePlan("Premium");
        plano.setServiceTypePlan("Mensal");
        plano.setServicePlanDesc("Plano premium com suporte 24h");

        // Criando o objeto Laptop e conectando tudo
        Laptops laptop = new Laptops();
        laptop.setBrand("Dell");
        laptop.setModel("G15");
        laptop.setMemory("16GB");
        laptop.setHd("1TB SSD");
        laptop.setCode("DLG15-001");
        laptop.setCpu(cpu);
        laptop.setGpu(gpu);
        laptop.setPlan(plano);
        laptop.setPlanPrice(249.99);

        // Adiciona o laptop à lista
        listaDeLaptops.add(laptop);

        return listaDeLaptops;
    }
    public List<Laptops> getListaDeLaptops() {
        return listaDeLaptops;
    }
}
