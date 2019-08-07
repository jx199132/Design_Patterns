package adapter.object_adapter;

public class VoltAdapter implements Volt5 {

    Volt220 volt220;

    public VoltAdapter(Volt220 volt220){
        this.volt220 = volt220;
    }

    public int getVolt220(){
        return volt220.getVlot220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}