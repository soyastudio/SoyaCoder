# Chapter 1. Overview of Google Cloud Platform

## Exam Essentials

- Understand different ways of delivering cloud computing resources
- Understand the different forms of cloud storage and when to use them.
- Understand the differences between running an IT environment on-premise or in the cloud

## Review Questions

### 1.5

All block storage systems use what block size?

1. 4KB
2. 8KB
3. 16KB
4. Block size can vary.

### 1.6

You have been asked to set up network security in a virtual private cloud. Your company wants to have multiple
subnetworks and limit traffic between the subnetworks. Which network security control would you use to control the flow
of traffic between subnets?

1. Identity access management
2. Router
3. Firewall
4. IP address table

# Chapter 2. Google Cloud Computing Services

## Exam Essentials

- Understand the differences between Compute Engine, Kubernetes Engine, App Engine, and Cloud Functions.
- Understand what is meant by serverless.
- Understand the difference between object and file storage.
- Know the different kinds of databases.
- Understand virtual private clouds
- Understand load balancing.
- Understand developer and management tools.
- Know the types of specialized services offered by Google Cloud Platform.
- Know the main differences between on-premises and public cloud computing.

## Review Questions

### 2.3

Why would an API developer want to use the Apigee API platform?

1. To get the benefits of routing and rate-limiting
2. Authentication services
3. Version control of code
4. A and B
5. All of the above

# Chapter 3. Projects, Service Accounts, and Billing

## Exam Essentials

- Understand the GCP resource hierarchy
- Understand organization policies.
- Understand service accounts and how they are used
- Understand GCP Billing.
- Know how to enable APIs and create Stackdriver Workspaces.

## Highlights

- Organization Administrator...
- It is in projects that we create resources, use GCP services, manage permissions, and manage billing options.
- The organization policies are defined in terms of constraints on a resource.
- Since policies are inherited and cannot be disabled or overridden by objects lower in the hierarchy, this is an
  effective way to apply a policy across all organizational resources.
- Multiple policies can be in effect for a folder or project.
- When we assign a role to a service account, we are treating it as an identity. When we give users permission to access
  a service account, we are treating it as a resource.
- There are two types of billing accounts: self-serve and invoiced
- Billing account roles: Billing account Creator/Administrator/User/Viewer
- A budget is associated with a billing account, not a project
- Billing data can be exported to either a BigQuery database or a Cloud Storage file.

## Review Questions

### 3.4

Your company has a number of policies that need to be enforced for all projects. You decide to apply policies to the
resource hierarchy. Not long after you apply the policies, an engineer finds that an application that had worked prior
to implementing policies is no longer working. The engineer would like you to create an exception for the application.
How can you override a policy inherited from another entity in the resource hierarchy?

1. Inherited policies can be overridden by defining a policy at a folder or project level.
2. Inherited policies cannot be overridden.
3. Policies can be overridden by linking them to service accounts.
4. Policies can be overridden by linking them to billing accounts.

### 3.13

A large enterprise is planning to use GCP across a number of subdivisions. Each subdivision is managed independently and
has its own budget. Most subdivisions plan to spend tens of thousands of dollars per month. How would you recommend they
set up their billing account(s)?

1. Use a single self-service billing account.
2. Use multiple self-service billing accounts.
3. Use a single invoiced billing account.
4. Use multiple invoiced billing accounts.

### 3.14

An application administrator is responsible for managing all resources in a project. She wants to delegate
responsibility for several service accounts to another administrator. If additional service accounts are created, the
other administrator should manage those as well. What is the best way to delegate privileges needed to manage the
service accounts?

1. Grant iam.serviceAccountUser to the administrator at the project level.
2. Grant iam.serviceAccountUser to the administrator at the service account level.
3. Grant iam.serviceProjectAccountUser to the administrator at the project level.
4. Grant iam.serviceProjectAccountUser to the administrator at the service account level.

### 3.15

You work for a retailer with a large number of brick and mortar stores. Every night the stores upload daily sales data.
You have been tasked with creating a service that verifies the uploads every night. You decide to use a service account.
Your manager questions the security of your proposed solution, particularly about authenticating the service account.
You explain the authentication mechanism used by service accounts. What authentication mechanism is used?

1. Username and password
2. Two-factor authentication
3. Encrypted keys
4. Biometrics

# Chapter 4. Introduction to Computing in Google Cloud

## Exam Essentials

- Understand how images are used to create instances of VMs and how VMs are organized in projects.
- Know that GCP has multiple geographic regions and regions have one or more zones.
- Understand what preemptible VMs are and when they are appropriate to use.
- Understand the difference between the App Engine standard and flexible environments.
- Know that Kubernetes is a container orchestration platform.
- Understand Kubernetes.
- Understand Cloud Functions.

## Highlights:

