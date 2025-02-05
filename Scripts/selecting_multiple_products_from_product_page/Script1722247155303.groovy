import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

GlobalVariable.product_name_001 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_name_for_first_product'))

System.out.println(GlobalVariable.product_name_001)

GlobalVariable.product_price_001 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_price_for_first_product'))

System.out.println(GlobalVariable.product_price_001)


GlobalVariable.product_name_002 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_name_of_second_product'))

System.out.println(GlobalVariable.product_name_002)

GlobalVariable.product_price_002 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_price_for_second_product'))

System.out.println(GlobalVariable.product_price_002)


GlobalVariable.product_name_003 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_name_of_third_product'))

System.out.println(GlobalVariable.product_name_003)

GlobalVariable.product_price_003 = WebUI.getText(findTestObject('Object Repository/selecting_multiple_prodcuts/getting_price_for_third_product'))

System.out.println(GlobalVariable.product_price_003)


WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/add_to_cart_button_first_product'), 10)

WebUI.click(findTestObject('Object Repository/selecting_multiple_prodcuts/add_to_cart_button_first_product'))

WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/aad_to_cart_button_for_second_product'), 10)

WebUI.click(findTestObject('Object Repository/selecting_multiple_prodcuts/aad_to_cart_button_for_second_product'))

WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/add_to_cart_button_third_product'), 10)

WebUI.click(findTestObject('Object Repository/selecting_multiple_prodcuts/add_to_cart_button_third_product'))

WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/remove_button_for_first_product'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/remove_button_for_second_product'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/selecting_multiple_prodcuts/remove_button_for_third_button'), 10)


