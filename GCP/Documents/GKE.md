# [Kubernates](https://kubernetes.io/docs/concepts/overview/)

## Overview

- Traditional deployment era
- Virtualized deployment era
- Container deployment era:
    - Agile application creation and deployment: increased ease and efficiency of container image creation compared to
      VM image use.
    - Continuous development, integration, and deployment: provides for reliable and frequent container image build and
      deployment with quick and efficient rollbacks (due to image immutability).
    - Dev and Ops separation of concerns: create application container images at build/release time rather than
      deployment time, thereby decoupling applications from infrastructure.
    - Observability: not only surfaces OS-level information and metrics, but also application health and other signals.
    - Environmental consistency across development, testing, and production: runs the same on a laptop as it does in the
      cloud.
    - Cloud and OS distribution portability: runs on Ubuntu, RHEL, CoreOS, on-premises, on major public clouds, and
      anywhere else.
    - Application-centric management: raises the level of abstraction from running an OS on virtual hardware to running
      an application on an OS using logical resources.
    - Loosely coupled, distributed, elastic, liberated micro-services: applications are broken into smaller, independent
      pieces and can be deployed and managed dynamically – not a monolithic stack running on one big single-purpose
      machine.
    - Resource isolation: predictable application performance.
    - Resource utilization: high efficiency and density

### Kubernetes

Kubernetes provides you with:

- Service discovery and load balancing
- Storage orchestration
- Automated rollouts and rollbacks
- Automatic bin packing
- Self-healing
- Secret and configuration management
- Batch execution
- Horizontal scaling
- IPv4/IPv6 dual-stack
- Designed for extensibility

Kubernetes do not:

- Does not limit the types of applications supported
- Does not deploy source code and does not build your application
- Does not provide application-level services
- Does not dictate logging, monitoring, or alerting solutions. It provides some integrations as proof of concept, and
  mechanisms to collect and export metrics.
- Does not provide nor mandate a configuration language/system (for example, Jsonnet).
- Does not provide nor adopt any comprehensive machine configuration, maintenance, management, or self-healing systems.
- Additionally, Kubernetes is not a mere orchestration system.

## [Cluster Architecture](https://kubernetes.io/docs/concepts/architecture/)

### Nodes

- workload: a workload is an application running on Kubernates
- control plane: The container orchestration layer that exposes the API and interfaces to define, deploy and manage the
  lifecycle of containers
- Pods: A pod represents a set of running containers in your cluster
- Kubelet: an agent that runs on each node in the cluster. I makes sure that containers are running in a pod.
- Container runtime interface (CRI): software that is responsible for running containers
- Kube-proxy: network proxy that runs on each node of the cluster

### Communication between Nodes and the Control Plane

#### Node to Control Plane

#### Control plane to node

- API server to kubelet
- API server to nodes, pods and services
- SSH tunnels
- Konnectivity service

### Controllers

### Leases

### Cloud Controller Manager

### About cgroup v2

### Container Runtime Interface (CRI)

### Garbage Collection

### Mixed Version Proxy

# [GKE](https://cloud.google.com/kubernetes-engine/docs/concepts/kubernetes-engine-overview)

## Overview

A GKE environment consists of nodes, which are Compute Engine virtual machines (VMs), that are grouped together to form
a cluster. You package your apps (also called workloads) into containers. You deploy sets of containers as Pods to your
nodes. You use the Kubernetes API to interact with your workloads, including administering, scaling, and monitoring.

# [GKE: Concepts for Networking](https://www.youtube.com/watch?v=aVBV4O3h4AY)
## GKE Cluster: architecture
- User VPC Network: for Nodes
- Google Managed VPC Network (Master): for Control Plane

## GKE Cluster: VPC-native cluster

- Natively routable
- Automatically generated subnet routes
- Firewall rules for Pod IPs
- Pod and secondary IP accessible from on-prem privately

## IP addresses in VPC-native cluster

- Nodes
- Pods
- Services

Note: creating cluster in shared VPC environment, GKE cannot manage secondary IP addresses. So network admin need to
create secondary IPs before creating GKE cluster.

## VPC-native cluster types

- Public: Node IPs are external IPs
- Private: recommended. VPC Peer between User VPC Network and Google Managed VPC Network

## IP masquerade agent

## Access services
- Service type:loadBalancer: Container-native load balancing
  - Unlike pods, services using stable ip addresses and google use 
- Ingress object: ips
- Gateway API: HTTP routes

## Network security considerations
- Authorized networks
- IAM
- RBAC (Role-based access control)
- Workload identity
- Firewall rules
- Network policies