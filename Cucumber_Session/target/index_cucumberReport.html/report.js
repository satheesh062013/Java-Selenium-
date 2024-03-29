$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1551000,
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
  "duration": 3937910600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enters_the_Username()"
});
formatter.result({
  "duration": 259625000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enters_the_Password()"
});
formatter.result({
  "duration": 213103600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_clickOnLoginButton()"
});
formatter.result({
  "duration": 3211056100,
  "status": "passed"
});
formatter.after({
  "duration": 120100,
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
  "duration": 83000,
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
  "duration": 39887100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_selects_the_HotelLocation()"
});
formatter.result({
  "duration": 1338589100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_Hotel()"
});
formatter.result({
  "duration": 1201405700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_RoomType()"
});
formatter.result({
  "duration": 1192981400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_of_Rooms()"
});
formatter.result({
  "duration": 1197214300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_CheckInDate()"
});
formatter.result({
  "duration": 278346800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_CheckOutDate()"
});
formatter.result({
  "duration": 287360600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_Of_Adults_Room()"
});
formatter.result({
  "duration": 1144272800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_No_Of_Childs_Room()"
});
formatter.result({
  "duration": 1208616900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_Search_Button()"
});
formatter.result({
  "duration": 1324565300,
  "status": "passed"
});
formatter.after({
  "duration": 164900,
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
  "duration": 103300,
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
  "duration": 30455500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_RadioButton_to_Select_the_Hotel()"
});
formatter.result({
  "duration": 3102931400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_ContinueButton()"
});
formatter.result({
  "duration": 1213517300,
  "status": "passed"
});
formatter.after({
  "duration": 71700,
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
  "duration": 91600,
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
  "duration": 30259000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_FirstName()"
});
formatter.result({
  "duration": 314918500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_LastName()"
});
formatter.result({
  "duration": 253996900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_Address()"
});
formatter.result({
  "duration": 316861200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_CreditCardDetail()"
});
formatter.result({
  "duration": 299175000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardType()"
});
formatter.result({
  "duration": 1232430800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardExpiryMonth()"
});
formatter.result({
  "duration": 1275346600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.selects_the_VISACardExpiryYear()"
});
formatter.result({
  "duration": 1203910700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Enters_the_CVV_Number()"
});
formatter.result({
  "duration": 289443800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_BookNowButton()"
});
formatter.result({
  "duration": 101209900,
  "status": "passed"
});
formatter.after({
  "duration": 157600,
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
  "duration": 86900,
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
  "duration": 29789200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_MyItineraryButton()"
});
formatter.result({
  "duration": 8696878500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.takes_the_Screenshot()"
});
formatter.result({
  "duration": 654419300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_LogOutButton()"
});
formatter.result({
  "duration": 491823600,
  "error_message": "java.lang.Exception: Manually Created Exception for Test Purpose\r\n\tat stepDefinitions.stepDefinition.click_on_the_LogOutButton(stepDefinition.java:236)\r\n\tat ✽.And Click on the LogOutButton(C:/Users/sgsasek/Desktop/jAva/eclipse-workspace/Cucumber_Session/src/test/java/Features/AdactinHotelBooking.feature:56)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 501828900,
  "status": "passed"
});
});