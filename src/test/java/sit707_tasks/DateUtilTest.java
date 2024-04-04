package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;



public class DateUtilTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s223746541";
		Assert.assertNotNull("Student ID is", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Gruhi";
		Assert.assertNotNull("Student name is", studentName);
	}

	@Test
	public void maximumJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void maximumJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void NominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("JanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	

	
	@Test
	public void MinimumJanuary1ShouldIncrementToJanuary2() {
		  DateUtil date = new DateUtil(1, 1, 2024);
		  System.out.println("MinJanuary1ShouldIncrementToJanuary2 > " + date);
		  date.increment();
		  System.out.println(date);
		  Assert.assertEquals(2, date.getDay());
		  Assert.assertEquals(1, date.getMonth());	}
	
	@Test
	public void MinimumJanuary1ShouldDecrementToDecember31() {
		  DateUtil date = new DateUtil(1, 1, 2024);
		  System.out.println("MinJanuary1ShouldDecrementToDecember31 > " + date);
		  date.decrement();
		  System.out.println(date);
		  Assert.assertEquals(31, date.getDay());
		  Assert.assertEquals(12, date.getMonth()); 
	}

	@Test
	public void MaximumFebruary29LeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024); 
	    System.out.println("MaxFebruary29LeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumFebruary28NonLeapYearShouldDecrementToFebruary27() {
	    DateUtil date = new DateUtil(28, 2, 2023); 
	    System.out.println("MaxFebruary28NonLeapYearShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void MaximumFebruary29LeapYearShouldDecrementToFebruary28() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("MaxFebruary29LeapYearShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void MaximumMarch31ShouldIncrementToApril1() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("MaxMarch31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void MaximumMarch31ShouldDecrementToMarch30() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("MaxMarch31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void MaximumApril30ShouldIncrementToMay1() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("MaxApril30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumApril30ShouldDecrementToApril29() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("MaxApril30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void NominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("NominalApril > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(4, date.getMonth());
	}
	@Test
	public void MaximumMay31ShouldIncrementToJune1() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("MaxMay31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumMay31ShouldDecrementToMay30() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("MaxMay31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void NominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("NominalMay > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(5, date	.getMonth());
	}
	@Test
	public void MaximumJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("MaxJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumJune30ShouldDecrementToJune29() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("MaxJune30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void nominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("NominalJune > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(6, date.getMonth());
	}
	@Test
	public void MaximumJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("MaxJuly31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumJuly31ShouldDecrementToJuly30() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("MaxJuly31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void NominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("NominalJuly > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(7, date.getMonth());
	}
	@Test
	public void MaximumAugust31ShouldIncrementToSeptember1() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("MaxAugust31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumAugust31ShouldDecrementToAugust30() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("MaxAugust31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void NominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("NominalAugust > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(8, date.getMonth());
	}
	@Test
	public void MaximumSeptember30ShouldIncrementToOctober1() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("MaxSeptember30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumSeptember30ShouldDecrementToSeptember29() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("MaxSeptember30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void NominalSeptember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
	    System.out.println("NominalSeptember > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay()); 
	    Assert.assertEquals(9, date.getMonth());
	}
	@Test
	public void MaximumOctober31ShouldIncrementToNovember1() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("MaxOctober31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumOctober31ShouldDecrementToOctober30() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("MaxOctober31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void NominalOctober() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
	    System.out.println("NominalOctober > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	    Assert.assertEquals(10, date.getMonth());
	}
	@Test
	public void MaximumNovember30ShouldIncrementToDecember1() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("MaxNovember30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumNovember30ShouldDecrementToNovember29() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("MaxNovember30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void NominalNovember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(31); 
	    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
	    System.out.println("NominalNovember > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(rand_day_1_to_30 + 1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	@Test
	public void MaximumDecember31ShouldIncrementToJanuary1() {
	  DateUtil date = new DateUtil(31, 12, 2024);
	  System.out.println("MaxDecember31ShouldIncrementToJanuary1 > " + date);
	  date.increment();
	  System.out.println(date);
	  Assert.assertEquals(1, date.getMonth());
	  Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void MaximumDecember31ShouldDecrementToDecember30() {
	  DateUtil date = new DateUtil(31, 12, 2024);
	  System.out.println("MaxDecember31ShouldDecrementToDecember30 > " + date);
	  date.decrement();
	  System.out.println(date);
	  Assert.assertEquals(30, date.getDay());
	  Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void NominalDecember() {
	  int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	  DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
	  System.out.println("NominalDecember > " + date);
	  date.increment();
	  System.out.println(date);
	  Assert.assertEquals(rand_day_1_to_31 + 1, date.getDay()); 
	  Assert.assertEquals(12, date.getMonth());
	} 

	 @Test
	
	  public void IncrementJanuary1st2024() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("IncrementJanuary1st2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune2nd1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("IncrementJune2nd1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune30th1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("IncrementJune30th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune31th1994() {
	    DateUtil date = new DateUtil(29, 6, 1994);
	    System.out.println("IncrementJune31th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear()); 
	  }
	
	 @Test
	  public void IncrementJan15th1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("IncrementJan15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementFab15th1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("IncrementFab15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementDec15th1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("IncrementDec15th1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune15th1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("IncrementJune15th1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune15th1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("IncrementJune15th1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune15th2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("IncrementJune15th2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	  }
	
	 @Test
	  public void IncrementNov28th2022() {
	    DateUtil date = new DateUtil(28, 11, 2022);
	    System.out.println("IncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2022, date.getYear());
	  }
	
	 @Test
	  public void IncrementFab28th2020() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    System.out.println("IncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	  }
	
	 @Test
	  public void IncrementJune15th2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("IncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	 }
	 
	 @Test
	  public void IncrementJune28th2016() {
	    DateUtil date = new DateUtil(29, 2, 2016);
	    System.out.println("IncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2016, date.getYear());
	 }
	 
	 @Test
	  public void IncrementJune27th2017() {
	    DateUtil date = new DateUtil(28, 2, 2017);
	    System.out.println("IncrementJune15th2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2017, date.getYear());
	 }
	 
	
}
