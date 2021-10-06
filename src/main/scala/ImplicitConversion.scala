/*
  givenとConversionを使用する必要がある

  Conversion[変換したい型, 変換後の型]

  _ は、変換したい型の値を表している（はず）

  同じ型変換があればコンパイルエラーになる
    Int → Booleanの定義が２つ
*/
given Conversion[Int, Boolean] with
  def apply(int: Int): Boolean = int < 0

// 省略形
//given Conversion[Int, Boolean] = _ < 0

@main def runConversion = if 1 then println(1 + 1) else println(1 - 1)