- Custom image
- VMs are reliable in GCP
- Single VM is not scalable in CPU, Memory, so introduce instance group for scaling.
- Permission: role and member

## Review Questions

### 4.6

How much memory of a node does Kubernetes require as overhead?

1. 10GB to 20GB
2. 1GB to 2GB
3. 1.5GB
4. A scaled amount starting at 25 percent of memory and decreasing to 2 percent of marginal memory as the total amount
   of memory increases.

### 4.13

Your company is seeing a marked increase in the rate of customer growth in Europe. Latency is becoming an issue because
your application is running in us-central1. You suggest deploying your services to a region in Europe. You have several
choices. You should consider all of the following factors except which one?

1. Cost
2. Latency
3. Regulations
4. Reliability

### 4.18

Kubernetes reserves CPU resources in percentage of cores available. The percentage is what range?

1. 1 percent to 10 percent
2. 0.25 percent to 6 percent
3. 0.25 percent to 2 percent
4. 10 percent to 12 percent

### 4.20

A client has brought you in to help reduce their DevOps overhead. Engineers are spending too much time patching servers
and optimizing server utilization. They want to move to serverless platforms as much as possible. Your client has heard
of Cloud Functions and wants to use them as much as possible. You recommend all of the following types of applications
except which one?

1. Long-running data warehouse data load procedures
2. IoT backend processing
3. Mobile application event processing
4. Asynchronous workflows

# Chapter 5. Computing with Compute Engine Virtual Machines

## Exam Essentials

- Understand how to use Cloud Console and Cloud SDK to create, start, and stop VMs.
- Know how to configure a preemptible VM using Cloud Console and the gcloud commands.
- Know the purpose of advanced options, including Shielded VMs and advanced boot disk configurations.
- Know how to use gcloud compute instance commands to list, start, and stop VMs.
- Understand how to monitor a VM.
- Know the factors that determine the cost of a VM.

## Review Questions

### 5.8

All of the following parameters can be set when adding an additional disk through Google Cloud Console, except one.
Which one?

1. Disk type
2. Encryption key management
3. Block size
4. Source image for the disk

# Chapter 6. Managing Virtual Machines

## Exam Essentials

- Know how to create a VM in the console and at the command line.
- Understand why GPUs are used and how to attach them to a VM.
- Understand images and snapshots.
- Understand instance groups and instance group templates.

## Highlights:

- The Reset command restarts a VM.
- Attaching graphics processing units (GPUs) to VMs.
- Working with snapshots and images.
- To work with snapshots, a user must be assigned the Compute Storage Admin role
- Instance group:
- VM Commands: (page 168)
  - gcloud compute instances ...
  - gcloud compute zones list
  - gcloud compute disks snapshot DISK_NAME --snapshot-names=NAME
  - gcloud compute disks create DISK_NAME --source-snapshot=SNAPSHOT_NAME
  - gcloud compute snapshots list/describe
  - gcloud compute images create/delete/export
  - gcloud compute instance-templates create/delete/list ...
  - gcloud compute instance-groups managed delete-instances/list-instances ...

## Review Questions

### 6.8

You have decided to delegate the task of making backup snapshots to a member of your team. What role would you need to
grant to your team member to create snapshots?

1. Compute Image Admin
2. Storage Admin
3. Compute Snapshot Admin
4. Compute Storage Admin

### 6.12

You would like to understand details of how GCP starts a virtual instance. Which optional parameter would you use when
starting an instance to display those details?

1. --verbose
2. --async
3. --describe
4. --details

### 6.19

What can be the basis for scaling up an instance group?

1. CPU utilization and operating system updates
2. Disk usage and CPU utilization only
3. Network latency, load balancing capacity, and CPU utilization
4. Disk usage and operating system updates only

# Chapter 7. Computing with Kubernetes

## Exam Essentials

- Understand that Kubernetes is a container orchestration system.
- Understand that Kubernetes uses a single cluster master that controls nodes that execute workloads.
- Be able to describe pods.
- Kubernetes can be deployed using Cloud Console or using gcloud commands.
- Deployments are sets of identical pods. StatefulSets are a type of deployment used for stateful applications.
  Kubernetes is monitored using Stackdriver.
- ReplicaSet vs Deployment
- The first time you use Kubernetes Engine, you may need to create credentials.
- Kubernetes runs a number of workloads to manage the cluster.
-

## Highlights:

- GKE and VM instances group
- When you create a cluster, you can specify a machine type.
- Replicas are copies of pods and constitute a group of pods that are managed as a unit.
- Pods are considered ephemeral; that is, they are expected to terminate.
- A service, in Kubernetes terminology, is an object that provides API endpoints with a stable IP address that allow
  applications to discover pods running a particular application
-

## Review Questions

### 7.3

