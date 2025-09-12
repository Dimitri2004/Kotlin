//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val ciudad = listOf("Ankara","Tokyo","Cape Town","Guatemala City")
    val min= listOf(27,32,59,50)
    val max=listOf(31,36,54,55)
    val chance=listOf(82,10,2,7)

    for (i in 0..3){
        cities(" nombre ciudad :${ciudad[i]}")
        numer(" minima : ${min[i]}")
        numer (" maxima : ${max[i]}")
        numer (" porcentage : ${chance[i]}")
        println()
    }




}
fun cities(ciudad : String){
    for (name in ciudad) {
        print("$name")

    }
}
fun numer(min :String){
    for (m in min){
        print("$m")
    }
}