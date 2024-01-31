# [Virtual Private Cloud](https://cloud.google.com/vpc/docs/overview)

## [Overview](https://cloud.google.com/vpc/docs/overview)
### VPC networks
- A VPC network does the following:
  - Provides connectivity for your Compute Engine virtual machine (VM) instances, including Google Kubernetes Engine (GKE) clusters, serverless workloads, and other Google Cloud products built on Compute Engine VMs.
  - Offers built-in internal passthrough Network Load Balancers and proxy systems for internal Application Load Balancers.
  - Connects to on-premises networks by using Cloud VPN tunnels and VLAN attachments for Cloud Interconnect.
  - Distributes traffic from Google Cloud external load balancers to backends.
- Firewall
- Routes
- Forwarding Rules
- Interfaces and IP addresses

### Interfaces and IP addresses
- IP address
- Alias IP address
- Multiple network interfaces

### Sharing and Peering
- Shared VPC
- VPC Network Peering

### Hybrid cloud

### Cloud Load Balancing

### Special configurations


## VPC networks

[Andromeda](nsdi18-dalton.pdf)

### Networks and subnets
#### Subnets
Each VPC network consists of one or more IP address ranges called subnets. Subnets are regional resources, and have IP address ranges associated with them.

[TOOL: CIDR to IPv4 Conversion](https://www.ipaddressguide.com/)

#### Types of subnet
- IPv4 only (single-stack) subnets, with only IPv4 subnet ranges
- IPv4 and IPv6 (dual-stack) subnets, with both IPv4 and IPv6 subnet ranges

#### Purposes of subnets
- Regular subnets: This is the default subnet type. Regular subnets are created by users or automatically created in auto mode networks to be used with VM instances. Regular subnets have a purpose of PRIVATE in the gcloud CLI or API. The purpose is None in the Google Cloud console.
- Private Service Connect subnets: A subnet to use to publish a managed service by using Private Service Connect.
- Proxy-only subnets: A proxy-only subnet to use with regional Envoy-based load balancers.
- Private NAT subnets: A subnet that is reserved for use as the source range for Private NAT. This subnet is set to --purpose=PRIVATE_NAT

#### IPv4 subnet ranges
- Valid IPv4 subnet ranges
- Prohibited IPv4 subnet ranges
- Unusable addresses in IPv4 subnet rangs
- Auto mode IPv4 rangs
- Additional consideration

#### IPv6 subnet ranges
- IPv6 specifications
- IPv6 range assignment

### Virtual machine instances
A Compute Engine virtual machine (VM) instance is a virtual machine that is hosted on Google's infrastructure. VM instances include Google Kubernetes Engine (GKE) clusters, App Engine flexible environment instances, and other Google Cloud products built on Compute Engine VMs.

### Specifications
- VPC networks, including their associated routes and firewall rules, are global resources. They are not associated with any particular region or zone.
- Subnets are regional resources.
- Each subnet defines a range of IPv4 addresses. Subnets in custom mode VPC networks can also have a range of IPv6 addresses.
- Traffic to and from instances can be controlled with network firewall rules. Rules are implemented on the VMs themselves, so traffic can only be controlled and logged as it leaves or arrives at a VM.
- Resources within a VPC network can communicate with one another by using internal IPv4 addresses, internal IPv6 addresses, or external IPv6 addresses, subject to applicable network firewall rules. For more information, see communication within the network.
- Instances with internal IPv4 or IPv6 addresses can communicate with Google APIs and services.
- Network administration can be secured by using Identity and Access Management (IAM) roles.
- An organization can use Shared VPC to keep a VPC network in a common host project. Authorized IAM principals from other projects in the same organization can create resources that use subnets of the Shared VPC network.
- VPC networks can be connected to other VPC networks in different projects or organizations by using VPC Network Peering.
- VPC networks can be securely connected in hybrid environments by using Cloud VPN or Cloud Interconnect.
- VPC networks support GRE traffic, including traffic on Cloud VPN and Cloud Interconnect. VPC networks do not support GRE for Cloud NAT or for forwarding rules for load balancing and protocol forwarding. Support for GRE allows you to terminate GRE traffic on a VM from the internet (external IP address) and Cloud VPN or Cloud Interconnect (internal IP address). The decapsulated traffic can then be forwarded to a reachable destination. GRE enables you to use services such as Secure Access Service Edge (SASE) and SD-WAN.
- VPC networks support IPv4 and IPv6 unicast addresses. VPC networks do not support broadcast or multicast addresses within the network.

### Organization policy constraints

### Routes and firewall rules

#### [Routs](https://cloud.google.com/vpc/docs/routes)
- Routing in Google Cloud (routing table)
- Route types
  - System-generated default routes
  - Subnet routes
  - Dynamic routes: based on Border Gateway Protocol (BGP)
- Applicability and order
  - Applicable routes
  - Special return paths
  - Routing order
- Static Routess

#### Dynamic routing mode
Each VPC network has an associated dynamic routing mode that controls the behavior of all of its Cloud Routers. Cloud Routers manage BGP sessions for Google Cloud connectivity products.

BGP Route Advertisement: BGP route advertisement refers to the process of broadcasting routing information to neighboring routers. This is an important aspect of the Border Gateway Protocol (BGP), which is used for exchanging routing and reachability information among autonomous systems on the internet.

#### Firewall rules

### Communications and access
- Communication within the network: (default-allow-internal rule)
- Internet access requirements
- Communications and access for App Engine
  - App Engine standard environment: Only App Engine firewall rules apply to ingress traffic. Because App Engine standard environment instances do not run inside your VPC network, VPC firewall rules do not apply to them.
  - App Engine flexible environment: Both App Engine and VPC firewall rules apply to ingress traffic. Inbound traffic is only permitted if it is allowed by both types of firewall rules. For outbound traffic, VPC firewall rules apply.
- Traceroute to external IP addresses
- Egress throughput limits
- Packet size

### Network performance
- Latency
- Packet loss


## [Create and manage VPC networks](https://cloud.google.com/vpc/docs/create-modify-vpc-networks)


















# [Google Cloud Networking](https://www.youtube.com/watch?v=Hg6GH-V5YqE)

## Precondition
### 7 layer of OSI model

### IPv4



## VPC Networking

## Cloud IAM

## Cloud Load Balancing

## Cloud VPN

## Deployment Manager

## Cloud Monitoring

## Cloud Logging



# [VPC Deep Dive and Best Practices](https://www.youtube.com/watch?v=wmP6SQe5J7g)

## Virtual Private Cloud
PoP - Point of Present

- Global: 
  - Single VPC across all regions
  - No cross region VPNs required
  - No peering of regional VPCs required
- Sharable
  - Single shared VPC
  - Firewalls, Routes, VPN configuration once
  - RFC 1918 IP space managed centrally
- Private
  - Private access to Google APIs
  - No need for public IPs to access Google services


## Deep dive and best practices

### VPC configuration walkthrough: Network

Global, shared VPC
- Centrally managed network
- RFC 1918 ranges defined once
- Configure network policies once centrally

What's new?
- Folder support for shared VPC
  - Managed multiple shared VPCs
  - Have multiple shared VPC admins
- Private Ip reservation
- Alias IP ranges
  - Central IP management for GKE
  - Enables native network functions


### VPC configuration walkthrough: Security

Distributed firewalls
- No single choke point
- Ingress, egress, allow, deny rules
- Easy grouping using tags
- Security grouping using service accounts
  - Source and target service accounts


### VPC configuration walkthrough: Connectivity

VPN and interconnect
- BGP over IPSec VPN
- Dedicated Interconnect
- Partner Interconnect


### VPC configuration walkthrough: Services
VPC peering: between VPCs
- High throughput and bandwidth
- No proxy or single choke point
- Access internal services across peers

VPC peering: Multi Network Interfaces
- Isolate data plane network and management network
- Up to 8 NICs associated with a VM


### VPC configuration walkthrough: Monitoring
Logging and monitoring:
- VPC Flow Logs
  - Network forensics
  - Network analysis
  - Export to BigQuery or PubSub

## VPC topologies

### VPC routing

#### VPC as a routing domain
- VPC as a logical routing domain
- Provides internal routing connectivity between subnets in any region
- Different VPC may have subnets with overlapping IP ranges

#### Cloud router
- EBGP speaker process
- Advertise routes outside the VPC and import routes inside the VPC
- Can advertise subnet routes from all regions 
- Can program external routes into all regions


### VPC Peering
#### Saas services with VPC Peering
- SaaS Services deployed in one project in the provider org
- Different VPCs in the provider project due to overlapping IP addressing in consumer projects
- Native tenant isolation in provider project without firewall rules


### Shared VPC
#### Multi-tier application
- Centralize networking and security considerations and operation
- Different user are giver "permission to use" different subnetworks
- Each team manages compute of its own tier
- Supports load balancers and flow logs

#### Shared VPC with NVA
- Network Virtual Appliance (NVA) deployed as multi-nic instance on host project
- Provides networking and security services to a common set of service projects
- Central point of policy enforcement and management

#### Shared VPC with shared Interconnect
Goals:
- Leverage the same dedicated interconnected setup across multiple projects
- Keep operational and management advantages of the shared VPC model
- Allocate costs across projects

Components:
- One project where the dedicated inter connection is created
- One or more shared VPC host projects with cloud router and interconnect attachment
- Security using firewall rules based on service accounts
- Visibility of traffic thanks to VPC flow logs

Consideration:
- Dedicated interconnect billed against its project. VLAN attachment billed against the host project. Egress instance traffic billed against the service project
- Common DNS space spanning each Shared VPC domain
- VPC flow logs contains information about both the service project (src_instances/dest_instance) and the host project (src_vpc/dest_vpc)

#### High throughput VPN connection
Redundant Cloud VPN
- Two cloud VPN Gateway in a VPC
- Multiple tunnels per VPN Gateway
- Use route based or dynamic BGP configuration for maximum flexibility
- Per 5-tuple flow ECMP

#### Redundant VPC connection
Active-Active with backup VPN
- Leverages Cloud Router "global routing" feature
- Routes for subnetworks of ny region are known to all cloud routers of the VPC
- Inter-region cost automatically added to ensure optimal path

## Customer case study: PayPal