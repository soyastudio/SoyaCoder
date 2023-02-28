## Chapter 1. Introduction
### 1.1 I/O Versus CPU Time
I/O is often the limiting factor in application performance, not processing speed.

### 1.2 No Longer CPU Bound
Current JVMs run bytecode at speeds approaching that of natively compiled code, sometimes doing even better because of dynamic runtime optimizations. This means that most Java applications  are no longer CPU bound (spending most of their time executing code) and are more
frequently I/O bound (waiting for data transfers).

There's an impedance mismatch between the operating system and the Java stream-based I/O model. The operating system wants to  move data in large chunks (buffers), often with the assistance of hardware Direct Memory Access (DMA). The I/O classes of the JVM like to operate on small pieces — single bytes, or lines of text. This means that the operating system delivers buffers full of data that the stream classes of java.io spend a lot of time breaking down into little
pieces, often copying each piece between several layers of objects. The operating system wants to deliver data by the truckload. The java.io classes want to process data by the shovelful. NIO makes it easier to back the truck right up to where you can make direct  use of the data (a ByteBuffer object).

### 1.3 Getting to the Good Stuff

### 1.4 I/O Concepts
- Buffer handling
- Kernel versus user space
- Virtual memory
- Paging
- File-oriented versus stream I/O
- Multiplexed I/O (readiness selection)

#### 1.4.1 Buffer Handling

##### 1.4.1.1 Direct memory access (DMA)

Direct memory access (DMA) is a feature of computer systems that allows certain hardware subsystems to access main system memory independently of the central processing unit (CPU).

Without DMA, when the CPU is using programmed input/output, it is typically fully occupied for the entire duration of the read or write operation, and is thus unavailable to perform other work. With DMA, the CPU first initiates the transfer, then it does other operations while the transfer is in progress, and it finally receives an interrupt from the DMA controller (DMAC) when the operation is done.[citation needed] This feature is useful at any time that the CPU cannot keep up with the rate of data transfer, or when the CPU needs to perform work while waiting for a relatively slow I/O data transfer. Many hardware systems use DMA, including disk drive controllers, graphics cards, network cards and sound cards. DMA is also used for intra-chip data transfer in multi-core processors. Computers that have DMA channels can transfer data to and from devices with much less CPU overhead than computers without DMA channels. Similarly, a processing circuitry inside a multi-core processor can transfer data to and from its local memory without occupying its processor time, allowing computation and data transfer to proceed in parallel.

DMA can also be used for "memory to memory" copying or moving of data within memory. DMA can offload expensive memory operations, such as large copies or scatter-gather operations, from the CPU to a dedicated DMA engine. An implementation example is the I/O Acceleration Technology. DMA is of interest in network-on-chip and in-memory computing architectures.

##### 1.4.1.2 Kernel space and User space

- Kernel space: Kernel space is where the operating system lives. Kernel code has special privileges: it can communicate with device controllers, manipulate the state of processes in user space, etc. Most importantly, all I/O flows through kernel space, either directly or indirectly.
- User space: User space is where regular processes (such as JVM) live. User space is a non-privileged area: code executing there cannot directly access hardware devices.
- When a process requests an I/O operation, it performs a system call, sometimes known as a trap, which transfers control into the kernel

##### 1.4.1.3 Scatter/gather

The notion of scatter/gather allows a process to pass a list of buffer addresses to the operating system in one system call. The kernel can then fill or drain the multiple buffers in sequence, scattering the data to multiple user space buffers on a read, or gathering from several buffers on a write.

#### 1.4.2 Virtual Memory

By mapping a kernel space address to the same physical address as a virtual address in user space, the DMA hardware (which can access only physical memory addresses) can fill a buffer that is simultaneously visible to both the kernel and a user space process.

#### 1.4.3 Memory Paging
In computer operating systems, memory paging (or swapping on some Unix-like systems) is a memory management scheme by which a computer stores and retrieves data from secondary storage (hard disc) for use in main memory (RAM). In this scheme, the operating system retrieves data from secondary storage in same-size blocks called pages. Paging is an important part of virtual memory implementations in modern operating systems, using secondary storage to let programs exceed the size of available physical memory.

