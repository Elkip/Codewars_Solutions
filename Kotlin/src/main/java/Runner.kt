fun twoOldestAges(ages: List<Int>): List<Int> =
        ages.sorted().takeLast(2)


/*
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure)
that checks whether the two arrays have the "same" elements, with the same
multiplicities. "Same" means, here, that the elements in b are the elements
in a squared, regardless of the order.


 */
fun comp(a: IntArray?, b: IntArray?): Boolean =
        if (a == null || b == null) false
        else (b.subtract(a.map { it -> it * it }).isEmpty() && b.isNotEmpty()) || (a == b)
