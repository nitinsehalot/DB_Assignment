package assignment;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestCheckVersion {
	
	// Check with lower version
	@Test
	public void TestCheckVersion1(){

		VersionCheck vc = new VersionCheck();
		  boolean thrown = false;

		  try {
			  vc.isCorrectVersion(1);
		  } catch (VersionException e) {
		    thrown = true;
		    System.out.println(thrown);
		  }

		  assertTrue(thrown);	
	}
	
	//Check with higher version
	@Test
	public void TestCheckVersion2(){

		VersionCheck vc = new VersionCheck();
		Assert.assertEquals(true, vc.isCorrectVersion(2));
	
		  	}
}