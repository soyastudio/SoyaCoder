## App Engine

- Simplest way to deploy and scale your applications in GCP
  - Provide end-to-end application management
- Supports:
  - Go, Java, .Net, Node.js, PHP, Python, Ruby using pre-configured runtime
  - Use custom run-time and write code in language
  - Connection to variety of Google Cloud storage product (Cloud SQL etc.)
- No usage charges - Pay for resources provisioned
- Features:
  - Automatic load balancing & Auto scaling
  - Managed platform updates & Application health monitoring
  - Application versioning
  - Traffic splitting

## Compute Engine vs App Engine

### Compute Engine
- IaaS
- More Flexible
- More Responsibility
  - Choosing image
  - Install software
  - Choosing hardware
  - Fine-grained Access/Permissions (Certificates/Firewalls)
  - Availability etc.

### App Engine
- PaaS
- Serverless
- Less Responsibility
- Lower Flexibility


## App Engine Environments
- Standard: applications run in language specific sandboxes (Java, Go, Python...)
  - Complete isolation from OS/Disk/Other Apps
  - Two versions of App Engine: v1(Restrictions)  and v2 (Full network access and no restrictions on language extensions)
- Flexible - Application instances run within Docker containers
  - Makes use of Compute Engine VMs
  - Support ANY runtime
  - Provides access to background processes and local disk

## App Engine - Application Component Hierarchy
- Application: one app per project
- Services: multiple microservices of app components
  - You can have multiple services in a single application
  - Each Service can have different settings
  - Earlier call Modules
- Versions: Each version associated with code and configuration
  - Each version can run in one or more instances
  - Multiple version can co-exist
  - Options to rollback and split traffic


## App Engine - Comparison

| Feature                | Standard                 | Flexible                             |
|------------------------|--------------------------|--------------------------------------|
| Pricing Factors        | Instance hours           | vCPU, Memory, Persistent Disks       |
| Scaling                | Manual, Basic, Automatic | Manual, Automatic                    |
| Scaling to zero        | Yes                      | No. Minimum one instance             |
| Instance startup time  | Seconds                  | Minutes                              |
| Max request timeout    | 1 to 10 minutes          | 60 minutes                           |
| Local disk             | Mostly write to /tmp.    | Yes. Ephemeral. New Disk on startup. |
| SSH for debugging      | No                       | Yes                                  |




## App Engine - Scaling Instances
- Automatic - automatically scale instances based on the load (Recommended for continuously running workloads):
  - Auto scale based on:
    - Target CPU Utilities - configure a CPU usage threshold
    - Target Throughput Utilities - configure a throughput threshold
    - Max Concurrent Requests - configure max concurrent requests an instance can receive
  - Configure min and max instances
- Basic - instances are created as and when requests are received (Recommended for Adhoc Workload):
  - Instances are shutdown if ZERO requests:
    - Try to keep low cost
    - High latency is possible
  - NOT supported by App Engine Flexible Environment
  - Configure MAX instances and Idle Timeout
- Manual - Configure specific number of instances to run (manually adjust number of instances over time).
