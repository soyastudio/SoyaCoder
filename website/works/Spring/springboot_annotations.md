# SpringBoot Annotations

## Configuration Based Annotations

### Basic: 
- @SpringBootApplication
- @Configuration 
- @Bean

### Specifying Configuration: 
- @ComponentScan, @ComponentScans
- @EnableAutoConfiguration

### Adding Properties to Environment: 
- @PropertySource, @PropertySources

### Enable specific feature:
- @EnableWebMvc
- @EnableCaching
- @EnableScheduling
- @EnableAsync
- @EnableWebSocket
- @EnableJpaRepositories
- @EnableTransactionManagement
- @EnableJpaAuditing
- @EnableJms
- @EnableKafka
- ...


## Component Based Annotations
These annotations are resided org.springframework.stereotype package.
- @Component
- @Service
- @Repository
- @Controller

- @Indexed
used by Indexer to pre-generate index file located in META-INF/spring.components one per JAR at compile time. Every index entry in this file is a fully qualified name of a candidate component as a key and comma separated stereotypes as value. So for example “X=Y, Z” can be read simply as register a candidate component X with following stereotypes Y, Z.
[TODO]

## Component Additional Annotations (under org.springframework.context.annotation package)
- @DependsOn
- @Primary
- @Scope: (ConfigurableBeanFactory.SCOPE_PROTOTYPE, ConfigurableBeanFactory.SCOPE_SINGLETON, WebApplicationContext.SCOPE_REQUEST, WebApplicationContext.SCOPE_SESSION)

## Injection and Binding Annotations (org.springframework.beans.factory.annotation package)
- @AutoWired
- @Qualifier

### @Qualifier vs @Primary


## Lifecycle Annotation
- @PostConstruction and @PreDestruction
- @EventListener: ApplicationContext Event

## Testing Basic Annotations
- @SpringBootTest
- @MockBean
- @Validated


## Spring MVC Annotations
org.springframework.web.servlet.DispatcherServlet

### MVC Annotations
- @RequestMapping
- @PathVariable
- @RequestParam
- @ModelAttribute
- @SessionAttribute, @SessionAttributes
- @RequestBody and @ResponseBody
- @RequestHeader and @ResponseHeader

### MVC REST Annotations
- @RestController
- @GetMapping, @PostMapping, @PathMapping, @PutMapping, @DeleteMapping
- @PathVariable
- @RequestBody
- @ResponseBody













