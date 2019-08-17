package builder.ext_demo;

public class NewMain {
    public static void main(String[] args) {

        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .disk("disk")
                .build();

    }
}
