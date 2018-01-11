import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  val firstMember = 10
  val secondMember = 20
  val thirdMember = 30
  val fourthMember = 40
  val inputListOne = List(firstMember, secondMember, thirdMember, fourthMember)
  log.info(s"Sum of Cube ${Operations.highOrderFunctionSum(Operations.sumOfCube, firstMember, secondMember)}")
  log.info(s"Sum of Square ${Operations.highOrderFunctionSum(Operations.sumOfSquare, firstMember, secondMember)}")
  log.info(s"Sum of Int${Operations.highOrderFunctionSum(Operations.sumOfInt, firstMember, secondMember)}")
  log.info(s"Sum of List $inputListOne is ${Operations.operationList(inputListOne, "sum", Operations.sum)}")
  log.info(s"Product of List $inputListOne is ${Operations.operationList(inputListOne, "product", Operations.product)}")
  log.info(s"Max Element of List $inputListOne is ${Operations.operationList(inputListOne, "max", Operations.max)}")


}
