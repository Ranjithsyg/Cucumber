$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Fb.feature");
formatter.feature({
  "name": "Facebook Create Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "Enter First Name \"\u003cFirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Surname \"\u003cSurname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the Mobile Number \"\u003cMobileNo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Password \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Date of Birth \"\u003cDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Month of Birth \"\u003cMonth\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter Year of Birth \"\u003cYear\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Sign Up",
  "keyword": "Then "
});
formatter.step({
  "name": "TakeScreenshort \"\u003cFirstname\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Surname",
        "MobileNo",
        "Password",
        "Date",
        "Month",
        "Year"
      ]
    },
    {
      "cells": [
        "Ranjith",
        "R",
        "no234567892",
        "ranjith",
        "d22",
        "Oct",
        "y1999"
      ]
    }
  ]
});
formatter.background({
  "name": "Facebook launching function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the facebook website \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccount.launch_the_facebook_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create new account",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.click_on_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "Enter First Name \"Ranjith\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Surname \"R\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Mobile Number \"no234567892\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_the_mobile_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password \"ranjith\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Date of Birth \"d22\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_date_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Month of Birth \"Oct\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_month_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Year of Birth \"y1999\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccount.enter_year_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign Up",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount.click_on_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TakeScreenshort \"Ranjith\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.take_screenshort(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/JIO.feature");
formatter.feature({
  "name": "Ajio Mens Jeans",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Ajio launching function",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Ajio website \"https://www.ajio.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Ajio.launch_the_ajio_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Mens and click on Jeans",
  "keyword": "And "
});
formatter.match({
  "location": "Ajio.navigate_to_mens_and_click_on_Jeans()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sorting Mens Jeans by Lowest Price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@jeans"
    }
  ]
});
formatter.step({
  "name": "User clicks on sort dropdown and select option in a dropdown with one dim map",
  "rows": [
    {
      "cells": [
        "sort1",
        "highest"
      ]
    },
    {
      "cells": [
        "sort2",
        "Discount"
      ]
    },
    {
      "cells": [
        "sort3",
        "lowest"
      ]
    },
    {
      "cells": [
        "sort4",
        "What"
      ]
    },
    {
      "cells": [
        "sort5",
        "Ratings"
      ]
    },
    {
      "cells": [
        "sort6",
        "Relevance"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Ajio.user_clicks_on_sort_dropdown_and_select_option_in_a_dropdown_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "Ajio.validate_the_outcome()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});