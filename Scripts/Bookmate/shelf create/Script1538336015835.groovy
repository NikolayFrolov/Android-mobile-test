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

Mobile.scrollToText('создать полку')

Mobile.tap(findTestObject('android.widget.TextView16 -   (1)'), 0)

Mobile.setText(findTestObject('android.widget.ImageView0'), 'TestShelf', 0)

Mobile.tap(findTestObject('android.widget.EditText1 - '), 0)

Mobile.tap(findTestObject('android.support.v7.widget.LinearLayoutCompat0'), 0)

Mobile.tap(findTestObject('android.widget.RelativeLayout5'), 0)

Mobile.tap(findTestObject('android.widget.TextView5 -  '), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.EditText0 -   '), 0)

Mobile.setText(findTestObject('android.widget.EditText0 -   '), 'me gusta', 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.RelativeLayout1 (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView10'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 -  (5)'), 0)

Mobile.pressBack()

Mobile.closeApplication()

