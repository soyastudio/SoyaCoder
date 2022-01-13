<!-- comments -->

# Understanding Spring Boot

## Overview

```pptx[Spring Boot Overview]
    - The core of Spring Boot is Spring Framework 
    - The core of spring framework is spring IoC container
    - Integrated lots of java libraries into spring IoC container
    - SpringBoot wraps spring framework, and make application:
        -- Bootable
        -- Easy to start with Initializr Tool
        -- Easy to configure, test and manage
        -- Product ready for runtime monitoring and management (Actuator)
```

<!-- TODO: add media here () -->


## Spring IoC Container

```pptx[Spring IoC Container]
    - Simple Understanding: ApplicationContext
    - More Details: 
        -- Container and Components
        -- Inversion of Control and Dependency Injection
        -- POJO(Plain Old Java Object)
    - Deep understanding about ApplicationContext
    
```

<!-- TODO: add media here () -->

### Container and Components

```pptx[Container and Components]
    - Separate business logic and low-level technical details such as security, transaction and state management, multithreading, resource pooling, etc.
    - Components focus on business logic and managed by container;
    - Containers prepare and provide low-level complex services for the components;
    - Container manages the lifecycle of components and provide related services to the components;
    - There are protocols between container and components

```

<!-- TODO: add media here () -->

### POJO (Plain Old Java Object)

```pptx[Plain Old Java Object]
    - A plain old Java object (POJO) is an ordinary Java object, not bound by any special restriction.
    - POJO is about the protocol between components and container
    - Interfaces and Annotations are used for component lifecycle management

```

<!-- TODO: add media here () -->


### IoC and Dependent Injection

```pptx[IoC and Dependency Injection]
    - Inversion of control (IoC) is a software design principle
    - IoC is a bottom-up instead of top-down approach, which means the design start from a special task or module, not from a whole system.
    - Continuously decouple the execution of a task from implementation to increase the modularity and reusability
    - IoC relies on contracts between classes or modules
    - Dependency Injection is an implementation to support the contracts (Dependency) through a way called Injection (passing of a dependency into the client that uses it)

```

<!-- TODO: add media here (10) -->

### ApplicationContext

```pptx[ApplicationContext]
    - The lifecycle of ApplicationContext is that of application
    - It is a BeanFactory
    - It is a ResourceLoader
    - It is a ApplicationEventPublisher
    
```

<!-- TODO: add media here -->

## Include Almost Every Java Library into Springframework without or with less coding



## SpringBoot

```pptx[Spring Initializr and Bootable Application]
    - Bootable
    - Easy to start with spring initializr
    - Change xml based configuration to annotation based configuration
    - Solved dependent libraries' version conflicts
    - With abundant spring-boot-starters, start and manage projects made super easy
    - Test are included in parallel
    - Acturator: monitor and manage application at runtime

```

### Spring Initializr and Bootable Application

```pptx[Spring Initializr and Bootable Application]
    - TODO:

```

<!-- TODO: add media here -->

### Spring Boot Dependency Versions

[Spring Boot Dependency Versions](https://docs.spring.io/spring-boot/docs/current/reference/html/dependency-versions.html)



## Labs

### SpringBoot Initializr and Bootable 


### Understanding ApplicationContext


### Include More Starters
