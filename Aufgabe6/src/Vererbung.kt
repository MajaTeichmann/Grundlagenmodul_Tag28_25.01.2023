open class Haustier(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun pet(){
        println("Dein Haustier hat sich streicheln lassen.")
    }
}

class Meerschweinchen(name: String, age: Int, val jumpheight: Int) : Haustier(name, age) {

    fun jump(heightSleepPlace: Int): Boolean {
        return heightSleepPlace <= jumpheight
    }
}

/*
fun main(){
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}
 */

//todo: Aufgabe:

// todo: Was gibt das Programm aus?
// Dein Haustier hat sich streicheln lassen.
// Dein Haustier heisst Kruemel und ist 3 Jahre alt.
// false (weil der schlafplatz höher liegt, als das meerschweinchen springen kann)

//todo: Wir instanziieren eine Meerschweinchen-Instanz. In der Meerschweinchen-Klasse ist keine Methode pet(), dennoch können wir die Meerschweinchen-Instanz mit pet() streicheln. Warum?
// Die Meerschweinchen-Klasse hat keine Eigenschaften name und age, dennoch können wir über die Meerschweinchen-Instanz auf die Eigenschaften zugreifen. Warum?
//Wir können in der Klasse Meerschweinchen auf alles zugreifen, was in der Klasse Haustier steht. Umgekehrt aber nicht.

//todo: Was macht das Keyword? open
//es ermöglicht die Vererbung

//todo: Was macht der Codeausschnitt hier? : Haustier(name, age)
//: Haustier(name, age) ist die BasisKlasse. So können wir der erbenden Klasse sagen, von welcher Klasse sie erben darf.