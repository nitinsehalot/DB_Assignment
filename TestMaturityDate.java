package assignment;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class TestMaturityDate {
	
	//Test with less MaturityDate
	@Test
	public void TestBeforeMaturityDate(){

		MaturityDate md = new MaturityDate();
		Assert.assertEquals(true, md.MaturityDate(new Date()));
	
		  	}
}
