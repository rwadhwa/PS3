package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.InsufficientFundsException;

public class AccountTest {
	Account accountTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		accountTest = new Account(1122,20000);
	}

	@After
	public void tearDown() throws Exception {
		accountTest=null;
	}
	@Test
	public void testDeposit(){
		accountTest.deposit(30000);
		assertTrue(accountTest.getBalance()==20000.0+30000.0);
}
	@Test
	public void testWithdraw() throws InsufficientFundsException{
		accountTest.withdraw(2500);
		assertTrue(accountTest.getBalance()==20000.0-2500.0);

}
	
}