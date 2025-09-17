package Ejercicios


open class Aquarium_Open(open var height : Int =50, open var width : Int = 60 ,open var length : Int = 100 ){
    open var volume : Int
        get() = width*height*length / 1000
        set(value){
            height=(value*1000)/(width*height)

        }
    open val shape = "Rectangle"
    open var water : Double =0.0
        get()= volume*0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}

fun buildAquarium_Open() {
    val aquarium6 = Aquarium_Open(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}
fun main() {
    buildAquarium_Open()
}




