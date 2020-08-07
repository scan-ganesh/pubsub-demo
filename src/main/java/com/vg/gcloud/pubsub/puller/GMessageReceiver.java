package com.vg.gcloud.pubsub.puller;

import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.pubsub.v1.PubsubMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class GMessageReceiver implements MessageReceiver {
    private static final Log log = LogFactory.getLog(GMessageReceiver.class) ;

    @Override
    public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
        // TODO Auto-generated method stub
        log.info(message.getData()) ;
        // consumer.ack() ; // this has to be uncommented to acknowledge the message

    }
}