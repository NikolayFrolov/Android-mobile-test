<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Authorization Bookmate</name>
   <tag></tag>
   <elementGuidId>340e612c-b283-4f34-8cb6-d5129d728cd1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;user[credential]&quot;,
      &quot;value&quot;: &quot;androidtest&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;user[password]&quot;,
      &quot;value&quot;: &quot;1234567&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;application[key]&quot;,
      &quot;value&quot;: &quot;So9vglNCTWQKXFcBDSrE8mW8cwFzbi1fAgRWeYR2aSZ2sjsDumrfAoaE61N6VvM0&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;application[identity]&quot;,
      &quot;value&quot;: &quot;BOOKMATE-FOR-ANDROID&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;application[uuid]&quot;,
      &quot;value&quot;: &quot;1a45c9e4bc4f9afb&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;locale_lang&quot;,
      &quot;value&quot;: &quot;ru&quot;,
      &quot;type&quot;: &quot;string&quot;
    },
    {
      &quot;name&quot;: &quot;locale_country&quot;,
      &quot;value&quot;: &quot;ru&quot;,
      &quot;type&quot;: &quot;string&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.bookmate.rocks/a/4/u/entrance.json?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getResponseText(value)).contains('Token')




assertThat(response.getResponseText()).isEqualTo(&quot;value&quot;)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
