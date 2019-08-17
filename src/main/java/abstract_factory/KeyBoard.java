package abstract_factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyBoard {
    private String type;

    public KeyBoard(String type) {
        this.type = type;
    }
}
