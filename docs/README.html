<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<body>
<a href="https://github.com/k1729p/Study05/tree/main/docs"><img alt="" src="images/ColorScheme.png" height="25" width="800"/></a>
<h2 id="contents">Study05 README Contents</h2>
<h3 id="top">Research the Kafka Broker and <a href="https://spring.io/projects/spring-cloud-stream">Spring Cloud Stream</a></h3>

<p>
<img alt="" src="images/MermaidFlowchart1.png" height="140" width="530"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>In the Docker container 'spr-kafka', Kafka Server runs with a single Kafka Broker.</i>
</p>

<p>
This is the Spring Cloud Stream application with the Apache Kafka Binder.<br>
The Apache Kafka Binder implementation maps each <i>destination</i> to an Apache Kafka <i>topic</i>. 
</p>

<p>
The sections of this project:
</p>
<ol>
<li><a href="#ONE"><b>Docker Build</b></a></li>
<li><a href="#TWO"><b>Sender, Processor, Receiver</b></a></li>
<li><a href="#THREE"><b>Kafka Scripts</b></a></li>
</ol>

<hr>

<p>
Java source code packages in modules 'kafka-sender', 'kafka-processor', and 'kafka-receiver':<br>
<img alt="" src="images/aquaHR-500.png"><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-sender' <i>application sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-sender/src/main/java/kp">kp</a><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-sender' <i>test sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-sender/src/test/java/kp/sender">kp.sender</a><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-processor' <i>application sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-processor/src/main/java/kp">kp</a><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-processor' <i>test sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-processor/src/test/java/kp/processor">kp.processor</a><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-receiver' <i>application sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-receiver/src/main/java/kp">kp</a><br>
<img alt="" src="images/aquaSquare.png">
    module 'kafka-receiver' <i>test sources</i>&nbsp;:&nbsp;
	<a href="https://github.com/k1729p/Study05/tree/main/kafka-receiver/src/test/java/kp/receiver">kp.receiver</a><br>
<img alt="" src="images/aquaHR-500.png">
</p>

<p>
<img alt="" src="images/yellowHR-500.png"><br>
<img alt="" src="images/yellowSquare.png">
    <a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study05/blob/main/docs/apidocs/index.html">
	Java API Documentation</a>&nbsp;●&nbsp;
    <a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study05/blob/main/docs/testapidocs/index.html">
	Java Test API Documentation</a><br>
<img alt="" src="images/yellowHR-500.png">
</p>
<hr>
<h3 id="ONE">❶ Docker Build</h3>

<p>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. With the batch file
 <a href="https://github.com/k1729p/Study05/blob/main/0_batch/01%20Docker%20build%20and%20run.bat">
 <i>"01 Docker build and run.bat"</i></a>, build the image and<br>
<img alt="" src="images/orangeSquare.png"><img alt="" src="images/spacer-32.png">start the container with the application.<br>
<img alt="" src="images/orangeHR-500.png">
</p>

<p><img alt="" src="images/greenCircle.png">
1.1. Docker image is built using these files:<br>
<a href="https://raw.githubusercontent.com/k1729p/Study05/main/docker-config/Dockerfile-processor"><b>Dockerfile-processor</b></a>,
<a href="https://raw.githubusercontent.com/k1729p/Study05/main/docker-config/Dockerfile-receiver"><b>Dockerfile-receiver</b></a>,
<a href="https://raw.githubusercontent.com/k1729p/Study05/main/docker-config/Dockerfile-sender"><b>Dockerfile-sender</b></a>, and
<a href="https://raw.githubusercontent.com/k1729p/Study05/main/docker-config/compose.yaml"><b>compose.yaml</b></a>.
</p>
<p>
<img alt="" src="images/ScreenshotDockerContainer.png" height="520" width="960"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The screenshot of the created Docker containers.</i>
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="TWO">❷ Sender, Processor, Receiver</h3>
<p>
<img alt="" src="images/MermaidFlowchart2.png" height="215" width="610"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>Docker containers for SpringBoot applications: sender, processor, and receiver</i>
</p>
<p><img alt="" src="images/greenCircle.png">
2.1. The <b>Sender</b> is configured in 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-sender/src/main/resources/application.yml">application.yml</a>.<br>
The container <b>spr-sender</b> sends 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-sender/src/main/java/kp/model/Box.java">Box</a>
to the destination '<b>kp-1</b>'.<br>
The 'Supplier' creation method in SpringBoot configuration: 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-sender/src/main/java/kp/sender/KpSender.java#L30">
kp.sender.KpSender::sendBox</a>.
</p>
<p><img alt="" src="images/SprSender.png" height="165" width="430"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The log from the container <b>spr-sender</b>.</i>
</p>

<p><img alt="" src="images/greenCircle.png">
2.2. The <b>Processor</b> is configured in 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-processor/src/main/resources/application.yml">application.yml</a>.<br>
The container <b>spr-processor</b> processes 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-processor/src/main/java/kp/model/Box.java">Box</a>
from the destination '<b>kp-1</b>' to the destination '<b>kp-2</b>'.<br>
The 'Function' creation method in SpringBoot configuration: 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-processor/src/main/java/kp/processor/KpProcessor.java#L30">
kp.processor.KpProcessor::processBox</a>.
</p>
<p><img alt="" src="images/SprProcessor.png" height="140" width="265"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The log from the container <b>spr-processor</b>.</i>
</p>

<p><img alt="" src="images/greenCircle.png">
2.3. The <b>Receiver</b> is configured in 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-receiver/src/main/resources/application.yml">application.yml</a>.<br>
The container <b>spr-receiver</b> receives 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-receiver/src/main/java/kp/model/Box.java">Box</a>
from the destination '<b>kp-2</b>'.<br>
The 'Consumer' creation method in SpringBoot configuration: 
<a href="https://github.com/k1729p/Study05/blob/main/kafka-receiver/src/main/java/kp/receiver/KpReceiver.java#L31">
kp.receiver.KpReceiver::receiveBox</a>.
</p>

<p><img alt="" src="images/SprReceiver.png" height="140" width="340"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The log from the container <b>spr-receiver</b>.</i>
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="THREE">❸ Kafka Scripts</h3>

<p>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. With the batch file
 <a href="https://github.com/k1729p/Study05/blob/main/0_batch/02%20Kafka%20list%20topics.bat">
 <i>"02 Kafka list topics.bat"</i></a>, run in Docker the Kafka script for topic listing.<br>
<img alt="" src="images/orangeSquare.png"> 2. With the batch file
 <a href="https://github.com/k1729p/Study05/blob/main/0_batch/03%20Kafka%20consume.bat">
 <i>"03 Kafka consume.bat"</i></a>, run in Docker the Kafka consumer console on topic 'kp-2'.<br>
<img alt="" src="images/orangeHR-500.png">
</p>

<p><img alt="" src="images/greenCircle.png">
3.1. The batch file <i>"02 Kafka list topics.bat"</i>.<br>
The <a href="images/KafkaListTopics.png">
<b>screenshot</b></a> of the console log from the run of the batch file <i>"02 Kafka list topics.bat"</i>.
</p>

<p><img alt="" src="images/greenCircle.png">
3.2. The batch file <i>"03 Kafka consume.bat"</i>.
</p>
<p><img alt="" src="images/KafkaConsume.png" height="85" width="515"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The console log from the run of the batch file "03 Kafka consume.bat".</i>
</p>

<a href="#top">Back to the top of the page</a>
<hr>
</body>
</html>