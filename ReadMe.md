## Spring Boot 

https://spring.io/guides/gs/accessing-data-rest
src : https://github.com/spring-guides/gs-accessing-data-rest.git

https://spring.io/guides/gs/accessing-data-rest#:~:text=pre%2Dinitialized%20project

docker build -t accessing-data-rest:1.3 .

docker run -p 8080:8080 accessing-data-rest:1.3


```sh
# Tag the commit with 1.0:
git tag 1.0

# Push the commit and the tag to the remote repository:

push origin main --tags
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
