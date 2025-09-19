package Ejercicios

import Ejercicios.Decoration.Decoration

abstract class AquariumFish{
    abstract val color : String
}

class Dolphin : AquariumFish(), FishAction{
    override val color ="blue"
    override fun eat() {
        println("play and joke with his prey")
    }
}
class Turtle : AquariumFish(), FishAction{
    override val color ="green"
    override fun eat() {
        println("Its slow and peaceful")
    }
}

fun makeFish(){
    val d= Dolphin()
    val t= Turtle()

    println("Dolphin :${d.color}")
    d.eat()
    println("Turtle :${t.color}")
    t.eat()

}
fun main(){
    makeFish()
    Decoration()
    makeDecoration()
    var Prueba1= Walrus()
    var Prueba2= SeaLion()
    println( matchSeal(Prueba1))
    println( matchSeal(Prueba2))

}
class Decoration{
    data class Decoration(val rocks:String){
    }
}
fun makeDecoration(){
    val decoration1= Decoration("Granite")
    println(decoration1)
    val decoration2= Decoration("Sand")
    println(decoration2)
    val decoration3= Decoration("Sand")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

}
interface FishAction{
    fun eat()
}
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}


