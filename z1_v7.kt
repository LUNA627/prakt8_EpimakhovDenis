fun main() {
    try {
        var dog: Dog = Dog();

            //ввод данных
        print("Введите кличку: ")
        dog.nickname = readLine()!!.toString()

        print("Введите породу: ")
        dog.breed = readLine()!!.toString()

        print("Введите рост по холке (см): ")
        dog.heightAtWithers = readLine()!!.toInt()

            //условие, проверка на отрицательный рост
        if (dog.heightAtWithers <= 0) {
            println("Рост не должен быть меньше 0 или быть 0")
            return
        }

        print("Введите окрас шерсти: ")
        dog.coatСolor = readLine()!!.toString()

        print("Введите вес (кг): ")
        dog.weight = readLine()!!.toInt()

            //условие, проверка на отрицательный рост
        if (dog.heightAtWithers <= 0) {
            println("Вес не должен быть меньше 0 или быть 0")
            return
        }

        print("Введите характер: ")
        dog.character = readLine()!!.toString()

            //вывод функций
        dog.BreedDog()
        dog.HeightAtWithersDog()
        dog.WeightAndFeed()

    }
    catch(e:Exception) {
        println("Неверный формат")
    }



}