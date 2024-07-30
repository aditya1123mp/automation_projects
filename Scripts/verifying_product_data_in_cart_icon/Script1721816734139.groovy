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

WebUI.click(findTestObject('Object Repository/for_product_checkout/cart_icon'))

product_name_cart = WebUI.getText(findTestObject('Object Repository/for_product_checkout/getting_name_from_cart'))

System.out.println(product_name_cart)

product_price_cart = WebUI.getText(findTestObject('Object Repository/for_product_checkout/getting_price_from_cart'))

System.out.println(product_price_cart)

if (GlobalVariable.product_name == product_name_cart) {
    KeywordUtil.markPassed('the product is same as ordered')
} else {
    KeywordUtil.markFailed('the product is not same as ordered')
}

/*if (GlobalVariable.product_price == product_price_cart) {
    KeywordUtil.markPassed('the product price is same as ordered')
} else {
    KeywordUtil.markFailed('the product price is not same as ordered')
}*/

WebUI.verifyElementPresent(findTestObject('for_product_checkout/checkout_button_in_cart'), 10)

WebUI.click(findTestObject('for_product_checkout/checkout_button_in_cart'))

