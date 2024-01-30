# Chapter 1 Introduction to the Google Professional Cloud Architect Exam

## Designing a solution infrastructure that meets business requirements.

Considerations include:

- Business use cases and product strategy
- Cost optimization
- Supporting the application design
- Integration
- Movement of data
- Tradeoffs
- Build, buy or modify
- Success measurements (e.g., Key Performance Indicators(KPI), Return on Investment (ROI), metrics)
- Compliance and observability

## Analyzing Business Requirements

### Reducing Operational Expenses

- Managed Services: reduce the workload on systems administrators and DevOps engineers
- Preemptible VMs: a good option for batch processing and other tasks that are easily recovered and restarted
- Autoscaling: enables engineers to deploy an adequate number of instances needed to meet the load on a system

### Accelerating the Pace of Development

- Agile
- CI/CD
- Microservice architecture
- Lift and shift

### Reporting on Service-Level Objectives

```
 SLA/SLO/SLI
 
```

### Reducing Time to Recover from an Incident

- Alert
- Monitor
- Logging

### Improving Compliance with Industry Regulations

Major regulations include the following:

- Health Insurance Portability and Accountability Act (HIPAA), a healthcare regulation
- Children’s Online Privacy Protection Act (COPPA), a privacy regulation
- Sarbanes-Oxley Act (SOX), a financial reporting regulation
- Payment Card Industry Data Standard (PCI), a data protection regulation for credit card processing
- General Data Protection Regulation (GDPR), a European Union privacy protection regulation

Business Terms to Know:

- Brick and Mortar
- Capital Expenditure (Capex)
- Compliance
- Digital Transformation
- Governance
- Key Performance Indicator (KPI)
- Line of Business
- Operational Expenditures (Opex)
- Operating Budget
- Service-Level Agreement (SLA)
- Service-Level Indicator (SLI)
- Service-Level Objective (SLO)

## Analyzing Technical Requirements

### Functional Requirements

#### Understanding Compute Requirements

- Compute Engine
- App Engine
- Cloud Functions
- Kubernetes Engine

#### Understanding Storage Requirements

- Cloud Storage
- Cloud File Storage
- Bigtable
- Cloud DataStore
- CloudSQL
- Spanner
- Bigquery

#### Understanding Network Requirements

- VPCs

### Nonfunctional Requirements

- Availability
- Reliability
- Scalability
- Durability

# Chapter 2 Designing for Business Requirements

## Business Use Cases and Product

### Dress4Win Strategy

### Mountkirk Games Strategy

### TerramEarth Strategy

## Application Design and Cost Considerations

Total Cost of Ownership (TCO):

- Software licensing costs:
- Cloud computing costs, including infrastructure and managed services
- Cloud storage costs
- Data ingress and egress charges
- Cost of DevOps personnel to develop and maintain the service
- Cost of third-party services used in an application
- Charges against missed service-level agreements
- Network connectivity charges, such as those for a dedicated connection between an on-premises data center and Google
  Cloud

### Managed Services

Managed services are good options when:

- Users do not need low-level control over the resources providing the service, such as choosing the operating system to
  run in a VM.
- Managed services provide a functionality that would be difficult or expensive to implement, such as developing a
  machine vision application.
- There is little competitive advantage to performing resource management tasks. For example, the competitive advantage
  that may come from using Apache Spark for analytics stems from the algorithms and analysis methodologies, not from the
  administration of the Spark cluster.

Examples of Google Cloud Platform Managed Services:

- AutoML Tables
- Cloud AutoML
- Cloud Inference API
- Cloud Speech-to-Text
- Cloud Text-to-Speech
- Natural
- Translation
- BigQuery
- Cloud Datalab
- Cloud Dataprep
- Dataproc
- Google Data Studio
- Cloud Data Fusion
- Data Catalog
- Dataflow
- Cloud Spanner
- Cloud SQL
- Cloud Deployment Manager
- Cloud Source Control Repositories
- Cloud Pub/Sub
- Cloud Composer
- Bigtable
- Cloud Data Transfer
- Cloud Memorystore
- Cloud Storage

### Preemptible Virtual Machines

Preemptible VMs are well suited for batch jobs or other workloads that can be disrupted and restarted.

They are NOT suitable for running services that need high availability, such as

