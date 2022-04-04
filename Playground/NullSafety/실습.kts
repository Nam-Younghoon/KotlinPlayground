// ?
val number: Int = 10 // Non-Nullable
val number: Int? = null // Nullable

// !!
val nullableNumberList: List<Int?> = listOf<Int?>(1,2,3,null,null)
var result: Int = 0
nullableNumberList.forEach { i: Int? ->
    result += i!!
}
// -> 정말 필요한 경우에만 사용을 해야한다.