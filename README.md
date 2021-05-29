# BigCommerce-Task-Heng-Liu
it is an interview task from Bigcommerce, in which framework I used is spring boot + mybatis

## Prerequisites
Mysql 5.7 ; IntelliJ IDEA(not the community version, because it does not have tomcat); Chrome or other explorers

### Run

1 START MYSQL and change DB Config

	1.1 create a db called bigcommerce  
	1.2 open application.properties
	    find these two line:
		spring.datasource.username=stephen
		spring.datasource.password=83603919
		
	     directly change configs above, according to your own mysql configs on your computer as following
		spring.datasource.username=your-db-username
		spring.datasource.password=your-db-password
		
	
2 ADD TEST DATA IN DB

  open two sql files : sql/t_customer.sql as well as sql/t_order.sql
  open the db: bigcommerce
  run all sentences in these two files to add test data
  
3 START SERVER(TOMCAT)

    3.1 open com.BigCommerce.task.hengLiu.Application.java
    3.2 and run this java(by clicking the green triangle sign) , wait for about 10 seconds till tomcat starts
	
4 TEST APIS

  open chrome or other explorers
  
  test1: 
  A list of Customers, including the total number of orders they have placed
  run this address:
  http://localhost:8000/bigcommerce/customer/totalOrderNumber
  
  
  
  
  test2:  
  A Customer Details screen that displays the Order History for that Customer
  and their Lifetime Value (defined as the total value of all of their orders)
  run this address:
  http://localhost:8000/bigcommerce/customer/orderLifeValue/1
   
   
   
  test3: if a wrong customer_id is sent , see the exception result
  run this address:
  http://localhost:8000/bigcommerce/customer/orderLifeValue/1XX
   
   
 5: UNIT TESTS 
 
 
    open com.BigCommerce.ApplicationTest.java
    this is about the unit tests  run those three method one by one
