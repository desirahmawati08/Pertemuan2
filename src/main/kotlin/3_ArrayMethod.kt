fun main(args: Array<String>) {
    //Array Method
    //sort()

    val simpsonsA = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + " ")
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    val simpson_sorted = simpsonsB.sortedArray()
    for (simpson in simpson_sorted){
        print(simpson + " ")
    }
    print('\n')

    //reverse() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa","Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("yeah, that's my number ${position+1} simpson!")
    }else{
        println("Hey that's not simpson")
    }

    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa","Meggie")
    println("simpsons size: " +simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak Kosong!")
    println("Min = "+ simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("First = "+ simpsonsE.first())
    println(simpsonsE.contains("Marge"))
}