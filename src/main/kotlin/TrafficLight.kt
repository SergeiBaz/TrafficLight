class TrafficLight() {
    private val lampByColor = mapOf(
        LampColors.RED to Lamp(LampColors.RED),
        LampColors.YELLOW to Lamp(LampColors.YELLOW),
        LampColors.GREEN to Lamp(LampColors.GREEN),)

    fun allowToMove() { // Разрешить двигаться
        lampByColor[LampColors.RED]?.disable()
        lampByColor[LampColors.YELLOW]?.disable()
        lampByColor[LampColors.GREEN]?.enable()
    }

    fun denyToMove () {  // Запретить движение
        lampByColor[LampColors.RED]?.enable()
        lampByColor[LampColors.YELLOW]?.disable()
        lampByColor[LampColors.GREEN]?.disable()
    }

    fun warnOfTrafficRestrictions () {
        lampByColor[LampColors.RED]?.disable()
        lampByColor[LampColors.YELLOW]?.disable()
        lampByColor[LampColors.GREEN]?.blink()
    }

    fun attentionStop(){
        lampByColor[LampColors.RED]?.disable()
        lampByColor[LampColors.YELLOW]?.enable()
        lampByColor[LampColors.GREEN]?.disable()
    }

    fun getReadyToStart(){
        lampByColor[LampColors.RED]?.enable()
        lampByColor[LampColors.YELLOW]?.enable()
        lampByColor[LampColors.GREEN]?.disable()
    }

    fun printLamps(){
        val convertEnabled: (Boolean) -> String = fun(enabled): String =  if (enabled)  "ON" else "OFF"
        val convertMode: (LampModes, Boolean) -> String = fun(mode, enabled): String = if (!enabled) "" else if (mode == LampModes.GLOW) "GLOW" else "BLINK"  // Sorry((
        for (lamp in lampByColor.values){
            println("${lamp.color} lamp: ${convertEnabled(lamp.enabled)} ${convertMode(lamp.mode, lamp.enabled)}")
        }
    }

    /*        println("Red lamp: ${convertEnabled(`lampByColor[LampColors.RED]?`.getEnabled())} ${convertMode(`lampByColor[LampColors.RED]?`.getMode(), `lampByColor[LampColors.RED]?`.getEnabled())}")
        println("Yellow lamp: ${convertEnabled(yellowLamp.getEnabled())} ${convertMode(yellowLamp.getMode(), yellowLamp.getEnabled())}")
        println("Green lamp: ${convertEnabled(greenLamp.getEnabled())} ${convertMode(greenLamp.getMode(), greenLamp.getEnabled())}\n")
    }*/

/*
    private fun convertMode(mode: LampModes, enabled: Boolean): String{
        if (!enabled)
            return ""
        if (mode == LampModes.GLOW)
            return "GLOW"

        return "BLINK"
    }
*/

}