- A database or user-facing service, like a web server.
- Applications that manage state in memory or on the local SSD
- Live migrate
- Stateful applications

### Data Lifecycle Management

- Memorystore
- Databases
- Time-series databases
- Object storage

Lifecycle conditions can be based on the following:

- The age of an object
- When it was created
- The object’s storage class
- The number of versions of an object
- Whether or not the object is “live” (an object in nonversions bucketed is “live”; archived objects are not live)

## Systems Integration and Data Management

### Systems Integration Business Requirements

- Front-end: web, mobile...
- API:
- Backend applications:
- Data type:
- Third-party integration:RDBMS, NoSQL
- Data process:
- Logging, monitor and alert
- DevOps

### Data Management Business Requirements

- What kind of data will be stored and collected: structured, non-structured, blob, file...
- How much data will be collected and stored
- How long will it be stored
- What processing will be applied to the data
    - Distance between the location of stored data and services that will process the data
    - Volume of data that is moved from storage to processing services: batch, Cloud Dataflow (Apache Beam)
    - Acceptable latency when reading and writing the data
    - Stream or batch processing
    - In the case of stream processing, how long to wait for late arriving data
- Who will have access to the data

## Compliance and Regulation

### Privacy Regulations

- HIPAA
- GLBA
- GDPR
- PCI DSS
- COPPA

### Data Integrity Regulations

- SOX

### Security

- Confidentiality
- Integrity
- Availability

## Success Measures

### Key Performance Indicators

- Project
- Operations KPI

### Return on Investment (ROI)

# Chapter 3 Designing for Technical Requirements

## High Availability

### Compute Availability

- Compute Engine: Hardware Redundancy and Live Migration; Managed Instance Groups; Multiple Regions and Global Load
  Balancing
- Kubernetes Engine:
- App Engine and Cloud Functions: are fully managed services, focus on application issues and DevOps best practices

### Storage Availability

- Availability of Object, File, and Block Storage
    - Cloud Storage
    - Cloud Filestore
    - Persist Disk
- Availability of Databases
    - Self-Managed Database Redundancy: Shared disk; Filesystem replication; Synchronous multi-master replication
    - Managed Databases:
- Network Availability
    - Use redundant network connections
    - Use Premium Tier network
- Application Availability

## Scalability

### Scaling Compute Resources

- Autoscaler for average CPU utilization; HTTP load balancing capacity;
- Stackdriver for api_request_count; log_entry_count; memory_usage; uptime...

### Scaling Compute in Kubernetes Engine

### Scaling Storage Resources

### Network Design for Scalability

## Reliability

### Measuring Reliability

For distributed systems:

### Reliability Engineering

- Identifying how to monitor services.
- Considering alerting conditions.
- Using existing incident response procedures with the new system.
- Implementing a system for tracking outages and performing post-mortems to understand why a disruption occurred.

# Chapter 4 Designing Compute Systems

## Compute Engine (PaaS)

- Specifying Virtual Machine
- Machine Types and Service Accounts:
    - Based on CPUs and Memory: standard instances; highmem types; highcpu types; ultramem types and megamem types
    - User-customized
    - VMs can have 8 networks interfaces
    - Service account:
- Preemptible Virtual Machine
- Shielded VMs: are instances with enhanced security controls, including Secure boot; vTPM (Virtual Trusted Platform
  Module); Integrity monitoring
- Instance Groups: use managed instance groups (MIGs) with instance template

## App Engine

- Standard
- Customized

## Kubernetes Engine

### Kubernetes Cluster Architecture

#### Instances in Kubernetes

- Cluster master: controller manager; API server, scheduler, etcd
- Nodes: kubelet

#### Kubernetes’ Organizing Abstractions

- Pods
- Services: A service is an abstraction with a stable API endpoint and stable IP address
- ReplicaSets: controller that manages the number of pods running for a deployment
- Deployments:
- PersistentVolumes: Kubernetes’ way of representing storage allocated or provisioned for use by a pod. (
  PersistentVolumeClaim)
- StatefulSets: used to designate pods as stateful and assign a unique identifier to them. Kubernetes uses these to
  track which clients are using which pods and to keep them paired.
- Ingress: an object that controls external access to services running in a Kubernetes cluster

### Cloud Functions

#### Events, Triggers, and Functions

Events:

