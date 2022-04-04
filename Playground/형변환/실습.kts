// 기본 자료형의 타입 캐스팅
val number: Int = 10
val numberString : String = number.toString()
val stringToNumber: Int = numberString.toInt()
println(numberString)
println(stringToNumber)

val numberFloat: Double = 9.7
val numberFlostString: String = numberFloat.toString()
val numberFloatInt : Int = numberFloat.toInt()
println(numberFlostString)
println(numberFloatInt)
// -> to타입이 오는 함수를 이용해서 형변환

// 상속한 클래스간의 캐스팅
open class Warrior1(var name: String, var power: Int, var type: String) { // 부모클래스, 슈퍼클래스
    fun attack() {
        println("복잡한 코드 + 공격")
    }
}

class DefenseWarrior1(name: String, power: Int): Warrior1(name, power, "고블린") {
    fun defense() {
        println("방어")
    }
}

// is
// - 타입 체크
// - true, false가 리턴됨
// - 스마트 캐스팅
// - var은 불가능 -> val로 생성해야함
val warrior: Warrior1 = DefenseWarrior1("방어형 전사", 100)
println(warrior.attack())
//warrior.defense() -> 불가능. defense 함수를 포기하고 Warrior가 된 상태
if (warrior is DefenseWarrior1) {
    println("YES")
    // 스마트 캐스팅
    // -> 내가 만든 warrior를 if 블록 안에서는 defenseWarrior로 사용하게 해준다
    warrior.defense()
}

// as
// - 지정한 타입으로 캐스팅을 시도, 불가능한 경우 예외 발생
val warrior2 : DefenseWarrior1 = warrior as DefenseWarrior1
warrior2.defense()