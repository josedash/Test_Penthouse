# Test_Penthouse

My approach for builidng a test_suite/framework are two things.

1. Prioritize re-usability over complexity.
2. Transparency over levels of testing so you can see the connections between <br />
   Components(small) <- integrations(mediums) <- multiple integrations/e2e (large) testing.

## Trial Suite

Test Suite/Framework to test web application using Java & Maven.

### Tech Stack
* uses cucumber 1.25 
* junit runner with cucumber class.
* maven plugint temyers to run parallel tests.
* page objects guideline implemented.


## Elephant Suite

Test suite/framework to test web application and rest services using Java & Gradle.

### Tech Stack
* uses cucumber 1.25 
* junit runner with cucumber class.
* Gradle multi-module projec, in order to follow micro services pattern. 
* page objects guideline implemented.




