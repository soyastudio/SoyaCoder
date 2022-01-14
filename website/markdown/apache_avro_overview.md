<!-- comments -->
<!-- TODO: add media here () -->

# Apache Avro

## Overview

```pptx[What is Apache Avro]
    - Apache Avro™ is a data serialization system (Not for data modelling)
    - Avro provides:
        -- Rich data structures.
        -- A compact, fast, binary data format.
        -- A container file, to store persistent data.
        -- Remote procedure call (RPC).
        -- Simple integration with dynamic languages.
    - Avro require schema to do serialize and deserialize
```

## Comparison between Avro and Other Data formats

```pptx[Comparison between Avro and Other Data formats]
    - XML
    - Json
    - Thrift, Protocol Buffers
```


### Avro vs XML

```pptx[Avro vs XML]
    - XML is more widely-used: for configuration, data modelling, web services... 
    - Avro is for data transfer, and compare with XML, Avro is simpler and compressed
    - Both Avro and XML have schema for parsing data
    - Avro is generic and dynamic, while XML need binding to static classes
    - XML is plain text based and is human-readable while Avro is not
    
```

### Avro vs Json

```pptx[Avro vs Json]
    - Avro data has schema part and payload part, both use json as basic data structure 
    - Both Json and Avro are good to data transfer and Avro is compressed and has less size
    - Json does not has official schema, while Avro has and is in json format
    - Both Json and Avro are generic and dynamic, which means code generation is not required to read or write data in program nor to use or implement RPC protocols
    - Json is plain text based and is human-readable while Avro is not

```

### Avro vs Thrift vs Protocol Buffers

```pptx[Avro vs Thrift vs Protocol Buffers] 
    - TODO:
    
```

## Avro Schema

```pptx[Avro Schema]
    - Naming Convention: must match the regular expression [A-Za-z_][A-Za-z0-9_]* 
    - Primitive Types
    - Complex Types
        -- Records
        -- Arrays
        -- Unions
        -- Enums
        -- Maps
        -- Fixed
    - Logical Types
```

### Primitive Types

```pptx[Primitive Types]
    - null: no value
    - boolean: a binary value
    - int: 32-bit signed integer
    - long: 64-bit signed integer
    - float: single precision (32-bit) IEEE 754 floating-point number
    - double: double precision (64-bit) IEEE 754 floating-point number
    - bytes: sequence of 8-bit unsigned bytes
    - string: unicode character sequence

```

### Record Type

```pptx[Record Type]
    - name.
    - namespace: optional.
    - doc: optional. Description about the schema.
    - aliases: a JSON array of strings (optional).
    - fields: a JSON array of JSON Object, each has following attributes:
        -- name. 
        -- type: a schema, as defined above
        -- doc: optional.
        -- default: optional.
        -- order: optional. Related to sorting order.
        -- aliases: optional.

```

### Array Type

```pptx[Array Type]
    - Arrays use the type name "array"
    - Array has a single attribute "items" to specify the schema of its element

```

### Union Type

```pptx[Union Type]
    - Unions are represented using JSON arrays. For example, ["null", "string"] declares a schema which may be either a null or string.
    - A default value is specified for a record field whose type is a union, the type of the default value must match the first element of the union.
    - Unions may not contain more than one schema with the same type, except for the named types record, fixed and enum. 
    - Unions may not immediately contain other unions.

```

### Enums Type

```pptx[Enums Type]
    - Enums use the type name "enum", 
    - Enums have following attributes:
        -- name: required.
        -- symbols: required. A JSON array, listing symbols, as JSON strings. All symbols in an enum must be unique. Every symbol must match avro naming convention.
        -- default: optional
        -- namespace: optional.
        -- aliases: optional.
        -- doc: optional.
```

## Comparison of XML Schema, Avro Schema and Json Types

