# 2-Objektorientierung/11-Recap-Projekt-ShopService

## Unklarheiten beseitigen

Habt ihr Fragen zum bisherigen Unterricht? Klärt sie gemeinsam.

## Coding: ProductRepo

Erstelle eine Klasse `ProductRepo`, die eine Liste von `Product`-Objekten enthält.

* Schritt 1: Erstelle einen Record `Product` mit den benötigten Attributen.
* Schritt 2: Implementiere die `ProductRepo`-Klasse mit einer Liste zur Speicherung von Produkten.
* Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.

## Coding: OrderListRepo

Erstelle eine Klasse `OrderListRepo`, die eine Liste von `Order`-Objekten enthält.

* Schritt 1: Erstelle einen Record `Order` mit den benötigten Attributen.
* Schritt 2: Implementiere die `OrderListRepo`-Klasse mit einer Liste zur Speicherung von Bestellungen.
* Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.

## Coding: ShopService

Erstelle eine Klasse `ShopService`, über die wir neue Bestellungen aufgeben können.

* Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben.
* Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht gebe ein System.out.println aus.

## Coding: OrderRepoInterface

* Schritt 1: Erstelle ein `OrderRepo`-Interface mit den Methoden aus dem OrderListRepo (Hinzufügen, Entfernen und Abfragen von Bestellungen)

## Coding: OrderMapRepo

* Erstelle eine Klasse `OrderMapRepo`, über die wir neue Bestellungen aufgeben können.
* Diese Klasse soll auch das `OrderRepo`-Interface implementieren.
* Erstelle in der main-Methode entweder das `OrderMapRepo` oder das `OrderListRepo` und gib es dem Konstruktor von `ShopService` (in einen Konstruktor-Parameter, der das Interface nutzt) mit.

## Pause

Nehmt euch eine Pause, um euch zu erholen und die Aufgaben zu verinnerlichen.

## Bonus: Preis, Anzahl

Für diejenigen mit Vorwissen oder zusätzlichem Interesse an Herausforderungen.

* Füge ein Preis zum Produkt und einen Gesamtpreis für eine Bestellung hinzu.
* Erlaube es dem Nutzer, die Anzahl der Produkte in einer Bestellung anzugeben und zu ändern.

## Bonus: Tests

* Schreibe sinnvolle Tests für die Klassen `ProductRepo`, `OrderListRepo` und `ShopService`.
* Nutze assertj matchers in deinen Tests.

## Bonus: Kommandozeilen-Interface

* Nutze einen `Scanner` um von `System.in` zu lesen. Baue eine interaktive Produktverwaltung mit allen Extras.

## Bonus: Kommandozeilen-Farben

* Gestalte die Kommandozeilenausgabe farbig mit sinnvollen, hilfreichen Farben und Formen.

## Bonus: EAN-Datenbank

* Suche im Internet eine EAN-Datenbank als CSV (oder lass eine von ChatGPT generieren). Nutze diese CSV-Datei als Input

## Bonus: Bestandsinfos

* Speichert pro Produkt, wie viele davon noch auf Lager sind. Wenn ein Produkt bestellt wird, wird der Bestand verringert. Wenn ein Produkt nicht mehr auf Lager ist, kann es nicht mehr bestellt werden.

## Bonus: Warenein- und ausgänge

* Ermöglicht zusätzliche Workflows für Warenein- und ausgänge. Wenn Ware eingelagert wird, wird der Bestand erhöht. Wenn Ware ausgelagert wird (z.B. nach einem Wasserschaden oder Diebstahl), wird der Bestand verringert.

## Bonus: Bestandsprotokoll

* Notiere für den Warenbestand ein Protokoll aller Warenbestandsänderungen mit Verknüpfungen zu den Bestellungen (oder Warenein- oder ausgängen), die diese Änderungen verursacht haben.
