package model;

/**
 * Repräsentiert ein einzelnes Todo-Element.
 */
public class TodoItem {

    // Beschreibung der Aufgabe
    private String text;

    // Status: erledigt oder nicht
    private boolean completed;

    /**
     * Konstruktor: erstellt ein neues TodoItem mit Text
     * Standard: nicht erledigt
     */
    public TodoItem(String text) {

        // Text sauber speichern und null vermeiden.
        this.text = cleanText(text);

        // Neue Aufgaben sind standardmäßig nicht erledigt.
        this.completed = false;
    }


    /**
     * Wechselt den Status (erledigt <-> nicht erledigt)
     */
    public void toggle() {
        completed = !completed;
    }

    /**
     * Gibt den Text der Aufgabe zurück
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {

        // Text sauber speichern und null vermeiden.
        this.text = cleanText(text);
    }


    /**
     * Gibt zurück, ob die Aufgabe erledigt ist
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Bereitet Textwerte für TodoItems auf.
     */
    private String cleanText(String text) {

        // Null-Werte werden als leerer Text gespeichert,
        // damit später keine NullPointerException entsteht.
        if (text == null) {
            return "";
        }

        // Leerzeichen am Anfang und Ende entfernen.
        return text.trim();
    }
}