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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.takeScreenshotAsCheckpoint('current_viewport1')

WebUI.takeScreenshotAsCheckpoint('current_viewport2')

WebUI.takeScreenshotAsCheckpoint('current_viewport3')

WebUI.takeScreenshotAsCheckpoint('current_viewport4')

WebUI.takeScreenshotAsCheckpoint('current_viewport5')

WebUI.takeScreenshotAsCheckpoint('current_viewport6')

WebUI.takeScreenshotAsCheckpoint('current_viewport7')

WebUI.takeScreenshotAsCheckpoint('current_viewport8')

WebUI.takeScreenshotAsCheckpoint('current_viewport9')

WebUI.takeScreenshotAsCheckpoint('current_viewport10')

WebUI.takeScreenshotAsCheckpoint('current_viewport11')

WebUI.takeScreenshotAsCheckpoint('current_viewport12')


WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

