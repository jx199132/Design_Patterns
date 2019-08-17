package builder.ext_demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String mainboard;
    private String cpu;
    private String disk;
    private String memory;
    private String ssd;

    public Computer(String mainboard, String cpu, String disk, String memory, String ssd) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
        this.ssd = ssd;
    }

    public static void main(String[] args) {
        new Computer("主板", "cpu", "硬盘", "内存", "固态硬盘");
    }
}
