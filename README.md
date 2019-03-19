# OpenShift Spring Boot Playground

This is a simple Spring Boot application I created to play around with OpenShift.
It makes use of the fabric8 Maven plugin's zero config feature. 

## OpenShift CLI Preparations

Login to OpenShift: `oc login`

Create a project, if you haven't already done so - e.g.: `oc new-project springboot-playground`

## Build and Run Locally

`mvn package spring-boot:run`

## Deploy and Run on OpenShift

Generate resources, build and deploy:

```
mvn fabric8:resource
mvn fabric8:build
mvn fabric8:deploy
```

## Resources

* [fabric8-maven-plugin](https://maven.fabric8.io/)
* [fabric8-maven-plugin](https://access.redhat.com/documentation/en-us/red_hat_jboss_fuse/6.3/html/fuse_integration_services_2.0_for_openshift/fabric8-maven-plugin) (Red Hat)