- Cloud Storage
- Cloud Pub/Sub
- HTTP
- Firebase
- Stackdriver Logging

## Compute System Provisioning

Deployment Manager and Configuration Template

### Additional Design Issues

#### Managing State in Distribute Systems

- Persistent Assignment of Clients to Instances
- Persistent State and Volatile Instances
    - In-Memory Cache (Cloud Memorystore, managed Redis)
    - Database

#### Data Flows and Pipelines

- Synchronous and Asynchronous Operations
- Cloud Pub/Sub Pipelines
- Cloud Dataflow Pipelines

#### Monitoring and Alerting

# Chapter 5 Designing Storage Systems

## Overview of Storage Services

Factors influence the choice of storage systems:

- Is the data structured or unstructured?
- How frequently will the data be accessed?
- What is the read/write pattern? What is the frequency of reads versus writes?
- What are the consistency requirements?
- Can Google-managed-keys be used for encryption, or do you need to deploy customer managed keys?
- What are the most common query patterns?
- Does your application require mobile support, such as synchronization?
- For structured data, is the workload analytic or transactional?
- Does your application require low-latency writes?

## Object Storage with Google Cloud Storage

- Organizing Objects in a Namespace (Google Cloud Storage Bucket vs Azure blob container)
- Cloud Storage FUSE
- Storage Tiers:
    - Regional
    - Multiregional
    - Nearline
    - Codeline

## Network-Attached Storage with Google Cloud Filestore

- Standard and Premium Comparison
- Cloud Filestore filesystems can be mounted using operating system commands
- IAM roles are used to control access to Cloud Filestore administration

## Database

### Relational Database Overview: ACID

### Cloud SQL

Key features of Cloud SQL include the following:

- All data is encrypted at rest and in transit.
- Data is replicated across multiple zones for high availability.
- GCP manages failover to replicas.
- Support for standard database connectors and tools is provided.
- Stackdriver is integrated monitoring and logging.

Limitation:

- Can only scale vertically

### Cloud Spanner

- Supports horizontal scalability across regions
- Supports common relational features, such as schemas for structured data and SQL for querying
- Supports strong consistency, so there is no risk of data anomalies caused by eventual consistency
- Manages replication

### Analytics Database: BigQuery

### NoSQL Databases (Suite for flexible schema)

- Bigtable: (vs Hadoop HBase)
- Datastore: JSON-like document based (vs MongoDB)
- Firestore

### Caching with Cloud Memorystore: managed Redis service

## Data Retention and Lifecycle Management

## Networking and Latency

Three ways of addressing network latency concerns are as follows:

- Replicating data in multiple regions and across continents
- Distributing data using Cloud CDN (Content Delivery Network)
- Using Google Cloud Premium Network tier

# Chapter 6 Designing Networks

## Virtual Private Clouds

### VPC Subnets

### Shared VPC

### VPC Network Peering

## Firewall Rules

## Hybrid-Cloud Implementation Options

- Cloud VPN
- Cloud Interconnect
- Direct peering

## Load Balancing

- Regional Load Balancing:
    - Network TCP/UDP
    - Internal TCP/UDP
- Global Load Balancing:
    - HTTP(S)
    - SSL Proxy
    - TCP Proxy

# Chapter 7 Designing for Security and Legal Compliance

## Identity and Access Management

The primary elements of IAM are as follows:

- Identities and groups
- Resources
- Permissions
- Roles
- Policies

### Identities and Groups

- Google account
- Service account
- Cloud Identity
- Groups: Google Group; G Suite domain (for users who are not identities)

### Resources

- Projects
- VMs
- App Engine applications
- Cloud Storage buckets
- Pub/Sub topics

### Permissions

### Roles

- Predefined
- Primitive: Viewer, Editor, Owner
- Custom

### Policies

## Data Security

### Encryption

#### Encryption at Rest

- Data at rest is encrypted by default in Google Cloud Platform.
- Data is encrypted at multiple levels, including the application, infrastructure, and device levels.
- Data is encrypted in chunks. Each chunk has its own encryption key, which is called a data encryption key.
- Data encryption keys are themselves encrypted using a key encryption key.

#### Encryption in Transit

- Within Google network: authenticated but not encrypted
- Outside Google network: encrypted

### Key Management

- Default Key Management (DEK)
- Cloud KMS Key Management
- Customer-Supplied Keys

