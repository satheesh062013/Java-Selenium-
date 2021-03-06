Feature: Adactin Hotel Booking

@Test
Scenario: Login the Adactin Website with Valied user Credentials
	Given user launch the Adactin url
	When enters the Username
	And enters the Password
	Then user clickOnLoginButton
	
@Test
Scenario Outline: SearchHotel Page with the User Details & Preferences 
	Given User successfully lands at the Page "<HomePageTitle>"
	Then user selects the HotelLocation
	And selects the Hotel
	And selects the RoomType
	And selects the No of Rooms
	And selects the CheckInDate
	And selects the CheckOutDate
	And selects the No Of Adults Room
	And selects the No Of Childs Room
	Then Click on Search Button
Examples:
|HomePageTitle|
|Adactin.com - Search Hotel|

@Test	
Scenario Outline: Itinerary Page
	Given User successfully lands at the Page "<ItineraryPageTitle>"
	Then Click on the RadioButton to Select the Hotel
	And Click on the ContinueButton
Examples:
|ItineraryPageTitle|
|Adactin.com - Select Hotel|

@Test
Scenario Outline: Booking Page with Valied User & Payment Details
	Given User successfully lands at the Page "<Book A HotelPageTitle>"
	Then user Enters the FirstName
	And user Enters the LastName
	And user Enters the Address
	And user Enters the CreditCardDetail
	And Selects the VISACardType
	And Selects the VISACardExpiryMonth
	And Selects the VISACardExpiryYear
	And user Enters the CVV Number
	Then Click on the BookNowButton
Examples:
|Book A HotelPageTitle| 
|Adactin.com - Book A Hotel|

@Test
Scenario Outline: Booking Confirmation Page with Valied User & Payment Details
	Given User successfully lands at the Page "<Booking Confirmation Page Title>"
	And Click on the MyItineraryButton
	Then takes the Screenshot
	And Click on the LogOutButton
Examples:
|Booking Confirmation Page Title| 
|Adactin.com - Book A Hotel|




