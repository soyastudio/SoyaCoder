# Machine families resource and comparison guide
## VM terminology
- Machine family
- Machine series
- Machine type

## Machine family and series recommendations
- General-purpose workloads
- Compute-optimized
- Memory-optimized
- Accelerator-optimized

## GPUs and VMs



# Choose a Compute Engine deployment strategy for your workload

## Assess your workload

### Application state
- Application state
  - Is the application stateful?
  - Should any instance-specific metadata be preserved when your VMs reboot or when Compute Engine recreates (autoheals) the VMs?
- Provisioning
  - Should the VMs use a mix of machine types or images?
  - Should the infrastructure scale automatically in tune with changes in load, so that you maintain an optimal balance between cost and response time?
  - Can all the VMs run within a single zone, VPC network, and subnet?
  - Should the application run in the same zone as certain other resources?
- Operations
    - Do you want to manage the VMs as a single group? 
    - Do you need to use a custom or third-party tool to manage the VMs?
    - Do you need control over handling failed VMs?
    - Do you need control over the start-stop-suspend-resume sequence or schedule of your VMs? 
- Resilience
  - Does the application need protection against zonal failures? In other words, if a zone is down, would you like the application to continue serving requests from VMs in other zones in the region?
  - If a VM stops or crashes for any reason, or if the application doesn't respond to requests, should Compute Engine recreate the VM automatically?
  - Does the application need fixed internal or external IP addresses for the host VMs?

## Review the available deployment options
- Standalone VMs
- Unmanaged instance group
- Managed instance group (MIG)

## Select a deployment strategy

## Decision tree
[See here](https://cloud.google.com/compute/docs/choose-compute-deployment-option)




# About VM tenancy

- Sole-tenancy: 
- Multi-tenancy: shares its Compute Engine server with VMs from other Google Cloud projects

## Pricing considerations

## Workload considerations
Scenarios for using sole-tenant nodes:
- Gaming workloads with specific computing performance requirements.
- Finance or healthcare workloads with security and compliance requirements.
- Windows workloads with licensing requirements.
- Machine learning, data processing, or image rendering workloads. For these workloads, consider reserving GPUs.
- Workloads requiring increased input/output operations per second (IOPS) and decreased latency, or workloads that use temporary storage in the form of caches, processing space, or low-value data. For these workloads, consider reserving Local SSDs.

## Maintenance event considerations


# Designing resilient systems
A resilient system is a system that can withstand a certain amount of failures or disruptions without interrupting your service or affecting your users' experience using your service.

## Types of failures
- Types of failures: You can mitigate these events by using persistent disks and startup scripts to save your data and re-enable software after you restart the VM.
- Unexpected single VM reboot: To help mitigate these events, backup your data, use persistent disks, and use startup scripts to quickly re-configure software.
- Zone or region failures: To mitigate these failures, create diversity across regions and zones and implement load balancing. You should also back up your data or replicate your persistent disks across multiple zones.

## Tips for designing resilient systems
### Use live migration

### Distribute your VMs
- Use zone-specific internal DNS names
- Create groups of VMs: [Lab: Create a MIG with VMs in multiple zones in a region](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups)
- Use load balancing
- Use startup and shutdown scripts
- Backup your data











# Creating a GCE VM instance
- Using Google Cloud Console
- Google Cloud CLI
- Google Platform (GCP) API
- Client Libraries (Go, Java, )

# Naming Convention for GCE VM instance
- Name should be 1-63 characters in length
- Must always start with a lowercase letter
- Can be followed by a combination of lowercase letters, numbers and hyphens
- Should not end with hyphen