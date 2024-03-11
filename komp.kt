open class komp:abstrComp(){
    override var name_cpu = ""
    override var takt=0.0
    override var memory=0.0
    override fun calc(): Double {
      val all = (0.1*takt)+memory
        return all
    }
    fun input(){
        println("Введите название процессора: ")
        name_cpu = readln()
        println("Введите такт. частоту процессора: ")
        takt = readln().toDouble()
        println("Введите объем оперативной памяти: ")
        memory = readln().toDouble()
    }


}