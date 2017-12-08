# Restaurants data REST API

## How to use it:

- Clone the project
- Install Activator
- Install MongoDB
- Create new database and new collection
  ```
  use elmenus
  createCollection("resturant")
  ```
- Build with sbt (import to IntelliJ or eclipse)
- activator run

## Examples:
### Get all resturants
```
curl -v -H "Content-Type: application/json" -X GET http://localhost:9000/api/restaurant
```
Expected Output:

```
*   Trying 127.0.0.1...
* Connected to localhost (127.0.0.1) port 9000 (#0)
> GET /api/restaurant HTTP/1.1
> Host: localhost:9000
> User-Agent: curl/7.47.0
> Accept: */*
> Content-Type: application/json
>
< HTTP/1.1 200 OK
< Content-Type: application/json; charset=utf-8
< Content-Length: 2814
<
* Connection #0 to host localhost left intact
[[{"uuid":"5dc8c9cb-add9-11e7-b988-0242ac110002","data":{"enName":"English name value","arName":"Arabic name value","state":"string","routingMethod":"String","logo":"String",
"coverPhoto":"String","enDescription":"String", ... "client":  false,"pendingInfo": true, "pendingMenu": false, "closed": true}},
{"uuid":"5dc8cbba-add9-11e7-b988-02sdf110002","data":{"enName":"English name value","arName":"Arabic name value","state":"string","routingMethod":"String","logo":"String",
"coverPhoto":"String","enDescription":"String", ... "client":  false,"pendingInfo": true, "pendingMenu": false, "closed": true}},...]]
```

### Add new resturant
```
curl -v -H "Content-Type: application/json" -X GET http://localhost:9000/api/restau -d '{"uuid": "12", "data": {"enName": "gemgem",
"arName": "محمد جمال",  "state": "string", "routingMethod": "String", "logo": "String","coverPhoto": "String","enDescription": "String",
"arDescription": "String", "shortNumber": "String", "facebookLink":"String", "twitterLink": "String", "youtubeLink": "String",
"website": "String", "onlinePayment": true, "client": false,"pendingInfo": true, "pendingMenu": false,
"closed": true}}' -v -H "Content-Type: application/json" -X POST http://localhost:9000/api/restaurant
```
Expected Output:
```
*   Trying 127.0.0.1...
* Connected to localhost (127.0.0.1) port 9000 (#0)
> POST /api/restaurant HTTP/1.1
> Host: localhost:9000
> User-Agent: curl/7.47.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 435
>
* upload completely sent off: 435 out of 435 bytes
< HTTP/1.1 200 OK
< Content-Type: application/json; charset=utf-8
< Content-Length: 56
<
* Connection #0 to host localhost left intact
{"result":"Data was inserted Successfully into MongoDB"}
```

### Fetch a specific restuarant with uuid
```
curl -v -H "Content-Type: application/json" -X GET http://localhost:9000/api/restaurant/12
```

Expected Output:

```
[{"uuid":"12","data":{"enName":"English name value","arName":"Arabic name value","state":"string","routingMethod":"String","logo":"String",
"coverPhoto":"String","enDescription":"String", ... "client":  false,"pendingInfo": true, "pendingMenu": false, "closed": true}}
```

## TODO
- Update restaurant
- Filter data with query string

