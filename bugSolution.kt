fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    //Using toMutableList() to create mutable list after map operation
    val doubledList = list.map { it * 2 }.toMutableList()
    doubledList.add(12)
    println(doubledList) // Output: [2, 4, 6, 8, 10, 12]

    //Using mapTo to create mutable list directly
    val doubledList2 = list.mapTo(mutableListOf()) { it * 2 }
    doubledList2.add(12)
    println(doubledList2) // Output: [2, 4, 6, 8, 10, 12]
}