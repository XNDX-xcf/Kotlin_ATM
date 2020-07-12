# Kotlin_ATM
kotlin基本语法
*****************************8
import java.util.*

fun main() {
    /*
    //输出语句
    print("hollo")//不换行
    println("你好")//换行

    //输出变量
    val name="Avicii"
    println(name)
    //字符串模板
    println("my name is $name")
    //当输出的变量的值有多个部分组成使用 ${var}
    println("my name is $name lenght is ${name.length}")
    */

    /*
    //基本类型和变量的定义

    //var 定义变量
    //val 定义常量  常量的值不能再次改变

    //定义的时候指定类型
    val pi: Double=3.14
    //类型自动推导
    val name: String ="China"

    var temp=30
    var score=95.5

    //类型安全的语言 不一样的类型就不能赋值
    //通过Number提供的转换方法来实现转换
    score=temp.toDouble()
    */

    /*
    //if条件语句
    //普通的if语句
    var num =20
    if(num>10){

    }else{

    }

    //kotlin里面的if-else语句是一个表达式
    val result=if (num>10) "下载成功" else "下载失败"

    val res=if (num>10){
        println("$num>10")
        20
    }else{
        println("$num<=10")
        "失败"
    }

    //java中的问号表达式 1>2 ? a:b
    //判空表达式 ？:
    var school="西南大学"
    println(school)
    val resul=school.length ?: "没有内容"
    */

    /*
    //when语句
    val num=100

    //更简洁
    when(num){
        10-> println("10")
        20-> println("20")
        30-> println("30")
        40-> println("40")
        else-> println("其他")
    }

    //更灵活
    when(num){
        in 1..40-> println("Z")
        in 50..60-> println("B")
        in 60..70-> println("C")
        in 70..100-> println("A")
        else-> println("没有考试")
    }

    //更方便
   val res= when(num){
        in 1..40->"Z"
        in 50..60-> "B"
        in 60..70-> "C"
        in 70..100-> "A"
        else->"没有考试"
    }
    println("res is $res")


    //判断
    var tt
    when(tt){
        is String -> println("字符串")
        is Int -> println("整数")
        else -> println("其他")
    }
     */

    /*
    //for循环 使用step改变增量
    for (i in 1..10 step 3){
        println("$i")
    }

    for (i in 1 until 10 ){
        println("$i")
    }

    for (i in 10 downTo 1){
        println("$i")
    }

    val names= arrayOf("jake","rose","meccy")
    //一次获取一个item
    for (item in names){
        print("$item ")
    }
    //获取索引值
    for (i in names.indices){
        println(names[i])
    }
    //
    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }
    */

    //终端输入
    /*
    val input= readLine()
    println("你输入的内容是$input")
    */

    //使用scanner
    val scanner=Scanner(System.`in`)
    val num=scanner.nextInt()
    println("你输入的内容是$num")
}
