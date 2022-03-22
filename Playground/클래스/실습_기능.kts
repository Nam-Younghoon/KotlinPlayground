class FootballPlayer constructor(uniform: String, ball: String) {
    val uniform: String
    val ball: String

    init {
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        println("킥")
    }

    fun pass() {
        println("패스")
    }
}

val footballPlayer = FootballPlayer("파란색", "축구공")
footballPlayer.kick()