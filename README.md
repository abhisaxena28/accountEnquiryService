I have developed a service utilizing REST APIs. The service features two key endpoints:

Account List Enquiry Endpoint: This endpoint returns the list of accounts the user holds.
Account Transaction Enquiry Endpoint: By submitting a user's account number, this endpoint provides the transaction history associated with that account.

Sample data is in data.sql file and below are the two corresponding endpoints:

1: http://localhost:8080/api/accounts

2: http://localhost:8080/api/transactions/{accountNumber}

E.g.:
http://localhost:8080/api/transactions/585309209
http://localhost:8080/api/transactions/791066619
