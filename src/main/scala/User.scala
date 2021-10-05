/*
  new キーワードなしでインスタンス化できるようになった

  通常クラスでもapplyメソッドを
    持つコンパニオンオブジェクトが自動生成されるようになった
*/

class Student(name: String, Age: Int)

def create: Student = Student("a", 1)

@main def run(): Unit =
  println(create)