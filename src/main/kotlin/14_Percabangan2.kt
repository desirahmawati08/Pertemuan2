fun main(args: Array<String>) {
    println("masukkan angka antara 10-20:")
    val a = readLine()!!.toInt()
    if (a >= 10 && a <= 20) {
        println("Syarat Telah Terpenuhi.")
    } else {
        println("Kamu salah.")
    }

    println("\nMasukkan angka antara 10-20 or 30-40:")
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >=30) && (b <= 40))) {
        println("Syarat telah terpenuhi.")
    } else {
        println("Kamu salah.")
    }
}