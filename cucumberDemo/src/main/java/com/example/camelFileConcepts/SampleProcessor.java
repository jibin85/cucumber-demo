package com.example.camelFileConcepts;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("fileProcessor")
public class SampleProcessor implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        String data = exchange.getIn().getBody().toString();
        System.out.println("Before Modifying"+data);
        String data2 = "modified the content";
        System.out.println("After Modifying" +data2);
        exchange.getIn().setBody(data2);
    }
}
