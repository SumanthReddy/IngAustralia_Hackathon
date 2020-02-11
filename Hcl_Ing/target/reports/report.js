$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("INGBanking.feature");
formatter.feature({
  "line": 1,
  "name": "Banking Application",
  "description": "",
  "id": "banking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Launch HomePage",
  "description": "",
  "id": "banking-application;launch-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clicks on Bank and Save",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on Personal Term Deposit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Personal Term Deposit Page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 268612844,
  "error_message": "org.openqa.selenium.WebDriverException: Cannot find firefox binary in PATH. Make sure firefox is installed. OS appears to be: WIN10\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027LP-PC0K9VSV\u0027, ip: \u0027192.168.43.190\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: FirefoxDriver\r\n\tat org.openqa.selenium.firefox.FirefoxBinary.\u003cinit\u003e(FirefoxBinary.java:100)\r\n\tat java.util.Optional.orElseGet(Unknown Source)\r\n\tat org.openqa.selenium.firefox.FirefoxOptions.getBinary(FirefoxOptions.java:216)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.toExecutor(FirefoxDriver.java:187)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:147)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:125)\r\n\tat in.com.hcl.Utilities.Crossbrowser.BrowserIntialisation(Crossbrowser.java:33)\r\n\tat in.com.hcl.StepDefinition.INGBankingStepDefinition.user_is_on_homepage(INGBankingStepDefinition.java:51)\r\n\tat ✽.Given user is on Homepage(INGBanking.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "INGBankingStepDefinition.clicks_on_bank_and_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_click_on_personal_Term_Deposit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "INGBankingStepDefinition.personal_term_deposit_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Launch Personal Deposit Page",
  "description": "",
  "id": "banking-application;launch-personal-deposit-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on Personal Deposit Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks on OpenNow",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#And user clicks on New Customer"
    }
  ],
  "line": 15,
  "name": "user is on Open Personal Term Deposit Page",
  "keyword": "Then "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_personal_deposit_page()"
});
formatter.result({
  "duration": 2414251,
  "error_message": "java.lang.NullPointerException\r\n\tat in.com.hcl.StepDefinition.INGBankingStepDefinition.user_is_on_personal_deposit_page(INGBankingStepDefinition.java:93)\r\n\tat ✽.Given user is on Personal Deposit Page(INGBanking.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_clicks_on_opennow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_open_personal_term_deposit_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Launch New Customer Page",
  "description": "",
  "id": "banking-application;launch-new-customer-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user is on Personal Term Deposit Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user fill the form with following details",
  "rows": [
    {
      "cells": [
        "INDIA",
        "Ram",
        "Dasaradh",
        "Raghuvamasha",
        "02/02/2020",
        "Ayodhya",
        "INDIA",
        "sita@gmail.com",
        "991627785",
        "6361550433",
        "AYODHYA-001",
        "Kousalya"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "clicks on continue",
  "keyword": "And "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_personal_term_deposit_page()"
});
formatter.result({
  "duration": 4048421,
  "error_message": "java.lang.NullPointerException\r\n\tat in.com.hcl.StepDefinition.INGBankingStepDefinition.user_is_on_personal_term_deposit_page(INGBankingStepDefinition.java:140)\r\n\tat ✽.Given user is on Personal Term Deposit Page(INGBanking.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_fill_the_form_with_following_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "INGBankingStepDefinition.clicks_on_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 25,
      "value": "#Then"
    }
  ],
  "line": 28,
  "name": "Invalid Date format Validation",
  "description": "",
  "id": "banking-application;invalid-date-format-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User is on Personal Term Deposite Page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User provides Invalid Date",
  "rows": [
    {
      "cells": [
        "xxx",
        "Ram",
        "Dasaradh",
        "Raghuvamasha",
        "vvv",
        "Ayodhya",
        "INDIA",
        "sita@gmail.com",
        "991627785",
        "6361550433",
        "AYODHYA-001",
        "Kousalya"
      ],
      "line": 31
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user should get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "INGBankingStepDefinition.user_is_on_personal_term_deposite_page()"
});
formatter.result({
  "duration": 3953648,
  "error_message": "java.lang.NullPointerException\r\n\tat in.com.hcl.StepDefinition.INGBankingStepDefinition.user_is_on_personal_term_deposite_page(INGBankingStepDefinition.java:225)\r\n\tat ✽.Given User is on Personal Term Deposite Page(INGBanking.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_provides_invalid_date(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "INGBankingStepDefinition.user_should_get_error_message()"
});
formatter.result({
  "status": "skipped"
});
});