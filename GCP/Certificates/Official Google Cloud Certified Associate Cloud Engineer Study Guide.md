# Chapter 1 Overview of Google Cloud Platform

## Types of Cloud Services

### Compute Resources

- Virtual Machines
- Managed Kubernates Clusters
- Serverless Computing
    - AppEngine
    - Cloud Functions

### Storage

- Object Storage: Cloud Storage
    - Objects are grouped into Bucket
    - Each object is individually addressable, usually by a URL
    - Objects can be uploaded without concern for the amount of space available on a disk
    - Multiple copies of objects are stored to improve availability and durability
    - Access controls can be applied at the object level (bucket level, object level)
    - Cloud Storage FUSE
- File Storage: Cloud Filestore
    - Based on NFS (Network File System)
    - Decouple the file system from VMs
- Block Storage
    - Block is fixed-size data structure
    - Used in ephemeral and persistent disks attached to VMs
- Caches

### Networking

### Specialized Services

## Cloud Computing vs. Data Center Computing

- Rent Instead of Own Resources
- Pay-as-You-Go-for-What-You-Use Model
- Elastic Resource Allocation
- Specialized Services

# Chapter 2 Google Cloud Computing Services

## Computing Components of Google Cloud Platform

### Computing Resources

- Compute Engine (VM)
    - KVM (Kernel Virtual Machine)
    - Hypervisor: run multiple operating systems, referred to as guest operating systems, while keeping the activities
      of each isolated from other guest operating systems
- Kubernetes Engine (GKE)
    - Container:
    - Container Manager: for isolation
- App Engine
    - PaaS
    - App Engine manages the underlying computing and network infrastructure. (managed services)
    - Standard and flexible types
    - In the flexible environment, you run Docker containers in the App Engine environment
- Cloud Functions
    - Lightweight
    - Event-driven
    - Short-running

## Storage Components of Google Cloud Platform

### Storage Resources

- Cloud Storage
- Persistent Disk
- Cloud Storage for Firebase (best for mobile app)
- Cloud Filestore

### Databases

- Cloud SQL
- Cloud Spanner (support ANSI 2011 standard SQL)
- Cloud Bigtable
- Cloud Datastore (NoSQL document database)
- Cloud Memorystore
- Cloud Firestore

## Networking Components of Google Cloud Platform

### Networking Services

- VPC
- Cloud Load Balancing
- Cloud Armor
    - Ability to allow or restrict access based on IP address
    - Predefined rules to counter cross-site scripting attacks
    - Ability to counter SQL injection attacks
    - Ability to define rules at both level 3 (network) and level 7 (application)
    - Allows and restricts access based on the geolocation of incoming traffic
- Cloud CDN
- Cloud Interconnect
- Cloud DNS (is designed to automatically scale so customers can have thousands and millions of addresses without
  concern for scaling the underlying infrastructure)

### Identity Management

### Development Tools

- Cloud SDK
- Cloud SDK Client Libraries: for Java, Go, Python, NodeJs...
- Google Cloud Code plugin for VSCode, Intellij, Eclipse, Maven...

## Additional Components of Google Cloud Platform

### Management Tools:

- Stackdriver
- Monitoring
- Logging
- Error Reporting
- Trace
- Debugger
- Profiler

### Specialized Services

- Apigee API Platform
    - Based on the Open API Specification
    - APIs can be authenticated using either OAuth 2.0 or SAML
    - Provides routing and rate-limiting based on policies customers can define
- Data Analytics
    - BigQuery
    - Cloud Dataflow
    - Cloud Dataproc
    - Cloud Dataprep
- AI and Machine Learning
    - Cloud AutoML
    - Cloud Machine Learning Engine
    - Cloud Natural Language Processing
    - Cloud Vision

# Chapter 3 Projects, Service Accounts, and Billing

# Chapter 4 Introduction to Computing in Google Cloud

# Chapter 5 Computing with Compute Engine Virtual Machines

# Chapter 6 Managing Virtual Machines

# Chapter 7 Computing with Kubernetes

# Chapter 8 Managing Kubernetes Clusters

# Chapter 9 Computing with App Engine

# Chapter 10 Computing with Cloud Functions

# Chapter 11 Planning Storage in the Cloud

# Chapter 12 Deploying Storage in Google Cloud Platform

# Chapter 13 Loading Data into Storage

# Chapter 14 Networking in the Cloud: Virtual Private Clouds and Virtual Private Networks

# Chapter 15 Networking in the Cloud: DNS, Load Balancing, and IP Addressing

# Chapter 16 Deploying Applications with Cloud Launcher and Deployment Manager

# Chapter 17 Configuring Access and Security

# Chapter 18 Monitoring, Logging, and Cost Estimating