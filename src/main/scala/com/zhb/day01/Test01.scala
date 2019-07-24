package com.zhb.day01

/**
  * @progrom StudyJava
  * @Description TODO
  * @Author rainboz
  * @Date 2019-07-22 下午3:26
  *
  */
object Test01 {
  def main(args: Array[String]): Unit = {
    //print("姓名\t年龄\t籍贯\t住址\n")
    //print("john\t12\t河北\t北京")
    //funcation1()
    //println(funcation2(funcation3, 10))
    //println("multiplier(1) value = " + multiplier(1))
    //println("multiplier(2) value = " + multiplier(2))
  }
  def funcation1(): Unit = {
    //使用+
    var name: String = "zhb"
    var sal: Double = 0.1
    println("hello" + sal + name)

    //使用格式化方式printf(类C)
    printf("name=%s sal=%f\n", name, sal)

    //使用$引用方式输出变量（类php）
    println(s"第三种方式 name=$name sal = ${sal + 1}")
  }
  /* 高阶函数funcation2() 函数使用了另外一个函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v：
   * 这里我们引入一个自由变量 factor，这个变量定义在函数外面。
   * 这样定义的函数变量 multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
   */
  def funcation2(f: Int => String, v: Int) = f(v)
  def funcation3[A](x: A) = "[" + x.toString() + "]"

  //匿名函数
  var factor = 3
  val multiplier = (i: Int) => i * factor

  var arr1 = Array[Int](3)
  println(arr1(0))
}
