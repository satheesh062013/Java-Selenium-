$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1665500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login the Adactin Website with Valied user Credentials",
  "description": "",
  "id": "adactin-hotel-booking;login-the-adactin-website-with-valied-user-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the Adactin url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enters the Username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enters the Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clickOnLoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_launch_the_Adactin_url()"
});
formatter.result({
  "duration": 490179500,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_INTERNET_DISCONNECTED\n  (Session info: chrome\u003d104.0.5112.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SG-L-7301093\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.102, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\sgsasek\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:62600}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 23c1a9e5c0adda86bb2212643ad87b1b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.BaseClass_AdactinPages_Mini_Proj.BaseClass_Adactin.launchUrl(BaseClass_Adactin.java:61)\r\n\tat stepDefinitions.stepDefinition.user_launch_the_Adactin_url(stepDefinition.java:50)\r\n\tat ✽.Given user launch the Adactin url(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.enters_the_Username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.enters_the_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_clickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 172848500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "SearchHotel Page with the User Details \u0026 Preferences",
  "description": "",
  "id": "adactin-hotel-booking;searchhotel-page-with-the-user-details-\u0026-preferences",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User successfully lands at the Page \"\u003cHomePageTitle\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user selects the HotelLocation",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "selects the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects the RoomType",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "selects the No of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "selects the CheckInDate",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "selects the CheckOutDate",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "selects the No Of Adults Room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects the No Of Childs Room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Search Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;searchhotel-page-with-the-user-details-\u0026-preferences;",
  "rows": [
    {
      "cells": [
        "HomePageTitle"
      ],
      "line": 23,
      "id": "adactin-hotel-booking;searchhotel-page-with-the-user-details-\u0026-preferences;;1"
    },
    {
      "cells": [
        "Adactin.com - Search Hotel"
      ],
      "line": 24,
      "id": "adactin-hotel-booking;searchhotel-page-with-the-user-details-\u0026-preferences;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 105600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "SearchHotel Page with the User Details \u0026 Preferences",
  "description": "",
  "id": "adactin-hotel-booking;searchhotel-page-with-the-user-details-\u0026-preferences;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User successfully lands at the Page \"Adactin.com - Search Hotel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user selects the HotelLocation",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "selects the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects the RoomType",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "selects the No of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "selects the CheckInDate",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "selects the CheckOutDate",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "selects the No Of Adults Room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects the No Of Childs Room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Search Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Search Hotel",
      "offset": 37
    }
  ],
  "location": "stepDefinition.user_successfully_lands_at_the_Page(String)"
});
formatter.result({
  "duration": 11720800,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[adactinhotelapp.com]\u003e but was:\u003c[Adactin.com - Search Hotel]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.stepDefinition.user_successfully_lands_at_the_Page(stepDefinition.java:78)\r\n\tat ✽.Given User successfully lands at the Page \"Adactin.com - Search Hotel\"(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.user_selects_the_HotelLocation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_Hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_RoomType()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_of_Rooms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_CheckInDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_CheckOutDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_Of_Adults_Room()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_Of_Childs_Room()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.click_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 154265900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Itinerary Page",
  "description": "",
  "id": "adactin-hotel-booking;itinerary-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User successfully lands at the Page \"\u003cItineraryPageTitle\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Click on the RadioButton to Select the Hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click on the ContinueButton",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;itinerary-page;",
  "rows": [
    {
      "cells": [
        "ItineraryPageTitle"
      ],
      "line": 32,
      "id": "adactin-hotel-booking;itinerary-page;;1"
    },
    {
      "cells": [
        "Adactin.com - Select Hotel"
      ],
      "line": 33,
      "id": "adactin-hotel-booking;itinerary-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 108200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Itinerary Page",
  "description": "",
  "id": "adactin-hotel-booking;itinerary-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User successfully lands at the Page \"Adactin.com - Select Hotel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Click on the RadioButton to Select the Hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click on the ContinueButton",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Select Hotel",
      "offset": 37
    }
  ],
  "location": "stepDefinition.user_successfully_lands_at_the_Page(String)"
});
formatter.result({
  "duration": 5879200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[adactinhotelapp.com]\u003e but was:\u003c[Adactin.com - Select Hotel]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.stepDefinition.user_successfully_lands_at_the_Page(stepDefinition.java:78)\r\n\tat ✽.Given User successfully lands at the Page \"Adactin.com - Select Hotel\"(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_RadioButton_to_Select_the_Hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.click_on_the_ContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 209239500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 36,
  "name": "Booking Page with Valied User \u0026 Payment Details",
  "description": "",
  "id": "adactin-hotel-booking;booking-page-with-valied-user-\u0026-payment-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User successfully lands at the Page \"\u003cBook A HotelPageTitle\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "user Enters the FirstName",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user Enters the LastName",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enters the Address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enters the CreditCardDetail",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Selects the VISACardType",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Selects the VISACardExpiryMonth",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Selects the VISACardExpiryYear",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enters the CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click on the BookNowButton",
  "keyword": "Then "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;booking-page-with-valied-user-\u0026-payment-details;",
  "rows": [
    {
      "cells": [
        "Book A HotelPageTitle"
      ],
      "line": 48,
      "id": "adactin-hotel-booking;booking-page-with-valied-user-\u0026-payment-details;;1"
    },
    {
      "cells": [
        "Adactin.com - Book A Hotel"
      ],
      "line": 49,
      "id": "adactin-hotel-booking;booking-page-with-valied-user-\u0026-payment-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 64900,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Booking Page with Valied User \u0026 Payment Details",
  "description": "",
  "id": "adactin-hotel-booking;booking-page-with-valied-user-\u0026-payment-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User successfully lands at the Page \"Adactin.com - Book A Hotel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "user Enters the FirstName",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user Enters the LastName",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enters the Address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enters the CreditCardDetail",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Selects the VISACardType",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Selects the VISACardExpiryMonth",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Selects the VISACardExpiryYear",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enters the CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click on the BookNowButton",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Book A Hotel",
      "offset": 37
    }
  ],
  "location": "stepDefinition.user_successfully_lands_at_the_Page(String)"
});
formatter.result({
  "duration": 9109500,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[adactinhotelapp.com]\u003e but was:\u003c[Adactin.com - Book A Hotel]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.stepDefinition.user_successfully_lands_at_the_Page(stepDefinition.java:78)\r\n\tat ✽.Given User successfully lands at the Page \"Adactin.com - Book A Hotel\"(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_FirstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_CreditCardDetail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardType()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardExpiryMonth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardExpiryYear()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_CVV_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.click_on_the_BookNowButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 211767800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 52,
  "name": "Booking Confirmation Page with Valied User \u0026 Payment Details",
  "description": "",
  "id": "adactin-hotel-booking;booking-confirmation-page-with-valied-user-\u0026-payment-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 51,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User successfully lands at the Page \"\u003cBooking Confirmation Page Title\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "Click on the MyItineraryButton",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "takes the Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Click on the LogOutButton",
  "keyword": "And "
});
formatter.examples({
  "line": 57,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;booking-confirmation-page-with-valied-user-\u0026-payment-details;",
  "rows": [
    {
      "cells": [
        "Booking Confirmation Page Title"
      ],
      "line": 58,
      "id": "adactin-hotel-booking;booking-confirmation-page-with-valied-user-\u0026-payment-details;;1"
    },
    {
      "cells": [
        "Adactin.com - Book A Hotel"
      ],
      "line": 59,
      "id": "adactin-hotel-booking;booking-confirmation-page-with-valied-user-\u0026-payment-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 114500,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "Booking Confirmation Page with Valied User \u0026 Payment Details",
  "description": "",
  "id": "adactin-hotel-booking;booking-confirmation-page-with-valied-user-\u0026-payment-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 51,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User successfully lands at the Page \"Adactin.com - Book A Hotel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "Click on the MyItineraryButton",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "takes the Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Click on the LogOutButton",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Book A Hotel",
      "offset": 37
    }
  ],
  "location": "stepDefinition.user_successfully_lands_at_the_Page(String)"
});
formatter.result({
  "duration": 17839900,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[adactinhotelapp.com]\u003e but was:\u003c[Adactin.com - Book A Hotel]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinitions.stepDefinition.user_successfully_lands_at_the_Page(stepDefinition.java:78)\r\n\tat ✽.Given User successfully lands at the Page \"Adactin.com - Book A Hotel\"(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:53)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_MyItineraryButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.takes_the_Screenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.click_on_the_LogOutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 181856000,
  "status": "passed"
});
});