class TrafficLight() {
    private val redSignal: String = "Red signal"
    private val yellowSignal: String = "Yellow signal"
    private val greenSignal: String = "Green signal"

    fun allowMovement() { // Разрешить движение
        println(
            "Traffic is allowed permissive traffic light is on!\n" +
                    "$redSignal : off\n" +
                    "$yellowSignal : off\n" +
                    "$greenSignal : on")
    }

    fun stopSoon(){
        println("Attention soon forbidding traffic signal.\n" +
                "$redSignal : Off\n$yellowSignal: Off\n$greenSignal: blink ")
    }

    fun attentionStop(){
        println("Attention, it's time to stop! Now there will be a prohibitory traffic signal!\n" +
                "$redSignal : off\n" +
                "$yellowSignal : on\n" +
                "$greenSignal : off")
    }

    fun movementProhibition(){
        println("Movement Prohibition\n" +
                "$redSignal : off\n" +
                "$yellowSignal : on\n" +
                "$greenSignal : off")
    }

    fun prepareToStart(){
        println("Prepare to start\n" +
                "$redSignal : on\n" +
                "$yellowSignal : on\n" +
                "$greenSignal : off")
    }
}