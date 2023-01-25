//todo: für die eigentliche Aufgabe:

//fun main(){
//    var pinguin = Pinguin(25.2)
//    var adler = Adler(5.9)
//
//    println("Kann ein Pinguin fliegen?")
//    pinguin.canFly
//    println("Welche Geräusche macht ein Pinguin?")
//    pinguin.makeNoise()
//    println()
//    println("Kann ein Adler fliegen?")
//    adler.canFly
//    println("Welche Geräusche macht ein Adler?")
//    adler.makeNoise()
//    println()
//    println("Lass den Pinguin watscheln und den Adler fliegen.")
//    pinguin.waddle()
//    adler.fly()
//}

//todo: eigene erweiterung:

fun main(){
    var pinguin = Pinguin(0.8,25.2,14, "kleine Krabben","Antarktis (Südpol)")
    var adler = Adler(0.9,5.9, 12,"Fische","Nordamerika")

    println("Kann ein Pinguin fliegen?")
    pinguin.canFly
    println("Welche Geräusche macht ein Pinguin?")
    pinguin.makeNoise()
    println()
    println("Kann ein Adler fliegen?")
    adler.canFly
    println("Welche Geräusche macht ein Adler?")
    adler.makeNoise()
    println()
    println("Lass den Pinguin watscheln und den Adler fliegen.")
    pinguin.waddle()
    adler.fly()
}