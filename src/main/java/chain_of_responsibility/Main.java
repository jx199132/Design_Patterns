package chain_of_responsibility;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        String[] problemArray = {"language", "math", "english", "physical", "chemistry", "computer"};

        // 化学老师解决化学问题
        ChemistryHandler chemistryHandler = new ChemistryHandler("chemistry");

        // 英语老师解决英语问题
        EnglishHandler englishHandler = new EnglishHandler("english");

        // 语文老师解决语文问题
        LanguageHandler languageHandler = new LanguageHandler("language");

        // 数学老师解决数学问题
        MathematicsHandler mathematicsHandler = new MathematicsHandler("math");

        // 物理老师解决物理问题
        PhysicalHandler physicalHandler = new PhysicalHandler("physical");

        chemistryHandler.setNext(englishHandler).setNext(languageHandler).setNext(mathematicsHandler).setNext(physicalHandler);


        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(problemArray.length);
            Problem problem = new Problem(problemArray[index]);
            System.out.println("问题： " + problem.getType());
            chemistryHandler.doHandler(problem);
            System.out.println();
        }
    }
}
