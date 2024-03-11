abstract class abstrComp():computer{
    abstract val name_cpu:String
    abstract val takt:Double
    abstract val memory:Double
    abstract fun calc():Double
    override fun info() {
        println("Название процессора: $name_cpu " +
                "Такт. частота процессора: $takt Объем оперативной памяти: $memory  Q-${calc()} ")}
}