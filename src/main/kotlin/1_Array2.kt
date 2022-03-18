fun main(args: Array<String>) {
    //membuat array string dengan size 5 dan nilai ["0","1","4","9","16"]

    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }

}