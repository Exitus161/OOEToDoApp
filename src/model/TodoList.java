package model;

/**
 * Abstrakte Oberklasse für alle Arten von Todo-Listen.
 * Enthält gemeinsame Eigenschaften (z. B. Titel).
 */
public abstract class TodoList {

    // Titel der Liste
    protected String title;
    // Typ der Liste
    protected String type;

    /**
     * Konstruktor setzt den Titel der Liste
     */
    public TodoList(String title, String type) {

        // Titel sauber speichern und null vermeiden.
        this.title = cleanTitle(title);

        // Typ sauber speichern und null vermeiden.
        this.type = cleanType(type);

    }

    /**
     * Gibt den Titel der Liste zurück
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gibt den Typ der Liste zurück.
     */
    public String getType() {
        return type;
    }

    public void setTitle(String title) {

        // Titel sauber speichern und null vermeiden.
        this.title = cleanTitle(title);
    }

    /**
     * Bereitet Titelwerte für TodoListen auf.
     */
    private String cleanTitle(String title) {

        // Null-Werte werden als leerer Titel gespeichert,
        // damit später keine NullPointerException entsteht.
        if (title == null) {
            return "";
        }

        // Leerzeichen am Anfang und Ende entfernen.
        return title.trim();
    }

    /**
     * Bereitet Typwerte für TodoListen auf.
     */
    private String cleanType(String type) {

        // Null-Werte werden als leerer Typ gespeichert,
        // damit später keine NullPointerException entsteht.
        if (type == null) {
            return "";
        }

        // Leerzeichen am Anfang und Ende entfernen.
        return type.trim();
    }
}