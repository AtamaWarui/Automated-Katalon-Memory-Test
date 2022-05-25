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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/forms/23/6iov55cdv952tseyww2wqoojj6la5zr9')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Email_ant-input (3)'), 'mmj761776+Test4@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Password_ant-input (3)'), '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Forgot Password_ant-btn form-submit-_936258 (3)'))

WebUI.setText(findTestObject('Page_Workmap/Name-HomeTesting-TestObject'), 'Rowan Janah')

WebUI.click(findTestObject('Page_Workmap/Input-BithDate-test-1'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (4)'))

WebUI.setText(findTestObject('Page_Workmap/Second-Email-2'), 'mmj761776@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (4)'))

WebUI.setText(findTestObject('Page_Workmap/Document-Number-TestObject'), '999999')

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_Select (4)'))

