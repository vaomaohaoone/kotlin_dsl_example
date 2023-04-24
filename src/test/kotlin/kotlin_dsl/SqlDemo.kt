package kotlin_dsl

import kotlin_dsl.kotlin_dsl.selectQuery
import org.junit.Test

class SqlDemo {

    @Test
    fun test() {
        val result = selectQuery {
            select("user_name", "birthday")
            from("users")
            where {
                "user_name" eq "Alex"
                and { "birthday" eq "01.02.2017" }
            }
        }.build()
        println(result)

    }
}