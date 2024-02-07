# [BigTable](https://cloud.google.com/bigtable/docs/overview)

## Overview

A single value in each row is indexed; this value is known as the row key. Bigtable is ideal for storing large amounts
of single-keyed data with low latency. It supports high read and write throughput at low latency, and it's an ideal data
source for MapReduce operations.

Bigtable's powerful backend servers offer several key advantages over a self-managed HBase installation:

- Incredible scalability. Bigtable scales in direct proportion to the number of machines in your cluster. A self-managed
  HBase installation has a design bottleneck that limits the performance after a certain threshold is reached. Bigtable
  does not have this bottleneck, so you can scale your cluster up to handle more reads and writes.
- Simple administration. Bigtable handles upgrades and restarts transparently, and it automatically maintains high data
  durability. To replicate your data, simply add a second cluster to your instance, and replication starts
  automatically. No more managing replicas or regions; just design your table schemas, and Bigtable will handle the rest
  for you.
- Cluster resizing without downtime. You can increase the size of a Bigtable cluster for a few hours to handle a large
  load, then reduce the size of the cluster again—all without any downtime. After you change a cluster's size, it
  typically takes just a few minutes under load for Bigtable to balance performance across all of the nodes in your
  cluster.

### What it's good for

- Bigtable is ideal for applications that need high throughput and scalability for key/value data, where each value is
  typically no larger than 10 MB.
- Bigtable also excels as a storage engine for batch MapReduce operations, stream processing/analytics, and
  machine-learning applications.

You can use Bigtable to store and query all of the following types of data:

- Time-series data, such as CPU and memory usage over time for multiple servers.
- Marketing data, such as purchase histories and customer preferences.
- Financial data, such as transaction histories, stock prices, and currency exchange rates.
- Internet of Things data, such as usage reports from energy meters and home appliances.
- Graph data, such as information about how users are connected to one another.

### Bigtable storage model

- A Bigtable is a sparse, distributed, persistent multidimensional sorted map.
    - Sparse (graph)
    - Map (key/value based)
    - Persistent (based on GFS, HBase is based on HDFS)
    - Distributed: (RAID: redundant array of independent disks)
    - Sorted
    - Multidimensional
- The map is indexed by a row key, column key, and a timestamp;
- Each value in the map is an uninterpreted array of bytes.

Data Model:

- Table: An HBase table consists of multiple rows.
- Row: A row in HBase consists of a row key and one or more columns with values associated with them. Rows are sorted
  alphabetically by the row key as they are stored. For this reason, the design of the row key is very important. The
  goal is to store data in such a way that related rows are near each other. A common row key pattern is a website
  domain.
- Column: A column in HBase consists of a column family and a column qualifier, which are delimited by a : (colon)
  character.
    - Column Family: Column families physically colocate a set of columns and their values, often for performance
      reasons.
    - Column Qualifier: A column qualifier is added to a column family to provide the index for a given piece of data.
- Cell: A cell is a combination of row, column family, and column qualifier, and contains a value and a timestamp, which
  represents the value’s version.
    - Timestamp: A timestamp is written alongside each value, and is the identifier for a given version of a value.

### Bigtable Architecture

A Bigtable table is sharded into blocks of contiguous rows, called tablets, to help balance the workload of queries. (
Tablets are similar to HBase regions.) Tablets are stored on Colossus, Google's file system, in SSTable format. An
SSTable  (Sorted String Table) provides a persistent, ordered immutable map from keys to values, where both keys and
values are arbitrary byte strings. Each tablet is associated with a specific Bigtable node. In addition to the SSTable
files, all writes are stored in Colossus's shared log as soon as they are acknowledged by Bigtable, providing increased
durability.

### Load Balance

### Supported data types

### Memory and disk usage
- Unused columns
- Column qualifiers
- Compactions
- Mutations and deletions
- Data compression

### Data durability

[Google Colossus](https://cloud.google.com/blog/products/storage-data-transfer/a-peek-behind-colossus-googles-file-system)

### Consistency model: eventual consistency

### Security

### Encryption


### Backup

### Change data capture (CDC)
Bigtable provides change data capture (CDC) in the form of change streams. Change streams let you capture and stream out data changes to a table as the changes happen.