What is a pod in Kubernetes?

1. A set of containers
2. Application code deployed in a Kubernetes cluster
3. A single instance of a running process in a cluster
4. A controller that manages communication between clients and Kubernetes services

### 7.5

You have noticed that an application’s performance has degraded significantly. You have recently made some configuration
changes to resources in your Kubernetes cluster and suspect that those changes have alerted the number of pods running
in the cluster. Where would you look for details on the number of pods that should be running?

1. Deployments
2. Stackdriver
3. ReplicaSet
4. Jobs

### 7.6

You are deploying a high availability application in Kubernetes Engine. You want to maintain availability even if there
is a major network outage in a data center. What feature of Kubernetes Engine would you employ?

1. Multiple instance groups
2. Multizone/region cluster
3. Regional deployments
4. Load balancing

### 7.7

You want to write a script to deploy a Kubernetes cluster with GPUs. You have deployed clusters before, but you are not
sure about all the required parameters. You need to deploy this script as quickly as possible. What is one way to
develop this script quickly?

1. Use the GPU template in the Kubernetes Engine cloud console to generate the gcloud command to create the cluster
2. Search the Web for a script
3. Review the documentation on gcloud parameters for adding GPUs
4. Use an existing script and add parameters for attaching GPUs

### 7.8

What gcloud command will create a cluster named ch07-cluster-1 with four nodes?

1. gcloud beta container clusters create ch07-cluster-1 --num-nodes=4
2. gcloud container beta clusters create ch07-cluster-1 --num-nodes=4
3. gcloud container clusters create ch07-cluster-1 --num-nodes=4
4. gcloud beta container clusters create ch07-cluster-1 4

### 7.16

When creating an alerting policy, what can be specified?

1. Conditions, notifications, and time to live
2. Conditions, notifications, and documentation
3. Conditions only
4. Conditions, documentation, and time to live

### 7.19

You are attempting to execute commands to initiate a deployment on a Kubernetes cluster. The commands are not having any
effect. You suspect that a Kubernetes component is not functioning correctly. What component could be the problem?

1. The Kubernetes API
2. A StatefulSet
3. Cloud SDK gcloud commands
4. ReplicaSet

# Chapter 8. Managing Kubernetes Clusters

## Exam Essentials

- Know how to view the status of a Kubernetes cluster:
  - gcloud container clusters ...
- Understand how to add, modify, and remove nodes
  - gcloud container clusters resize
- Understand how to add, modify, and remove pods
  - kubectl get deployments
  - kubectl scale deployment
- Understand how to add, modify, and remove services
  - kubectl run
  - kubectl expose deployment
  - kubectl delete service
- Know how to view Container Registry images and their details.
  - gcloud container images list
  - gcloud container images describe

## Highlights:

### Cluster Related Command:

- gcloud container clusters list
- gcloud container clusters describe --zone us-central1-a standard-cluster-1
- gcloud container clusters get-credentials --zone us-central1-a standard-cluster-1
- gcloud container clusters resize
- gcloud container clusters update
- gcloud container images list/describe

### Cluster Objects Related Command:

- kubectl get/describe nodes
- kubectl get/describe pods
- kubectl get deployments
- kubectl scale deployment nginx-1 --replicas 5
- kubectl autoscale deployment nginx-1 --max 10 --min 1 --cpu-percent 80
- kubectl delete deployment nginx-1
- kubectl get services
- kubectl run hello-server --image=gcr.io/google/samples/hello-app:1.0 --port 8080
- kubectl expose deployment hello-server --type="LoadBalancer"
- kubectl delete service hello-server

## Review Questions

### 8.6

You receive a page in the middle of the night informing you that several services running on a Kubernetes cluster have
high latency when responding to API requests. You review monitoring data and determine that there are not enough
resources in the cluster to keep up with the load. You decide to add six more VMs to the cluster. What parameters will
you need to specify when you issue the cluster resize command?

1. Cluster size
2. Cluster name
3. Node pool name
4. All of the above

### 8.12

Where can you view a list of services when using Cloud Console?

1. In the Deployment Details page
2. In the Container Details page
3. In the Cluster Details page
4. None of the above

### 8.13

What kubectl command is used to add a service?

1. run
2. start
3. initiate
4. deploy

# Chapter 9. Computing with App Engine

## Exam Essentials

- Know the structure of App Engine Standard applications
- Know how to deploy an App Engine app
- Know how to view the status of an application in the App Engine Console
- Understand the different scaling options: autoscaling, basic scaling and manual scaling
- Know how to split traffic.
- Understand how to migrate traffic to a new version

## Highlight
- 

## Review Questions

### 9.2

You’ve just released an application running in App Engine Standard. You notice that there are peak demand periods in
which you need up to 12 instances, but most of the time 5 instances are sufficient. What is the best way to ensure that
you have enough instances to meet demand without spending more than you have to?

