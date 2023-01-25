//todo: Schau dir den folgenden Codeausschnitt an.
// Beschreibe in einem Text, was dieser Codeausschnitt macht.

class Car {                                     // Klasse Car wird erstellt
    var color: String                           // Variable color wird als String deklariert
    var speed: Int                              // Variable speed wird als Integer deklariert

    constructor(color: String, speed: Int) {    // der constructor wird mit den variablen color und speed erstellt
        this.color = color                      // die Variable color aus der Klasse Car ist gleich der Variable color im constructor
        this.speed = speed                      // die Variable speed aus der Klasse Car ist gleich der Variable speed im constructor
    }

    fun paint(color: String) {                  // es wird eine methode paint mit der variable color (aus dem constructor) erstellt
        this.color = color                      // die Variable color aus der Klasse Car ist gleich der Variable color in der methode paint
    }

    fun tune() {                                // es wird eine methode tune erstellt
        speed = speed + 10                      // die Variable speed aus der Klasse Car ist in der methode tune gleich speed + 10
    }
}

//todo: Beschreibe in einem Text, was dieser Codeausschnitt macht.

/*
var car: Car = Car("weiss", 150)
car.paint("schwarz")
car.tune()

println(car.color)
println(car.speed)
 */

// es wird eine variable namens car erstellt, die auf die Klasse Car zugreift und mit den werten color = weiss und
// speed = 150 übergeben wird. nun wird das car von weiss auf schwarz umlackiert und wird um den wert 10 getuned (150+10 = 160)
// wir geben erst in der konsole die farbe des autos aus (schwarz) und dann den speed (160)