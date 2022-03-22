// getter/setter
class Book() {
    var title : String = "모름"
        get() {
            println("Getter is Called")
            return field
        }
        set(value) {
            println("Setter is Called")
            field = value
        }
}
//val book = Book()
//println(book.title)
//book.title = "촤하하"
//println(book.title)

// lateinit
class Book2() {
    lateinit var title : String

    fun nextPage() {
        if(::title.isInitialized){
            println("페이지 넘어감")
        } else {
            println("초기화 필요")
        }
    }

}
val book = Book2()
book.title = "책 이름"
println(book.nextPage())

// Lazy
// - 호출시점에 by lazy 정의에 의해서 초기화 수행한다
// - val에서만 사용 가능하다
class Book3 {
    val title: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다
        println("lazy 초기화")
//        title = "책 제목"    -> X
//        return "책 제목"     -> X
        "책 제목"
    }
}
val book3 = Book3()
println(book3.title)