package adapter.object_adapter;

public class Main {
    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + adapter.getVolt5());
        System.out.println("输出电压：" + adapter.getVolt220());
    }
}
