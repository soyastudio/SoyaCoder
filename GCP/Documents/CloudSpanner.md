# [Introduction to Google Cloud Spanner](https://www.youtube.com/watch?v=9PsSIVUbtWo)

## What is Cloud Spanner

### The challenge of growing DBss

- Scale-up relational
- Scale-out non-relational

### Cloud Spanner

An enterprise-grade, globally-distributed, and strongly-consistent database service built for the cloud specifically to
combine the benefits of rational database structure with non-relational horizontal scale.

- Relational semantics: schemas, ACID transactions, SQL...
- Horizontal-scale: up to 99.999% availability SLA, fully managed and easy scalable

### How Does it Compare

|              | Traditional Relational | Traditional Non-Relational | Cloud Spanner |
|--------------|------------------------|----------------------------|---------------|
| Schema       | Yes                    | No                         | Yes           |
| SQL          | Yes                    | No                         | Yes           |
| Consistency  | Strong                 | Eventual                   | Strong        |
| Availability | Failover               | High                       | High          |
| Scalability  | Vertical               | Horizontal                 | Horizontal    |
| Replication  | Configurable           | Configurable               | Automatic     |


## How does Cloud Spanner work

### Architecture Overview
- Compute Nodes(3 for each zone) and Storage(Databases)
- Paxos Group for Split
- True Time
    - Invented during the creation of Spanner
    - Quantifies the "worst" possible error/drift between clocks in all datacenters around the world

### Data Format in Google Cloud Spanner:

#### Interleaving: Logical Data Layout

#### Interleaving: Physical Data Layout

#### Schema changes without downtime



## How to get started with Cloud Spanner




## Cloud Spanner use cases: Industries and Verticals

### Cloud Spanner Helps Meet Business Goals:
- Reduce Time to Launch
  - No new paradigms to learn
  - Familiar relational model
  - Transaction across rows, regions, and conditions
  - Online schema changes
  - Strong consistency simplifies app logic
- Performance and HA at Scale
  - Up to 99.999% SAL
  - Regional or multi-region
  - Low-latency
  - Global scale
  - Synchronous replication
  - Don't replatform for scale
- Simplified Operations
  - Deploy a db in 4 clicks
  - No planned downtime
  - One-click scaling
  - Strong consistency reduces bugs
  - Simple billing model

### When is Cloud Spanner the Right Fit
- Transactional Consistency:
Companies that have outgrown a single-instance RDBMS and moved to a NoSQL solution but need transactional consistency, or are looking to move to a scalable solution
  - Supply-Chain Management
  - E-commerce
- Scale:
Companies currently sharding database because they need more read or write throughput than can be placed on a single node. Or companies reaching maxing out traditional scale-up relational databases:
  - Telecom and Billing
  - Gaming
- Global Data:
Companies and/or developers building applications that rely on global data and require strong consistency for accuracy
  - Financial Service
  - Insurance
  - Global Call-Center
- Database Consolidation
Companies that store their business data in multiple database products with variable maintenance overheads and capabilities and need to consolidate their data
  - logistics and Manufacturing


## Google Cloud Database Portfolio
- In Memory
  - App Engine Memcache: good for web/mobile app, gaming
- Relational
  - Cloud SQL: good for Web frameworks, such as CMS, eCommerce
  - Cloud Spanner: good for RDBMS + Scale, HA, HTAP, such as User metadata, Ad/Fin/MarTech
- Non-Relational
  - Cloud Datastore: good for Hierarchical, mobile, web such as user profiles, game state
  - Cloud Bigtable: good for heavy read/write, events such as AdTech, Financial, IoT
- Object:
  - Cloud Storage: good for binary or object data such as images, media saving, backups
- Data Warehouse
  - BigQuery: good for enterprise data warehouse such as analytics, dashboards




# [Cloud Spanner: How It Works](https://www.youtube.com/watch?v=QPpSzxs_8bc)

## Solid Foundation

### Google Cloud platform regions

### Regional Cloud Spanner instances

### Multi-region Cloud Spanner name

### Google Cloud network

## Nodes, replicas, and data

### Replicas - Regional configuration


## Diving deeper: Automatic sharding life of a query

### Architecture overview

...

### Life of a query - Strong read



