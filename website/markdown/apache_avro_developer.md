<!-- comments -->
<!-- TODO: add media here () -->

# Apache Avro

## Overview

```pptx[What is Apache Avro]
    - Apache Avro™ is a data serialization system. That means it is for data transfer purpose instead of data modelling.
    - Avro require schema to serialize and deserialize data.
    - Avro provides:
        -- Rich data structures.
        -- A compact, fast, binary data format.
        -- A container file, to store persistent data.
        -- Remote procedure call (RPC).
        -- Simple integration with dynamic languages.
```

## Comparison between Avro and Other Data formats

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


## Avro Schema

```pptx[Avro Schema]
    - Avro schema is in json format, usually with extension ".avsc"
    - Naming Convention: must match the regular expression [A-Za-z_][A-Za-z0-9_]* 
    - Avro Data Type:
        -- Primitive Types: null, boolean, int, long, float, double, bytes, string
        -- Complex Types: record, array, union, enum, maps, fixed
        -- Logical Types: a logical type is an Avro primitive or complex type with extra attributes to represent a derived type. 
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
    - records use the type name "record", and have following attributes:
    - name: required
    - namespace: optional.
    - doc: optional. Description about the schema.
    - aliases: a JSON array of strings (optional).
    - fields: an array of JSON Object, each has attributes:
        -- name: required 
        -- type: required. A schema, as defined above
        -- doc: optional.
        -- default: optional.
        -- order: optional. Related to sorting order.
        -- aliases: optional.

```

#### Record Schema Example

```
{
  "type": "record",
  "name": "AddressType",
  "fields": [
    {
      "name": "line_1",
      "type": "string"
    },
    {
      "name": "line_2",
      "type": [
        null,
        "string"
      ]
    },
    {
      "name": "city",
      "type": "string"
    },
    {
      "name": "country",
      "type": "string"
    },
    {
      "name": "zipCode",
      "type": "string"
    }
  ]
}
```

### Array Type

```pptx[Array Type]
    - Arrays use the type name "array"
    - Array has a single attribute "items" to specify the schema of its element

```

#### Array Schema Example
```
{
  "type": "array",
  "items" : "string",
  "default": []
}
```

### Union Type

```pptx[Union Type]
    - Unions are represented using JSON arrays. For example, ["null", "string"] declares a schema which may be either a null or string.
    - A default value is specified for a record field whose type is a union, the type of the default value must match the first element of the union.
    - Unions may not contain more than one schema with the same type, except for the named types record, fixed and enum. 
    - Unions may not immediately contain other unions.

```

#### Union Schema Example

```
[
  null,
  {
    "type": "record",
    "name": "DocumentActionType",
    "fields": [
      {
        "name": "ActionTypeCd",
        "type": "string"
      },
      {
        "name": "RecordTypeCd",
        "type": "string"
      }
    ]
  }
]

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

#### Enums Schema Example

```
{
  "type": "enum",
  "name": "DayOfWeek",
  "symbols": [
    "SUNDAY",
    "MONDAY",
    "TUESDAY",
    "WEDNESDAY",
    "THURSDAY",
    "FRIDAY",
    "SATURDAY"
  ]
}

```

## Type Mapping from XML Schema to Avro Schema

```pptx[Mapping XSD Type to Avro Schema]
    - Basic Types Mappings 
    - Cardinality
```

### Basic Types Mappings

<!-- table: Basic Types Mappings -->

| XSD Type              | Avro Type          | Json Type          |
| ------------------    | ------------------ | ------------------ |
| complex	            | record             | json object        |
| xs:boolean	        | boolean            | json boolean       |
| xs:float	            | float              | json number	      |
| xs:double	            | double             | json number	      |
| xs:integer	        | int                | json number	      |
| xs:long	            | long               | json number	      |
| xs:int	            | int                | json number	      |
| xs:short	            | int                | json number	      |
| xs:byte	            | int                | json number	      |
| xs:decimal	        | double             | json number	      |
| xs:string	            | string	         | json string        |
| xs:dateTime	        | string	         | json string        |
| xs:time	            | string	         | json string        |
| xs:date	            | string	         | json string        |
| xs:duration	        | string	         | json string        |
| xs:anyURI	            | string	         | json string        |
| xs:QName	            | string	         | json string        |

<!-- ##### -->

### More String Based Types

<!-- table: More String Based Types Mappings -->

| XSD Type              | Avro Type          | Json Type          |
| ------------------    | ------------------ | ------------------ |
| xs:base64Binary	    | string	         | json string        |
| xs:hexBinary	        | string	         | json string        |
| xs:token	            | string	         | json string        |
| xs:language	        | string	         | json string        |
| xs:gYearMonth	        | string	         | json string        |
| xs:gYear	            | string	         | json string        |
| xs:gMonthDay	        | string	         | json string        |
| xs:gDay	            | string	         | json string        |
| xs:gMonth	            | string	         | json string        |
| xs:NOTATION	        | string	         | json string        |
| xs:NCName	            | string	         | json string        |
| xs:ID	                | string	         | json string        |
| xs:IDREF	            | string	         | json string        |
| xs:IDREFS	            | string	         | json string        |
| xs:ENTITY	            | string	         | json string        |
| xs:ENTITIES	        | string	         | json string        |
| xs:NMTOKEN	        | string	         | json string        |
| xs:NMTOKENS	        | string	         | json string        |

<!-- ##### -->

### More Number-Based Types

<!-- table: More Number-Based Types -->

| XSD Type              | Avro Type          | Json Type          |
| ------------------    | ------------------ | ------------------ |
| xs:nonPositiveInteger	| int                | json number	      |
| xs:NegativeInteger	| int                | json number	      |
| xs:nonNegativeInteger	| int                | json number	      |
| xs:positiveInteger	| int                | json number	      |
| xs:unsignedLong	    | long               | json number	      |
| xs:unsignedInt	    | int                | json number	      |
| xs:unsignedShort	    | int                | json number	      |
| xs:unsignedByte	    | int                | json number	      |

<!-- ##### -->

### Cardinality

<!-- table: Cardinality -->

| Cardinality           | Avro Type          | Description        |
| ------------------    | ------------------ | ------------------ |
| 1-1    	            | MappedType         | Above mapping rule |
| 1-n    	            | array of MappedType|                    |
| 0-1    	            | Union              | [null, MappedType] |
| 0-n    	            | Union of array     | [null, array]      |

<!-- ##### -->


## Avro for Java Developer

```pptx[Avro for Java Developer]
    - Maven dependency, 
    - Parse schema from different resources
    - Avro Generic Data
    - Avro Datum Writer and Reader
    - Avro Encoder
    - XML to Avro under IIB environment
