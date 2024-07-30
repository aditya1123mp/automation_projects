import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By


WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/for_product_checkout/cart_icon'))

// Find all price elements using XPath
WebDriver driver = DriverFactory.getWebDriver()

List<String> priceElements = driver.findElements(By.xpath('//div[@class=\'inventory_item_price\' and @data-test=\'inventory-item-price\']'))

// Extract the text content (prices)
List<String> prices = priceElements.collect({
		it.text
	})

println(prices // Output should be ['$29.99', '$9.99', '$15.99']
	)
	
pricesString = prices.join(', ')
println pricesString
	
	
// Split the string by comma and trim spaces
pricesArray = pricesString.split(',').collect { it.trim() }

// Assign to separate variables
price1 = pricesArray[0]
price2 = pricesArray[1]
price3 = pricesArray[2]

// Print out the variables to verify
println "Price 1: ${price1}"
println "Price 2: ${price2}"
println "Price 3: ${price3}"


product_name_001_cart = WebUI.getText(findTestObject('Object Repository/verifying_name_and_price_for_multiple_product/getting_name_of_first_product_in_cart'))
	
System.out.println(product_name_001_cart)


product_name_002_cart = WebUI.getText(findTestObject('Object Repository/verifying_name_and_price_for_multiple_product/getting_name_of_second_product_in_cart'))

System.out.println(product_name_002_cart)


product_name_003_cart = WebUI.getText(findTestObject('Object Repository/verifying_name_and_price_for_multiple_product/getting_name_of_third_product_in_cart'))

System.out.println(product_name_003_cart)


if (GlobalVariable.product_name_001 == product_name_001_cart) {
	println "selected product 1 is same as selected 001."
	
 } else if(GlobalVariable.product_name_001 == product_name_002_cart){
println "selected product 1 is same as selected 002." } 
 else {println "selected product 1 is same as selected 003." } 
 

 if (GlobalVariable.product_name_002 == product_name_001_cart) {
	 println "selected product 2 is same as selected 001."
	 
  } else if(GlobalVariable.product_name_002 == product_name_002_cart){
 println "selected product 2 is same as selected 002." }
  else {println "selected product 2 is same as selected 003." }
 


  if (GlobalVariable.product_name_003 == product_name_001_cart) {
	  println "selected product 3 is same as selected 001."
	  
   } else if(GlobalVariable.product_name_003 == product_name_002_cart){
  println "selected product 3 is same as selected 002." }
   else {println "selected product 3 is same as selected 003." }
  




   if (GlobalVariable.product_price_001 == price1) {
	   println "selected product price 1 is same as selected product price in cart 001."
	   
	} else if(GlobalVariable.product_price_001 == price2){
   println "selected product  price 1 is same as selected product price in cart 002." }
	else {println "selected product  price 1 is same as selected product price in cart  003." }
	
   
	if (GlobalVariable.product_price_002 == price1) {
		println "selected product price  2 is same as selected product price in cart 001."
		
	 } else if(GlobalVariable.product_price_002 == price2){
	println "selected product price  2 is same as selected product price in cart  002." }
	 else {println "selected product price 2 is same as selected product price in cart 003." }
	
   
   
	 if (GlobalVariable.product_price_003 == price1) {
		 println "selected product price 3 is same as selected product price in cart 001."
		 
	  } else if(GlobalVariable.product_price_003 == price2){
	 println "selected product price 3 is same as selected product price in cart 002." }
	  else {println "selected product  price 3 is same as selected product price in cart 003." }
   




