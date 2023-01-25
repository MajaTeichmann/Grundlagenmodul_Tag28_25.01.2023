//todo: Schau dir den folgenden Codeausschnitt an.
// Beschreibe in einem Text, was dieser Codeausschnitt macht.

class Car {
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun showOff() {
        println(
            "Mein Auto ist das coolste! Es ist " + color +
                    " und " + speed + " kmh schnell!"
        )
    }

    fun drive() {
        if (speed > 180) {
            println("Du wurdest geblitzt!")
        } else {
            println("Du wurdest nicht geblitzt.")
        }
    }
}

//die klasse car wird erstellt und mit den variablen color (string) und speed (integer) gefüllt.
// der constructor bekommt diese variablen mit this übergeben.
// die methode showOff wird erstellt, welche beim aufrufen eine println in der konsole ausgeben soll.
// die methode drive wird erstellt und es soll, wenn speed > 180 ist, die println "Du wurdest geblitzt!" und
// wenn das nicht zutrifft soll die println "Du wurdest nicht geblitzt." in der konsole ausgegeben werden

//todo: Beschreibe in einem Text, was dieser Codeausschnitt macht.

/*
val car = Car("Audi", 180)
car.showOff()
car.drive()
 */

//die konstante car wird mit den variablen der Klasse Car erstellt und es werden die methoden showOff und drive aufgerufen