// Scope
var number: Int = 1
fun changeNumber() {
    var internalNumber: Int = 2
    number = 20     // 하위 스코프에서 상위 멤버에 접근할 수 있다.
    var number : String = "재정의" // 하위 스코프에서 상위 멤버를 재정의 할 수 있다.
    println(number)
}
changeNumber()
println(number)
// internalNumber = 30 -> 상위 스코프에서 하위 스코프 멤버에 접근할 수 없다
// 하위 -> 상위로 접근 가능
// 상위 -> 하위로 접근 불가능 -> 사실상 하위는 독립적


// 접근제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100 // Numbers라는 스코프 안에 존재하기 때문에 number에 접근/변경할 수 있다
    }
    fun printNumber(): Int {
        return this.number
    }
}

val number2 = Numbers()
println(number2.printNumber())
//println(number2.number) // Numbers밖에 존재하기 때문에 number에 접근/변경 할 수 없다
//number2.number = 100 // Numbers밖에 존재하기 때문에 number에 접근/변경 할 수 없다
number2.changeNumber()
number2.printNumber()

// public -> 내가 포함되어 있는 범위 밖에서도 접근/변경 가능
// private -> 내가 포함되어 있는 범위 밖에서는 접근/변경 불가능
//         -> 내가 포함되어 있는 범위 안에서는 접근/변경 가능