# OOEToDoApp

OOEToDoApp ist eine einfache Java-Swing-Anwendung zur Verwaltung von Todo-Listen. Die Anwendung unterstützt Checkbox-Listen für Aufgaben und Textlisten für freie Notizen.

## Funktionen

- Erstellen von Checkbox-Listen und Textlisten
- Umbenennen und Löschen von Listen
- Hinzufügen, Bearbeiten, Abhaken und Löschen von Aufgaben
- Freie Bearbeitung von Textlisten
- Automatisches Speichern und Laden der Daten als JSON-Datei
- Persistenz über Gson

## Projektstruktur

```text
OOEToDoApp-main/
├── app/                 # Gebaute JAR-Datei und Laufzeitdaten
│   ├── ToDo-Liste.jar
│   └── resources/
│       └── todos.json
├── docs/                # Projektdokumentation
│   ├── Klassendiagramm.pdf
│   └── Klassendiagramm.puml
├── lib/                 # Externe Bibliotheken
│   └── gson-2.13.2.jar
├── src/                 # Java-Quellcode
│   ├── controller/
│   ├── model/
│   ├── view/
│   └── Main.java
└── README.md
```

## Voraussetzungen

- Java JDK 17 oder neuer
- IntelliJ IDEA oder eine andere Java-IDE

## Starten in IntelliJ

1. Projekt in IntelliJ öffnen.
2. Sicherstellen, dass `lib/gson-2.13.2.jar` als Library eingebunden ist.
3. `src/Main.java` ausführen.

## Starten der JAR-Datei

Die fertige Anwendung liegt im Ordner `app`.

```bash
java -jar ToDo-Liste.jar
```

Wichtig: Die Anwendung speichert ihre Daten im Ordner `resources/todos.json` relativ zum Startordner. Wird die JAR aus dem Ordner `app` gestartet, wird `app/resources/todos.json` verwendet.

## Datenhaltung

Die Todo-Daten werden als JSON-Datei gespeichert. Für die Umwandlung zwischen Java-Objekten und JSON wird Gson verwendet.

Die Datei befindet sich standardmäßig hier:

```text
resources/todos.json
```

## Architektur

Das Projekt ist grob nach einem MVC-ähnlichen Aufbau strukturiert:

- `model`: Enthält die Datenklassen wie `TodoApp`, `TodoList`, `CheckboxTodoList`, `TextTodoList` und `TodoItem`.
- `view`: Enthält die Swing-Oberfläche in der Klasse `GUI`.
- `controller`: Vermittelt zwischen GUI, Model und Persistenz.
- `PersistenceManager`: Speichert und lädt die Daten.
- `TodoListAdapter`: Ermöglicht das Laden verschiedener Listentypen aus JSON.

Ein Klassendiagramm befindet sich im Ordner `docs`.

## Externe Bibliotheken

Dieses Projekt verwendet:

- Gson 2.13.2

Die Bibliothek liegt im Ordner `lib`.

## Hinweise

Beim Beenden der Anwendung werden die aktuellen Daten automatisch gespeichert. Textlisten werden während der Bearbeitung im Model aktualisiert und spätestens beim Listenwechsel oder Beenden gespeichert.
