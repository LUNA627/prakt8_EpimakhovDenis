class Dog(val nickname: String, val breed: String, val heightAtWithers: Int, val coatColor: String, val weight: Int, val character: String) {

    // Проверка на рост
    fun HeightAtWithersDog() {
        if (heightAtWithers !in 1..75) {
            println("Собак с таким ростом нет")
            return
        }
    }

    // Проверка на породу
    fun BreedDog() {
        if (breed.length > 50) { //максимальная длина названия породы - 50 символов
            println("Собак с такой породой не существует")
            return
        }
    }

    // Проверка на вес и кормление
    fun WeightAndFeed() {
        when (weight) {
            in 1..10 -> println("Необходимо количество корма (гр): 30-180")
            in 11..20 -> println("Необходимо количество корма (гр): 190-300")
            in 21..35 -> println("Необходимо количество корма (гр): 310-460")
            in 36..50 -> println("Необходимо количество корма (гр): 470-600")
            in 51..70 -> println("Необходимо количество корма (гр): 610-760")
            else -> {
                println("Слишком большой вес")
                return
            }
        }
    }

    //информация о собаке
    fun DogInfo(): String {
        return """
            Кличка: $nickname
            Порода: $breed
            Рост по холке: $heightAtWithers см
            Окрас шерсти: $coatColor
            Вес: $weight кг
            Характер: $character
        """.trimIndent()
    }
}


