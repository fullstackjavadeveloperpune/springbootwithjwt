# springbootwithjwt
Spring Boot With JWT

Dependencies-

<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.0.4</version>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>
		

---------------------------------------------------
application.yaml file-


spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/productdatabase?createDatabaseIfNotExist=true&autoReconnect=true&showSSL=false
    username: postgres
    password: postgres
  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: update
    show-sql: true

  main:
    allow-circular-references: true

jwt:
  secret: 404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970
  expiration: 86400000    # A Day in MilliSeconds
