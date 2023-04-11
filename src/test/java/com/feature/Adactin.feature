Feature: Online RoomBooking site

Scenario: User Login the adactin page

Given User Launch the url
When User Enter a username
And User Enter a Password
And User click the login button
Then User see the nextpage

Scenario: User Enter a booking details 

When User enter a location
And User select a hotel
And User select a room type
And User select a number of rooms required 
And User enter a checkin date
And User enter a checkout date
And User enter a adults details 
And User enter a childrens details
And user click the search button

Scenario: User Select hotel

When User select a hotel name
And User click the continue button

Scenario: User Enter a payment details and book a room

When User enter a first name 
And User enter a second name
And User enter a billing Address 
And User enter a card number
And User select a card type
And User select a card expiry month
And User select a card expiry year
And User enter a card cvv number
And User Click a book now button



