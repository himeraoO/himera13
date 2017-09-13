package Lesson5;

public class InitializationBlock {

    private String name;

    static {
        System.out.println("Second");
    }

    {
        System.out.println("Before constructor");
    }

    public InitializationBlock() {
        System.out.println("Constructor");
    }

    {
        name = "Dmitry";
        System.out.println("Name");
    }

    static {
        System.out.println("First");
    }

}
