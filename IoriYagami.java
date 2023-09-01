// Clase Hijo (Subclase) que hereda de TheKingOfFighters
public class IoriYagami extends TheKingOfFighters {

    // Métodos abstractos
    @Override
    public void golpear() {
        System.out.println("Iori realiza golpe rapido a Rugal");
    }

    @Override
    public void bloquear() {
        System.out.println("Iori bloquea ataque de Rugal");
    }

    @Override
    public void especial() {
        System.out.println("Iori realiza especial y mata a Rugal ");
    }
}