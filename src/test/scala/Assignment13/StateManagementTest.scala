package Assignment13

import org.scalatest.funsuite.AnyFunSuite

class StateManagementTest extends AnyFunSuite {

  test("deposit should increase the balance") {
    val account = new BankAccount
    account.deposit(100)
    assert(account.getBalance == 100.0)
  }

  test("withdraw should decrease the balance when funds are sufficient") {
    val account = new BankAccount
    account.deposit(200)
    assert(account.withdraw(50))
    assert(account.getBalance == 150.0)
  }

  test("withdraw should fail when funds are insufficient") {
    val account = new BankAccount
    account.deposit(50)
    assert(!account.withdraw(100)) // Should return false
    assert(account.getBalance == 50.0) // Balance should remain unchanged
  }

  test("multiple transactions should update the balance correctly") {
    val account = new BankAccount
    account.deposit(300)
    assert(account.withdraw(100))
    assert(account.withdraw(50))
    assert(account.getBalance == 150.0)
  }
}

