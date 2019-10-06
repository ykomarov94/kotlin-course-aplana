package module2

fun main(){
    // Оригинал: https://meduza.io/games/eto-skazal-patsan-ili-maks-peyn
    println("Это сказал пацан или Макс Пейн?")
    println("Проверим, где вы были 18 лет назад — за компьютером или во дворе?")
    println("Легендарной игре «Макс Пейн» исполнилось ровно 18 лет. Помимо эффектной " +
            "стрельбы в слоу-мо и крутого сюжета, «Макс Пейн» запомнился фразами, которые " +
            "произносит сам главный герой. Правда, порой они очень похожи на цитаты из «пацанских " +
            "пабликов» — сообществ, где многозначительно рассуждают о жизни, судьбе и принципах. " +
            "Но настоящие фанаты Макса Пейна точно смогут отличить его реплики от пацанских цитат. " +
            "Не так ли?")
    println("\n\nНачнем игру\nНапишите 0, если считаете, что цитата взята из «пацанских пабликов» " +
            "и 1, если думаете, что это цитата из легендарной игры.")
    println()

    var okAnswers = 0

    okAnswers += if (checkAnswer("Если живешь как волк - будь добр не лаять, как пес", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Прежде, чем сдаваться, вспомни, ради чего ты все начинал", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Закрывая глаза, ты закрываешься изнутри в темноте", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Если бы кто-то мог читать мои мысли, он бы рыдал", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Если человек сильный, это не значит, что ему не больно", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Слушай всех, прислушивайся к немногим, решай сам", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Счастье - это отнюдь не данность, за него надо постоянно бороться", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Никто не может бежать вечно", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Выдержать можно все, но не предательство", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Лучше падать, чем никогда не летать", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Пройдет время, и жизн покажет, что все было только к лучшему", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Как только я вошел, он завял, как двойка перед флеш-роялем", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Может, и не получится, но попробовать стоит всегда", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Это любовь... Любовь причиняет боль", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Он хамил так, как будто у него в кармане лежала запасная челюсть", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Добро и зло - это всего лишь разные обличья одного и того же чудовища", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Иногда надо упасть, чтобы потом встать", "0") ) 1 else 0
    okAnswers += if (checkAnswer("То, что причиняет мне боль, умрет. Все, что было моей болью, уже умерло", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Душевная боль всегда внезапна. В отличие от боли физической, к ней нельзя подготовиться", "1") ) 1 else 0
    okAnswers += if (checkAnswer("У каждого человека бывает такой период в жизни, когда ему кажется, что он никому не нужен", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Прислушиваясь к голосу совести, ты получаешь по заслугам", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Сможешь сломать свой страх - и никто не сможет сломать тебя", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Победит не тот, кто сильнее, а тот, кто готов идти до конца", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Леди Удача - обыкновенная проуститутка, а у тебя закончились наличные", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Нет ничего, кроме пути вперед", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Закон ямы. Неважно, сколько карабкался наверх, - обратно слетишь в один миг", "1") ) 1 else 0
    okAnswers += if (checkAnswer("Меня знают многие, но лишь единицы знают, какой я на самом деле", "0") ) 1 else 0
    okAnswers += if (checkAnswer("Все мы делаем ошибки", "1") ) 1 else 0

    var result = "Ваш результат :$okAnswers из 28. "
    result += when (okAnswers){
        in 0..4 -> "Все мы делаем ошибки"
        in 5..9 -> "Лучше падать, чем никогда не летать"
        in 10..14 -> "Прислушиваясь к голосу совести, ты получаешь по заслугам"
        in 15..19 -> "Прежде, чем сдаваться, вспомни, ради чего ты все начинал"
        in 20..24 -> "Нет ничего, кроме пути вперед"
        in 25..28 -> "Победит не тот, кто сильнее, а тот, кто готов идти до конца"
        else -> "Сломавший тест не заслуживает цитаты"
    }

    println(result)
}

fun checkAnswer(question: String, okAnswer: String): Boolean{
    println(question)
    if (readLine() == okAnswer){
        println("Верно\n")
        return true
    }
    else {
        println("Неверно\n")
        return false
    }
}