```


### Maven Dependency

```
<dependency>
    <groupId>org.apache.avro</groupId>
    <artifactId>avro-compiler</artifactId>
    <version>1.8.2</version>
</dependency>

<dependency>
    <groupId>org.apache.avro</groupId>
    <artifactId>avro-maven-plugin</artifactId>
    <version>1.8.2</version>
</dependency>

```

### Create Schema

```

        // From string:
        Schema schema = new Schema.Parser().parse(string);

        // From file:
        Schema schema = new Schema.Parser().parse(file);

        // From input stream:
        Schema schema = new Schema.Parser().parse(inputStream);

        // From muliple string if named
        Schema schema = new Schema.Parser().parse(string, string...);    

```

### Avro Generic Data

```pptx[Avro Data]    
    - Schema is included
    - Avro Data is Dynamic Typed (Schema)
    - Avro Data is encoded
    - Avro Data toString() gives a json data format
    - GenericData:
        -- GenericData.Record (builder pattern: GenericRecordBuilder)
        -- GenericData.Array<T>
        -- GenericData.Fixed
        -- GenericData.EnumSymbol

```

### Avro Data Writer

```pptx[Avro DatumWriter]
    - org.apache.avro.io.DatumWriter<D>
        -- void write(D datum, Encoder out);    
    - org.apache.avro.generic.GenericDatumWriter<D>
    - org.apache.avro.io.Encoder
        -- BinaryEncoder
        -- JsonEncoder
    - org.apache.avro.io.EncoderFactory
        -- EncoderFactory.get().binaryEncoder(outputStream)
        -- EncoderFactory.get().jsonEncoder(schema, outputStream)

```

```

    public static void writeAsJson(GenericRecord record,
                                   Schema schema,
                                   OutputStream outputStream) throws IOException {

        GenericDatumWriter<GenericRecord> writer = new GenericDatumWriter<>(schema);
        Encoder encoder = EncoderFactory.get().jsonEncoder(schema, outputStream);

        writer.write(record, encoder);
        encoder.flush();
        outputStream.close();
    }



    public static void writeAsBinary(GenericRecord record,
                                     Schema schema,
                                     OutputStream outputStream) throws IOException {
        
        GenericDatumWriter<GenericRecord> writer = new GenericDatumWriter<>(schema);
        Encoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);

        writer.write(record, encoder);
        encoder.flush();
        outputStream.close();
    }

```

### Avro Data Reader

```pptx[Avro DatumReader]
    - org.apache.avro.io.DatumReader<D>
        -- D read(D reuse, Decoder in);
        
    - org.apache.avro.generic.GenericDatumReader<D>
    - org.apache.avro.io.Decoder
        -- BinaryDecoder
        -- JsonDecoder
        
    - org.apache.avro.io.DecoderFactory
        -- DecoderFactory.get().binaryDecoder(byte[] bytes, BinaryDecoder reuse)
        -- DecoderFactory.get().jsonDecoder(Schema schema, InputStream input)

```

```

    public static GenericRecord read(byte[] data, Schema schema) throws Exception {
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>();
        datumReader.setSchema(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        return datumReader.read(null, decoder);
    }

```

### XML to Avro in IIB

```pptx[XML to Avro in IIB]
    - XSD and Avro Schema must have same structure, without namespace
    - XML attribute to field
    - XML simple type with attribute not supported
    - Avro logic types are not mapped
    - Libraries:
        -- gson-2.8.6.jar
        -- avro-1.9.0.jar
        -- jackson-core-2.9.8.jar
        -- jackson-annotations-2.9.8.jar
        -- slf4j-api-1.7.21.jar
        -- slf4j-log4j12-1.7.21.jar

```





