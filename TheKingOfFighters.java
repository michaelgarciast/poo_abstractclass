// Definimos clase padre (abstracta)
public abstract class TheKingOfFighters {

    // Definimos metodos de colores (Implemetacion Extra)
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Definimos tres métodos abstractos implementados en la clase Hijo (subclases)
    public abstract void golpear();

    public abstract void bloquear();

    public abstract void especial();
}