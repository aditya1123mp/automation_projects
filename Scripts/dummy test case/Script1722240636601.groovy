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


// Initialize WebDriver
WebUI.openBrowser('')

'Maximize current window'
WebUI.maximizeWindow()


'Navigate to saucedemo site'
WebUI.navigateToUrl('www.saucedemo.com')

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), 10)

WebUI.click(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'))

/*WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), GlobalVariable.user_data)*/
List<String> usernameList = Arrays.asList(GlobalVariable.user_data, GlobalVariable.username_data_003, GlobalVariable.username_data_004, 
    GlobalVariable.user_name_data_005, GlobalVariable.user_name_data_006)

Random randProductUnit = new Random()

String randomPath = usernameList.get(randProductUnit.nextInt(usernameList.size()))

WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/username_xpath'), randomPath)

WebUI.verifyElementPresent(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'), 10)

WebUI.click(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'))

WebUI.setText(findTestObject('Object Repository/for_saucedemo_login_page/password_xpath'), GlobalVariable.password_data)

WebUI.verifyElementPresent(findTestObject('for_saucedemo_login_page/login_button_xpath'), 10)

WebUI.click(findTestObject('for_saucedemo_login_page/login_button_xpath'))

WebUI.delay(3)

WebUI.click(findTestObject('selecting_multiple_prodcuts/add_to_cart_button_first_product'))

WebUI.click(findTestObject('selecting_multiple_prodcuts/aad_to_cart_button_for_second_product'))

WebUI.click(findTestObject('selecting_multiple_prodcuts/add_to_cart_button_third_product'))

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

// Close the WebDriver
//WebUI.closeBrowser()

// Join elements with a comma separator
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
