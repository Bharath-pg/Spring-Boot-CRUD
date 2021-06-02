# Spring-Boot-CRUD
## About The Project

Spring-Boot application which supports all rest API endpoints with in-memory H2 database  
  
This projects consists 3 layers namely:  
  
* **```API layer:```** POST, GET, PUT, DELETE requests
* **```Service Layer:```** Consists of business logic
* **```Data Access Layer:```** Responsible for connecting the database    

![image](https://user-images.githubusercontent.com/43911332/120148844-785ec080-c206-11eb-826d-970474d87641.png)


## Routes
#### POST
* ```localhost:8082/departments``` 
#### GET

* Fetch all the data  
```localhost:8082/departments```  

* Fetch data based on ID  
```localhost:8082/departments/{id}```

* Fetch data based on DeptName  
```localhost:8082/departments/name/{DeptName}```

#### DELETE
* Delete data based on ID  
```localhost:8082/departments/{id}```

#### PUT
* Update data based on ID  
```localhost:8082/departments/{id}```
