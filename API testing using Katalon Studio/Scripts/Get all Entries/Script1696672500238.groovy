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

response = WS.sendRequest(findTestObject('Get all Entries'))

//Test on API Endpoint

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'entries[85].Category', 'Authentication & Authorization')

WS.verifyElementsCount(response, 'entries[85].Category', 30)

//Authentication and Authorization logged into console

value = WS.getElementPropertyValue(response, 'entries[85].Category')

println('Value is: ' + value)

//Objects with Category logged out into Console

object1 = WS.getElementPropertyValue(response, 'entries[81]')

println(object1)

object2 = WS.getElementPropertyValue(response, 'entries[82]')

println(object2)

object3 = WS.getElementPropertyValue(response, 'entries[83]')

println(object3)

object4 = WS.getElementPropertyValue(response, 'entries[84]')

println(object4)

object5 = WS.getElementPropertyValue(response, 'entries[85]')

println(object5)

object6 = WS.getElementPropertyValue(response, 'entries[86]')

println(object6)

object7 = WS.getElementPropertyValue(response, 'entries[87]')

println(object7)

