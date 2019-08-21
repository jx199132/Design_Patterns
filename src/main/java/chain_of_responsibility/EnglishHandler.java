package chain_of_responsibility;

public class EnglishHandler extends Handler{
    public EnglishHandler(String type) {
        super(type);
    }

    @Override
    protected boolean canDo(Problem problem) {
        return this.type.equals(problem.getType());
    }
}
