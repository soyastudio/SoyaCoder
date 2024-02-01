# Google Cloud Architecture Fundamentals

## System design

### Core Principles

- Document everything
- Simplify your design and use fully managed services
- Decouple your architecture
    - Apply independent upgrades.
    - Enforce specific security controls.
    - Establish reliability goals for each subsystem.
    - Monitor health.
    - Granularly control performance and cost parameters.
- Use a stateless architecture

### [Choose Google Cloud deployment archetypes](Choose Google Cloud deployment archetypes)

- Zonal
    - Development and test environments.
    - Applications that don't need high availability.
    - Low-latency networking between application components.
    - Migrating commodity workloads.
    - Applications that use license-restricted software.
- Regional
    - Highly available applications that serves users within a geographic area.
    - Compliance with data residency and sovereignty requirements.
- Multi-regional
    - Highly available application with geographically dispersed users.
    - Applications that require low end-user latency experience.
    - Compliance with data residency and sovereignty requirements by using a geofenced DNS routing policy.
- Global
    - Highly available applications that serve globally dispersed users.
    - Opportunity to optimize cost and simplify operations by using global resources instead of multiple instances of
      regional resources.
- Hybrid
    - Disaster recovery (DR) site for on-premises workloads.
    - On-premises development for cloud applications.
    - Progressive migration to the cloud for legacy applications.
    - Enhancing on-premises applications with cloud capabilities.
- Multi-cloud
    - Google Cloud as the primary site and another cloud as a DR site.
    - Enhancing applications with advanced Google Cloud capabilities.

### Select geographic zones and regions

- Deploy over multiple regions
- Select regions based on geographic proximity (latency)
- Select regions based on available services
- Choose regions to support compliance
- Compare pricing of major resources
- Use Cloud Load Balancing to serve global users
- Use the Cloud Region Picker to support sustainability (carbon neutral)

### Manage cloud resources

- Resource hierarchy: organizations, folders, projects, resources
- Resource labels and tags
    - Use a simple folder structure
    - Use folders and projects to reflect data governance policies
    - Use tags and labels at the outset of your project
        - A tag provides a way to conditionally allow or deny policies based on whether a resource has a specific tag.
        - A label is a key-value pair that helps you organize your Google Cloud instances.
    - Assign labels to support cost and billing reporting
    - Avoid creating large numbers of labels
    - Avoid adding sensitive information to labels
    - Anonymize information in project names
    - Apply tags to model business dimensions
- Organizational policies
    - Establish project naming conventions
    - Automate project creation
    - Audit your systems regularly
    - Configure projects consistently
        - Project ID and naming conventions
        - Billing account linking
        - Networking configuration
        - Enabled APIs and services
        - Compute Engine access configuration
        - Logs export and usage reports
        - Project removal lien
    - Decouple and isolate workloads or environments
    - Enforce billing isolation

### Choose and manage compute

