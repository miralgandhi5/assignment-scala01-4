object Operations {

  def highOrderFunctionSum(sum: (Int, Int) => Int, valueOne: Int, valueTwo: Int): Int = sum(valueOne, valueTwo)

  def sumOfSquare(valueOne: Int, valueTwo: Int): Int = (valueOne * valueOne) + (valueTwo * valueTwo)

  def sumOfCube(valueOne: Int, valueTwo: Int): Int = (valueOne * valueOne * valueOne) + (valueTwo * valueTwo * valueTwo)

  def sumOfInt(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo

  def operationList(inputList: List[Int], operation: String, listFunction: (Int, Int) => Int): Int = {

    def performOperation(inputList: List[Int], listFunction: (Int, Int) => Int, result: Int): Int = {

      inputList match {
        case Nil => -1
        case head :: Nil => listFunction(head, result)
        case head :: tail => performOperation(tail, listFunction, listFunction(head, result))
        case _ => -1
      }

    }

    operation.toLowerCase match {
      case "sum" => performOperation(inputList, listFunction, 0)
      case "product" => performOperation(inputList, listFunction, 1)
      case "max" => performOperation(inputList, listFunction, 0)
      case _ => -1

    }
  }

  def sum(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo

  def product(valueOne: Int, valueTwo: Int): Int = valueOne * valueTwo

  def max(valueOne: Int, valueTwo: Int): Int = if (valueOne > valueTwo) valueOne else valueTwo


}

