# Big Data Fundamental

## A very generic

### Big Data

- Volume
- Velocity
- variety
- Value
- Veracity

### Layers

- Data Sources
    - Structured data:
    - Semi-structured data: NoSQL, Email, CSV, Log, JSON, XML...
    - Unstructured data:
- Data Ingestion
    - Batch/Scheduling
    - Real Time/Stream/In-memory
- Data Storage
    - HDFS
    - RDMS
    - NoSQL
- Analytics/Servicing
    - Statistics
    - Machine learning
    - Recommendation
    - Predictive
    - Knowledge graph
    - Pre-computed views
- Data Consumption
    - Dashboard/BI
    - Reporting
    - Data Visualization
    - Insights
    - Real time alerting
    - search/querying
    - Enterprise Data Warehousing

## Hadoop

### HDFS (Storage Unit)

#### Assumptions and Goals

- Hardware Failure
- Streaming Data Access
- Large Data Set
- Simple Coherency Model
- Moving Computation is Cheaper than Moving Data: especially true when the size of data set is huge.
- Portability Across Heterogeneous Hardware and Software Platforms

#### NameNode and DataNodes

- NameNode: master, single in HDFS cluster, metadata
- DataNodes: multiple, split to

#### The File System Namespace (NameNode)

#### Data Replication

#### The Communication Protocols

#### Robustness

1. Data Disk, Heartbeats, Re-Replication
2. Cluster Rebalancing:
3. Data Integrity: implements checksum checking
4. Metadata Disk: maintaining multiple copies of the FsImage and EditLog
5. Snapshots

#### Data Organization

1. Data Blocks:
2. Staging
3. Replication Pipelining

#### Accessibility (Java API)

1. FS Shell
2. DFSAdmin
3. Browser Interface

#### Space Reclamation

### MapReduce



### Yarn ()