fun main() {
    try {

        val dog = inputDog()


        when {
            dog.heightAtWithers <= 0 -> {
                println("Недопустимый формат")
                return
            }
            dog.weight <= 0 ->
                { println("Недопустимый формат")
                return
            }
            else -> {
                // вывод функций
                dog.BreedDog()
                println("\n")
                dog.HeightAtWithersDog()
                println("\n")
                dog.WeightAndFeed()
            }
        }

        println("\nИнформация о собаке:")
        println(dog.DogInfo())



    } catch (e: Exception) {
        println("Неверный формат")
    }
}



    //ввод данных
fun inputDog(): Dog {
    print("Введите кличку: ")
    val nickname = readLine()!!.toString()

    print("Введите породу: ")
    val breed = readLine()!!.toString()

    print("Введите рост по холке (см): ")
    val heightAtWithers = readLine()!!.toInt()

    print("Введите окрас шерсти: ")
    val coatColor = readLine()!!.toString()

    print("Введите вес (кг): ")
    val weight = readLine()!!.toInt()

    print("Введите характер: ")
    val character = readLine()!!.toString()

    return Dog(nickname, breed, heightAtWithers, coatColor, weight, character)
}