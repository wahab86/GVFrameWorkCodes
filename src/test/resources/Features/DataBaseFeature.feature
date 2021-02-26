Feature: DataBase SQL query feature scenario


@DBTest
Scenario: Exectue all information from Actor Table

		Given User Connects to PostgresSql DataBase
		When User sends query 'select * from public.actor'
		Then User should get all infromation from that table
		
		
		
		
		
		
		
