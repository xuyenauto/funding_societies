Feature: Verify UI test

  @smoke_test
  Scenario: TC_01_Verify UI test
    When I click on "Statistics" on top navigation
    Then I should see the total funded value is displayed
    And I should see the number of financing value is displayed
    And I should see the default rate value is displayed
    And I should see the financing fulfillment rate value is displayed
    And I should see the "General" tab is displayed
    And I should see the "Repayment" tab is displayed
    And I should see the "Disbursement" tab is displayed
#
##  go to General tab and get the total approved loans, total amount disbursed and
##  default rate
    When I click on "General" tab

#  ==========clarify Requirement==============
#  There are a ton of steps to get value as follows but we don't have any step to use those, so I put Todo at here, but in general, we can run test now.
#    Then I get the total approved value
#    And I get the total default rate value
#    And I get the total amount disbursement value
#
##  go to Repayment tab and get total repayment amount, principal amount and
##  interest amount
#    When I click on "Repayment" tab
#    Then I get the total repayment value
#    And I get the principal amount value
#    And I get the interest amount value
#
##  go to Disbursement tab and store all industry names according percentage
##  (increasing order)
#    When I click on "Disbursement" tab
#    Then I get the total repayment value