// Clase Hijo (subclase) que hereda de TheKingOfFighters
public class RugalBernstein extends TheKingOfFighters {

    // Métodos abstractos
    @Override
    public void golpear() {
        System.out.println("Rugal ataca con golpe bajo a Iori");
    }

    @Override
    public void bloquear() {
        System.out.println("Rugal bloquea ataque de Iori");
    }

    @Override
    public void especial() {
        System.out.println("Rugal realiza especial y mata a Iori ");
    }
}