# Kafka-Demo

`STEP 1`  : docker-compose.yml

`STEP 2`  : use [kafdrop](http://localhost:9000/) ui to create kafka topic

    Note:
            - while creating kafka topic check brocker configuration in docker-compose file.
            - if brockers are 3 you can not create more then three partations.

`STEP 3` : Rest API to publish message in kafka topic

### Reference Documentation
For further reference, please consider the following sections:

* [Kafka docker-compose](https://github.com/conduktor/kafka-stack-docker-compose/blob/master/zk-single-kafka-multiple.yml)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
