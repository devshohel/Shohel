
/*

# Class Task :: 07 Jan 26
1. Create a JAVA project named R68_YOURID

2. Create 04 packages for the project you've created
   :=> com.cgnt.ui
   :=> com.cgnt.controller
   :=> com.cgnt.service
   :=> com.cgnt.dao

3. Create an Enitity named Student inside the ui package and take below actions :
       :=> Define instance private properties
            1. studentID
            2. studentName
            3. subject
            4. marks
            5. fees
        :=> Create a constructor initializing the instance properties
        :=> Create getters and setters for the instance properties

4. Create an User Input JFrame class and design text fields according with the
   Student Entity

5. Create an action for the Save button and wrap the user data with the entity
   take the inputted values 
        from the user form 
            to the entity/model

6. Create the MVC architecture classes 
    according to the relevant package for the below layers :
    - StudentController
    - StudentService
    - StudentDAO

7. Create a public method returning the Entity Student type for the below layers :
    - StudentController method : create(Student s)
    - StudentService method    : save(Student s)
    - StudentDAO method        : insert(Student s)

8. Inside the save action method of UI
    - Create instance of Controller & call the create method to pass the Entity
        from UI to Controller
        - store the Entity inside an Entity type
9. Inside the create method of Controller
    - Create instance of Service & call the save method to pass the Entity
        from Controller to Service
        - return the Entity
10. Inside the save method of Service
    - Create instance of DAO & call the insert method to pass the Entity
        from Service to DAO
        - return the Entity
11. Inside the insert method of DAO
    - return the Entity

12. Show the Enity values on the top of the UI

*/