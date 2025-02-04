https://spring.io/guides/gs/accessing-data-rest#:~:text=pre%2Dinitialized%20project

docker build -t accessing-data-rest:1.3 .

docker run -p 8080:8080 accessing-data-rest:1.3

## Spring Boot 

https://spring.io/guides/gs/accessing-data-rest

```sh
git clone https://github.com/spring-guides/gs-accessing-data-rest.git
cd gs-accessing-data-rest/complete 
./mvnw spring-boot:run
```

### Test

```sh
clear
curl http://localhost:8080/people

curl -i -H "Content-Type:application/json" -d '{"firstName": "Frodo", "lastName": "Baggins"}' http://localhost:8080/people

curl http://localhost:8080/people/1

curl http://localhost:8080/people/search

curl http://localhost:8080/people/search/findByLastName?name=Baggins


curl -X PUT -H "Content-Type:application/json" -d '{"firstName": "Bilbo", "lastName": "Baggins"}' http://localhost:8080/people/1

curl -X PATCH -H "Content-Type:application/json" -d '{"firstName": "Bilbo Jr."}' http://localhost:8080/people/1

curl -X DELETE http://localhost:8080/people/1
```



## AKS to Storage via Vnet peering 

https://techcommunity.microsoft.com/blog/coreinfrastructureandsecurityblog/quick-start-guide-to-azure-private-endpoints-with-aks--storage/3943803
(pt. 2.)

# Bicep
