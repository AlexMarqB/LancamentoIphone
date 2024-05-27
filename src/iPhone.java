public interface iPhone {

    default void desbloquear() {
        System.out.println("Unlocked");
    };

    default void bloquear() {
        System.out.println("Locked");
    };
}
