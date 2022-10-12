fun main(args: Array<String>) {
    println("Введите сторону А")
    var sideA = readLine()!!.toInt()
    println("Введите сторону B")
    var sideB = readLine()!!.toInt()
    println("Введите сторону C")
    var sideC = readLine()!!.toInt()
    var text = "формула v=a*b*c"
    var result = sideA * sideB * sideC
    println(text)
    println("ответ:" + result)
}