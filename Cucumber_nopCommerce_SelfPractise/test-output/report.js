$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "nopCommerce Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valied Login Credentials on nopCommerce",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches the Browser \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launches_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens the URL with \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_the_URL_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the PageTitle with \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.verify_the_PageTitle_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user passes the Username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_passes_the_Username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the LoginButton",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_the_LoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the PageTitle with \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.verify_the_PageTitle_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the LogoutButton",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_the_LogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the PageTitle with \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.verify_the_PageTitle_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});