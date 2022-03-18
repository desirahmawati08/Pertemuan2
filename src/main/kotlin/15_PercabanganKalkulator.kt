fun main(args: Array<String>) {
    println("Welcome to our calculator")
    println("masukkan angka pertama:")
    val a = readLine()!!.toDouble()
    println("masukkan angka kedua:");
    val b = readLine()!!.toDouble()
    println("Pilih salah satu dari operasi berikut:")
    println("1 - Tambahan")
    println("2 - Pengurangan")
    println("3 - perkalian ")
    println("4 - Pembagian")
    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1) {
        result = a + b
    } else if (choice == 2) {
        result = a - b
    } else if (choice == 3) {
        result = a * b
    } else if (choice == 4) {
        result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("result: $result")
    } else {
        println("Invalid choice")
    }
    println("Thank you for using our calculator.")
}