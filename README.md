# Java LogStash Example

## Setup docker ELK instance (Elasticsearch + Logstash + Kibana)
```
docker-compose up
```

## Run application which will generate log entries

To generate a basic log file in /tmp/app.log run the following java application:

```
./gradlew clean build runShadow
```

The application is just a sample java app requiring Java 1.8+ JDK. You can make changes to this by editing in an IDE. For intellij support run `./gradlew cleanIdea idea` and open the '.ipr' project file (requires intellij installation).


## Upload the log:

For simple testing we can just upload the log file manually

```
nc localhost 5000 < /tmp/app.log
```

Or you can perodically upload the file by downloading and configuring: https://www.elastic.co/downloads/beats/filebeat 

You can try filebeat with the following sample filebeat.yml:
```
filebeat:
  prospectors:
    -
      paths:
        - /tmp/app.log
      input_type: log

output:

  elasticsearch:
    hosts: ["localhost:5000"]

shipper:

logging:

  files:

    rotateeverybytes: 10485760 # = 10MB
```

## Kibana access to see output

http://localhost:5601

### Notes: 
* You may need to provide the usual port forwarding for docker localhost access on MacOS or Windows.
* You may need to configure Kibana basic configuration before you can access the log data