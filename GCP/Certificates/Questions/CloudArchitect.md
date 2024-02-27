### 1.1

You have been tasked with interviewing line-of-business owners about their needs for a new cloud application. Which of
the following do you expect to find?

1. A comprehensive list of defined business and technical requirements
2. That their business requirements do not have a one-to-one correlation with technical requirements
3. Business and technical requirements in conflict
4. Clear consensus on all requirements

### 2.2

You have received complaints from customers about long wait times while loading application pages in their browsers,
especially pages with several images. Your director has tasked you with reducing latency when accessing and transmitting
data to a client device outside the cloud. Which of the following would you use? (Choose two.)

1. Multiregional storage
2. Coldline storage
3. CDN
4. Cloud Pub/Sub
5. Cloud Dataflow

### 2.4

You have been hired to consult with a new data warehouse team. They are struggling to meet schedules because they
repeatedly find problems with data quality and have to write preprocessing scripts to clean the data. What managed
service would you recommend for addressing these problems?

1. Cloud Dataflow
2. Cloud Dataproc
3. Cloud Dataprep
4. Cloud Datastore

### 2.17

Your company has large volumes of unstructured data stored on several network-attached storage systems. The maintenance
costs are increasing, and management would like to consider alternatives. What GCP storage system would you recommend?

1. Cloud SQL
2. Cloud Storage
3. Cloud Datastore
4. Bigtable

### 3.4

Your company is running multiple VM instances that have not had any downtime in the past several weeks. Recently,
several of the physical servers suffered disk failures. The applications running on the servers did not have any
apparent service disruptions. What feature of Compute Engine enabled that?

1. Preemptible VMs
2. Live migration
3. Canary deployments
4. Redundant array of inexpensive disks

### 3.5

You have deployed an application on an instance group. The application is not functioning correctly. What is a possible
outcome?

1. The application shuts down when the instance group time-to-live (TTL) threshold is reached.
2. The application shuts down when the health check fails.
3. The VM shuts down when the instance group TTL threshold is reached and a new VM is started.
4. The VM shuts down when the health check fails and a new VM is started.

### 3.6

Mountkirk Games is growing its user base in North America, Europe, and Asia. Executives are concerned that players in
Europe and Asia will have a degraded experience if the game backend runs only in North America. What would you suggest
as a way to improve latency and game experience for users in Europe and Asia?

1. Use Cloud Spanner to have a globally consistent, horizontally scalable relational database.
2. Create instance groups running the game backend in multiple regions across North America, Europe, and Asia. Use
   global load balancing to distribute the workload.
3. Use Standard Tier networking to ensure that data sent between regions is routed over the public Internet.
4. Use a Cloud Memorystore cache in front of the database to reduce database read latency.

### 3.9

TerramEarth has determined that it wants to use Cloud Bigtable to store equipment telemetry data transmitted over their
cellular network. They have also concluded that they want two clusters in different regions. Both clusters should be
able to respond to read and write requests. What kind of replication should be used?

1. Primary–hot primary
2. Primary–warm primary
3. Primary–primary
4. Primary read–primary write

### 3.12

Why would you want to run long-running, compute-intensive backend computation in a different managed instance group than
on web servers supporting a minimal user interface?

1. Managed instance groups can run only a single application.
2. Managed instance groups are optimized for either compute or HTTP connectivity.
3. Compute-intensive applications have different scaling characteristics from those of lightweight user interface
   applications.
4. There is no reason to run the applications in different managed instance groups.

### 3.13

An instance group is adding more VMs than necessary and then shutting them down. This pattern is happening repeatedly.
What would you do to try to stabilize the addition and removal of VMs?

1. Increase the maximum number of VMs in the instance group.
2. Decrease the minimum number of VMs in the instance group.
3. Increase the time autoscalers consider when making decisions.
4. Decrease the time autoscalers consider when making decisions.

### 3.14

Dress4Win has just developed a new feature for its social networking service. Customers can upload images of their
clothes, create montages from those images, and share them on social networking sites. Images are temporarily saved to
locally attached drives as the customer works on the montage. When the montage is complete, the final version is copied
to a Cloud Storage bucket. The services implementing this feature run in a managed instance group. Several users have
noted that their final montages are not available even though they saved them in the application. No other problems have
been reported with the service. What might be causing this problem?

1. The Cloud Storage bucket is out of storage.
2. The locally attached drive does not have a filesystem.
3. The users experiencing the problem were using a VM that was shut down by an autoscaler, and a cleanup script did not
   run to copy the latest version of the montage to Cloud Storage.
4. The network connectivity between the VMs and Cloud Storage has failed.

### 3.15

Kubernetes uses several abstractions to model and manage computation and applications. What is the progression of
abstractions from the lowest to the highest level?

1. Pods → Deployments → Services
2. Pods → Services → Deployments
3. Deployments → Services → Pods
4. Deployments → Pods → Services

### 3.17

TerramEarth is considering building an analytics database and making it available to equipment designers. The designers
require the ability to query the data with SQL. The analytics database manager wants to minimize the cost of the
service. What would you recommend?

