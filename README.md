## Scala3の勉強  
https://docs.scala-lang.org/scala3/reference/overview.html

### 削除された機能
パッと分かるものはまとめる

- DelayedInitトレイト
  - ここにあったAppトレイトは使用しない方が良い?
  - mainメソッドは、@mainを使う
- do-while
  - 代わりに違う書き方があるよう
  - そもそもそんなに使わないイメージ
- メソッドの書き方
  - 返りの型を明示せずに描こうとするのは完全にダメになった
  - 型を明示するか、= {} にすればOK
- パッケージオブジェクト
  - 非推奨かつ後々削除される
  - classやobjectに内包しなくてもメソッドなどが書けるようになったことが要因っぽい
- タプルと関数の22制限がなくなった
- 引数なしメソッドを作成したとき、()をつけたのであれば呼び出す側は()をつけないといけない
  - Scala2もそうでなかったっけ？
- private[this]とprotected[this]の廃止

### implicit
どう置き換わったのか(?)
変わってないものもあるかもしれないがScala2のimplicitの機能を書き記す

- enrich my library → extension
- implicit conversion(暗黙的な型変換) → given Conversionを使う
- implicit parameter
  - オブジェクトを渡す時の
  - 型クラス

## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).
