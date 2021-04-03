# cosmosdb-springboot-java-sample

Copy of Microsofts azure cosmosdb example app with needed fixes and some modifications

## Content

Small example how to use `azure-spring-data-cosmos` Java SQL API with spring boot.

## Original arcticle

See original article for detailed setup information

https://docs.microsoft.com/en-us/azure/cosmos-db/create-sql-api-spring-data

## Prerequisites

- `JDK 11` or newer 
- Maven. 
- An active Azure account.
    - If you don't have one, you can sign up for a [free account](https://azure.microsoft.com/free/).
- Cosmos db configured  
    - Use sql api

## App 

### Properties

Get keys from cosmos db accounts *keys* section and fill application.properties or set environment variables so that proper keys are used

#### application.properties

    cosmos.uri=${ACCOUNT_HOST}
    cosmos.key=${ACCOUNT_KEY}
    cosmos.secondaryKey=${SECONDARY_ACCOUNT_KEY}
    
### Test it

mvn clean install spring-boot:run

## Resources

