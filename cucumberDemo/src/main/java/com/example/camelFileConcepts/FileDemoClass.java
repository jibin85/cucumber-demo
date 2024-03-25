package com.example.camelFileConcepts;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileDemoClass extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        directRouter();
        processedRouter();

    }

    private void directRouter() {
        from("file:C:/Project/KT/input/?fileName=sample.txt")
                .routeId("file-demo-1")
                .to("file:C:/Project/KT/output/")
                .log(LoggingLevel.INFO, "Moved File Sucessfully, body : ${body}");
    }

    private void processedRouter() {
        from("file:C:/Project/KT/input/?fileName=sample2.txt")
                .routeId("file-demo-2")
                .process("fileProcessor")
                .to("file:C:/Project/KT/output/")
                .log(LoggingLevel.INFO, "Moved File Sucessfully after transformation, body : ${body}");
    }
}
