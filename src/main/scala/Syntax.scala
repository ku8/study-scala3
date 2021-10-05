class Syntax {

  /*
    ()を省略することが可能になった

    ifは、()をなくす代わりにthenが必要
  */
  val x = 1
  if x % 2 == 0 then println("偶数") else println("奇数")

  // 元々1
  if(x % 2 == 0) println("偶数") else println("奇数")

  //元々2
  if(x % 2 == 0){
    println("偶数")
  } else {
    println("奇数")
  }

  /*
    forはdoが必要
  */
  for
    x <- Option(1)
    y <- Option(2)
  do
    x + y

  // 元々1
  for {
    x <- Option(1)
    y <- Option(2)
  } x + y


}
