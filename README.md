# trackey
-key tracking system for car dealership


High level objective:
	Sales managers can utilize to check in and check out car keys using barcode scanner


	Sales Managers
	DB Admin
	Salespeople


Use Case:
	Sales Manager: CRUD for SalesPeople
					CRUD for new cars/car keys
					Checkin/ Checkout of Keys 
	Sales People: Lookup car


Architecture:
	Redundancy/Backup/DR etc
	LDAP or AD or Oauth for authentication/authorization?
	Java Springboot Backend
	Persistent DB - H2
	React frontend

Database: 
	Employee:
		Name - String
		email - String
		EID - String - PK
		Role - String
	Car: 
		Make - String
		model - String
		color - String
		PK vin - String
		stock # - String
		Sold - Boolean