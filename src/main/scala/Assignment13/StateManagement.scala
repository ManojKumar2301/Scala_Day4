package Assignment13

class BankAccount {
  private var balance: Double = 0.0
  def deposit(amount: Double): Unit = balance += amount

  def withdraw(amount: Double): Boolean =
    if (amount <= balance) {
      balance -= amount
      true
    }
    else {
      false
    }

  def getBalance: Double = balance
}

object StateManagement extends App{
  private val account = new BankAccount
  account.deposit(100)
  println(account.withdraw(50))
  println(account.getBalance)
  println(account.withdraw(100))
}
