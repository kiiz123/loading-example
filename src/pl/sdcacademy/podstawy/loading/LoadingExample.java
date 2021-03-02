package pl.sdcacademy.podstawy.loading;

public class LoadingExample {
    public static final int STATIC_FIELD = Main.staticField();
    public static final int STATIC_FIELD_INITIALIZER;

    static {

        STATIC_FIELD_INITIALIZER = Main.staticInitializer();
    }


    public LoadingExample() {
        this(1);
        firstConstructor=Main.firstConstructor();
    }

    public LoadingExample(int objectField) {
        this.objectField = objectField;
        secondConstructor =Main.secondConstructor();
    }

    private int firstConstructor;
    private int secondConstructor;


    private int objectField;
    private final int objectInitializer = Main.objectInitializer();

    {
        objectField = Main.objectField();
    }
}


