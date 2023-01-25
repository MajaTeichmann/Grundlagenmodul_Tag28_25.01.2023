//todo: Hier ist ein Klassendiagramm von einem Buch und einer Seite.
// Eine Seite hat einen Text und eine Methode read(), die den Text in der Konsole ausgibt.
// Ein Buch hat eine Liste mit mehreren Seiten. Das Buch hat ebenso eine Seite page, die gerade aufgeschlagen ist.
// Der Leser kann zwischen den Seiten wechseln (nextPage() und previousPage()). Und der Leser kann die gerade
// aufgeschlagene Seite lesen read(). Zu Begin ist die erste Seite aufgeschlagen.

//todo: Aufgabe:
// - Erstelle die Klassen.
// - Instanziiere eine Buch-Instanz mit mehreren Seiten-Instanzen.
// - Wechsel dann ein paar mal zwischen den Seiten. Achte darauf, dass du nicht weiter blättern kannst, wenn du bereits
// an der letzten Seite angekommen bist.
// - Lies einmal das Buch von vorne nach hinten und einmal von hinten nach vorne.
// - Du kannst den folgenden Text für die Seiten verwenden oder dir selbst einen Text ausdenken.
/*
Seite 1:  Das ist der Anfang des Buches.
Seite 2:  Jetzt sind wir auf Seite 2.
Seite 3:  Hier haben wir gerade Seite 3. erreicht.
Seite 4:  Nun sind wir bei der letzten Seite angekommen.
 */

//todo: Bonus:
// Erweitere die Buch- oder Seiten-Klasse um weitere Methoden und Eigenschaften.


fun main() {
    var pages = listOf(
        Page("Deckblatt"),
        Page("Seite 1: Das ist der Anfang des Buches."),
        Page("Seite 2: Jetzt sind wir auf Seite 2."),
        Page("Seite 3: Hier haben wir gerade Seite 3. erreicht."),
        Page("Seite 4: Nun sind wir bei der letzten Seite angekommen."),
        Page("Buchrücken: Das war das Buch")
    )

    var book = Book(pages)


    //Deckblatt
    book.read()

    //Seite 1
    book.nextPage()
    book.read()

    //Seite 2
    book.nextPage()
    book.read()

    //Seite 1
    book.previousPage()
    book.read()

    //Seite 2
    book.nextPage()
    book.read()

    //Seite 3
    book.nextPage()
    book.read()

    //Seite 4
    book.nextPage()
    book.read()

    //Buchrücken
    book.nextPage()
    book.read()

    // Deckblatt - Buchrücken
    book.readForwards()

    // Buchrücken - Deckblatt
    book.readBackwards()
}