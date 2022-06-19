**<h1 align="left">EJ's Taco Shop Project</h1>**

The task is to design and build a point of sale program for a growing restaurant business.


**<h2 align = "left">The point of sale program must</h2>**

- Allow the waitstaff to input the table number, and the number of diners at this table
   - Each table can seat up to 4 diners
- For each diner at the table, the system must
   - Display a menu of at least 7 common breakfast items
      - The menu is small, but the quality is high
   - Allow the waitstaff to enter the items the diner has ordered
      - Each diner may order as many items as they want
   - Display the total (before tax) and total (with tax) for each individual diner (sales tax is 8%)
- After the orders for all diners at this table have been entered, the system must display:
   - total with tax for the whole table
   - suggested tip amounts for 10%, 15%, 20% and 25% tips for whole table
- After a table is complete, the program should restart at the beginning, and continue until the manager selects "quit"
- When the manager selects "quit", the program must report the total amount of money that should be in the register (ticket totals + tax for the entire day), before the program ends


**<h3 align = "left">Analysis and Design</h3>**

Take some time to analyze the problem description above. Based on your analysis, begin to sketch a design for a program to solve the problem. Produce a document that captures your design. Your design document should include the following information.

You may use or adapt your design documentation from the previous Collaborative Project Challenge in which you designed and implemented this system in Python.


**<h4 align="left">Program Inputs</h4>**

Identify each of the inputs to the program. For each input, provide the following:

1. Description of the input
2. Good name for a variable to store the input value
3. Data type of this input


**<h4 align="left">Program Outputs</h4>**

Identify each of the outputs from the program. For each output, provide the following:

1. Description of the output
2. Good name for a variable to store the output value
3. Data type of this output


**<h4 align="left">Structure Summary<h4>**

- **Methods**
  - Design a method named displayMenu, that will display the menu of numbered (1 - 7) choices when called. This method should take no arguments, and should return no value.
  - Design a method named getMenuChoice, that will ask for and collect the user's menu choice. This method should take no arguments, and should return an int value indicating the menu number of the menu item the user has selected.
  - Design a method named getPriceOfMenuChoice. This method should take an int argument indicating a menu choice (1 - 7), and should return a float value indicating the price of this menu item.
  - Design a method named dinerWantsAnotherItem, that asks the user if the diner wants another menu item. This method should take no arguments, and should return a boolean value indicating whether or not the diner wants to order another menu item.
  - Design a method named getDinersOrder. This method should take no arguments, and should return a float value indicating the total cost (pre tax) of the items this diner orders. This method should first display the menu (by calling the displayMenu method), then continue to ask if this diner would like to order another menu item (by calling the dinerWantsAnotherItem method) - collecting the total cost of all items ordered by this diner - until the diner does not want any more menu items. The method should print out the total cost of this diner's order (both without and with 8% sales tax) before returning the accumulated total cost (pre tax) of all menu items ordered by this diner.
  - Design a method named getNumberOfDinersAtTable, that will ask the user how many diners are at this table (1-4), and will return an int value indicating the number of diners at this table.
  - Design a method named displaySuggestedTipAmmounts. This method should take a float argument indicating a cost, and should return no value. This method should display a list of tip amounts for 10%, 15%, 20%, and 25% tip rates based on the cost value passed in as an argument.
  - Design a method named getTableOrder. This method should take no arguments, and should return a float value indicating the total cost (with tax) for all the diners at this table. This method should first ask the user to enter the number of diners at this table (by calling the getNumberOfDinersAtTable method). Then it should take the order for each diner at the table (by calling the getDinersOrder method) - collecting the total cost for all the diners at this table. The method should print out the total cost for this table (with 8% sales tax), and a list of tip amounts for 10%, 15%, 20%, and 25% tip rates, before returning the accumulated total cost (with tax) for all the diners at this table.
  - Design a method named moreTableToServe, that asks the user if there are more tables to serve. This method should take no arguments, and should return a boolean value indicating whether or not there are more tables to serve.
  - Design a method named getAllTableOrders. This method should take no arguments, and should return a float value indicating the total amount of money (including tax) collected for the day. This method should continue to ask if there are more tables to serve (by calling the moreTablestoServe method), and get the order for each table (by calling the getTableOrder method) until the user indicates that there are no more tables to serve. This method should accumulate the total (with tax) amounts for all tables served.
  
  
**<h5 align="left">Things to think about when you’re designing this program<h5>**

- Spend some time choosing your variable and method names carefully. Names should be descriptive.
- For each method your design and write, make sure that method does only one thing.
- For each method that you design and write, give that method a name that clearly describes what that method does.
- For each method that you design and write, ask yourself "What things does this method need to know in order to be able to do what this method should do?" The things the method needs to know should be passed to the method as arguments, so the method will need some parameter variables to store these argument values that are passed to it. Some methods may not need to know anything in order to do what they should do, but those that do should take arguments. In general, avoid the use of global variables within methods.
- For each method that you design and write, ask yourself "what do I need to get back from this method?". If this method must give something back when it is called, the method should use a return statement to return that value.
- Tasks that are repeated within the program should generally be inside of some loop.