1. Configure your app for autoscaling and specify max instances of 12 and min instances of 5.
2. Configure your app for basic scaling and specify max instances of 12 and min instances of 5.
3. Create a cron job to add instances just prior to peak periods and remove instances after the peak period is over.
4. Configure your app for instance detection and do not specify a max or minimum number of instances.

### 9.6

You have several App Engine apps you plan to deploy from your project. What have you failed to account for in this
design?

1. App Engine only supports one app per project.
2. App Engine only supports two apps per project.
3. App Engine apps exist outside of projects.
4. Nothing, this is a common pattern.

### 9.10

What parameters can be configured with basic scaling?

1. max_instances and min_instances
2. idle_timeout and min_instances
3. idle_timeout and max_instances
4. idle_timeout and target_throughput_utilization

### 9.15

What parameter to gcloud app services set-traffic is used to specify the method to use when splitting traffic?

1. ––split-traffic
2. ––split-by
3. ––traffic-split
4. ––split-method

# Chapter 10. Computing with Cloud Functions

## Exam Essentials

- Know the relationship between events, triggers, and functions
- Know when to use Cloud Functions versus App Engine applications.
- Know the parameters for defining a cloud function on a Cloud Storage event.
  - google.storage.object.finalize
  - google.storage.object.delete
  - google.storage.object.archive
  - google.storage.object.metadataUpdate
- Know the parameters for defining a Cloud Function on a Cloud Pub/Sub event.
- Know the gcloud commands for working with Cloud Functions
  - gcloud functions deploy
  - gcloud functions delete

## Review Questions

### 10.1

A product manager is proposing a new application that will require several backend services, three business logic
services, and access to relational databases. Each service will provide a single function, and it will require several
of these services to complete a business task. Service execution time is dependent on the size of input and is expected
to take up to 30 minutes in some cases. Which GCP product is a good serverless option for running this related service?

1. Cloud Functions
2. Compute Engine
3. App Engine
4. Cloud Storage

# Chapter 11. Planning Storage in the Cloud

## Exam Essentials

- Know the major storage system types, including caches, persistent disks, and object storage.
- Know the major kinds of data models.
- Know the four storage classes in Cloud Storage.
- Know that cloud applications may require more than one kind of data store.
- Know that you can apply lifecycle configurations on Cloud Storage buckets.
- Know the characteristics of different data stores that help you determine which is the best option for your
  requirements.

## Highlight:

- SSDs are used when high throughput is important.
- SSDs provide consistent performance for both random access and sequential access patterns; HDDs have longer latencies
  but cost less
- Cloud Storage does not support concurrency and locking.
- Buckets are resources within a project.

## Review Questions

### 11.1

You are tasked with defining lifecycle configurations on buckets in Cloud Storage. You need to consider all possible
options for transitioning from one storage class to another. All of the following transitions are allowed except for
one. Which one is that?

1. Nearline to coldline
2. Regional to nearline
3. Multiregional to coldline
4. Regional to multiregional

### 11.6

Which of the following statements about Cloud Storage is not true?

1. Cloud Storage buckets can have retention periods.
2. Lifecycle configurations can be used to change storage class from regional to multiregional.
3. Cloud Storage does not provide block-level access to data within files stored in buckets.
4. Cloud Storage is designed for high durability.

### 11.7

Once a bucket has its storage class set to coldline, what are other storage classes it can transition to?

1. Regional
2. Nearline
3. Multi-regional
4. None of the above

### 11.20

A colleague is wondering why some storage charges are so high. They explain that they have moved all their storage to
nearline and coldline storage. They routinely access most of the object on any given day. What is one possible reason
the storage costs are higher than expected?

1. Nearline and coldline incur access charges.
2. Transfer charges.
3. Multiregional coldline is more expensive.
4. Regional coldline is more expensive.

# Chapter 12. Deploying Storage in Google Cloud Platform

## Exam Essentials

- Understand how to initialize Cloud SQL and Cloud Spanner.
- Understand how to initialize Cloud Datastore and Cloud Bigtable
- Know how to export data from BigQuery, estimate the cost of a query, and monitor jobs in BigQuery.
- Know how to convert Cloud Storage bucket storage classes.
- Understand that Pub/Sub is a message queue.
- Understand that Cloud Dataproc is a managed Spark and Hadoop service.
- Know the four command-line tools: gcloud, gsutil, bq, and cbt.

### Highlight

- gcloud sql commands:
  - gcloud sql connect
  - gcloud sql backups create ––async ––instance [INSTANCE_NAME]
  - gcloud sql instances patch [INSTANCE_NAME] –backup-start-time [HH:MM]
