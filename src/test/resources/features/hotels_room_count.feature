@web

  Feature: room count dropdown

    Background:
      Given I am on hotels.com home page


    @verify-room-count-dropdown
    Scenario Outline: Verify room count dropdown
      When I select <select_rooms> from room dropdown
      Then I verify <number_of_room_dropdown> is displayed


      Examples:
        | select_rooms   | number_of_room_dropdown |
        | 1              |1                        |
        | 2              |2                        |
        | 3              |3                        |
        | 4              |4                        |
        | 5              |5                        |
        | 6              |6                        |
        | 7              |7                        |
        | 8              |8                        |
        | 9+             |0                        |


