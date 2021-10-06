case class UserName(name: String)
case class Password(hash: String)

/*
  ユニオン型? 共同型?

  | を使うことで両方の型が入るようになっている？
  Anyを使わずに実装できるので型の安全性は上がりそう？
*/
def help(id: UserName | Password) =
  val user = id match
    case UserName(name) => name
    case Password(hash) => hash