1. Use BigQuery as the analytics database, and partition the data to minimize the amount of data scanned to answer
   queries.
2. Use Bigtable as the analytics database, and partition the data to minimize the amount of data scanned to answer
   queries.
3. Use BigQuery as the analytics database, and use data federation to minimize the amount of data scanned to answer
   queries.
4. Use Bigtable as the analytics database, and use data federation to minimize the amount of data scanned to answer
   queries.

### 3.19

A group of business executives and software engineers are discussing the level of risk that is acceptable for a new
application. Business executives want to minimize the risk that the service is not available. Software engineers note
that the more developer time dedicated to reducing risk of disruption, the less time they have to implement new
features. How can you formalize the group’s tolerance for risk of disruption?

1. Request success rate
2. Uptime of service
3. Latency
4. Throughput

### 3.20

Your DevOps team recently determined that it needed to increase the size of persistent disks used by VMs running a
business-critical application. When scaling up the size of available persistent storage for a VM, what other step may be
required?

1. Adjusting the filesystem size in the operating system
2. Backing up the persistent disk before changing its size
3. Changing the access controls on files on the disk
4. Update disk metadata, including labels

### 4.2

You have just joined a startup that analyzes healthcare data and makes recommendations to healthcare providers to
improve the quality of care while controlling costs. You have to comply with privacy regulations. A compliance
consultant recommends that your startup control encryption keys used to encrypt data stored on cloud servers. You’d
rather have GCP manage all encryption components to minimize your work and infrastructure management responsibilities.
What would you recommend?

1. Use default encryption enabled on Compute Engine instances.
2. Use Google Cloud Key Management Service to store keys that you create and use them
3. Implement a trusted key store on premises, create the keys yourself, and use them to encrypt storage used with
   Compute Engine instances.
4. Use an encryption algorithm that does not use keys.

### 4.5

You are leading a lift-and-shift migration to the cloud. Your company has several load-balanced clusters that use VMs
that are not identically configured. You want to make as few changes as possible when moving workloads to the cloud.
What feature of GCP would you use to implement those clusters in the cloud?

1. Managed instance groups
2. Unmanaged instance groups
3. Flexible instance groups
4. Kubernetes clusters

### 5.15

Your Cloud SQL database is close to maximizing the number of read operations that it can perform. You could vertically
scale the database to use a larger instance, but you do not need additional write capacity. What else could you try to
reduce the number of reads performed by the database?

1. Switch to Cloud Spanner.
2. Use Cloud Bigtable instead.
3. Use Cloud Memorystore to create a database cache that stores the results of database queries. Before a query is sent
   to the database, the cache is checked for the answer to the query.
4. There is no other option—you must vertically scale.

### 6.6

Several new firewall rules have been added to a VPC. Several users are reporting unusual problems with applications that
did not occur before the firewall rule changes. You’d like to debug the firewall rules while causing the least impact on
the network and doing so as quickly as possible. Which of the following options is best?

1. Set all new firewall priorities to 0 so that they all take precedence over other rules.
2. Set all new firewall priorities to 65535 so that all other rules take precedence over these rules.
3. Disable one rule at a time to see whether that eliminates the problems. If needed, disable combinations of rules
   until the problems are eliminated.
4. Remove all firewall rules and add them back one at a time until the problems occur and then remove the latest rule
   added back.

### 6.8

To comply with regulations, you need to deploy a disaster recovery site that has the same design and configuration as
your production environment. You want to implement the disaster recovery site in the cloud. Which topology would you
use?

1. Gated ingress topology
2. Gated egress topology
3. Handover topology
4. Mirrored topology

### 6.9

Network engineers have determined that the best option for linking the on-premises network to GCP resources is by using
an IPsec VPN. Which GCP service would you use in the cloud?

1. Cloud IPsec
2. Cloud VPN
3. Cloud Interconnect IPsec
4. Cloud VPN IKE

### 6.10

Network engineers have determined that a link between the on-premises network and GCP will require an 8 Gbps connection.
Which option would you recommend?

1. Cloud VPN
2. Partner Interconnect
3. Direct Interconnect
4. Hybrid Interconnect

### 6.13

A startup is designing a social site dedicated to discussing global political, social, and environmental issues. The
site will include news and opinion pieces in text and video. The startup expects that some stories will be exceedingly
popular, and others won’t be, but they want to ensure that all users have a similar experience with regard to latency,
so they plan to replicate content across regions. What load balancer should they use?

1. HTTP(S)
2. SSL Proxy
3. Internal TCP/UDP
4. TCP Proxy

### 6.14

As a developer, you foresee the need to have a load balancer that can distribute load using only private RFC 1918
addresses. Which load balancer would you use?

1. Internal TCP/UDP
2. HTTP(S)
3. SSL Proxy
4. TCP Proxy

### 6.15

After a thorough review of the options, a team of developers and network engineers have determined that the SSL Proxy
load balancer is the best option for their needs. What other GCP service must they have to use the SSL Proxy load
balancer?

1. Cloud Storage
2. Cloud VPN
3. Premium Tier networking
4. TCP Proxy Load Balancing