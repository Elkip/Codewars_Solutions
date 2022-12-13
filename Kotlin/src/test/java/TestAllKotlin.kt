import kotlin.test.assertEquals
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestExample {

    @Test
    fun test1() {
        val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val a2 = intArrayOf(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)

        assertTrue(comp(a1, a2))
    }
    @Test
    fun test2() {
        val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val b = intArrayOf(132, 14641, 20736, 361, 25921, 361, 20736, 361)

        assertFalse(comp(a, b))
    }
    @Test
    fun test3() {
        val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val b = intArrayOf(121, 14641, 20736, 36100, 25921, 361, 20736, 361)

        assertFalse(comp(a, b))
    }

    @Test
    fun test4() {
        val a = intArrayOf(40, 53, 25, 45, 84)
        val b = intArrayOf(1600, 2809, 625, 2025, 7056)

        assertTrue(comp(a, b))
    }

    @Test
    fun test5() {
        val a = intArrayOf()
        val b = intArrayOf()

        assertTrue(comp(a, b))
    }
}