package week1.ex2

class ParenthesisBalancing {

  def balance(chars: List[Char]): Boolean = {
	def checkBalance(substring: List[Char], count: Int): Boolean = 
	{
	  if (count < 0) {
		  false
	  }
	  else {
		  if(substring == Nil) {
		    count == 0
		  }
		  else {
			var char: Char = substring(0);
			var newString: List[Char] = substring.tail;
			char match {
			  case '(' => checkBalance(newString, count+1) 
			  case ')' => checkBalance(newString, count-1)
			  case _ => checkBalance(newString, count)
			}
		  }
	  }
	}
    checkBalance(chars, 0);
  }

}