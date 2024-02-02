# [IAM](https://cloud.google.com/iam/docs/overview)

## IAM overview

### Concepts related to identity

In IAM, you grant access to principals. Principals can be of the following types:

- Google Account
- Service account: service accounts provide a way to manage authentication and authorization when a human is not
  directly involved, such as when an application needs to access Google Cloud resources.
- Google group: A Google group is a named collection of Google Accounts and service accounts.
- Google Workspace account: Google Workspace accounts are associated with your organization's internet domain name, such
  as example.com
- Cloud Identity domain
- All authenticated users
- All users

### Concepts related to access management

- Resource
- Permissions
- Roles
    - Basic roles: Owner, Editor, Viewer
    - Predefined roles:
    - Custom roles:
- Allow policy
    - Example

```
{
  "bindings": [
    {
      "role": "roles/storage.objectAdmin",
      "members": [
        "user:ali@example.com",
        "serviceAccount:my-other-app@appspot.gserviceaccount.com",
        "group:admins@example.com",
        "domain:google.com"
      ]
    },
    {
      "role": "roles/storage.objectViewer",
      "members": [
        "user:maria@example.com"
      ]
    }
  ]
}
```

IAM and policy APIs

- Resource hierarchy
    - Organization: root
    - Folders
    - Projects
    - Resources

### [IAM support for Google Cloud services](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles)

### Consistency model for the IAM API

The IAM API is eventually consistent. (finally not immediately)

## [Use IAM securely](https://cloud.google.com/iam/docs/using-iam-securely)

### Least privilege
- In production environments, do not grant basic roles unless there is no alternative. Instead, grant the most limited
  predefined roles or custom roles that meet your needs.
- Treat each component of your application as a separate trust boundary. If you have multiple services that require
  different permissions, create a separate service account for each of the services, then grant only the required
  permissions to each service account.
- Remember that the allow policies for child resources inherit from the allow policies for their parent resources.
- Grant roles at the smallest scope needed.
- Specify which principals can act as service accounts. Users who are granted the Service Account User role for a
  service account can access all the resources to which the service account has access. Therefore, be cautious when
  granting the Service Account User role to a user.
- Granting the Project IAM Admin and Folder IAM Admin predefined roles will allow access to modify allow policies without also allowing direct read, write, and administrative access to all resources.
- Granting the Owner (roles/owner) role to a principal will allow them to access and modify almost all resources, including modifying allow policies. This amount of privilege is potentially risky. Grant the Owner role only when (nearly) universal access is required.
  Use conditional role bindings to let access expire automatically, and consider granting privileged access only on a just-in-time basis.

### Service accounts
- Adopt [best practices for working with service accounts](https://cloud.google.com/iam/docs/best-practices-for-using-service-accounts-in-deployment-pipelines). Ensure that service accounts have limited privileges, and protect against potential security threats.
- Do not delete service accounts that are in use by running instances
- Use the display name of a service account to keep track of what the service account is used for and what permissions it needs.

### Service account keys
- Avoid using service account keys if another option is available. 
- Rotate your service account keys using the IAM service account API.
- [Implement processes](https://cloud.google.com/iam/docs/best-practices-for-managing-service-account-keys) to manage user-managed service account keys.
- Be careful not to confuse encryption keys with service account keys. Encryption keys are typically used to encrypt data and service account keys are used for secure access to Google Cloud APIs.
- Don't check in the service account keys into the source code or leave them in the Downloads directory.

### Auditing
- Use logs from Cloud Audit Logs to regularly audit changes to your allow policy.
- Export audit logs to Cloud Storage to store your logs for long periods of time.
- Audit who has the ability to change your allow policies on your projects.
- Manage access to logs using Logging roles.
- Apply the same access policies to the Google Cloud resource that you use to route logs as applied to the Logs Explorer.
- Use logs from Cloud Audit Logs to regularly audit access to service account keys.

### Policy management
- If a principal needs access to all projects in your organization, grant roles to the principal at the organization level.
- Grant roles to a Google group instead of individual users when possible. It is easier to update the members of a Google group than to update the principals in your allow policies.


