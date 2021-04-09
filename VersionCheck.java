package assignment;

import java.util.Date;

import assignment.TradeJpaModel.Trade;

public class VersionCheck {
	
	TradeModel tm = new TradeModel();

	public boolean isCorrectVersion(Integer version){

		if(tm.getVersion() != null && tm.getVersion() != 0 && tm.getVersion() > version){
			
			try{
		throw new VersionException("Lower version received..!!");  
		
			}catch(VersionException e){
				return true;
			}
		}
		
		else{
			
			//Need to write code to update existing data using JPA
			
			Trade trade = new Trade();
			trade.setBookId("bookId");
			trade.setCounterPartyId("counterPartyId");
			trade.setCreatedDate(new Date());
			trade.setExpired("expired");
			trade.setMaturityDate(new Date());
			trade.setTradeId("");
			trade.setVersion(version);
			
			return true;
		}
	}
}


