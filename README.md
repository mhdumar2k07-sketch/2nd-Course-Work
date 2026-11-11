Salary Information System - CourseWork Three

A simple Java console application to calculate salary-related information for employees.

Features

[1] Calculate Income Tax
Calculates monthly income tax based on salary slabs.

- 0 - 100,000 : 0%
- 100,001 - 141,667 : 6%
- 141,668 - 183,333 : 12%
- 183,334 - 225,000 : 18%
- 225,001 - 266,667 : 24%
- 266,668 - 308,333 : 30%
- Above 308,333 : 36%

Example:
- Salary: 250,000
- Income Tax: 21,000

[2] Calculate Annual Bonus
Calculates annual bonus based on monthly salary.

- Salary < 100,000 : Rs. 5,000
- Salary < 200,000 : 10% of salary
- Salary < 300,000 : 15% of salary
- Salary < 400,000 : 20% of salary
- Salary >= 400,000 : 35% of salary

Example:
- Salary: 250,000
- Annual Bonus: 37,500

[3] Calculate Loan Amount
Calculates maximum loan amount an employee can get.

- Salary must be more than Rs. 50,000
- Maximum loan period: 5 years
- Monthly installment: 60% of salary
- Annual interest rate: 15%

Example:
- Salary: 250,000
- Years: 3
- Loan Amount: 4,327,000

How to Run

Compile the Java file:
javac CourseWorkThree.java

Run the program:
java CourseWorkThree

Technologies Used
- Java
- Scanner class for user input
- switch-case and if-else for control flow
- Math.pow() for loan calculation

Course
CourseWork Three - Java Programming
