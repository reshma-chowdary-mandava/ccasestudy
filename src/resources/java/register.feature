Feature: Registration to TestMe
Scenario: Successful registration
Given click on SignUp button
When User must enter all the below credentials
And Enter the username "anu12345" 
And Enter the firstname "reshma" 
And Enter the lastname "chowdary" 
And Enter the password "anuprasad123" 
And Enter the confirm Password "anuprasad123" 
And select the gender "female" 
And Enter the E-mail Id "Anu@gmail.com" 
And Enter the phone no "9558846547"
And Enter the dob "25/09/1999" 
And Enter the Address "chromepet,chennai"
And choose the "What is your pet Name" 
And Enter your fav pet "dog"
And User should click registration button
Then user must be in  login page


