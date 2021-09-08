# quarkus-config project
## Context
We encountered issues with configuration injection when running QuarkusTests.
This little project is a small playground to experiment with configuration in Quarkus to see if the issue can be reproduced.

It shows very basic configuration options in quarkus and some validation in tests.

## Conclusion
Issue could not be reproduced with Quarkus 1.11.7.Final or 1.13.7.Final.
Tried both temurin-1.8.0_302 and jdk-15.0.1.9-openj9