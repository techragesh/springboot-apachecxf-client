# springboot-apachecxf-client
This project demonstrates how to implement apachecxf client in Springboot and how to generated wsdltojava for client call.

### Springboot-apachecxf- jaxws example ###

* This application shows how to create a client using apachecxf jaxws and how to generate wsdl2java from the wsdl.
* Used java2ws for service to wsdl generation and those are configured in pom.xml

Note: Refer this link for Service Project

[springboot-apachecxf-service](https://github.com/techragesh/springboot-apachecxf-service)

To test this application, Checkout the service project (above link) and run the service. 

### Keypoints to remember ###

* pom.xml for client code generation

```
            <plugin>
				<groupId>org.apache.cxf</groupId>
				<artifactId>cxf-codegen-plugin</artifactId>
				<version>3.2.0</version>
				<executions>
					<execution>
						<id>generate-sources</id>
						<phase>generate-sources</phase>
						<goals>
							<goal>wsdl2java</goal>
						</goals>
						<configuration>
							<sourceRoot>${project.build.directory}/target/generated-sources/wsdlimport/booking</sourceRoot>
							<wsdlOptions>
								<wsdlOption>
									<wsdl>src/main/resources/wsdl/BookingService.wsdl</wsdl>
									<wsdlLocation>classpath:wsdl/BookingService.wsdl</wsdlLocation>
								</wsdlOption>
							</wsdlOptions>
						</configuration>
					</execution>
				</executions>
			</plugin>

```

* Run this maven command for client code generation: mvn clean generate-sources

* ClientConfig.java

```
      @Bean
      public BookingService bookingServiceClient(){
          JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
          jaxWsProxyFactoryBean.setServiceClass(BookingService.class);
          jaxWsProxyFactoryBean.setAddress("http://localhost:8085"+ BASE_URL + SERVICE_URL);
          return (BookingService) jaxWsProxyFactoryBean.create();
      }

```
* Refer BookingClientTest.java class file 

### Happy Coding ###