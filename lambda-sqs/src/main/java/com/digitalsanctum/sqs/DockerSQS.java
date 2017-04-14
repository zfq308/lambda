package com.digitalsanctum.sqs;

import com.digitalsanctum.lambda.docker.AbstractDockerService;

/**
 * @author Shane Witbeck
 * @since 4/14/17
 */
public class DockerSQS extends AbstractDockerService {

  @Override
  public String name() {
    return "SQS";
  }

  @Override
  public String imageId() {
    return "expert360/elasticmq";
  }

  @Override
  public int containerPort() {
    return 9324;
  }
}
