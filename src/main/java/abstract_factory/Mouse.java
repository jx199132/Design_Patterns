package abstract_factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mouse {
    private String type;

    public Mouse(String type) {
        this.type = type;
    }
}
