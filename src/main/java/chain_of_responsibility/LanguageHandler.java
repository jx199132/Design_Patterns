package chain_of_responsibility;

public class LanguageHandler extends Handler {
    public LanguageHandler(String type) {
        super(type);
    }

    @Override
    protected boolean canDo(Problem problem) {
        return this.type.equals(problem.getType());
    }
}
