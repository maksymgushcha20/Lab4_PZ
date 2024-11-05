/**
 * Клас представляє літеру в слові.
 */
public class Letter {
    private char character; // Символ літери

    /**
     * Конструктор для створення об'єкта літери.
     * @param character Символ, який представляє літеру.
     */
    public Letter(char character) {
        this.character = character;
    }

    /**
     * Повертає символ літери.
     * @return Символ літери.
     */
    public char getCharacter() {
        return character;
    }

    /**
     * Повертає літеру у вигляді рядка.
     * @return Літера як рядок.
     */
    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
