// https://zenn.dev/ababup1192/articles/29c7b3d4bf74bd

/*
  extension を使うことで、既存の型にメソッドを追加することが可能
  ただ、メソッドの予測変換では出てこない?
*/

extension (s: String)
  def smile: String = s + " :)"

@main def run2() =
  println("Hello".smile)