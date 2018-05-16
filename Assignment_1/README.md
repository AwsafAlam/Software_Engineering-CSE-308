# CSE 308 
- Assignment -1 
---
## Scenario 1

In many restaurants customers  may  order  children  meal  which  may  vary  from one restaurant to another, however, the process  is same. 
Children's  meals typically consist of  a  main  item, a side item,  a  drink,  and  a  toy  (e.g.,  a  hamburger,  fries,  Coke,  and  toy  dinosaur). Despite  possible variation  in  the  content  of  the  children's  meal,the construction  process  is  the  same. Whether a customer orders a hamburger, cheeseburger, or chicken, the process is the same. The employee at the  counter  directs  the  crew  to  assemble  a  main  item,  side  item,  and  toy.  These  items  are  then placed in a bag. The drink is placed in a cup and remains outside of the bag.

---
## Builder Design Pattern
---
##### Definition 
Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

**For Scenario - 1 the buider pattern is needed**

#### Class Diagram
---
Inside Class_Diagram folder

![alt text](https://drive.google.com/open?id=1RHEnFyu4AKU2moLdqUiKmVpcsv2limww "Class Diagram Scenario 1")

---
## Scenario 2

Suppose you have been given the task of designing a computer system to display and print shapes from  a  database.  The  type  of resolution  to use  to  display  and  print  the  shapes depends  on  the computer that the system is currently running on: the speed of its CPU and the amount of memory that  it  has  available.  Your system  must  be  careful  about how  much  demand it is placing on the computer.

---
## Singleton & Abstract Factory Pattern 
---
##### Definition 
- **Abstract Factory** - Provide an interface for creating families of related or dependent objects withour specifying their concrete classes.

This is needed for specifying the shape and resolution to get from the Database

- **Singleton** - Ensure a class has only one instance, and provide a global point of access to it.

Only a single instance of Database is enough to obtain the required shapes each time.

**For Scenario - 2 both Singleton and Abstract Factory pattern is needed**

#### Class Diagram
---



---
	The Assignment is arranged in three separate folders one containing the Class Diagrams and the others containing the two scenarios respectively.