- gcloud datastore import/export
- bq
- gcloud pubsub
  - gcloud pubsub topics create [TOPIC-NAME]
  - gcloud pubsub subscriptions create [SUBSCRIPTION-NAME] ––topic [TOPIC-NAME]
- cbt
  - cbt createtable ace-exam-bt-table
  - cbt ls
  - cbt createfamily ace-exam-bt-table colfam1
  - cbt set ace-exam-bt-table row1 colfam1:col1=ace-exam-value
  - cbt read ace-exam-bt-table
- gcloud dataproc clusters
- gsutil
  - gsutil rewrite -s [STORAGE_CLASS] gs://[PATH_TO_OBJECT]
  - gsutil mb/mv/cp

## Review Questions

### 12.5

What is the correct command-line structure to export data from Datastore?

1. gcloud datastore export '[NAMESPACE]' gs://[BUCKET_NAME]
2. gcloud datastore export gs://[BUCKET_NAME]
3. gcloud datastore export --namespaces='[NAMESPACE]' gs://[BUCKET_NAME]
4. gcloud datastore dump --namespaces='[NAMESPACE]' gs://[BUCKET_NAME]

### 12.9

You want to estimate the cost of running a BigQuery query. What two services within Google Cloud Platform will you need
to use?

1. BigQuery and Billing
2. Billing and Pricing Calculator
3. BigQuery and Pricing Calculator
4. Billing and Pricing Calculator

# Chapter 13. Loading Data into Storage

## Exam Essentials

- Know how to load data into and move data around Cloud Storage.
  - gsutil acl ch -u
- Understand how import and export work with Cloud SQL.
- Know that you can export entities from a Cloud Datastore.
  - There isn’t a Cloud Console option for exporting and importing from Datastore.
- Understand how to export and import data from BigQuery.
- Remember that Bigtable and Cloud Dataproc are different from other import and export functions.
  - Bigtable does not have a console or command-line feature to import or export data. A Java program is run from the
    command line to import or export data from Bigtable
  - When you export from Dataproc, you are exporting the cluster configuration, not data in the cluster.
- Know that Pub/Sub is used to send messages between services.

## Highlight:

- gcloud sql:
  - gcloud sql instances describe [INSTANCE_NAME]
  - gcloud sql export sql [INSTANCE_NAME] gs://[BUCKET_NAME]/[FILE_NAME] --database=[DATABASE_NAME]
  - gcloud sql import sql [INSTANCE_NAME] gs://[BUCKET_NAME]/[IMPORT_FILE_NAME] --database=[DATABASE_NAME]
- Cloud Spanner uses the Dataflow service for importing and exporting.
- gcloud datastore:
  - gcloud datastore export --namespaces="(default)" gs://${BUCKET}
  - gcloud datastore import gs://${BUCKET}/[PATH]/[FILE].overall_export_metadata
- bq:
  - bq extract --destination_format [FORMAT] --compression [COMPRESSION_TYPE]
    --field_delimiter [DELIMITER] --print_header [BOOLEAN] [PROJECT_ID]:[DATASET].
    [TABLE] gs://[BUCKET]/[FILENAME]
  - bq load --autodetect --source_format=[FORMAT] [DATASET].[TABLE] [PATH_TO_SOURCE]
- Cloud Bigtable does not have an Export and Import option in the Cloud Console or in gcloud
- Cloud Dataproc does have Import and Export commands to save and restore cluster configuration data.
  - gcloud beta dataproc clusters export [CLUSTER_NAME] --destination=[PATH_TO_EXPORT_FILE]
  - gcloud beta dataproc clusters import [SOURCE_FILE]
- gcloud pubsub:
  - gcloud pubsub topics create [TOPIC_NAME]
  - gcloud pubsub subscriptions create --topic [TOPIC_NAME] [SUBSCRIPTION_NAME]
  - cloud pubsub topics publish [TOPIC_NAME] --message [MESSAGE]
  - gcloud pubsub subscriptions pull --auto-ack [SUBSCRIPTION_NAME]

## Review Questions

### 13.8

As required by your company’s policy, you need to back up your Datastore database at least once per day. An auditor is
questioning whether or not Datastore export is sufficient. You explain that the Datastore export command produces what
outputs?

1. A single entity file
2. A metadata file
3. A metadata file and a folder with the data
4. A metadata file, an entity file, and a folder with the data

### 13.11

You have received a large data set from an Internet of Things (IoT) system. You want to use BigQuery to analyze the
data. What command-line command would you use to make data available for analysis in BigQuery?

1. bq load ––autodetect ––source_format=[FORMAT] [DATASET].[TABLE]
   [PATH_TO_SOURCE]
2. bq import ––autodetect ––source_format=[FORMAT] [DATASET].[TABLE]
   [PATH_TO_SOURCE]
