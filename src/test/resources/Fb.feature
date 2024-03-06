Feature: Facebook Create Account

Background: Facebook launching function
Given Launch the facebook website "https://www.facebook.com"
And Click on Create new account

@create
Scenario Outline: Create new account
When Enter First Name "<Firstname>"
When Enter Surname "<Surname>"
When Enter the Mobile Number "<MobileNo>"
When Enter Password "<Password>"
When Enter Date of Birth "<Date>"
When Enter Month of Birth "<Month>"
When Enter Year of Birth "<Year>"
Then Click on Sign Up
And TakeScreenshort "<Firstname>"



Examples:
|Firstname  |Surname	|MobileNo    	 |Password |Date|Month|Year	|
|Ranjith  	|R 		  	|no234567892	 |ranjith  |d22 |Oct  |y1999|
#|santhos	  |J  			|no345678901	 |santhos  |d20 |May  |y1997|
#|karna	    |S 				|no234671239	 |karna    |d21 |Feb 	|y1997|
#|Surya  	  |P  			|no954672769	 |surya    |d15 |Dec 	|y1999|