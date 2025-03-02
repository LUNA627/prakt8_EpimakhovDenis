import kotlin.math.max
    //создаем класс Dog
class Dog {

    var nickname = "" //кличка
    var breed = "" //порода
    var heightAtWithers: Int = 0 //рост по холке (см)
    var coatСolor = "" //окрас шерсти
    var weight: Int = 0 //вес
    var character = "" //характер



        //функция, проверка на рост
    fun HeightAtWithersDog() {
        when (heightAtWithers) {
            in 76..100 -> println("Собак с таким ростом нет")
        }
    }

        //функция, проверка на породу
    fun BreedDog() {
        when(breed.length) {
            in 100..200 -> println("Собак с такой породой не существует")
        }
    }



        //функция, проверка на вес
    fun WeightAndFeed() {
        when (weight) {
            in 1..10 -> println("Необходимо количество корма (гр): 30-180")
            in 11..20 -> println("Необходимо количество корма (гр): 190-300")
            in 21..35 -> println("Необходимо количество корма (гр): 310-460")
            in 36..50 -> println("Необходимо количество корма (гр): 470-600")
            in 51..70 -> println("Необходимо количество корма(гр): 610-760")
            else -> println("Слишком большой вес")
        }
    }


 }