3. gloud BigQuery load ––autodetect ––source_format=[FORMAT] [DATASET].
   [TABLE] [PATH_TO_SOURCE]
4. gcloud BigQuery load ––autodetect ––source_format=[FORMAT] [DATASET].
   [TABLE] [PATH_TO_SOURCE]

### 13.14

You have just exported from a Dataproc cluster. What have you exported?

1. Data in Spark DataFrames
2. All tables in the Spark database
3. Configuration data about the cluster
4. All tables in the Hadoop database

### 13.17

Which of the following commands will create a subscription on the topic ace-exam-topic1?

1. gcloud pubsub create ––topic=ace-exam-topic1 ace-exam-sub1
2. gcloud pubsub subscriptions create ––topic=ace-exam-topic1
3. gcloud pubsub subscriptions create ––topic=ace-exam-topic1 ace-exam-sub1
4. gsutil pubsub subscriptions create ––topic=ace-exam-topic1 ace-exam-sub1

# Chapter 14. Networking in the Cloud: Virtual Private Clouds and Virtual Private Networks

## Exam Essentials

- Know that VPCs are logical data centers in the cloud and VPNs are secure connections between your VPC subnets and your
  internal network. VPCs have subnets and routing rules for routing traffic between subnets.
- Know that VPCs create subnets in each region when in auto mode. Firewall rules are applied to subnets, also called
  networks.Routers can be configured to learn just regional routes or global route.
- Understand how to read and calculate CIDR notation.
- Know that VPCs can be created using gcloud commands.
- Shared VPCs can be shared at the network or folder level.
- Understand that you can add network interfaces to a VM.
- Know that firewall rules control the flow of network traffic. Firewall rules are applied to a subnet.
- Know how to create a VPN with Cloud Console. VPNs route traffic between your cloud resources and your internal
  network.

## Highlight:

- VPC
  - VPCs are software versions of physical networks that link resources in a project.
  - GCP automatically creates a VPC when you create a project
  - You can create additional VPCs and modify the VPCs created by GCP
  - VPCs are global resources, so they are not tied to a specific region or zone.
  - VPCs contain subnetworks, call subnets, which are regional resources.
  - Subnets provide private internal addresses. Resources use these addresses to communicate with each other and with
    Google APIs and services.
  - Shared VPC within organization (can also on folder level)
  - VPC peering for interproject connectivity (if the VPCs are not shared)
  - CIDR: classless inter-domain routing
  - Dynamic routing (Google Cloud Routing): regional or global
  - gcloud compute networks create ace-exam-vpc1 --subnet-mode=auto
  - Command for create and manage shared VPC: (page 381)
- Firewall Rules
  - Firewall rules are defined at the network (subnet) level and used to control the flow of network traffic to VMs.
  - It is important to note that the firewall is stateful
  - All VPCs start with two implied rules
  - gcloud compute firewall-rules
- VPN:
  - Hybrid Connectivity
  - Tunnel
  - Routing options: dynamic, route-based and policy-based
  - Commands:
    - gcloud compute target-vpn-gateways
    - gcloud compute forwarding-rule
    - gcloud compute vpn-tunnels

## Review Questions

### 14.6

At what levels of the resource hierarchy can a shared VPC be created?

1. Folders and resources
2. Organizations and project
3. Organizations and folders
4. Folders and subnets

### 14.7

You are using Cloud Console to create a VM that you want to exist in a custom subnet you just created. What section of
the Create Instance form would you use to specify the custom subnet?

1. Networking tab of the Management, Security, Disks, Networking, Sole Tenancy section
2. Management tab of the Management, Security, Disks, Networking, Sole Tenancy section
3. Sole Tenancy tab of Management, Security, Disks, Networking, Sole Tenancy
4. Sole Tenancy tab of Management, Security, Disks, Networking

### 14.13

You are using gcloud to create a firewall rule. Which parameter would you use to specify the subnet it should apply to?

1. ––subnet
2. ––network
3. ––destination
4. ––source-ranges

### 14.17

You are using Cloud Console to create a VPN. You want to configure the GCP end of the VPN. What section of the Create
VPN form would you use?

1. Tunnels
2. Routing Options
3. Google Compute Engine VPN
4. IKE Version

### 14.19

When you create a cloud router, what kind of unique identifier do you need to assign for the BGP protocol?

1. IP address
2. ASN
3. Dynamic load routing ID
4. None of the above

# Chapter 15. Networking in the Cloud: DNS, Load Balancing, and IP Addressing

## Exam Essentials

- Cloud DNS is used to map domain names to IP addresses.
  - DNS Zone: public and private
- Know that DNS entries, like example.com, can have multiple records associated with them.
  - CNAME