```wiki
虚拟内存是计算机系统内存管理的一种技术。它使得应用程序认为它拥有连续可用的内存（一个连续完整的地址空间），而实际上物理内存通常被分隔成多个内存碎片，还有部分暂时存储在外部磁盘存储器上，在需要时进行数据交换。与没有使用虚拟内存技术的系统相比，使用这种技术使得大型程序的编写变得更容易，对真正的物理内存（例如RAM）的使用也更有效率。此外，虚拟内存技术可以使多个进程共享同一个运行库，并通过分割不同进程的内存空间来提高系统的安全性。

要注意的是，虚拟内存不只是「用磁盘空间来扩展物理内存」的意思——这只是扩充内存级别以使其包含硬盘驱动器而已。把内存扩展到磁盘只是使用虚拟内存技术的一个结果，它的作用也可以通过覆盖或者把处于不活动状态的程序以及它们的数据全部交换到磁盘上等方式来实现。对虚拟内存的定义是基于对地址空间的重定义的，即把地址空间定义为「连续的虚拟内存地址」，以借此「欺骗」程序，使它们以为自己正在使用一大块的「连续」地址。

那些需要快速存取或者相应时间非常稳定的嵌入式系统，以及其他的具有特殊应用的计算机系统，可能会为了避免让运算结果的可预测性降低，而选择不使用虚拟内存。
```


#### 1.4.4 File I/O

A filesystem is a very different thing from a disk. A filesystem is a higher level of abstraction. Filesystems are a particular method of arranging and interpreting data stored on a disk. 

A filesystem organizes a sequence of uniformly sized data blocks. Some blocks store meta information such as maps of free blocks, directories, indexes, etc. Other blocks contain file data. The meta information about individual files describes which blocks contain the file data, where the data ends, when it was last updated, etc.

User process (application) request the file system to implement file operations. 

##### 1.4.4.1 Memory-mapped files

##### Figure 1-6. User memory mapped to filesystem pages


##### 1.4.4.2 File locking

File locking is a scheme by which one process can prevent others from accessing a file or restrict how other processes access that file.

##### Figure 1-7. Exclusive-lock request blocked by shared locks
##### Figure 1-8. Shared-lock requests blocked by exclusive lock
#### 1.4.5 Stream I/O
### 1.5 Summary
## Chapter 2. Buffers
### 
#### 
##### Figure 2-1. The Buffer family tree
### 2.1 Buffer Basics
#### 2.1.1 Attributes
##### Figure 2-2. A newly created ByteBuffer
#### 2.1.2 Buffer API
#### 2.1.3 Accessing
#### 2.1.4 Filling
##### Figure 2-3. Buffer after five put()s
##### Figure 2-4. Buffer after modification
#### 2.1.5 Flipping
##### Figure 2-5. Buffer after being flipped
#### 2.1.6 Draining
##### Example 2-1. Filling and draining buffers
#### 2.1.7 Compacting
##### Figure 2-6. A partially drained buffer
##### Figure 2-7. Buffer after compaction
#### 2.1.8 Marking
##### Figure 2-8. A buffer with a mark set
##### Figure 2-9. A buffer position reset to its mark
#### 2.1.9 Comparing
##### Figure 2-10. Two buffers considered to be equal
##### Figure 2-11. Two buffers considered to be unequal
#### 2.1.10 Bulk Moves
### 2.2 Creating Buffers
### 2.3 Duplicating Buffers
#### 
##### Figure 2-12. Duplicating a buffer
##### Figure 2-13. Creating a slice buffer
### 2.4 Byte Buffers
#### 2.4.1 Byte Ordering
##### Table?2-1. Primitive data types and sizes
##### Figure 2-14. Big-endian byte order
##### Figure 2-15. Little-endian byte order
#### 2.4.2 Direct Buffers
#### 2.4.3 View Buffers
##### Figure 2-16. A CharBuffer view of a ByteBuffer
##### Example 2-2. Creating a char view of a ByteBuffer
#### 2.4.4 Data Element Views
##### Figure 2-17. A ByteBuffer containing some data
#### 2.4.5 Accessing Unsigned Data
##### Example 2-3. Utility routines for getting/putting unsigned values
#### 2.4.6 Memory-Mapped Buffers
### 2.5 Summary











## Chapter 3. Channels


A channel represents an open connection to an entity such as a hardware device, a file, a network socket, or a program component that is capable of performing one or more distinct I/O operations, for example reading or writing.

Channels are gateways through which the native I/O services of the operating system can be accessed with a minimum of overhead, and buffers are the internal endpoints used by channels to send and receive data.

Channels are, in general, intended to be safe for multithreaded access as described in the specifications of the interfaces and classes that extend and implement this interface.

