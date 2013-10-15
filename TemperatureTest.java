/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.
  
	
   @Test
   public void test_Kelvin (){
      Temperature kelvinTemperature = new Temperature (0,Temperature.units.KELVIN);
      assertEquals(Temperature.Units.KELVIN,kelvinTemperature.getUnits());
   }

   @Test
   public void getUnitsTestForCELSIUS(){
 	  Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	  assertEquals(Temperature.Units.CELSIUS, celciusTemperature.getUnits() );
   }
   
   public void getUnitsTestForFAHRENHEIT(){
		  Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
		  assertEquals(Temperature.Units.FAHRENHEIT, fahrenheitTemperature.getUnits());
	  }
	 
   
}
