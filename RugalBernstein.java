// Clase Hijo (subclase) que hereda de TheKingOfFighters
public class RugalBernstein extends TheKingOfFighters {

    // Métodos abstractos
    @Override
    public void golpear() {
        System.out.println(ANSI_YELLOW + "Rugal -------> Ataca con multiples golpes a Iori " + ANSI_RESET);
    }

    @Override
    public void bloquear() {
        System.out.println(ANSI_YELLOW + "Rugal -------> Bloquea ataque de Iori " + ANSI_RESET);
    }

    @Override
    public void especial() {
        System.out.println(ANSI_YELLOW + "Rugal -------> Realiza especial y mata a Iori " + ANSI_RESET);
    }
}