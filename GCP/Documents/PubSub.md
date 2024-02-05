# [PubSub](https://cloud.google.com/pubsub/docs/overview)

## Overview
### Common use cases:
- Ingestion user interaction and server events.
- Real-time event distribution.
- Replicating data among databases.
- Parallel processing and workflows.
- Enterprise event bus. 
- Data streaming from applications, services, or IoT devices.
- Refreshing distributed caches.
- Load balancing for reliability. 

### Comparing Pub/Sub to other messaging technologies
- Horizontal scalability
- Per-message parallelism, rather than partition-based messaging
- Pub/Sub is intended for service-to-service communication rather than communication with end-user or IoT clients.

### Integrations
- Stream processing and data integration. Supported by Dataflow, including Dataflow templates and SQL, which allow processing and data integration into BigQuery and data lakes on Cloud Storage. Dataflow templates for moving data from Pub/Sub to Cloud Storage, BigQuery, and other products are available in the Pub/Sub and Dataflow UIs in the Google Cloud console. Integration with Apache Spark, particularly when managed with Dataproc is also available. Visual composition of integration and processing pipelines running on Spark + Dataproc can be accomplished with Data Fusion.
- Monitoring, Alerting and Logging. Supported by Monitoring and Logging products.
- Authentication and IAM. Pub/Sub relies on a standard OAuth authentication used by other Google Cloud products and supports granular IAM, enabling access control for individual resources.
- APIs. Pub/Sub uses standard gRPC and REST service API technologies along with client libraries for several languages.
- Triggers, notifications, and webhooks. Pub/Sub offers push-based delivery of messages as HTTP POST requests to webhooks. You can implement workflow automation using Cloud Functions or other serverless products.
- Orchestration. Pub/Sub can be integrated into multistep serverless Workflows declaratively. Big data and analytic orchestration often done with Cloud Composer, which supports Pub/Sub triggers. You can also integrate Pub/Sub with Application Integration (Preview) which is an Integration-Platform-as-a-Service (iPaaS) solution. Application Integration provides a Pub/Sub trigger to trigger or start integrations.
- Integration Connectors.(Preview) These connectors let you connect to various data sources. With connectors, both Google Cloud services and third-party business applications are exposed to your integrations through a transparent, standard interface. For Pub/Sub, you can create a Pub/Sub connection for use in your integrations.