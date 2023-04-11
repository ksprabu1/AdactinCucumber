package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.Pom01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Page_Object_Manager pom = new Page_Object_Manager(driver);
@Given("User Launch the url")
public void user_launch_the_url() throws IOException {
   String url = File_Reader_Manager.getInstanceCr().getUrl();
   getUrl(url);
}
@When("User Enter a username")
public void user_enter_a_username() throws InterruptedException{
     Thread.sleep(3000);
	pom.getInstancePom01().getUserName().sendKeys("ksprabu3005");
}
@When("User Enter a Password")
public void user_enter_a_password() {
	pom.getInstancePom01().getPassword().sendKeys("Prabu@1234");
}
@When("User click the login button")
public void user_click_the_login_button() {
	pom.getInstancePom01().getLogIn().click();
}
@Then("User see the nextpage")
public void user_see_the_nextpage() {
    System.out.println("logged in done");
}

@When("User enter a location")
public void user_enter_a_location() {
	pom.getInstancePom02().getLocation().click();
}
@When("User select a hotel")
public void user_select_a_hotel() {
	pom.getInstancePom02().getHotels().click();
}
@When("User select a room type")
public void user_select_a_room_type() {
	pom.getInstancePom02().getRoomType().click();
}
@When("User select a number of rooms required")
public void user_select_a_number_of_rooms_required() {
	pom.getInstancePom02().getNoOfRooms().click();
}
@When("User enter a checkin date")
public void user_enter_a_checkin_date() {
	pom.getInstancePom02().getCheckInDate().sendKeys("01/05/2023");
}
@When("User enter a checkout date")
public void user_enter_a_checkout_date() {
	pom.getInstancePom02().getCheckOutDate().sendKeys("04/05/2023");
}
@When("User enter a adults details")
public void user_enter_a_adults_details() {
	pom.getInstancePom02().getAdults().click();
}
@When("User enter a childrens details")
public void user_enter_a_childrens_details() {
	pom.getInstancePom02().getChildrens().click();
}
@When("user click the search button")
public void user_click_the_search_button() {
	pom.getInstancePom02().getSearch().click();
}

@When("User select a hotel name")
public void user_select_a_hotel_name() {
	pom.getInstancePom03().getBox().click();
}

@When("User click the continue button")
public void user_click_the_continue_button() {
	pom.getInstancePom03().getSubmit().click();
}
@When("User enter a first name")
public void user_enter_a_first_name() {
	pom.getInstancePom04().getFirstName().sendKeys("prabu");
}
@When("User enter a second name")
public void user_enter_a_second_name() {
	pom.getInstancePom04().getLastName().sendKeys("kannan");
}
@When("User enter a billing Address")
public void user_enter_a_billing_address() {
	pom.getInstancePom04().getBillingAddress().sendKeys("Mayiladuthurai");
}
@When("User enter a card number")
public void user_enter_a_card_number() {
	pom.getInstancePom04().getCreditCard().sendKeys("1234567890098765");
}
@When("User select a card type")
public void user_select_a_card_type() {
	pom.getInstancePom04().getCardType().click();
}
@When("User select a card expiry month")
public void user_select_a_card_expiry_month() {
	pom.getInstancePom04().getExpiryMon().click();
}
@When("User select a card expiry year")
public void user_select_a_card_expiry_year() {
	pom.getInstancePom04().getExpiryYear().click();
}
@When("User enter a card cvv number")
public void user_enter_a_card_cvv_number() {
	pom.getInstancePom04().getCvvNumber().sendKeys("345");
}
@When("User Click a book now button")
public void user_click_a_book_now_button() {
	pom.getInstancePom04().getBookNow().click();
}

}
