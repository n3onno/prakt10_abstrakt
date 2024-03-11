class computers:komp() {
    var harddrive=0.0
    override fun calc(): Double {
        val rez =0.5*harddrive
        return rez
    }
    fun hard(){
        println("Введите объем жестк диска: ")
        harddrive= readln().toDouble()
    }

    override fun info() {
        super.info()
        println("Объем жестк диска: $harddrive, QP- ${calc()}")
    }




}