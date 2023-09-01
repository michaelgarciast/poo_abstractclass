// Clase Hijo (Subclase) que hereda de TheKingOfFighters
public class IoriYagami extends TheKingOfFighters {

    // Métodos abstractos
    @Override
    public void golpear() {
        System.out.println(ANSI_RED + "Iori -------> Ataca con un golpe rapido a Rugal ");
    }

    @Override
    public void bloquear() {
        System.out.println(ANSI_RED + "Iori -------> Se agacha para bloquea ataque de Rugal" + ANSI_RESET);
    }

    @Override
    public void especial() {
        System.out.println(ANSI_RED + "Iori -------> Realiza especial y mata a Rugal " + ANSI_RESET);
    }
}