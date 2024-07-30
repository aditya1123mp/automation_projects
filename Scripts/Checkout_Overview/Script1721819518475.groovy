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

check_out_product_name = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/product_name'))

System.out.println(check_out_product_name)

check_out_product_price = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/getting_product_price'))

System.out.println(check_out_product_price)

if (GlobalVariable.product_name == check_out_product_name) {
    KeywordUtil.markPassed('the product is same as ordered')
} else {
    KeywordUtil.markFailed('the product is not same as ordered')
}

/*if (GlobalVariable.product_price == check_out_product_price) {
	KeywordUtil.markPassed('the product price is same as ordered')
} else {
	KeywordUtil.markFailed('the product price is not same as ordered')
}*/
check_out_total_product_price = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/getting_total_price'))

System.out.println(check_out_total_product_price)

check_out_payment_information = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/getting_paymenty_information'))

System.out.println(check_out_payment_information)

check_out_shipping_information = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/getting_shipping_information'))

System.out.println(check_out_shipping_information)

WebUI.verifyElementPresent(findTestObject('matching_product_info_after_payment/finish_button'), 10)

WebUI.click(findTestObject('matching_product_info_after_payment/finish_button'))

thank_you_message = WebUI.getText(findTestObject('Object Repository/matching_product_info_after_payment/getting_thank_you_message'))

System.out.println(thank_you_message)

if (thank_you_message == 'Thank you for your order!') {
	KeywordUtil.markPassed('the Message is same')
} else {
	KeywordUtil.markFailed('the Message is not same')
}


WebUI.verifyElementPresent(findTestObject('Object Repository/matching_product_info_after_payment/back_home_button'), 10)

WebUI.click(findTestObject('Object Repository/matching_product_info_after_payment/back_home_button'))