- Know how load balancers are distinguished
- Know the five types of load balancers and when they should be used.
- Understand that configuring a load balancer can require configuring both the frontend and backend.
- Know how to increase the number of IP addresses in a subnet. (Cannot decrease the number of IP addresses in a subnet.)
- Know how to reserve an IP address using the console and the gcloud beta compute address create command.

## Highlight:

- A managed zone contains DNS records associated with a DNS name suffix
- "A" records, "AAAA" records and CNAME records; NS, SOA records.
- gcloud dns commands:
- Backends are VMs that will have load distributed to them
- gcloud compute forwarding-rules create ace-exam-lb --port=80 --target-pool ace-exam-pool
- gcloud compute target-pools add-instances ace-exam-pool --instances ig1,ig2
- gcloud compute networks subnets expand-ip-range ace-exam-subnet1 --prefix-length 16
- Premium is the network service level that routes all traffic over the Google network; the Standard tier may use the
  public Internet when routing traffic.

## Review Questions

### 15.1

What record type is used to specify the IPv4 address of a domain?

1. AAAA
2. A
3. NS
4. SOA

### 15.3

What do the TTL parameters specify in a DNS record?

1. Time a record can exist in a cache before it should be queried again
2. Time a client has to respond to a request for DNS information
3. Time allowed to create a CNAME record
4. Time before a human has to manually verify the information in the DNS record

### 15.6

Which load balancers provide global load balancing?

1. HTTP(S) only
2. SSL Proxy and TCP Proxy only
3. HTTP(S), SSL Proxy, and TCP Proxy
4. Internal TCP/UDP, HTTP(S), SSL Proxy, and TCP Proxy

### 15.15

You have created a subnet called sn1 using 192.168.0.0 with 65,534 addresses. You realize that you will not need that
many addresses, and you’d like to reduce that number to 254. Which of the following commands would you use?

1. gcloud compute networks subnets expand-ip-range sn1 --prefix-length=24
2. gcloud compute networks subnets expand-ip-range sn1 --prefix-length=-8
3. gcloud compute networks subnets expand-ip-range sn1 --size=256
4. There is no command to reduce the number of IP addresses available.

### 15.16

You have created a subnet called sn1 using 192.168.0.0. You want it to have 14 addresses. What prefix length would you
use?

1. 32
2. 28
3. 20
4. 16

### 15.17

You want all your network traffic to route over the Google network and not traverse the public Internet. What level of
network service should you choose?

1. Standard
2. Google-only
3. Premium
4. Non-Internet

# Chapter 16. Deploying Applications with Cloud Launcher and Deployment Manager

## Exam Essentials

- Understand how to browse for solutions using the Cloud Launcher section of Cloud Console.
- Know how to deploy a solution in Cloud Launcher.
- Understand how to use the Deployment Manager section of the console to monitor deployment.
- Know that Deployment Manager is a GCP service for creating configuration files that define resources to use with an
  application
- Know that resources in a configuration file are defined using a name, type, and set of properties.
- Know that you can launch a deployment configuration file using gcloud deploymentmanager deployments create.

## Highlight:

- Cloud Launcher is a central repository of applications and data sets that can be deployed to your GCP environment.
  Also called marketplace.
- The license types are free, paid, and bring your own license (BYOL).
- Deployment Manager Template Files: Python or Jinja2
- gcloud deployment-manager deployments create quickstart-deployment --config vm.yaml
- gloud deployment-manager deployments describe quickstart-deployment

## Review Questions

### 16.1

What are the categories of Cloud Launcher solutions?

1. Data sets only
2. Operating systems only
3. Developer tools and operating systems only
4. Data sets, operating systems, and developer tools

### 16.3

Where do you navigate to launch a Cloud Launcher solution?

1. Overview page of the solution
2. Main Cloud Launcher page
3. Network Services
4. None of the above

### 16.15

What command launches a deployment?

1. gcloud deployment-manager deployments create
2. gcloud cloud-launcher deployments create
3. gcloud deployment-manager deployments launch
4. gcloud cloud-launcher deployments launch

### 16.20

You are deploying a Cloud Launcher application that includes a LAMP stack. What software will this deploy?

1. Apache server and Linux only
2. Linux only
3. MySQL and Apache only
4. Apache, MySQL, Linux, and PHP

# Chapter 17. Configuring Access and Security

## Exam Essentials

- Know the three types of roles: primitive, predefined, and custom
- Understand that scopes are a type of access control applied to VM instances
- Know how to view roles assigned to identities: gcloud projects get-iam-policy
- Understand that IAM roles support separation of duties and the principle of least privilege.
- gcloud iam roles describe
- Understand the different options for accessing scopes when creating an instance: Default Access, Full Access, and Set
  Access for Each API
- Know that Stackdriver Logging collects logging events.

## Highlight:

