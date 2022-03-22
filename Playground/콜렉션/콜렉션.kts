val numbers = listOf<Int>(1,2,3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(3))
println(numbers.last())

val number2 = mutableListOf<Int>(1,2,3)
number2.add(50)
println(number2)
number2.removeAt(0)
println(number2)
number2.addAll(2, listOf<Int>(100, 100))
println(number2)



// Set
val number3 = setOf<Int>(1,1,1,3,3,4)
println(number3.contains(5))
println(number3.containsAll(setOf<Int>(1,3)))

val number4 = mutableSetOf<Int>(1,1,1,3,3,4)
number4.remove(1)
println(number4)

// Map
val number5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(number5.keys)
println(number5.values)
println(number5.size)
println(number5.get(1))
println(number5[2])
println(number5.getOrDefault(1, "error"))

val number6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))