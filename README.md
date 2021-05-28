# java-bigCommerce-task
it is interview task from Bigcommerce

## Prerequisites
Mysql 5.7 ; IntelliJ IDEA; Chrome

### Run

1 start Mysql 

2 open two sql files : sql/t_customer.sql as well as sql/t_order.sql
  run all sentences in these two files to add test data
  
3 open com.BigCommerce.task.hengLiu.Application.java
    and run this java   
	
4 open chrome or other explorer
  test1:  A list of Customers, including the total number of orders they have placed
  http://localhost:8000/bigcommerce/customer/totalOrderNumber
  
  
  
  test2:  A Customer Details screen that displays the Order History for that Customer
         and their Lifetime Value (defined as the total value of all of their orders)
  http://localhost:8000/bigcommerce/customer/orderLifeValue/1
   
   
  test3: if a wrong parameter is sent , see the exception result
  http://localhost:8000/bigcommerce/customer/orderLifeValue/1XX
   
   
 5: com.BigCommerce.ApplicationTest.java
    this is the test case java file 