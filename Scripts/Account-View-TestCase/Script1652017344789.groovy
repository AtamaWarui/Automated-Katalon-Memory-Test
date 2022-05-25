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

WebUI.navigateToUrl('https://nk-gke-test.gcp.workmap.ai/#/signIn')

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username'), 'pankajunk@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password'), 'Piu45nT0PQ8=')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Go to app'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_SA_custom-svg-icon'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Go to app_1'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/svg'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Testing Queue'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_All Tested Positive'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_All Tested'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_All Tested'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Marketing'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Marketing'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Production'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Production'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_HR'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Home Testing'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Tests'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_All Tests'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Auckland'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Auckland'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_New Plymouth'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_New Plymouth'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Wellington'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Wellington'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Canterbury'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Canterbury'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Otango'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Otango'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Nelson'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/a_Patients'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/i_Automation_mdi mdi-chart-arc'))

