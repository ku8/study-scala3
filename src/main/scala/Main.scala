/*
  コマンドラインから呼び出す新たな方法が@mainアノテーション
  
  mainメソッドではインスタンスの生成ができないっぽい
*/
@main def hello: Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

/*
  これでも実行できるから、@mainもあるくらいでOKだろうか？
  Appは今後非推奨になるっぽい？
*/
object Run extends App{
  println("Hello world!")
  println(msg)

  def msg = "I was compiled by Scala 3. :)"
}

/*
  メソッドに引数を持たせることも可能

  コンパイルすると、下記のように呼び出すことができるプログラムが生成される

  $ scala happyBirthday 23 Lisa Peter
  Happy 23rd Birthday, Lisa and Peter!

*/
@main def happyBirthday(age: Int, name: String, others: String*) =
  val suffix = (age % 100) match
    case 11 | 12 | 13 => "th"
    case _ => (age % 10) match
      case 1 => "st"
      case 2 => "nd"
      case 3 => "rd"
      case _ => "th"

  val sb = StringBuilder(s"Happy $age$suffix birthday, $name")
  for other <- others do sb.append(" and ").append(other)
  sb.toString


/*
  @mainの挙動
    コンパイルする
    @mainメソッドが見つかったパッケージにfという名前のクラスを生成する
    このクラスには、Javaメインメソッド(引数にArray[String]を持ちUnitで返す) のが存在する

    happyBirthdayメソッドは、下記のように追加される
*/

//final class happyBirthday {
//  import scala.util.{CommandLineParser as CLP}
//  <static> def main(args: Array[String]): Unit =
//    try
//    happyBirthday(
//    CLP.parseArgument[Int](args, 0),
//    CLP.parseArgument[String](args, 1),
//    CLP.parseRemainingArguments[String](args, 2))
//    catch {
//  case error: CLP.ParseError => CLP.showError(error)
//  }
//  }