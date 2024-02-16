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

## How GCP Organizes Projects and Accounts

### GCP Resource Hierarchy

- Organization
    - G Suite: Google’s office productivity suite (Gmail, Docs, Drive, Calendar...)
    - Cloud Identity (IDaaS)
        - A single cloud identity is associated with at most one organization
        - Super admins: assign the role of Organization Administrator Identity and Access Management (IAM) role to users
          who manage the organization. In addition, GCP will automatically grant Project Creator and Billing Account
          Creator IAM roles to all users in the domain
        - The users with the Organization Administrator IAM role are responsible for the following:
            1. Defining the structure of the resource hierarchy
            2. Defining identity access management policies over the resource hierarchy
            3. Delegating other management roles to other users
- Folder
- Project
    - It is in projects that we create resources, use GCP services, manage permissions, and manage billing options.
    - Anyone with the resourcemanager.projects.create IAM permission can create a project.
    - By default, when an organization is created, every user in the domain is granted that permission
    - Your organization will have a quota of projects it can create.

### Organization Policies

- Constraints on Resources
    - Allow a specific set of values
    - Deny a specific set of values
    - Deny a value and all its child values
    - Allow all allowed values
    - Deny all values
- Policy Evaluation
    - Policies are inherited and cannot be disabled or overridden by objects lower in the hierarchy, this is an
      effective way to apply a policy across all organizational resources.
    - Multiple policies can be in effect for a folder or project
- Managing Projects

## Roles and Identities

### Roles in GCP

- Primitive roles: owner, editor, viewer
- Predefined roles
- Custom roles

### Granting Roles to Identities

## Service Accounts

- Service accounts can be identities or treated as resource
- User-managed service accounts and Google-managed service accounts
- Service account group
- Service accounts are created automatically when resources are created

## Billing

### Billing Accounts

Billing account types:

- Self-serve:
- Invoiced: commonly used by enterprises and other large customers

Billing roles:

- Billing Account Creator, which can create new self-service billing accounts
- Billing Account Administrator, which manages billing accounts but cannot create them
- Billing Account User, which enables a user to link projects to billing accounts
- Billing Account Viewer, which enables a user to view billing account cost and transactions

### Billing Budgets and Alerts

### Exporting Billing Data

- Export to Big Query
- Export to Cloud Storage (File export): csv or json format

## Enabling APIs

GCP uses APIs to make services programmatically accessible. But you need enable it.

## Provisioning Stackdriver Workspaces

### Managing Projects

# Chapter 4 Introduction to Computing in Google Cloud

## Compute Engine

### Virtual Machine Images

- Public images by Google
- Public images by other providers
- Custom images

### Virtual Machines Are Contained in Projects

### Virtual Machines Run in a Zone and Region

consideration:

- Cost
- Data locality regulations
- HA
- Latency
- Need for specific hardware platforms, which can vary by region.

### Users Need Privileges to Create Virtual Machines

Predefined Roles:

- Compute Engine Admin
- Compute Engine Network Admin: can create, modify, and delete most networking resources, and it provides read-only
  access to firewall rules and SSL certifications
- Compute Engine Security Admin: create, modify, and delete SSL certificates and firewall rules.
- Compute Engine Viewer: can get and list Compute Engine resources but cannot read data from those resources

### Preemptible Virtual Machines

Limitation:

- May terminate at any time. If they terminate within 10 minutes of starting, you will not be charged for that time.
- Will be terminated within 24 hours.
- May not always be available. Availability may vary across zones and regions.
- Cannot migrate to a regular VM.
- Cannot be set to automatically restart.
- Are not covered by any service level agreement (SLA).

### Custom Machine Types

### Use Cases for Compute Engine Virtual Machines

- Choose the specific image to run on the instance.
- Install software packages or custom libraries.
- Have fine-grained control over which users have permissions on the instance.
- Have control over SSL certificates and firewall rules for the instance.

## App Engine

### Structure of an App Engine Application

- Application
- Services
- Versions
- Instances

### App Engine Standard and Flexible Environments

- Standard environment
    - First generation
    - Second generation
- Flexible environment
    - provides a fully managed PaaS and is a good option when you can package your application and services into a small
      set of containers. (like GKE)

### Use Cases for App Engine

## Kubernetes Engine

