fun main(){
    var unserFlugzeug: Airplane = Airplane(6,800.0,false)

    println("Wir wollen abheben!")
    unserFlugzeug.takeOff()
    println("\nWir wollen landen!")
    unserFlugzeug.land()
    println("\nWir wollen abheben!")
    unserFlugzeug.takeOff()
    println("\nWir wollen nochmal abheben!")
    unserFlugzeug.takeOff()
    println("\nWir wollen landen!")
    unserFlugzeug.land()
    println("\nWir wollen nochmal landen!")
    unserFlugzeug.land()

}