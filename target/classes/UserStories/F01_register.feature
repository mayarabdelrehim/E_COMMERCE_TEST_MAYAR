@smoke
Feature: guest user could register with valid data successfully

  Background:user open browser and navigates to demo.nopcommerce.com

  Scenario:user register wih valid data

   Given user click on register
   And user enter personal valid data

   When user enter password
   And user click on register button

   Then user get success message

