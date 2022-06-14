
@smoke
Feature: user could open followUs links
#first scenario:
  Scenario: user could open facebook and push follow us
    When  user open facebook page
    Then  facebook is opened



#second scenario
  Scenario: user could open site and push follow us twitter
    When user open twitter page
    Then  twitter is opened

# third scenario:
  Scenario: user could open site and push follow us RSS
    When user open RSS page
    Then  RSS is opened


# fourth scenario:
  Scenario: user could open site and push follow us youtube
    When user open youtube page
    Then  youtube is opened

