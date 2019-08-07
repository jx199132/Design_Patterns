package adapter.class_adapter;

public class VoltAdapter extends Volt220 implements Volt5 {
    @Override
    public int getVolt5() {
        return 5;
    }
}