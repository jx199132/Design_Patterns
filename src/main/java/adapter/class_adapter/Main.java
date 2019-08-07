package adapter.class_adapter;

public class Main {
    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压：" + adapter.getVolt5());
        System.out.println("输出电压：" + adapter.getVlot220());
    }
}
