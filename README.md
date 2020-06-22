[![Codacy Badge](https://app.codacy.com/project/badge/Grade/90ef5ca5918242e9bba1859d96c06110)](https://www.codacy.com/gh/pg-dp/civet?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=pg-dp/civet&amp;utm_campaign=Badge_Grade)

## Spring-Boot-WebServices-Civet

This is a spring-boot Maven app. So download this repository and in the root folder of this repository (the folder where the pom.xml can be found) open a terminal and run this command, mvn spring-boot:run.

## How to run the application:
1. Clone the repository.
2. Run Spring Boot Application
3. Open Postman, under form-data:
(i) Upload turtle file and give the key value = file.
(ii) Give datasetUri and give the key value = dataset.
4. Send the post request to the endpoint, the return result will be evaluated star.

## Model test turtle files can be found here:
- https://github.com/pg-dp/CivetAPI/tree/all-metrics-api/src/test/resources

### Example queries:
- https://localhost:8080/uploadFile/DateFormat,
- https://localhost:8080/uploadFile/Description,
- https://localhost:8080/uploadFile/ProviderIdentity,
- https://localhost:8080/uploadFile/Licenses,
- https://localhost:8080/uploadFile/ContactURLMetric,
- https://localhost:8080/uploadFile/ContactClassicMetric,
- https://localhost:8080/uploadFile/AccessibilityMetric,
- https://localhost:8080/uploadFile/VersionMetric,
- https://localhost:8080/uploadFile/UpdateRateMetric,
- https://localhost:8080/uploadFile/ReadabilityMetric,
- https://localhost:8080/uploadFile/TimelinessMetric,
- https://localhost:8080/uploadFile/ContactEmailMetric,
- https://localhost:8080/uploadFile/DataFormat.
