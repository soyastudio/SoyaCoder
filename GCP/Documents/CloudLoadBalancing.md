# [Cloud Load Balancing](https://cloud.google.com/load-balancing/docs/load-balancing-overview)

## Cloud Load Balancing overview

### Cloud Load Balancing offers the following load balancer features:

- Single anycast IP address.
- Software-defined load balancing.(not an instance-based or device-based solution)
- Seamless autoscaling.
- Layer 4 and Layer 7 load balancing.
- External and internal load balancing.
- Global and regional load balancing
- Advanced feature support:
    - Integration with Cloud CDN for cached content delivery.
    - Integration with Google Cloud Armor to protect your infrastructure from distributed denial-of-service (DDoS)
      attacks and other targeted application attacks.

### Types of load balancers

- Application Load Balancers (L7)
    - External Application Load
      Balancers ([Google Frond End Service](https://cloud.google.com/docs/security/infrastructure/design#google-frontend-service)
      and [Envoy Proxy](https://www.envoyproxy.io/docs) )
        - These load balancers can be global or regional.
        - For global external Application Load Balancers, only the Premium Tier is supported.
        - For regional external Application Load Balancers, both Premium and Standard Tier are supported.
        - For classic Application Load Balancers, the load balancer is a global load balancer in Premium Tier but can be
          configured to be effectively regional in Standard Tier.
        - Application Load Balancers use the open source Envoy proxy to enable advanced traffic management capabilities.
    - Internal Application Load Balancers (built on the Andromeda network virtualization stack and the open source Envoy proxy.)
        - These load balancers can be regional or cross-region.
        - Regional internal Application Load Balancers support only regional backends.
        - Cross-region internal Application Load Balancers (Preview) support global backends and are always globally
          accessible. Clients from any Google Cloud region can send traffic to the load balancer.
- Network Load Balancers (L4)
  - Proxy Network Load Balancers (distribute TCP traffic to VM instances in your VPC network.)
  - Passthrough Network Load Balancers (implemented by using Andromeda virtual networking and Google Maglev)

### Choose a load balancer

### Summary of types of Google Cloud load balancers