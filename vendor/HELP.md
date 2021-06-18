# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.11.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.11.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#using-boot-devtools)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#production-ready)
* [Hystrix [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#circuit-breaker-hystrix-clients)
* [Hystrix Dashboard [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#circuit-breaker-hystrix-dashboard)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Zuul [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#router-and-filter-zuul)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Circuit Breaker](https://spring.io/guides/gs/circuit-breaker/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)

### Additional Links
These additional references should also help you:

* [Sample of circuit-breaker metrics with Spring Cloud and Hystrix Dashboard](https://github.com/spring-cloud-samples/hystrix-dashboard)

# Spring Cloud Netflix Maintenance Mode

The dependencies listed below are in maintenance mode. We do not recommend adding them to
new projects:

*  Zuul
*  Hystrix
*  Hystrix Dashboard

The decision to move most of the Spring Cloud Netflix projects to maintenance mode was
a response to Netflix not continuing maintenance of many of the libraries that we provided
support for.

Please see [this blog entry](https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now#spring-cloud-netflix-projects-entering-maintenance-mode)
for more information on maintenance mode and a list of suggested replacements for those
libraries.
