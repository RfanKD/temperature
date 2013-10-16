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
	
	//getUnit test for individual temperature unit
	// testing if acquired temperature unit is correct 
	
   @Test
   public void getUnitTest_Kelvin (){
      Temperature kelvinTemperature = new Temperature (0,Temperature.units.KELVIN);
      assertEquals(Temperature.Units.KELVIN,kelvinTemperature.getUnits());
   }

   @Test
   public void getUnitTest_Celsius(){
 	  Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	  assertEquals(Temperature.Units.CELSIUS, celciusTemperature.getUnits() );
   }
   
   public void getUnitTest_Fahrenheit(){
		  Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
		  assertEquals(Temperature.Units.FAHRENHEIT, fahrenheitTemperature.getUnits());
	  }
	
   // unitsToString() Test fo  individual temperature unit
   // testing if conversion to string method is correct 
   // Kelvin must be K
   // Celsius must be C
   // Fahrenheit must be F
   
   @Test
   public void unitToStringTest_Kelvin(){
 	  Temperature kelvinTemperature = new Temperature(0,Temperature.Units.KELVIN);
 	  assertEquals("K", kelvinTemperature.unitsToString());
   }
   
   @Test
   public void unitToStringTest_Celsius(){
 	  Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	  assertEquals("°„C", celciusTemperature.unitsToString());
   }
   
   @Test
   public void unitToStringTest_Fahrenheit(){
 	  Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
 	  assertEquals("°„F", fahrenheitTemperature.unitsToString());
   }
   
   // testing if getValue() method can acquire correct temperature value
   // for celsius and fahrenheit specifically, two tests must be completed
   // one for when celsius and fahrenheit value is equal to zero
   // the second for when kelvin value is equal to zero
   // since zero is the an easy value to convert and to check between the different 
   // temperature units.
  
   // getValue() test for Kelvin
   @Test
   public void getValueTest_Kelvin(){
 	  Temperature kelvinTemperature = new Temperature(0,Temperature.Units.KELVIN);
 	  assertEquals(0,kelvinTemperature.getValue(),0);
   }
   // getValue() test for Celsius
   @Test
   public void getValueTest_Celsius(){
 	  Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	  assertEquals(0,celciusTemperature.getValue(),0);
   }
 	
   @Test
   public void getValueTest_Celsius_KelvinEqualToZero(){
 	  Temperature celciusTemperature = new Temperature(-273.15,Temperature.Units.CELSIUS);
 	  assertEquals(-273.15,celciusTemperature.getValue(),0);
   }
   
   // getValue() test for Fahrenheit
   @Test
   public void getValueTest_Fahrenheit(){
 	  Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
 	  assertEquals(0,fahrenheitTemperature.getValue(),0);
   }
 	
   @Test
   public void getValueTest_Fahrenheit_KelvinEqualToZero(){
 	  Temperature fahrenheitTemperature = new Temperature(-459.67,Temperature.Units.FAHRENHEIT);
 	  assertEquals(-459.67,fahrenheitTemperature.getValue(),0);
   }
   
  //tests to confirm if changeUnit method is functional  
   
 // changeUnits() test for Kelvin
   @Test
   public void changeUnitsTestForKELVINToCELSIUS(){
 	 Temperature kelvinTemperature = new Temperature(0,Temperature.Units.KELVIN);
 	kelvinTemperature.changeUnits(Temperature.Units.CELSIUS);
 	 assertEquals(Temperature.Units.CELSIUS,kelvinTemperature.getUnits());
   }

   @Test
   public void changeUnitsTestForKELVINToFAHRENHEIT(){
 	 Temperature kelvinTemperature = new Temperature(0,Temperature.Units.KELVIN);
 	kelvinTemperature.changeUnits(Temperature.Units.FAHRENHEIT);
 	 assertEquals(Temperature.Units.FAHRENHEIT,kelvinTemperature.getUnits());
   }
 	//changeUnits() test for Celsius
   @Test
   public void changeUnitsTestForCELSIUSToKELVIN(){
 	 Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	celciusTemperature.changeUnits(Temperature.Units.KELVIN);
 	 assertEquals(Temperature.Units.KELVIN,celciusTemperature.getUnits());
   }

   @Test
   public void changeUnitsTestForCELSIUSToFAHRENHEIT(){
 	 Temperature celciusTemperature = new Temperature(0,Temperature.Units.CELSIUS);
 	celciusTemperature.changeUnits(Temperature.Units.FAHRENHEIT);
 	 assertEquals(Temperature.Units.FAHRENHEIT,celciusTemperature.getUnits());
   }
   
   //changeUnits() test for Fahrenheit
   @Test
   public void changeUnitsTestForFAHRENHEITToKELVIN(){
 	 Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
 	fahrenheitTemperature.changeUnits(Temperature.Units.KELVIN);
 	  assertEquals(Temperature.Units.KELVIN,fahrenheitTemperature.getUnits());
   }

   @Test
   public void changeUnitsTestForFAHRENHEITToCELSIUS(){
 	 Temperature fahrenheitTemperature = new Temperature(0,Temperature.Units.FAHRENHEIT);
 	fahrenheitTemperature.changeUnits(Temperature.Units.CELSIUS);
 	 assertEquals(Temperature.Units.CELSIUS,fahrenheitTemperature.getUnits());
   }	
  
   
   
}
