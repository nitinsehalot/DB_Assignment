package assignment;

import java.util.Date;

import assignment.TradeJpaModel.Trade;

public class MaturityDate {



	public Object MaturityDate(Date date) {

		Trade trade = new Trade();
		if (date.after(trade.getMaturityDate())) {
			return false;

		}
		else{
			
			//Automatically updating expired flag
			
			trade.setExpired("Y");
			
			//Need to write code to update existing data using JPA

			return true;
		}
	}
}


