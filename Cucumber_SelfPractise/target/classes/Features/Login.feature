Feature: nopCommerce Login
	Scenario: Login on nopCommerce with Valied Credentials
	Given User launches the Browser with "chrome"
	When user opens the URL with "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	Then verify the PageTitle with "Your store. Login"
	And user passes the Username "admin@yourstore.com" and password "admin"
	Then verify the PageTitle with "Dashboard / nopCommerce administration"
	And close the browser