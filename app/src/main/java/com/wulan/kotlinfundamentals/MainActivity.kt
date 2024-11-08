package com.wulan.kotlinfundamentals

//Tugas 1
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

//Tugas 2
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

//Tugas 7
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
//    //Tugas 1
//    val event = Event(
//        title = "Study Kotlin",
//        description = "Commit to studying Kotlin at least 15 minutes per day.",
//        daypart = Daypart.EVENING,
//        durationInMinutes = 15
//    )
//    println(event)

    //Tugas 3
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Bath", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event3 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event4 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event5 = Event(title = "Nap", description = "Nap Time", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event6 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event7 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event8 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    val event9 = Event(title = "Sleep at night", daypart = Daypart.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6, event7, event8, event9)
    events.forEach { println(it) }

    println()

    //Tugas 4
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    println()

    //Tugas 5
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println()

    //Tugas 6
    println("Last event of the day: ${events[events.size - 1].title}")

    println()

    //Tugas 7
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}