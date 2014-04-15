Meta:
Scenario: 2 times two
Meta: @skip @theme multiply
Given a variable x with value 2
When I multiply x by 2
Then the result should equal 4

Scenario: 3 squared
Meta: @theme multiply
Given a variable x with value 3
When I multiply x by 3
Then the result should equal 9

Scenario: 2 to the power of 3
Meta: @theme exponent
Given a variable x with value 2
When I raise the power of x by 3
Then the result should equal 8