### Security Evaluation

- Penetration Testing
- Auditing: logging

### Security Design Principles

- Separation of Duties
- Least Privilege
- Defense in Depth

### Major Regulations

# Chapter 8 Designing for Reliability

## Improving Reliability with Stackdriver

### Monitoring with Stackdriver

- Metrics
- Time Series
- Dashboards

### Alerting with Stackdriver

- Policies, Conditions and Notifications
- Reducing Alerts

### Logging with Stackdriver

## Release Management

### Continuous Deployment

### Continuous Deployment Tests

- Unit Tests
- Integration Tests
- Acceptance Tests
- Load Tests

### Deployment Strategies

- Complete deployment
- Rolling deployment
- Canary deployment
- Blue/Green deployment

## Systems Reliability Engineering

### Overload

- Shedding Load:
- Degrading Quality of Service (QoS)
- Upstream Throttling

### Cascade Failures

### Testing for Systems Reliability

- Unit Tests
- Integration Tests
- System Tests: Sanity Tests, Regression Tests...
- Reliability Stress Tests

## Incident Management and Post-Mortem Analysis

# Chapter 9 Analyzing and Defining Technical Processes

## Software Development Lifecycle (SDLC) Plan

### Analysis

- Scoping the Problem to Be Solved
- Evaluating Options
- Cost-Benefit Analysis

### Design

- High-Level Design
- Detailed Design

### Development and Testing

### Documentation

- Developer documentation
- Operations documentation
- User documentation

### Maintenance

## Continuous Integration and Continuous Deployment

## Troubleshooting and Post-Mortem Analysis Culture

## IT Enterprise Processes

- Information Technology Infrastructure Library (ITIL)
- ISO/ICE 20000

## Business Continuity Planning and Disaster Recovery

### Business Continuity Planning:

- Disaster plan
- Business impact analysis
- Recovery plan
- Recovery time objectives

### Disaster Recovery

# Chapter 10 Analyzing and Defining Business Processes

## Stakeholder management

- Interests and Influence
- Projects, Programs, and Portfolios
- Stages of Stakeholder Management
    - Identifying stakeholders
    - Determining their roles and scope of interests
    - Developing a communications plan
    - Communicating with and influencing stakeholders

## Change management

- Reasons for Change
- Change Management Methodologies
    - Plan-Do-Study-Act methodology

## Team skill management

## Customer success management

## Cost management

# Chapter 11 Development and Operations

## Application Development Methodologies

- Waterfall
- Spiral
- Agile

## Technical Debt

Projects incur technical debt for many reasons, including the following:

- Insufficient understanding of requirements
- Need to deliver some functional code by a set time or within a fixed budget
- Poor collaboration between teams developing in parallel
- Lack of coding standards
- Insufficient testing

## API Best Practices

### Resources and Standard Methods

### API Security

- Authentication
- Authorization (JWT)

## Testing Frameworks

### Testing Framework Models

## Data and System Migration Tooling

### Types of Cloud Migrations

- Lift and shift
- Move and improve
- Rebuild in the cloud

### Migration Services and Tools

# Chapter 12 Migration Planning

## Integrating Cloud Services with Existing Systems

- Assessment
- Pilot
- Data migration
- Application migration
- Optimization

## Migrating Systems and Data

### Planning for Systems Migrations

- Consider the criticality of the system.
- Document the production level of each application.
- Also note whether the application is developed by a third party or in-house and the level of support available.
- Consider the service-level agreements (SLAs) that the application has in place.
- How well documented is the application?
- If the application were moved to the cloud, what level of effort would be required to make it functional in the cloud?
- Database consideration
- On what other systems is the application dependent, such as identity management, messaging, monitoring, and log
  collection? How is the application backed up?
- How well automated are the deployment and maintenance of the application? Are manual operations needed for normal
  operations?

### Planning for Data Migration

- Data Governance and Data Migration
- Migrating Object Storage
    - Plan the structure of buckets
    - Determine roles and access controls
    - Understand the time and cost of migrating data to Cloud Storage
    - Plan the order in which data will be transferred
    - Determine the method to transfer the data
    
- Migrating Relational Data

## Licensing Mapping

## Network and Management Planning
- Virtual Private Clouds
- Network Access Controls
- Scaling
- Connectivity

## Testing and proof-of-concept development













