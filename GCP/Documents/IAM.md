# [IAM](https://cloud.google.com/iam/docs/overview)

## IAM overview

### Concepts related to identity
In IAM, you grant access to principals. Principals can be of the following types:
- Google Account
- Service account: service accounts provide a way to manage authentication and authorization when a human is not directly involved, such as when an application needs to access Google Cloud resources.
- Google group: A Google group is a named collection of Google Accounts and service accounts.
- Google Workspace account: Google Workspace accounts are associated with your organization's internet domain name, such as example.com
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

