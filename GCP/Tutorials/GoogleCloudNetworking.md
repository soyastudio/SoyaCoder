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