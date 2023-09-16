package kotlin_Control_Flow

interface ICardLimit {
    fun getCreditInfo(): String
}

enum class CardType : ICardLimit {
    SILVER {
        override fun getCreditInfo() = """
            Card Type   : Silver
            CashBack    : 5%
            Max Balance : Rp.10.000.000
            """.trimIndent()
    },
    GOLD {
        override fun getCreditInfo() = """
            Card Type   : Gold
            CashBack    : 10%
            Max Balance : Rp.50.000.000
            """.trimIndent()
    },
    PLATINUM {
        override fun getCreditInfo() = """
            Card Type   : Platinum
            CashBack    : 15%
            Max Balance : Rp.100.000.000
            """.trimIndent()
    }
}

fun main() {
    var creditLimit = ""

    while (true) {
        println("=================================")
        println("              MENU               ")
        println("=================================")
        println("1. View Card List & Buy Card")
        println("2. View Your Card")
        println("3. Exit")
        println("=================================")
        print("Pick a menu : ")
        val num = readLine()

        when (num) {
            "1" -> {
                println("\n\n\n")
                creditLimit = buy()
            }
            "2" -> {
                if (creditLimit == "") {
                    println("\n\n\n")
                    println("Please Get Your Card First")
                } else {
                    println("\n\n\n")
                    println("=================================")
                    println("           Your Card")
                    println("=================================")
                    println(creditLimit)
                    println("=================================")
                    println("press any button to continue")
                    readLine()
                    println("\n\n\n")
                }
            }
            "3" -> {
                println("=================================")
                println("Goodbye!")
                return
            }
            else -> {
                println("\n\n\n")
                println("=================================")
                println("Please select the correct option")
            }
        }
    }
}

fun buy(): String {
    while (true) {
        println("=================================")
        println("           CARD LIST           ")
        println("=================================")
        println("1. SILVER")
        println("2. GOLD")
        println("3. PLATINUM")
        println("=================================")
        println("4. Back")
        println("=================================")
        print("Select a Card or Menu : ")
        val bought = readLine()

        when (bought) {
            "1", "2", "3" -> {
                println("\n\n\n")
                val cardType = when (bought) {
                    "1" -> CardType.SILVER
                    "2" -> CardType.GOLD
                    else -> CardType.PLATINUM
                }
                println("=================================")
                println("           CARD INFO             ")
                println("=================================")
                println(cardType.getCreditInfo())
                println("=================================")
                println("1. Get")
                println("2. Back")
                println("=================================")
                print("Select an option : ")
                val pick = readLine()

                when (pick) {
                    "1" -> {
                        println("\n\n\n")
                        println("Successfully Change The Card")
                        return cardType.getCreditInfo()
                    }
                    "2" -> {
                        println("\n\n\n")
                        // Return an empty string or some other appropriate value here.
                        return ""
                    }
                    else -> {
                        println("\n\n\n")
                        println("=================================")
                        println("Please choose the correct option")
                    }
                }
            }
            "4" -> {
                println("\n\n\n")
                // Return an empty string or some other appropriate value here.
                return ""
            }
            else -> {
                println("\n\n\n")
                println("=================================")
                println("Please select the correct option")
            }
        }
    }
}
