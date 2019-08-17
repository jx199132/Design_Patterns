package builder.ext_demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewComputer {
    private String mainboard;
    private String cpu;
    private String disk;
    private String memory;
    private String ssd;

    private NewComputer(){}

    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        disk = builder.disk;
        memory = builder.memory;
        mainboard = builder.mainboard;
        ssd = builder.ssd;
    }

    public final static class Builder{
        private String mainboard;
        private String cpu;
        private String disk;
        private String memory;
        private String ssd;

        public Builder(){}

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public Builder disk(String disk){
            this.disk = disk;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder ssd(String ssd){
            this.ssd = ssd;
            return this;
        }

        public NewComputer build(){
            return new NewComputer(this);
        }
    }
}
