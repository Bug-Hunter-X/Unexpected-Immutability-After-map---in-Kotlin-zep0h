# Unexpected Immutability After map() in Kotlin

This example highlights a potential source of confusion for Kotlin developers new to functional programming and collection manipulation.  The `map` function in Kotlin returns an immutable list by default. This can lead to unexpected behavior if you attempt to modify the result directly.

The provided code demonstrates different ways to handle mapping and modifying a list.  The example showcases the use of `toMutableList()` and `mapTo()` to achieve mutability after the mapping operation.

## How to reproduce:

1.  Run the `bug.kt` file.
2.  Observe the different outputs for `doubledList`, `doubledList2`, and `doubledList3`. Note how only `doubledList2` and `doubledList3` allow for addition of elements after being mapped.

## How to solve:

Refer to `bugSolution.kt` for a solution using `toMutableList()` or `mapTo()` to create a mutable list.