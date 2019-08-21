package chain_of_responsibility;

/**
 * 问题类
 */
public class Problem {

    private String type;

    public Problem(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
