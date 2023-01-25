//todo: Schau dir den folgenden Codeausschnitt an.
// Beschreibe in einem Text, was dieser Codeausschnitt macht.

class Person {
    var age: Int

    constructor(age: Int) {
        this.age = age
    }

    fun birthday(){
        age = age + 1
    }

    fun isUnderage() : Boolean {
        return(age < 18)
    }
}
// die Klasse Person wird mit der variable age(integer) erstellt.
// es wird ein dem constructor die variable aus der Klasse Person übergeben.
// die methoden birthday und isUnderage werden erstellt. birtday ist das age von der Klasse Person +1
// isUnderage ist vom typ boolean und gibt das alter unter 18 wieder.


//todo: Beschreibe in einem Text, was dieser Codeausschnitt macht.
/*
var person = Person(15)
person.birthday()
println(person.isUnderage())
 */

// die variable person wird erstellt und bekommt den wert age = 15 übergeben
// nun wird die methode birtday für die variable person gestartet und es wird das ergebnis der metode isUnderage in der konsole ausgegeben