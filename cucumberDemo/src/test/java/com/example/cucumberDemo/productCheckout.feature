Feature: product checkout Feature
  Scenario Outline: check the product price
    Given the prices of the "<product>" is <price>
    When I check <quantity> of "<product>"
    Then The total price of "<product>" should be <total>

    Examples:
    | product     | price | quantity | total |
    | Headphone   | 1000  |  1       | 1000  |
    | Eyearphone  | 500   |  2       | 1000  |
    | Watch       | 3000  |  3       | 9000  |
    | Charger     | 2000  |  2       | 4000  |