- Create clusters of VMs that run the Kubernetes orchestration software for containers
- Deploy containerized applications to the cluster
- Administer the cluster
- Specify policies, such as autoscaling
- Monitor cluster health

### Kubernetes Functionality

- Load balancing across Compute Engine VMs that are deployed in a Kubernetes cluster
- Automatic scaling of nodes (VMs) in the cluster
- Automatic upgrading of cluster software as needed
- Node monitoring and health repair
- Logging
- Support for node pools, which are collections of nodes all with the same configuration

### Kubernetes Cluster Architecture

### Kubernetes High Availability

### Kubernetes Engine Use Cases

## Cloud Functions

### Cloud Functions Execution Environment

- The functions execute in a secure, isolated execution environment.
- Compute resources scale as needed to run as many instances of Cloud Functions as needed without you having to do
  anything to control scaling.
- The execution of one function is independent of all others. The lifecycles of Cloud Functions are not dependent on
  each other.

### Cloud Functions Use Cases

-Internet of Things (IoT), in which a sensor or other device can send information about the state of a sensor. Depending
on the values sent, Cloud Functions could trigger an alert or start processing data that was uploaded from the sensor.

- Mobile applications that, like IoT apps, send data to the cloud for processing
- Asynchronous workflows in which each step starts at some time after the previous steps completes, but there are no
  assumptions about when the processing steps will complete

# Chapter 5 Computing with Compute Engine Virtual Machines

## Creating and Configuring Virtual Machines with the Console

### Main Virtual Machine Configuration Details

### Additional Configuration Details

- Management Tab
    - Description
    - Label(Metadata): key/value
    - Deletion protection
    - Startup script
    - Availability policy:
        - Preemptibility
        - Automatic restart
        - On host maintenance