### 3.1 Channel Basics
#### 3.1.1 Opening Channels
#### 3.1.2 Using Channels
##### Figure 3-3. The ByteChannel interfaces
##### Example 3-1. Copying data between channels
#### 3.1.3 Closing Channels
### 3.2 Scatter/Gather

Most modern operating systems support native vectored I/O. When you request a
scatter/gather operation on a channel, the request will be translated into appropriate
native calls to fill or drain the buffers directly. This is a big win, because buffer copies
and system calls are reduced or eliminated. Scatter/gather should be used with direct
ByteBuffers to gain the greatest advantage from native I/O, especially if the buffers are
long-lived.

#### 
##### Figure 3-4. Scatter/gather interfaces
##### Figure 3-5. A gathering write using four buffers
##### Figure 3-6. A scattering read using four buffers
##### Example 3-2. Collecting many buffers in a gathering write














### 3.3 File Channels
File channels are always blocking and cannot be placed into nonblocking mode.

##### Figure 3-7. FileChannel family tree
#### 3.3.1 Accessing Files
##### Table?3-1. File I/O API comparison chart
##### Figure 3-8. A disk file with two holes
#### 3.3.2 File Locking
##### Example 3-3. Shared- and exclusive-lock interaction
### 3.4 Memory-Mapped Files
#### 
##### Example 3-4. Composing HTTP replies with mapped files and gathering writes
##### Example 3-5. Three types of memory-mapped buffers
#### 3.4.1 Channel-to-Channel Transfers
##### Example 3-6. File concatenation using channel transfer
### 3.5 Socket Channels
#### 
##### Figure 3-9. The socket channel family tree
#### 3.5.1 Nonblocking Mode
#### 3.5.2 ServerSocketChannel
##### Example 3-7. A nonblocking accept() with ServerSocketChannel
#### 3.5.3 SocketChannel
##### Example 3-8. Concurrent-connection establishment
#### 3.5.4 DatagramChannel
##### Example 3-9. Time-service client using DatagramChannel
##### Example 3-10. DatagramChannel time server
### 3.6 Pipes
#### 
##### Figure 3-10. The Pipe family tree
##### Figure 3-11. A pipe is a pair of looped channels
##### Example 3-11. Worker thread writing to a pipe
### 3.7 The Channels Utility Class
#### 
##### Table?3-2. Summary of java.nio.channels.Channels utility methods
### 3.8 Summary
## Chapter 4. Selectors
### 4.1 Selector Basics
#### 4.1.1 The Selector, SelectableChannel, and SelectionKey Classes
##### Figure 4-1. Selection class family tree
##### Figure 4-2. Relationships of the selection classes
#### 4.1.2 Setting Up Selectors
### 4.2 Using Selection Keys
### 4.3 Using Selectors
#### 4.3.1 The Selection Process
#### 4.3.2 Stopping the Selection Process
#### 4.3.3 Managing Selection Keys
##### Example 4-1. Using select() to service multiple channels
#### 4.3.4 Concurrency
### 4.4 Asynchronous Closability
### 4.5 Selection Scaling
#### 
##### Example 4-2. Servicing channels with a thread pool
### 4.6 Summary
## Chapter 5. Regular Expressions
### 
#### 
##### Figure 5-1. The regular expression classes
### 5.1 Regular Expression Basics
### 5.2 The Java Regular Expression API
#### 5.2.1 The CharSequence Interface
##### Example 5-1. CharSequence interface examples
#### 5.2.2 The Pattern Class
##### Table?5-1. Flag values affecting regular expression compilation
##### Table?5-2. Matrix of split() behavior
##### 5.2.2.1 Splitting strings with the Pattern class
##### Example 5-2. Splitting strings with Pattern
##### Example 5-3. Split matrix styelsheet
#### 5.2.3 The Matcher Class
##### Example 5-4. Simple file grep
##### Example 5-5. Extracting matched expressions
##### Figure 5-2. start(), end(), and group() values
##### Table?5-3. Regular expression capture groups of A((B)(C(D)))
##### Table?5-4. Replacement of matched patterns
##### Example 5-6. Regular expression replacement
##### Example 5-7. Backslashes in regular expressions
##### Table?5-5. Using appendReplacement() and appendTail()
##### Example 5-8. Regular expression append/replace
### 5.3 Regular Expression Methods of the String Class
#### 
##### Table?5-6. Regular expression methods of the String class
### 5.4 Java Regular Expression Syntax
#### 
##### Table?5-7. Java regular expression syntax quick reference
### 5.5 An Object-Oriented File Grep
#### 
##### Example 5-9. Object-oriented grep
### 5.6 Summary
## Chapter 6. Character Sets
### 6.1 Character Set Basics
#### 
##### Figure 6-1. Characters encoded as UTF-8
### 6.2 Charsets
#### 
##### Table?6-1. Required charsets
##### Table?6-2. UTF-16 charset encode/decode
##### Example 6-1. Encoding with the standard charsets
#### 6.2.1 The Charset Class
##### Figure 6-2. The charset classes
#### 6.2.2 Comparing Charsets
#### 6.2.3 Charset Encoders
##### 6.2.3.1 The CoderResult class
##### Table?6-3. Exceptions thrown by CoderResult.throwException()
#### 6.2.4 Charset Decoders
##### Example 6-2. Charset decoding
### 6.3 The Charset Service Provider Interface
#### 
##### Table?6-4. Legal characters for charset names
#### 6.3.1 Creating Custom Charsets
#### 6.3.2 Providing Your Custom Charsets
##### Example 6-3. The custom Rot13 charset
##### Example 6-4. Custom charset provider
### 6.4 Summary
## Appendix A. NIO and the JNI
## Appendix B. Selectable Channels SPI
## Appendix C. NIO Quick Reference
### C.1 Package java.nio
#### C.1.1 Buffer
#### C.1.2 BufferOverflowException
#### C.1.3 BufferUnderflowException
#### C.1.4 ByteBuffer
#### C.1.5 ByteOrder
#### C.1.6 CharBuffer
#### C.1.7 DoubleBuffer
#### C.1.8 FloatBuffer
#### C.1.9 IntBuffer
#### C.1.10 InvalidMarkException
#### C.1.11 LongBuffer
#### C.1.12 MappedByteBuffer
#### C.1.13 ReadOnlyBufferException
#### C.1.14 ShortBuffer
### C.2 Package java.nio.channels
#### C.2.1 AlreadyConnectedException
#### C.2.2 AsynchronousCloseException
#### C.2.3 ByteChannel
#### C.2.4 CancelledKeyException
#### C.2.5 Channel
#### C.2.6 Channels
#### C.2.7 ClosedByInterruptException
#### C.2.8 ClosedChannelException
#### C.2.9 ClosedSelectorException
#### C.2.10 ConnectionPendingException
#### C.2.11 DatagramChannel
#### C.2.12 FileChannel
#### C.2.13 FileLock
#### C.2.14 FileLockInterruptionException
#### C.2.15 GatheringByteChannel
#### C.2.16 IllegalBlockingModeException
#### C.2.17 IllegalSelectorException
#### C.2.18 InterruptibleChannel
#### C.2.19 NoConnectionPendingException
#### C.2.20 NonReadableChannelException
#### C.2.21 NonWritableChannelException
#### C.2.22 NotYetBoundException
#### C.2.23 NotYetConnectedException
#### C.2.24 OverlappingFileLockException
#### C.2.25 Pipe
#### C.2.26 ReadableByteChannel
#### C.2.27 ScatteringByteChannel
#### C.2.28 SelectableChannel
#### C.2.29 SelectionKey
#### C.2.30 Selector
#### C.2.31 ServerSocketChannel
#### C.2.32 SocketChannel
#### C.2.33 UnresolvedAddressException
#### C.2.34 UnsupportedAddressTypeException
#### C.2.35 WritableByteChannel
### C.3 Package java.nio.channels.spi
#### C.3.1 AbstractInterruptibleChannel
#### C.3.2 AbstractSelectableChannel
#### C.3.3 AbstractSelectionKey
#### C.3.4 AbstractSelector
#### C.3.5 SelectorProvider
### C.4 Package java.nio.charset
#### C.4.1 CharacterCodingException
#### C.4.2 Charset
#### C.4.3 CharsetDecoder
#### C.4.4 CharsetEncoder
#### C.4.5 CoderMalfunctionError
#### C.4.6 CoderResult
#### C.4.7 CodingErrorAction
#### C.4.8 IllegalCharsetNameException
#### C.4.9 MalformedInputException
#### C.4.10 UnmappableCharacterException
#### C.4.11 UnsupportedCharsetException
### C.5 Package java.nio.charset.spi
#### C.5.1 CharsetProvider
### C.6 Package java.util.regex
#### C.6.1 Matcher
#### C.6.2 Pattern
#### C.6.3 PatternSyntaxException
## Colophon

Process finished with exit code 0
