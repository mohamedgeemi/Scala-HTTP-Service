object Problems {

  def factiorial(num: BigInt, result: BigInt = 1): BigInt = {
    require(num >= 0, "Your number must be positive")

    if (num == 0)
      result
    else
      factiorial(num-1, result*num)
  }

  def isPalindrome(str: String): Boolean = {
    require(str != null, "Your string can not be null")

    if(str.isEmpty)
      return true
    var result: Boolean = str == str.reverse
    return result
  }

  def runLengthEncoding(str: String): String = {
    require(str != null && !str.isEmpty, "Your string can not be null or empty")

    (1 until str.size).foldLeft((1, str(0), new StringBuilder)) {
      case ((len, char, strbuilder), index)
        if char != str(index) =>  strbuilder.append(char); strbuilder.append(len); (1, str(index), strbuilder)
      case ((len, char, strbuilder), _) => (len + 1, char, strbuilder)
    } match {
      case (len, char, strbuilder) => strbuilder.append(char); strbuilder.append(len);  strbuilder.toString
    }
  }

  def runLenghtDecoding(str: String): String = {
    require(str != null && !str.isEmpty, "Your string can not be null or empty")

    val strbuilder = new StringBuilder
    val Code = """([A-Za-z])(\d+)""".r
    for (Code(char, len) <- Code findAllIn str)
      strbuilder.append(char * len.toInt)
    strbuilder.toString
  }

  def compose(a:Int): Int = {
    var result = square(addOne(a))
    return result
  }

  def addOne(a: Int): Int = {
    a+1
  }
  def square(s: Int): Int = {
    s*s
  }
}
