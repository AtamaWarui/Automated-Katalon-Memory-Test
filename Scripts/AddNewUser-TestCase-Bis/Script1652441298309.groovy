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

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_username (2)'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Sign in_normal_login_password (2)'), '')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Log in (2)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/span_SA (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Admin (1)'))

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Add New (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Add New User_email (1)'), 'moonjanah9@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_Account Role (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Add New User_email (1)'), 'moonjanah9@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Workmap/li_Member (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Workmap/input_Member_full_name (1)'), 'MoonJTest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Weak_password (1)'), 'eRr/p23sGk+UsKS8KHWx3w==')

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_CancelAdd New UserAccount RoleMemberAcc_f0b016 (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Member_confirm_password (1)'), 'obF7Wr/mv3PdXTg7wcIsTg==')

WebUI.click(findTestObject('Object Repository/Page_Workmap/div_New Password and Confirm Password are n_e1b960'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workmap/input_Member_confirm_password (1)'), 'eRr/p23sGk+UsKS8KHWx3w==')

WebUI.click(findTestObject('Object Repository/Page_Workmap/button_Add New User (1)'))

