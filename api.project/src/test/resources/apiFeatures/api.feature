Feature: validate the API

Scenario: POST a sample json 
Given create POST api payload
When user calls with POST http request
Then API call executed with status code 201

Scenario: GET the information
Given Get a playlist payload
When user calls with GET http request
Then API call executes with status code 200

Scenario: verify the response
Then response is verified with the expected response