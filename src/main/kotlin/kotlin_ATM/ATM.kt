package kotlin_ATM

import java.util.*

//原始密码
var password=123456
//卡中原始钱物
var money=1000

fun main() {
   welcome()
   var passwordwrong=loginATM()
   if (passwordwrong){
       while (true){
           //显示登陆后的界面
           println("****************")
           println("    1.取款")
           println("    2.存款")
           println("    3.修改密码")
           println("    4.退出")
           println("****************")

           //用户进行操作
           val scanner= Scanner(System.`in`)
           print("请输入您的操作:")
           var res=scanner.nextInt()
           var ishefa=iswhat(res)
           if (ishefa){113
               println("操作成功！！！")
               if (res==4){
                  out()
                   return
               }
           }else{
               println("操作不合法！！请重新操作！！")
               continue
           }
       }


   } else{
       out()
   }
}


//欢迎界面
fun welcome(){
    println("****************")
    println("     欢迎使用     ")
    println("****************")
}

//退出界面
fun out(){
    println("****************")
    println("   感谢您的使用    ")
    println("****************")
}

//提示输入密码以及判断密码是否输入正确
fun loginATM(): Boolean {
    var wrongtime=0
    while (true){
        print("请输入密码：")
        var scanner=Scanner(System.`in`)
        var pw=scanner.nextInt()
        if (pw==password) {
            return true
        }
        else{
            wrongtime=wrongtime+1
            if (wrongtime==3){
                println("此卡已冻结 请联系客服！")
                return false
            }else{
                print("密码错误  ")
            }
        }
    }
}

//判断用户是否正确操作
fun iswhat(res:Int): Boolean {
    var re=true
    when(res){
        1 ->outmoney()
        2 ->putmoney()
        3->setpassword()
        4-> {loginout()
        }
        else->{println("操作不合法！请重新操作")
              re=false
        }
    }
    return re
}

//取款操作
fun outmoney(){
    var outmoney=0
    while (true){
        print("请输入取款金额:")
        var scanner=Scanner(System.`in`)
        outmoney=scanner.nextInt()
        if (outmoney> money){
            print("余额不足  ")
        }else{
            money= money-outmoney
            println("取款成功！！！ 余额为:$money")
            break
        }
    }
}

//存款操作
fun putmoney(){
    var putmoney=0
    print("请输入存款金额:")
    var scanner=Scanner(System.`in`)
    putmoney=scanner.nextInt()
    money= money+putmoney
    println("当前余额为:$money")
}

//修改密码操作
fun setpassword(){
    var pw=0
    var newpassword=0
    var newpw=0
    var scanner=Scanner(System.`in`)
    while (true) {
        print("请输入原始密码:")
        pw = scanner.nextInt()
        //判断原始密码是否正确
        if (password != pw) {
            print("密码错误 ")
        } else {
            break
        }
    }
        while (true){
            //输入新密码
            print("请输入新密码:")
            newpw=scanner.nextInt()
            print("请重新确认新密码:")
            newpassword=scanner.nextInt()
            //判断两次密码是否一致
            if (newpassword==newpw){
                password=newpassword
                println("密码修改成功！！！")
                break
            }else{
                print("两次密码不一致！！！")
            }
        }

  }

//退出登陆
fun loginout(){
     return
}
