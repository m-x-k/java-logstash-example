# Java LogStash Example

## Setup docker ELK instance (Elasticsearch + Logstash + Kibana)
```
docker-compose up
```

## Run application which will generate log entries
```
./gradlew clean build runShadow
```


## Kibana access to see output

http://localhost:5601

### Notes: 
* You may need to provide the usual port forwarding for docker localhost access on MacOS or Windows.
* You may need to configure Kibana basic configuration before you can access the log data