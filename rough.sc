


def operationList(inputList: List[Int], operation: String, listFunction: (Int,Int) => Int): Int = {

  def performFuntion(inputList: List[Int], operation: String, listFunction: (Int,Int) => Int,result: Int): Int= {

    inputList match {
      case Nil  => -1
      case head :: Nil => listFunction(head, result)
      case head :: tail => performFuntion(tail, operation, listFunction, listFunction(head, result))
      case _ => -1
    }
  }

  operation match {
    case "sum" => performFuntion(inputList,operation,listFunction,0)
    case "product" => performFuntion(inputList,operation,listFunction,1)



  }
}

operationList(List(1,2,3,4),"product",(a,b) => {if(a<b) b else a})
