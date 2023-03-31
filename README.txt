
End points:
Currentcy Exchange Service
http://localhost:8000/currency-exchange/from/USD/to/INR

Currentcy Conversion Service
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/15

naming server
http://localhost:8761/

API Gateway
http://localhost:8765/
WITHOUT APIGatewayConfiguration
http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR
http://localhost:8100/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/15
with  APIGatewayConfiguration
http://localhost:8765/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/15

Microservices:
currency-exchange
currency-conversion


Data File:
data.sql
localhost:8000/h2-console

Technology:
Spring boot microservices
Spring boot JPA
naming server (Eureka server)
Load balancing using feign
API Gateway
Circuit Breaker Pattern using Resilience4j

Work spaces
currency-exchange-service
currency-conversion-service
naming-server


30 Mar - lesson 147