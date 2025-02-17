-- Inserting sample data
INSERT INTO account (account_id,account_number, account_name, account_type, balance_date, currency, opening_available_balance)
VALUES 
(1,'585309209','SGSavings726', 'Savings', '2018-11-08', 'SGD', 84327.51),
(2,'791066619','AUSavings933', 'Savings', '2018-11-08', 'AUD', 88005.93),
(3,'321143048','AUCurrent433', 'Current', '2018-11-08', 'AUD', 38010.62),
(4,'347786244','SGCurrent166', 'current', '2018-11-08', 'SGD', 50664.65);

INSERT INTO transaction (id,account_id,account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
VALUES 
(1,1,'585309209', 'SGSavings726', '2012-01-12', 'SGD', 132.30, NULL, 'Debit', 'Bill'),
(2,1,'585309209', 'SGSavings726', '2012-01-12', 'SGD', NULL, 2103.40, 'Credit', 'Salary'),
(3,2,'791066619', 'AUSavings933', '2012-01-12', 'AUD', 1399.00, NULL, 'Debit', 'Bill'),
(4,2,'791066619', 'AUSavings933', '2012-01-12', 'AUD', 352.20, NULL, 'Debit', 'Food'),
(5,3,'321143048', 'AUCurrent433', '2012-01-12', 'AUD', 1543.33, NULL, 'Debit', 'Bill'),
(6,3,'321143048', 'AUCurrent433', '2012-01-12', 'AUD', NULL, 3212.44, 'Credit', 'Salary'),
(7,4,'347786244', 'SGCurrent166', '2012-01-12', 'SGD', 1033.50, NULL, 'Debit', 'Bill'),
(8,4,'347786244', 'SGCurrent166', '2012-01-12', 'SGD', 152.00, NULL, 'Debit', 'Food');
