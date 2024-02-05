# [Google Cloud Datastore](https://cloud.google.com/datastore/docs/concepts/overview)

## Overview
### Features
- Atomic transactions. Datastore can execute a set of operations where either all succeed, or none occur.
- High availability of reads and writes. Datastore runs in Google data centers, which use redundancy to minimize impact from points of failure.
- Massive scalability with high performance. Datastore uses a distributed architecture to automatically manage scaling. Datastore uses a mix of indexes and query constraints so your queries scale with the size of your result set, not the size of your dataset.
- Flexible storage and querying of data. Datastore maps naturally to object-oriented and scripting languages, and is exposed to applications through multiple clients. It also provides a SQL-like query language.
- Strong consistency. Datastore ensures that all queries are strongly consistent.
- Encryption at rest. Datastore automatically encrypts all data before it is written to disk and automatically decrypts the data when read by an authorized user. For more information, see Server-Side Encryption.
- Fully managed with no planned downtime. Google handles the administration of the service so you can focus on your application. Your application can still use Datastore when the service receives a planned upgrade.

### Good for applications that rely on highly available structured data at scale.
- Product catalogs that provide real-time inventory and product details for a retailer.
- User profiles that deliver a customized experience based on the user's past activities and preferences.
- Transactions based on ACID properties. For example, transferring funds from one bank account to another.

### Not good for
- If you need a relational database with full SQL support for an online transaction processing (OLTP) system, consider Cloud SQL.
- If you don't require support for ACID transactions or if your data is not highly structured, consider Bigtable.
- If you need interactive querying in an online analytical processing (OLAP) system, consider BigQuery.
- If you need to store large immutable blobs, such as large images or movies, consider Cloud Storage.
