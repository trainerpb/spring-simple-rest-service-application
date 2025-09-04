- Clone the repo and checkout main branch . I assume you have Java Se 17 or a higher compatible version 
- Assume that you have acccess tp maven central repository for dependencies OR you must have had on your local repo .
- Get inside the folder and build it.
- From ***target\generated-sources\archetype***  issue the command 
```markdown

mvn clean install
```
- You're all set to use this local archetype

  
## To use the archetype: 

```markdown

mvn archetype:generate -DarchetypeCatelog=local -Dfilter=com.soham.maven.spring:
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> archetype:3.4.0:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< archetype:3.4.0:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- archetype:3.4.0:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
Choose archetype:
1: local -> com.soham.maven.spring:spring-simple-rest-service-application-archetype (An archetype for a spring-simple-rest-service-application)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 1
Define value for property 'groupId': com.soham.selfteaching.spring
Define value for property 'artifactId': simple-jpa-rest-api
Define value for property 'version' 1.0-SNAPSHOT:
Define value for property 'package' com.soham.selfteaching.spring:
Confirm properties configuration:
groupId: com.soham.selfteaching.spring
artifactId: simple-jpa-rest-api
version: 1.0-SNAPSHOT
package: com.soham.selfteaching.spring
 Y: y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: spring-simple-rest-service-application-archetype:0.0.1-SNAPSHOT
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.soham.selfteaching.spring
[INFO] Parameter: artifactId, Value: simple-jpa-rest-api
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.soham.selfteaching.spring
[INFO] Parameter: packageInPathFormat, Value: com/soham/selfteaching/spring
[INFO] Parameter: package, Value: com.soham.selfteaching.spring
[INFO] Parameter: groupId, Value: com.soham.selfteaching.spring
[INFO] Parameter: artifactId, Value: simple-jpa-rest-api
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: C:\Users\ideal\IdeaProjects\my-first-archtype-use\simple-jpa-rest-api
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  38.518 s
[INFO] Finished at: 2025-09-04T16:18:08+05:30
[INFO] ------------------------------------------------------------------------
```

# A project will be created and you are all set and top up on the skeleton project 
