import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Nick\\Downloads\\application-dev-debug.apk', false)

Mobile.tap(findTestObject('android.widget.ImageView4 (3)'), 0)

Mobile.tapAndHold(findTestObject('android.view.View3'), 0.005, 0)

Mobile.tap(findTestObject('android.widget.RelativeLayout3'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 -   (2)'), 'zametka', 0)

Mobile.tap(findTestObject('android.widget.TextView1 (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.TextView8 - '), 0)

Mobile.tap(findTestObject('android.widget.TextView2 -  (3)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView8 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 -  (4)'), 0)

Mobile.pressBack()

Mobile.closeApplication()

