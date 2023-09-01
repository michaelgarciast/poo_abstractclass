// Clase principal para probar la clase Hijo (subclases)
public class Main {
    public static void main(String[] args) {
        // Instancias de las Clase Hijo (subclases)
        TheKingOfFighters iori = new IoriYagami();
        TheKingOfFighters rugal = new RugalBernstein();

        // Métodos implementados en la clase Hijo (subclases)
        iori.golpear();
        iori.bloquear();
        iori.especial();

        rugal.golpear();
        rugal.bloquear();
        rugal.especial();
    }
}