//todo: Ihr habt heute in der Vorlesung vereinfachte Klassendiagramme kennengelernt.
// Hier ist ein Klassendiagramm eines Flugzeugs.
// Es verfügt über die Eigenschaften:
// - amountTurbines, dass die Anzahl der Turbinen angibt.
// - flyingSpeed, dass die Fluggeschwindigkeit in Km/h angibt.
// - isAirborne, das angibt, ob das Flugzeug gerade fliegt.
// Es verfügt ebenso über einen Konstruktor und zwei Methoden.
// - Die Methode takeOff() prüft, ob das Flugzeug bereits fliegt, wenn nicht, setzt es die Eigenschaft isAirborne auf true.
// - Die Methode land() prüft, ob das Flugzeug gerade am fliegen ist, wenn ja, setzt es die Eigenschaft isAirborne auf false.
// - Das Flugzeug befindet sich zu Begin auf dem Boden.

// todo: Aufgabe:
//  - Erstelle die Klasse.
//  - Instanziiere ein Flugzeug-Objekt, lass es fliegen und landen.
//  - Stelle sicher, das ein Flugzeug nicht abheben kann, wenn es bereits in der Luft ist.

class Airplane(var amountTurbines: Int, var flyingSpeed: Double) {
    var isAirborne: Boolean = false

        fun takeOff(){
              if(isAirborne){
                  println("Wir fliegen bereits!")
              }
            else{
                isAirborne = true
                  println("Wir leiten den Flug ein!")
              }
        }

        fun land(){
            if(isAirborne){
                isAirborne = false
                println("Landeanflug wurde eingeleitet. Wir landen nun!")
            }
            else{
                println("Wir sind bereits am Boden. Landeanflug wurde nicht eingeleitet!")
            }
        }
}