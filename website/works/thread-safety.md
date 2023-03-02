# What is Thread-Safety and How to Achieve it?

## Overview
Java supports multithreading out of the box. This means that by running bytecode concurrently in separate worker threads, the JVM is capable of improving application performance.

Although multithreading is a powerful feature, it comes at a price. In multithreaded environments, we need to write implementations in a thread-safe way. This means that different threads can access the same resources without exposing erroneous behavior or producing unpredictable results. This programming methodology is known as “thread-safety.”

## Stateless Implementations
In most cases, errors in multithreaded applications are the result of incorrectly sharing state between several threads. So, the first approach that we'll look at is to achieve thread-safety using stateless implementations.

## Immutable Implementations
If we need to share state between different threads, we can create thread-safe classes by making them immutable.

Immutability is a powerful, language-agnostic concept, and it's fairly easy to achieve in Java.

To put it simply, a class instance is immutable when its internal state can't be modified after it has been constructed.

The easiest way to create an immutable class in Java is by declaring all the fields private and final and not providing setters.

## Thread-Local Fields

## Synchronized Collections
We can easily create thread-safe collections by using the set of synchronization wrappers included within the collections framework.

Let's keep in mind that synchronized collections use intrinsic locking in each method. This means that the methods can be accessed by only one thread at a time, while other threads will be blocked until the method is unlocked by the first thread.

## Concurrent Collections
Alternatively to synchronized collections, we can use concurrent collections to create thread-safe collections.

Java provides the java.util.concurrent package, which contains several concurrent collections, such as ConcurrentHashMap.

Unlike their synchronized counterparts, concurrent collections achieve thread-safety by dividing their data into segments. In a ConcurrentHashMap, for example, several threads can acquire locks on different map segments, so multiple threads can access the Map at the same time.

Concurrent collections are much more performant than synchronized collections, due to the inherent advantages of concurrent thread access.

It's worth mentioning that synchronized and concurrent collections only make the collection itself thread-safe and not the contents.

## Atomic Objects
It's also possible to achieve thread-safety using the set of atomic classes that Java provides, including AtomicInteger, AtomicLong, AtomicBoolean and AtomicReference.

Atomic classes allow us to perform atomic operations, which are thread-safe, without using synchronization. An atomic operation is executed in one single machine-level operation.

## Synchronized Methods
A Synchronized Method means only one thread can access a synchronized method at a time, while blocking access to this method from other threads. Other threads will remain blocked until the first thread finishes or the method throws an exception.

Synchronized methods rely on the use of “intrinsic locks” or “monitor locks.” An intrinsic lock is an implicit internal entity associated with a particular class instance.

In a multithreaded context, the term monitor is just a reference to the role that the lock performs on the associated object, as it enforces exclusive access to a set of specified methods or statements.

When a thread calls a synchronized method, it acquires the intrinsic lock. After the thread finishes executing the method, it releases the lock, which allows other threads to acquire the lock and get access to the method.

We can implement synchronization in instance methods, static methods and statements (synchronized statements).

## Synchronized Statements
Unlike synchronized methods, synchronized statements must specify the object that provides the intrinsic lock, usually this reference.

Synchronization is expensive, so with this option, we are able to only synchronize the relevant parts of a method.

### Other Objects as a Lock


## Volatile Fields
With the volatile keyword, we instruct the JVM and the compiler to store the counter variable in the main memory. That way, we make sure that every time the JVM reads the value of the counter variable, it will actually read it from the main memory, instead of from the CPU cache. Likewise, every time the JVM writes to the counter variable, the value will be written to the main memory.

Moreover, the use of a volatile variable ensures that all variables that are visible to a given thread will be read from the main memory as well.



