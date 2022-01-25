$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/NopCommerce.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigate to customer page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on add new customer",
  "keyword": "When "
});
formatter.step({
  "name": "Fill the customer details \"\u003cFirstname\u003e\",\"\u003cLastname\u003e\" and click on submit",
  "keyword": "And "
});
formatter.step({
  "name": "Verify success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname"
      ]
    },
    {
      "cells": [
        "John",
        "Peter"
      ]
    },
    {
      "cells": [
        "James",
        "Thomas"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "Login to the application",
  "keyword": "Background"
});
formatter.step({
  "name": "Open application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter userName \"admin@yourstore.com\" and Enter password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.enter_userName_and_Enter_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigate to customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.navigate_to_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on add new customer",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.click_on_add_new_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the customer details \"John\",\"Peter\" and click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.fill_the_customer_details_and_click_on_submit(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.verify_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "Login to the application",
  "keyword": "Background"
});
formatter.step({
  "name": "Open application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.open_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter userName \"admin@yourstore.com\" and Enter password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.enter_userName_and_Enter_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigate to customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.navigate_to_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on add new customer",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.click_on_add_new_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the customer details \"James\",\"Thomas\" and click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.fill_the_customer_details_and_click_on_submit(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.NopCommerce.verify_success_message()"
});
formatter.result({
  "status": "passed"
});
});