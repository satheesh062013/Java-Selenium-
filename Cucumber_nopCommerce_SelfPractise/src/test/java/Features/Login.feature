Feature: nopCommerce Login
	Scenario: Valied Login Credentials on nopCommerce
	Given User launches the Browser "chrome"
	When user opens the URL with "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	Then verify the PageTitle with "Your store. Login"
	And user passes the Username "admin@yourstore.com" and password "admin"
	And click on the LoginButton
	Then verify the PageTitle with "Dashboard / nopCommerce administration"
	And click on the LogoutButton
	Then verify the PageTitle with "Your store. Login"
	And close the browser