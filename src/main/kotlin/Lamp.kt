class Lamp(color: LampColors) {
    val color: LampColors = color
    var enabled = false
        private set
    var mode = LampModes.GLOW
        private set

    fun enable() {
        enabled = true
        mode = LampModes.GLOW
    }

    fun disable() {
        enabled = false
    }

    fun blink() {
        enabled = true
        mode = LampModes.BLINK
    }
}