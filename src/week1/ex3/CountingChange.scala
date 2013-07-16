package week1.ex3

class CountingChange {
	def countChange(money: Int, coins: List[Int]): Int = {

	  def count(moneyToReturn: Int, availableCoins: List[Int]): Int = {
	    if (moneyToReturn == 0) 1
	    else if (moneyToReturn < 0) 0
	    else if (availableCoins.isEmpty && moneyToReturn>=1) 0
	    else count(moneyToReturn, availableCoins.tail) + count(moneyToReturn - availableCoins.head, availableCoins)
	  }
	  
	  count(money, coins);
	  
	}
}