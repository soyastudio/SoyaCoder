# [Virtual Private Cloud](https://cloud.google.com/vpc/docs/overview)

## [Overview](https://cloud.google.com/vpc/docs/overview)

### VPC networks

- A VPC network does the following:
    - Provides connectivity for your Compute Engine virtual machine (VM) instances, including Google Kubernetes Engine (
      GKE) clusters, serverless workloads, and other Google Cloud products built on Compute Engine VMs.
    - Offers built-in internal passthrough Network Load Balancers and proxy systems for internal Application Load
      Balancers.
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

[Andromeda](../PDFs/nsdi18-dalton.pdf)

### Networks and subnets

#### Subnets

Each VPC network consists of one or more IP address ranges called subnets. Subnets are regional resources, and have IP
address ranges associated with them.

[TOOL: CIDR to IPv4 Conversion](https://www.ipaddressguide.com/)

#### Types of subnet

- IPv4 only (single-stack) subnets, with only IPv4 subnet ranges
- IPv4 and IPv6 (dual-stack) subnets, with both IPv4 and IPv6 subnet ranges

#### Purposes of subnets

- Regular subnets: This is the default subnet type. Regular subnets are created by users or automatically created in
  auto mode networks to be used with VM instances. Regular subnets have a purpose of PRIVATE in the gcloud CLI or API.
  The purpose is None in the Google Cloud console.
- Private Service Connect subnets: A subnet to use to publish a managed service by using Private Service Connect.
- Proxy-only subnets: A proxy-only subnet to use with regional Envoy-based load balancers.
- Private NAT subnets: A subnet that is reserved for use as the source range for Private NAT. This subnet is set to
  --purpose=PRIVATE_NAT

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

A Compute Engine virtual machine (VM) instance is a virtual machine that is hosted on Google's infrastructure. VM
instances include Google Kubernetes Engine (GKE) clusters, App Engine flexible environment instances, and other Google
Cloud products built on Compute Engine VMs.

### Specifications

- VPC networks, including their associated routes and firewall rules, are global resources. They are not associated with
  any particular region or zone.
- Subnets are regional resources.
- Each subnet defines a range of IPv4 addresses. Subnets in custom mode VPC networks can also have a range of IPv6
  addresses.
- Traffic to and from instances can be controlled with network firewall rules. Rules are implemented on the VMs
  themselves, so traffic can only be controlled and logged as it leaves or arrives at a VM.
- Resources within a VPC network can communicate with one another by using internal IPv4 addresses, internal IPv6
  addresses, or external IPv6 addresses, subject to applicable network firewall rules. For more information, see
  communication within the network.
- Instances with internal IPv4 or IPv6 addresses can communicate with Google APIs and services.
- Network administration can be secured by using Identity and Access Management (IAM) roles.
- An organization can use Shared VPC to keep a VPC network in a common host project. Authorized IAM principals from
  other projects in the same organization can create resources that use subnets of the Shared VPC network.
- VPC networks can be connected to other VPC networks in different projects or organizations by using VPC Network
  Peering.
- VPC networks can be securely connected in hybrid environments by using Cloud VPN or Cloud Interconnect.
- VPC networks support GRE traffic, including traffic on Cloud VPN and Cloud Interconnect. VPC networks do not support
  GRE for Cloud NAT or for forwarding rules for load balancing and protocol forwarding. Support for GRE allows you to
  terminate GRE traffic on a VM from the internet (external IP address) and Cloud VPN or Cloud Interconnect (internal IP
  address). The decapsulated traffic can then be forwarded to a reachable destination. GRE enables you to use services
  such as Secure Access Service Edge (SASE) and SD-WAN.
- VPC networks support IPv4 and IPv6 unicast addresses. VPC networks do not support broadcast or multicast addresses
  within the network.

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

Each VPC network has an associated dynamic routing mode that controls the behavior of all of its Cloud Routers. Cloud
Routers manage BGP sessions for Google Cloud connectivity products.

BGP Route Advertisement: BGP route advertisement refers to the process of broadcasting routing information to
neighboring routers. This is an important aspect of the Border Gateway Protocol (BGP), which is used for exchanging
routing and reachability information among autonomous systems on the internet.

In a VPC network, a route consists of a single destination prefix in CIDR format and a single next hop. Next hop is a
routing term that refers to the next closest router a packet can go through. The next hop is among the series of routers
that are connected together in a network and is the next possible destination for a data packet. More specifically, next
hop is an IP address entry in a router’s routing table, which specifies the next closest/most optimal router in its
routing path. Every single router maintains its routing table with a next hop address, which is calculated based on the
routing protocol used and its associated metric.

#### Firewall rules

### Communications and access

- Communication within the network: (default-allow-internal rule)
- Internet access requirements
- Communications and access for App Engine
    - App Engine standard environment: Only App Engine firewall rules apply to ingress traffic. Because App Engine
      standard environment instances do not run inside your VPC network, VPC firewall rules do not apply to them.
    - App Engine flexible environment: Both App Engine and VPC firewall rules apply to ingress traffic. Inbound traffic
      is only permitted if it is allowed by both types of firewall rules. For outbound traffic, VPC firewall rules
      apply.
- Traceroute to external IP addresses
- Egress throughput limits
- Packet size

### Network performance

- Latency
- Packet loss


# [Cloud Router](https://cloud.google.com/network-connectivity/docs/router/concepts/overview)

## Cloud Router overview
Cloud Router is a fully distributed and managed Google Cloud service that uses the Border Gateway Protocol (BGP) to advertise IP prefixes. It programs dynamic routes based on the BGP advertisements that it receives from a peer. Instead of a physical device or appliance, each Cloud Router consists of software tasks that act as BGP speakers and responders. A Cloud Router also serves as the control plane for Cloud NAT. Cloud Router provides BGP services for the following Google Cloud products:
- Cloud Interconnect
- Cloud VPN, specifically HA VPN
- Router appliance (part of Network Connectivity Center)

### Specifications
- Autonomous system number (ASN)
- BGP peering addresses
- Access to internal load balancers
- IPv6 support

### Cloud Router software tasks

### Route advertisement modes
- Default advertisement mode
  - Regional dynamic routing mode
  - Global dynamic routing mode
- Custom advertisement mode

## [Best practices for Cloud Router](https://cloud.google.com/network-connectivity/docs/router/concepts/best-practices)
- If your on-premises Border Gateway Protocol (BGP) device supports Bidirectional Forwarding Detection (BFD), enable it on your on-premises BGP device and on the Cloud Router to provide a high-availability network link that can respond faster to link failures.
- If your peer router supports it, consider enabling MD5 authentication on your BGP sessions. By default, BGP sessions are unauthenticated.
- Enable graceful restart on your on-premises BGP device. With graceful restart, traffic between networks isn't disrupted in the event of a Cloud Router or on-premises BGP device failure as long as the BGP session is re-established within the graceful restart period.
- If graceful restart is not supported or enabled on your device, configure two on-premises BGP devices with one tunnel each to provide redundancy. If you don't configure two separate on-premises devices, Cloud VPN tunnel traffic can be disrupted in the event of a Cloud Router or an on-premises BGP device failure.
- For high reliability, set up redundant routers and BGP sessions even if your on-premises device supports graceful restart. In the event of non-transient failures, you are protected even if one path fails. For more information, see Redundant Cloud VPN tunnels.
- To use dynamic routing to connect your on-premises network to multiple Google Cloud projects, see the scenarios for VPC Network Peering and Shared VPC.
- To ensure that you do not exceed Cloud Router limits, use Cloud Monitoring to create alerting policies. For example, you can use the metrics for learned routes to create alerting policies for the limits for learned routes.
- If appropriate, you can manually configure custom learned routes and apply them to a BGP session. Custom learned routes can be helpful if you want to avoid the limitations of static routes. For example, static routes can't detect a loss of reachability in the next hop of a route. In contrast, custom learned routes can detect a loss of reachability, and they react accordingly to avoid dropping traffic without notification.





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

Feature:
- Secure:
    - Encryption of data in transit
    - Cloud Armor: secure the VPC perimeter
    - Distributed firewalls
- Scalable:
    - Distributed network
    - No choke points
    - Improvements in scale
- Performant:
    - High bandwidth and availability
    - Andromeda 2.1: 40% latency reduction
- Easy to use:
    - Fine grained IAM
    - Third party services with VPC Peering
    - Better support for GKE

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
    - Many secondary ranges per subnet
    - Migrate an IP from one VM to another

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




## Deep dive and best practices

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

- Dedicated interconnect billed against its project. VLAN attachment billed against the host project. Egress instance
  traffic billed against the service project
- Common DNS space spanning each Shared VPC domain
- VPC flow logs contains information about both the service project (src_instances/dest_instance) and the host project (
  src_vpc/dest_vpc)

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

