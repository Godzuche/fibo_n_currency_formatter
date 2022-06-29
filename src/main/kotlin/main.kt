import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.sql.DriverManager.println
import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    fibo(10)
    val amount = readLine()?.toDoubleOrNull()
    val invalidInputMsg = "Invalid input"
    println(
        "Price = ${
            if (amount != null) {
                currencyFormatter(amount = amount)
            } else invalidInputMsg
        }"
    )
}

private fun fibo(num: Int) {
    var result = 0
    var a = 0
    var b = 0
    var c = 1
    for (i in 0 until num) {
        print("$result, ")
        result = c
        a = b
        b = c
        c = a + b
    }
}

private fun currencyFormatter(amount: Double): String {
    val numberFormat = NumberFormat.getCurrencyInstance(Locale.US)
    numberFormat.maximumFractionDigits = 0
    return numberFormat.format(amount)
}