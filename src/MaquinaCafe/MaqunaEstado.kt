package MaquinaCafe

class MaqunaEstado {
    sealed class CoffeeMachineState {
        object Idle : CoffeeMachineState()
        object MakingCoffee : CoffeeMachineState()
        object AddingMilk : CoffeeMachineState()
        data class ServingCoffee(val brand: String) : CoffeeMachineState()
        data class Error(val message: String) : CoffeeMachineState()
    }
}