- Security Tab
    - [Shielded VM](https://cloud.google.com/compute/shielded-vm/docs/shielded-vm): Shielded VM offers verifiable
      integrity of your Compute Engine VM instances, so you can be confident your instances haven't been compromised by
      boot- or kernel-level malware or rootkits
        - Secure boot: Secure Boot helps ensure that the system only runs authentic software by verifying the digital
          signature of all boot components, and halting the boot process if signature verification fails.
        - Virtual Trusted Platform Module (vTPM):
        - Integrity monitoring: helps you understand and make decisions about the state of your VM instances.
    - SSH Keys
- Disk Tab
    - Boot disk
    - Encryption
        - Google managed key
        - Customer managed key
        - Customer provided key
    - Additional disk
        - Name of the disk
        - Disk type, either standard or SSD Persistent disk
        - Source image, if this is not a blank disk
        - Indication of whether to delete the disk when the instance is deleted
        - Size in gigabytes
        - How the encryption keys will be managed
- Networking
    - Network tag
    - Network interfaces
- Sole Tenancy

## Creating and Configuring Virtual Machines with Cloud SDK

### Creating a Virtual Machine with Cloud SDK

gcloud command:

- Compute Engine
- Cloud SQL instances
- Kubernetes Engine
- Cloud Dataproc
- Cloud DNS
- Cloud Deployment

```
gcloud compute

```

### Creating a Virtual Machine with Cloud Shell

## Basic Virtual Machine Management

### Starting and Stopping Instances

### Network Access to Virtual Machines

- SSH
- RDP

### Monitoring a Virtual Machine

### Cost of Virtual Machines

- VMs are billed in 1-second increments.
- The cost is based on machine type.
- Google offers discounts for sustained usage.
- VMs are charged for a minimum of 1 minute of use.
- Preemptible VMs can save you up to 80 percent of the cost of a VM.

## Guidelines for Planning, Deploying, and Managing Virtual Machines

- Choose a machine type with the fewest CPUs and the smallest amount of memory that still meets your requirements,
  including peak capacity. This will minimize the cost of the VM.
- Use the console for ad hoc administration of VMs. Use scripts with gcloud commands for tasks that will be repeated.
- Use startup scripts to perform software updates and other tasks that should be performed on startup.
- If you make many modifications to a machine image, consider saving it and using it with new instances rather than
  running the same set of modifications on every new instance.
- If you can tolerate unplanned disruptions, use preemptible VMs to reduce cost.
- Use SSH or RDP to access a VM to perform operating system–level tasks.
- Use Cloud Console, Cloud Shell, or Cloud SDK to perform VM-level tasks.

# Chapter 6 Managing Virtual Machines

## Managing Single Virtual Machine Instances

### Managing Single Virtual Machine Instances in the Console

- Starting, Stopping, and Deleting Instances
- Viewing Virtual Machine Inventory
- Attaching GPUs to an Instance
    - GPU Libraries have to be installed
    - The instance will run in a zone that has GPUs available
    - You will also need to customize the configuration for the machine type
    - Restrictions on the use of GPUs
        - CPU compatibility
        - Must set the instance to terminate during maintenance
- Working with Snapshots
    - Snapshots are copies of data on a persistent disk
    - When you first create a snapshot, GCP will make a full copy of the data on the persistent disk. The next time you
      create a snapshot from that disk, GCP will copy only the data that has changed since the last snapshot
    - To work with snapshots, a user must be assigned the Compute Storage Admin role.
    - Add label to a snapshot
- Working with Images.
    - Images can be created from the following:
        - Disk
        - Snapshot
        - Cloud storage file
        - Another image
    - Create an image
    - Delete an image
    - Deprecate an image:

### Managing a Single Virtual Machine Instance with Cloud Shell and the Command Line

- Starting, Stopping, Deleting Instances

```
gcloud compute instances <start/stop/delete> INSTANCE_NAMES

```

- Viewing VM Inventory

```
gcloud compute instances list

gcloud compute instances describe (for resource fields)

```

- Working with Snapshots
    - Create a snapshot of a disk
    - Create disk from snapshot
    - Handle snapshot

```
gcloud compute disks snapshot DISK_NAME --snapshot-names=NAME

gcloud compute disks create DISK_NAME --source-snapshot=SNAPSHOT_NAME

gcloud compute snapshots list

gcloud compute snapshots describe SNAPSHOT_NAME

```

- Working with Images

```
gcloud compute images create/delete IMAGE_NAME

gcloud compute images export --destination-uri DESTINATION_URI --image IMAGE_NAME

```

## Introduction to Instance Groups

### Creating and Removing Instance Groups and Templates

```
gcloud compute instance-templates create/delete INSTANCE

gcloud compute instance-templates list

```

```
gcloud compute instance-groups managed delete-instances NAME

gcloud compute instance-groups managed list-instances

```

### Instance Groups Load Balancing and Autoscaling

You can configure an autoscaling policy to trigger adding or removing instances based on CPU utilization, monitoring
metric, load-balancing capacity, or queue-based workloads.

## Guidelines for Managing Virtual Machines

- Use labels and descriptions.
- Use managed instance groups to enable autoscaling and load balancing
- Use GPUs for numeric-intensive processing, such as machine learning and high-performance computing.
- Use snapshots to save the state of a disk or to make copies.
- Use preemptible instances for workloads that can tolerate disruption

# Chapter 7 Computing with Kubernetes

## Introduction to Kubernetes Engine

### Kubernetes Cluster Architecture

- Cluster Master:
    - Kubernates API server
    - Controller
    - Scheduler
- Cluster Nodes

### Kubernetes Objects

- Pods
    - Pods contain at least one container
    - Multiple containers are used when two or more containers must share resources
    - Pods also use shared networking and storage across containers
    - Each pod gets a unique IP address and a set of ports, multiple containers in a pod connect to different ports and
      can talk to each other on localhost
    - Pods treat the multiple containers as a single entity for management purposes.
    - Pods are generally created in groups. Replicas are copies of pods and constitute a group of pods that are managed
      as a unit.
    - Pods support autoscaling as well.
    - Pods are considered ephemeral
    - Pods are usually managed by a controller
- Services: A service, in Kubernetes terminology, is an object that provides API endpoints with a stable IP address that
  allow applications to discover pods running a particular application.
- ReplicaSet: A ReplicaSet is a controller used by a deployment that ensures the correct number identical of pods are
  running
- Deployment: Deployments are sets of identical pods.
- StatefulSet
- Job

## Deploying Kubernetes Clusters

- Create credentials
- Create cluster

### Deploying Kubernetes Clusters Using Cloud Console

### Deploying Kubernetes Clusters Using Cloud Shell and Cloud SDK

```
gcloud (optional alpha, beta) container

```

## Deploying Application Pods

- Create a deployment
    - Container image:
    - Application:
    - Cluster
- YAML file
- Install kubectl:

```
gcloud components install kubectl

```

```
kubectl run ch07-app-deploy --image=ch07-app --port=8080

kubectl scale deployment ch07-app-deploy --replicas=5

```

## Monitoring Kubernetes

- Enable Stackdriver monitoring and logging
- Create workspace
- Stackdriver monitoring page
    - Resources: list page and details page (CPU usage, Disk/IO, Network Traffic)
- Create Alerting Policy
    - Conditions: (Resource Metric Threshold Conditions)
        - Basic Types
        - Advanced Types
        - Basic Health
        - Advanced Health
    - Notifications: notification channels
        - Email,
        - webhooks,
        - SMS text messaging
        - Third-party tools such as PagerDuty, Campfire, and Slack
    - Documentation
    - Name policy (id)

# Chapter 8 Managing Kubernetes Clusters

## Viewing the Status of a Kubernetes Cluster

### Viewing the Status of Kubernetes Clusters Using Cloud Console

- List of Clusters in Kubernates Engine
- Click the name of a cluster to display its details
    - Cluster (configuration)
    - Add-ons
    - Permissions
- Details about node pools in the cluster
    - Details (Node pools)
    - Storage
    - Nodes
        - Pods
        - Pod status
        - Containers
        - Details of Container

### Viewing the Status of Kubernetes Clusters Using Cloud SDK and Cloud Shell

```
gcloud container clusters list

gcloud container clusters describe --zone us-central1-a standard-cluster-1

```

To list information about nodes and pods, use the kubectl command.

```
kubectl describe nodes
kubectl describe pods

```

## Adding, Modifying, and Removing Nodes

### Adding, Modifying, and Removing Nodes with Cloud Console

```
gcloud container clusters resize

gcloud container clusters update

```

### Adding, Modifying, and Removing with Cloud SDK and Cloud Shell

### Adding, Modifying, and Removing Pods

### Adding, Modifying, and Removing Pods with Cloud Console 192

### Adding, Modifying, and Removing Pods with Cloud SDK and Cloud Shell 195

### Adding, Modifying, and Removing Services

Services are added through deployments. That is under workload

### Adding, Modifying, and Removing Services with Cloud Console

### Adding, Modifying, and Removing Services with Cloud SDK and Cloud Shell

### Viewing the Image Repository and Image Details

### Viewing the Image Repository and Image Details with Cloud Console

### Viewing the Image Repository and Image Details with Cloud SDK and Cloud Shell

# Chapter 9 Computing with App Engine

## App Engine Components

- Application
- Service
- Version
- Instance

## Deploying an App Engine Application

### Deploying an App Using Cloud Shell and SDK

```
gcloud app deploy app.yml

```

- The project URL is the project name followed by .appspot.com
- --no-promote parameter to deploy the app without routing traffic to it
- Stop service version: gcloud app versions stop v1 v2

## Scaling App Engine Applications

- target_cpu_utilization
- target_throughput_utilization
- max_concurrent_requests
- max_instances
- min_instances
- max_pending_latency
- min_pending_latency

## Splitting Traffic between App Engine Versions

```
gcloud app services set-traffic

    --migrate
    --splits v1=.4,v2=.6
    --split-by

```

# Chapter 10 Computing with Cloud Functions

## Introduction to Cloud Functions

### Events, Triggers, and Functions

- Event Categories:
    - Cloud Storage
    - Cloud Pub/Sub
    - HTTP
    - Firebase
    - Stackdriver Logging

### Runtime Environments

## Cloud Functions Receiving Events from Cloud Storage

### Deploying a Cloud Function for Cloud Storage Events

Create Function:

- Function name
- Memory allocated for the function
- Trigger
- Event type
- Source of the function code
- Runtime
- Source code
- Python, Go or Node.js function to execute

### Using Cloud Console

### Using gcloud Commands

```
gcloud functions deploy/delete

```

## Cloud Functions Receiving Events from Pub/Sub

### Deploying a Cloud Function for Cloud Pub/Sub Events Using Cloud Console

### Deploying a Cloud Function for Cloud Pub/Sub Events

### Using gcloud Commands

# Chapter 11 Planning Storage in the Cloud

## Types of Storage Systems

### Cache

- MemoryStore: a managed Redis service
- 1GB - 300GB
- HA by failover replicas
- Create an instance

### Persistent Storage

- Be attached to VMs of GCE or GKE
- Block storage device and can create file system
- Data on persistent disks continues to exist after VMs are shut down or terminated.
- Network accessible
- Features of Persistent Disks
    - SSD and HDD
    - Persistent disks can be mounted on multiple VMs to provide multireader storage.
    - The size of persistent disks can be increased while mounted to a VM.
    - Persistent disks automatically encrypt data on the disk
    - Zonal or Regional
- Configuring Persistent Disks

### Object Storage

- Cloud Storage is an object storage system, which means files that are stored in the system are treated as atomic units
- Cloud Storage does not support concurrency and locking.
- Buckets are resources within a project
- Buckets share global namespace
- Cloud Storage does not provide a file system
- Cloud Storage provides four different classes of object storage:
    - mult-regional
    - regional
    - nearline
    - coldline
- Versioning and Object Lifecycle Management
    - Lifecycle management policies are applied to buckets and affect all objects in the bucket.
    - Multiregional and regional storage objects can be changed to nearline or coldline
    - Nearline can be changed only to coldline.

### Storage Types When Planning a Storage Solution

## Storage Data Models

### Object: Cloud Storage

### Relational: Cloud SQL, Cloud Spanner, and BigQuery

- Configuring Cloud SQL
- Configuring Cloud Spanner
- Configuring BigQuery
    - BigQuery does not require you to configure instances.
    - The first task for using BigQuery is to create a data set to hold data
    - Not all regions support BigQuery

### NoSQL: Datastore, Cloud Firestore, and Bigtable

- Cloud Datastore
    - Datastore is a document database
    - Datastore is a schemaless database
    - Datastore is a managed database.Datastore automatically partitions data and scales up or down as demand warrants.
    - support for transactions and indexes to improve query performance
- Cloud Firestore
    - Cloud Firestore is a managed NoSQL database that uses the document data model.
    - Cloud Firestore is that it is designed for storing, synchronizing, and querying data across distributed
      applications, like mobile apps.
    - Cloud Firestore supports transactions and provides multiregional replication
- Cloud Bigtable
    - It is a wide-column database
    - Bigtable is designed for petabyte-scale databases
    - Bigtable runs in clusters and scales horizontally.

## Choosing a Storage Solution: Guidelines to Consider

- Read and Write Patterns
- Consistency
- Transaction Support
- Cost
- Latency

# Chapter 12 Deploying Storage in Google Cloud Platform

## Deploying and Managing Cloud SQL

### Creating and Connecting to a MySQL Instance

### Creating a Database, Loading Data, and Querying Data

### Backing Up MySQL in Cloud SQL

## Deploying and Managing Datastore

### Adding Data to a Datastore Database

### Backing Up Datastore

To back up a Datastore database, you need to create a Cloud Storage bucket to hold a backup file and grant appropriate
permissions to users performing backup.

## Deploying and Managing BigQuery

- BigQuery is a fully managed database service
- Create DataSet
- BigQuery Jobs

### Estimating the Cost of Queries in BigQuery

### Viewing Jobs in BigQuery

## Deploying and Managing Cloud Spanner

Cloud Spanner is a managed database service, so you will not have to patch, backup, or perform other basic data
administration tasks.

## Deploying and Managing Cloud Pub/Sub

## Deploying and Managing Cloud Bigtable

- Instance name and ID
- Instance type: production vs development
- Storage type: SSD vs HDD
- Clusters: ID, Location, Region, Zone
- CLI: cbt

## Deploying and Managing Cloud Dataproc

Cluster Settings: YARN

## Managing Cloud Storage

# Chapter 13 Loading Data into Storage

## Loading and Moving Data to Cloud Storage

### Loading and Moving Data to Cloud Storage Using the Console

### Loading and Moving Data to Cloud Storage Using the Command Line

```
gsutil mb gs://[BUCKET_NAME]/

gsutil cp [LOCAL_OBJECT_LOCATION] gs://[DESTINATION_BUCKET_NAME]/

gsutil mv gs://[SOURCE_BUCKET_NAME]/[SOURCE_OBJECT_NAME] gs://[DESTINATION_BUCKET_NAME]/[DESTINATION_OBJECT_NAME]

```

## Importing and Exporting Data

### Importing and Exporting Data: Cloud SQL

```
gcloud sql instances describe [INSTANCE_NAME]

gcloud sql export sql [INSTANCE_NAME] gs://[BUCKET_NAME]/[FILE_NAME] --database=[DATABASE_NAME]

gcloud sql import sql [INSTANCE_NAME] gs://[BUCKET_NAME]/[IMPORT_FILE_NAME] --database=[DATABASE_NAME]

```

### Importing and Exporting Data: Cloud Datastore

```
gcloud datastore export --namespaces="(default)" gs://${BUCKET}

gcloud datastore import gs://${BUCKET}/[PATH]/[FILE].overall_export_metadata

```

### Importing and Exporting Data: BigQuery

### Importing and Exporting Data: Cloud Spanner

### Importing and Exporting Data: Cloud Bigtable

### Importing and Exporting Data: Cloud Dataproc

## Streaming Data to Cloud Pub/Sub

# Chapter 14 Networking in the Cloud: Virtual Private Clouds and Virtual Private Networks

## Creating a Virtual Private Cloud with Subnets

### Creating a Virtual Private Cloud with Cloud Console

- Subnet is regional
- Classless Inter-Domain Routing (CIDR)
- Firewall rules:
    - Types: ingress or egress
    - Action: allow or deny
    - Priority
- Dynamic routing: regional or global
- DNS Server policy

### Creating a Virtual Private Cloud with gcloud

```
gcloud compute networks create ace-exam-vpc1 --subnet-mode=auto/custom

```

### Creating a Shared Virtual Private Cloud Using gcloud

## Deploying Compute Engine with a Custom Network

## Creating Firewall Rules for a Virtual Private Cloud

### Structure of Firewall Rules

- Direction: Either ingress or egress
- Priority:
- Action: Either allow or deny
- Target: An instance to which the rule applies.
- Source/destination:
- Protocol and port
- Enforcement status:

Default rule:

- Incoming traffic from any VM instance on the same network
- Incoming TCP traffic on port 22, allowing SSH
- Incoming TCP traffic on port 3389, allowing Microsoft Remote Desktop Protocol(RDP)
- Incoming Internet Control Message Protocol (ICMP) from any source on the network
- The default rules all have priority 65534.

### Creating Firewall Rules Using Cloud Console

### Creating Firewall Rules Using gcloud

## Creating a Virtual Private Network

### Creating a Virtual Private Network Using Cloud Console

- Under Hybrid Connectivity
- Google Compute Engine VPN gateway
- Tunnels

### Creating a Virtual Private Network Using gcloud
```
gcloud compute target-vpn-gateways

gcloud compute forwarding-rule

gcloud compute vpn-tunnels

```

# Chapter 15 Networking in the Cloud: DNS, Load Balancing, and IP Addressing

## Configuring Cloud DNS

### Creating DNS Managed Zones Using Cloud Console

### Creating a DNS Managed Zones Using gcloud

## Configuring Load Balancers

### Types of Load Balancers

### Configuring Load Balancers using Cloud Console

### Configuring Load Balancers using gcloud

## Managing IP Addresses

### Expanding CIDR Blocks

### Reserving IP Addresses

# Chapter 16 Deploying Applications with Cloud Launcher and Deployment Manager

## Deploying a Solution Using Cloud Launcher

### Browsing Cloud Launcher and Viewing Solutions

### Deploying Cloud Launcher Solutions

## Deploying an Application Using Deployment Manager

### Deployment Manager Configuration Files

### Deployment Manager Template Files

### Launching a Deployment Manager Template

# Chapter 17 Configuring Access and Security

## Managing Identity and Access Management

### Viewing Account Identity and Access Management

### Assignments

### Assigning Identity and Access Management Roles to Accounts and Groups

### Defining Custom Identity and Access Management Roles

## Managing Service Accounts

### Managing Service Accounts with Scopes

### Assigning a Service Account to a Virtual Machine Instance

### Viewing Audit Logs

# Chapter 18 Monitoring, Logging, and Cost Estimating

## Monitoring with Stackdriver

### Creating Alerts Based on Resource Metrics

### Creating Custom Metrics

## Logging with Stackdriver

### Configuring Log Sinks

### Viewing and Filtering Logs

### Viewing Message Details

## Using Cloud Diagnostics

### Overview of Cloud Trace

### Overview of Cloud Debug

### Viewing Google Cloud Platform Status

## Using the Pricing Calculator