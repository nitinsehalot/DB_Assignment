package assignment;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TradeJpaModel {
	
	@Entity
	 public static class Trade {

		private String tradeId;
		private Integer version;
		private String counterPartyId;
		private String bookId;
		private Date maturityDate;
		private Date createdDate;
		private String expired;
		
		@Id
		public String getTradeId() {
			return tradeId;
		}

		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}
		@Column
		public Integer getVersion() {
			return version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}
		@Column
		public String getCounterPartyId() {
			return counterPartyId;
		}

		public void setCounterPartyId(String counterPartyId) {
			this.counterPartyId = counterPartyId;
		}
		@Column
		public String getBookId() {
			return bookId;
		}

		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		@Column
		public Date getMaturityDate() {
			return maturityDate;
		}

		public void setMaturityDate(Date maturityDate) {
			maturityDate = maturityDate;
		}
		@Column
		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		@Column
		public String getExpired() {
			return expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}
	}
}
