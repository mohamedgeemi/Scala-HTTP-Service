import org.scalatest.FunSuite

class ProblemsTest extends FunSuite {

  test("Problems.factiorial"){
    assertThrows[IllegalArgumentException](Problems.factiorial(-5))
    assert(Problems.factiorial(0) === 1)
    assert(Problems.factiorial(1) === 1)
    assert(Problems.factiorial(7) === 5040)
    assert(Problems.factiorial(10) === 3628800)
  }

  test("Problems.isPalindrome"){
    assertThrows[IllegalArgumentException](Problems.isPalindrome(null))
    assert(Problems.isPalindrome("") === true)
    assert(Problems.isPalindrome("anna") === true)
    assert(Problems.isPalindrome("apple") === false)
    assert(Problems.isPalindrome("elmenus") === false)
    assert(Problems.isPalindrome("oopoo") === true)
  }

  test("Problems.runLengthEncoding"){
    assertThrows[IllegalArgumentException](Problems.runLengthEncoding(null))
    assertThrows[IllegalArgumentException](Problems.runLengthEncoding(""))
    assert(Problems.runLengthEncoding("aaaaaaaaaabbbaxxxxyyyzyx") === "a10b3a1x4y3z1y1x1")
    assert(Problems.runLengthEncoding("cccccvvvvbbbnnm") === "c5v4b3n2m1")
  }

  test("Problems.runLenghtDecoding"){
    assertThrows[IllegalArgumentException](Problems.runLengthEncoding(null))
    assertThrows[IllegalArgumentException](Problems.runLengthEncoding(""))
    assert(Problems.runLenghtDecoding("a10b3a1x4y3z1y1x1") === "aaaaaaaaaabbbaxxxxyyyzyx")
    assert(Problems.runLenghtDecoding("c5v4b3n2m1") === "cccccvvvvbbbnnm")
  }

  test("Problems.compose"){
    assert(Problems.compose(6) === 49)
    assert(Problems.compose(10) === 121)
  }

}
