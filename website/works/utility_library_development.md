# How to Develop Utility Libraries

Purpose:
- Avoid duplicating code
- Make complexity simple
- One-Point-Dependency (Loose-Coupling)
- Clean Code
- Easy to Audit
- Easy to Optimize (For example, introduce Lambdas code style to improve performance.)

Utility Ways:
- Utility Class
- Utility method
- Builder Pattern
- Static plus Singleton Service

##  Java Provided Utility Classes:

- java.lang.System
- java.lang.Math and java.lang.StrictMath
- java.lang.management.ManagementFactory

- java.lang.reflect.Array
- java.lang.reflect.Modifier
- java.lang.reflect.Proxy

- java.util.Objects, java.util.Arrays and java.util.Collections
- java.util.Base64
- java.util.Spliterators
- java.util.concurrent.Executors
- java.util.concurrent.locks.LockSupport
- java.util.stream.Collectors

- java.time.*

- java.nio.channels.Channels
- java.nio.file.Files
- java.nio.file.Paths

- java.beans.Beans
- java.beans.Introspector

- java.text.Normalizer

## Commonly Used Utility Libraries

### Apache Commons

### Google Guava

### Springframework Utilities

## Utility Topics

### AssertUtils

#### Assertion Topics (See also Checker Framework)
- Null check
- Empty check
- State check
- Type Casting check

#### Examples
- java: java.util.Objects
- apache commons: org.apache.commons.lang3.Validate
- guava: com.google.common.base.Preconditions
- springframework: org.springframework.util.Assert
- junit: org.junit.platform.commons.util.Preconditions

#### Write Your Own AssertUtils
- none dependency
- internally used
- clean code
- if having to import external libraries, make it one-point-dependency

#### Strategy
- Pure validation: return boolean
- If validated, return the value for validation, otherwise throw exception with message
- If validated, return the value for validation, otherwise provide default value

#### Discussion
- Is it helpful to use @NotNull annotation in method argument?

### LogUtils

#### Why Using Logging

#### Examples
- JUL: java.util.logging
- Log4J
- LogBack
- SL4J
- Apache Common Logging

#### What Happened When You Log a Message

#### Logging in Different Stage (Logging Control)

#### Logging and Exception
- Never put logging code in Exception Class (You can put in catch clause)
- 

#### Write Your Own LogUtils
- One-point-dependency (clean code)
- Easy enable/disable log in different stage

#### Logging Management








### StringUtils

#### Utility methods in java.lang.String
- copyValueOf(): 
- valueOf()
- format()
- join()

#### Apache Commons Lang
- org.apache.commons.lang3.StringUtils
- org.apache.commons.lang3.CharSetUtils



### DateTimeUtils
- Date Format
- Date Time Calculation ()
- Calendar.Builder


### IOUtils

### ConvertUtils

### ReflectUtils

### FileSystemUtils and FileUtils

### EncodingUtils and DigestUtils




