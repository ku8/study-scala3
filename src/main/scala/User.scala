/*
  new キーワードなしでインスタンス化できるようになった

  通常クラスでもapplyメソッドを
    持つコンパニオンオブジェクトが自動生成されるようになった

  ただエディタの使う側では型がAnyになっている
    コンソールからだとちゃんと型になっている
*/

class Student(name: String, Age: Int)

@main def run(): Unit = {
  Student("a", 1)
}