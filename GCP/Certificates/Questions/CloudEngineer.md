# Chapter 1.

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

# Chapter 2.

### 2.3

Why would an API developer want to use the Apigee API platform?

1. To get the benefits of routing and rate-limiting
2. Authentication services
3. Version control of code
4. A and B
5. All of the above

# Chapter 3.

- How to create custom image
- VMs are reliable in GCP
- Single VM is not scalable in CPU, Memory, so introduce instance group for scaling.
- Permission: role and member

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

### 5.8

All of the following parameters can be set when adding an additional disk through Google Cloud Console, except one.
Which one?

1. Disk type
2. Encryption key management
3. Block size
4. Source image for the disk

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

### 10.1

A product manager is proposing a new application that will require several backend services, three business logic
services, and access to relational databases. Each service will provide a single function, and it will require several
of these services to complete a business task. Service execution time is dependent on the size of input and is expected
to take up to 30 minutes in some cases. Which GCP product is a good serverless option for running this related service?

1. Cloud Functions
2. Compute Engine
3. App Engine
4. Cloud Storage

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

### 12.9

You want to estimate the cost of running a BigQuery query. What two services within Google Cloud Platform will you need
to use?

1. BigQuery and Billing
2. Billing and Pricing Calculator
3. BigQuery and Pricing Calculator
4. Billing and Pricing Calculator

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