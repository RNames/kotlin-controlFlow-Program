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
    var num: String?

    do {
        println("=================================")
        println("              MENU               ")
        println("=================================")
        println("1. View Card List & Buy Card")
        println("2. View Your Card")
        println("3. Exit")
        println("=================================")
        print("Pick a menu : ")
        num = readLine()

        when (num) {
            "1" -> {
                println("\n\n\n")
                creditLimit = buy()
            }
            "2" -> {
                if (creditLimit == ""){
                    println("\n\n\n")
                    println("Please Get Your Card First")
                }else {
                    println("\n\n\n")
                    println("=================================")
                    println("           Your Card")
                    println("=================================")
                    println(creditLimit)
                    println("=================================")
                    println("press any button to continue")
                    readln()
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
    } while (true)
}

fun buy(): String {
    var buyCredit = ""
    var bought: String?
    var pick: String?

    do {
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
        bought = readLine()

        when (bought) {
            "1" -> {
                println("\n\n\n")
                println("=================================")
                println("           CARD INFO             ")
                println("=================================")
                println(CardType.SILVER.getCreditInfo())
                println("=================================")
                println("1. Get")
                println("2. Back")
                println("=================================")
                print("Select an option : ")
                pick = readLine()

                when (pick) {
                    "1" -> {
                        println("\n\n\n")
                        println("Successfully Change The Card")
                        buyCredit = CardType.SILVER.getCreditInfo()
                        return buyCredit
                    }
                    "2" -> {
                        println("\n\n\n")
                        buy()
                    }
                    else -> {
                        println("\n\n\n")
                        println("=================================")
                        println("Please choose the correct option")
                        buy()
                    }
                }
            }
            "2" -> {
                println("\n\n\n")
                println("=================================")
                println("           CARD INFO             ")
                println("=================================")
                println(CardType.GOLD.getCreditInfo())
                println("=================================")
                println("1. Get")
                println("2. Back")
                println("=================================")
                print("Select an option : ")
                pick = readLine()

                when (pick) {
                    "1" -> {
                        println("\n\n\n")
                        println("Successfully Change The Card")
                        buyCredit = CardType.GOLD.getCreditInfo()
                        return buyCredit
                    }
                    "2" -> {
                        println("\n\n\n")
                        buy()
                    }
                    else -> {
                        println("\n\n\n")
                        println("=================================")
                        println("Please choose the correct option")
                        buy()
                    }
                }            }
            "3" -> {
                println("\n\n\n")
                println("=================================")
                println("           CARD INFO             ")
                println("=================================")
                println(CardType.PLATINUM.getCreditInfo())
                println("=================================")
                println("1. Get")
                println("2. Back")
                println("=================================")
                print("Select an option : ")
                pick = readLine()

                when (pick) {
                    "1" -> {
                        println("\n\n\n")
                        println("Successfully Change The Card")
                        buyCredit = CardType.PLATINUM.getCreditInfo()
                        return buyCredit
                    }
                    "2" -> {
                        println("\n\n\n")
                        buy()
                    }
                    else -> {
                        println("\n\n\n")
                        println("=================================")
                        println("Please choose the correct option")
                        buy()
                    }
                }
            }
            "4" -> {
                println("\n\n\n")
                return "" // Return an empty string or some other appropriate value here.
            }
            else -> {
                println("\n\n\n")
                println("=================================")
                println("Please select the correct option")
            }
        }
    } while (true)

}