- gcloud projects get-iam-policy ace-exam-project
- gcloud iam roles describe
- gcloud projects add-iam-policy-binding [RESOURCE-NAME] --member user:[USER EMAIL]  --role [ROLE-ID]
- The launch stage options are as follows: Alpha, Beta, General Availability, and Disabled.
- Scopes are permissions granted to a VM to perform some operation. Scopes authorize the access to API methods. The
  service account assigned to a VM has roles associated with it,
- An instance can only perform operations allowed by both IAM roles assigned to the service account and scopes defined
  on the instance.
- To set scopes in an instance, stop the instance if it is running
- gcloud compute instances set-service-account [INSTANCE_NAME]   [--service-account [SERVICE_ACCOUNT_EMAIL]
  | [--no-service-account]   [--no-scopes | --scopes [SCOPES,...]]
- Assigning a Service Account to a Virtual Machine Instance

## Review Questions

### 17.6

You are working in the form displayed after clicking the Add link in the IAM form of IAM & Admin in Cloud Console. There
is a parameter called New Members. What items would you enter in that parameter?

1. Individual users only
2. Individual users or groups
3. Roles or individual users
4. Roles or groups

### 17.7

You have been assigned the App Engine Deployer role. What operations can you perform?

1. Write new versions of an application only
2. Read application configuration and settings only
3. Read application configuration and settings and write new configurations
4. Read application configuration and settings and write new versions

### 17.10

What launch stages are available when creating custom roles?

1. Alpha and beta only
2. General availability only
3. Disabled only
4. Alpha, beta, general availability, and disabled

### 17.13

A scope is identified using what kind of identifier?

1. A randomly generated ID
2. A URL beginning with https://www.googleserviceaccounts/
3. A URL beginning with https://www.googleapis.com/auth/
4. A URL beginning with https://www.googleapis.com/auth/PROJECT_ID]

### 17.16

What gcloud command would you use to set scopes?

1. gcloud compute instances set-scopes
2. gcloud compute instances set-service-account
3. gcloud compute service-accounts set-scopes
4. gcloud compute service-accounts define-scopes

# Chapter 18. Monitoring, Logging, and Cost Estimating

## Exam Essentials

- Understand the need for monitoring and the role of metrics.
- Stackdriver Logging collects, stores, filters, and displays log data.
- Know how to filter logs.
- Cloud Trace is a distributed tracing service
- Cloud Debug is used to analyze running code by taking snapshots or injecting logpoints.
- GCP publishes the status of services in the Google Cloud Platform Status page.
- The Pricing Calculator is used to estimate the cost of resources and services in the GCP.

## Highlight:

- Stackdriver works in hybrid environments with support for GCP, Amazon Web Services, and on-premise resources.
- Stackdriver needs a Workspace to store the data.
- Stackdriver will mail daily or weekly reports
- Agents send data from monitored resources to Stackdriver in streams
- This process of grouping data into regular-sized buckets of time is called aligning.
- There are two ways to create custom metrics: using OpenCensus or Stackdriver’s Monitoring API
  - OpenCensus provides a higher-level, monitoring-focused API,
  - The Stackdriver Monitoring API is lower-level.
- A metric kind, such as a gauge, delta, or cumulative metric
- The process of copying data from Logging to a storage system is called exporting, and the location to which you write
  the log data is called a sink

## Review Questions

### 18.2

You have just created a virtual machine, and you’d like Stackdriver Monitoring to alert you via email whenever the CPU
average utilization exceeds 75 percent for 5 minutes. What do you need to do to the VM to have this happen?

1. Install a Stackdriver workspace
2. Install the Stackdriver monitoring agent on the VM
3. Edit the VM configuration in Cloud Console and check the Monitor With Stackdriver checkbox
4. Set a notification channel

### 18.3

Stackdriver can be used to monitor resources where?

1. In Google Cloud Platform only
2. In Google Cloud Platform and Amazon Web Services only
3. In Google Cloud Platform and on premises data centers
4. In Google Cloud Platform, Amazon Web Services, and on premises data centers

### 18.4

Grouping a set of metrics that arrive in a period of time into regular-sized buckets is called what?

1. Aggregation
2. Alignment
3. Minimization
4. Consolidation

### 18.13

You are viewing log entries and spot one that looks suspicious. You are not familiar with the kind of log entry, and you
want to see the complete details of the log entry as quickly as possible. What would you do?

1. Drill down one by one into each structure in the log entry.
2. Click Expand all to show all details.
3. Write a Python script to reformat the log entry.
4. Click the Show Detail link next to the log entry.

### 18.16

You believe there may be a problem with BigQuery in the us-central zone. Where would you go to check the status of the
BigQuery service for the quickest access to details?

1. Email Google Cloud Support.
2. Check https://status.cloud.google.com/.
3. Check https://bigquery.status.cloud.google.com/.
4. Call Google tech support.