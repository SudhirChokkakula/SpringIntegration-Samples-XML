package com.si.samples.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

public class ChannelDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/channel/si-config.xml");
		MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
		PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);

		inputChannel.send(new GenericMessage<String>("Sudhir"));
		inputChannel.send(new GenericMessage<String>("Sudhir1"));
		inputChannel.send(new GenericMessage<String>("Sudhir2"));
		inputChannel.send(new GenericMessage<String>("Sudhir3"));
		inputChannel.send(new GenericMessage<String>("Sudhir4"));
		inputChannel.send(new GenericMessage<String>("Sudhir5"));

		System.out.println(outputChannel.receive().getPayload());

		//context.close();

	}

}
