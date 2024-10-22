package com.dawidhr.KafkaVehicleLocationProducer.model;


public enum KafkaTopic {
    VEHICLE_LOCATION("vehicle.location", 3, 1);

    private String topicName;
    private Integer partitionCount;
    private Integer replicaCount;

    KafkaTopic(String topicName, Integer partitionCount, Integer replicaCount) {
        this.topicName = topicName;
        this.partitionCount = partitionCount;
        this.replicaCount = replicaCount;
    }

    public String getTopicName() {
        return topicName;
    }

    public Integer getPartitionCount() {
        return partitionCount;
    }

    public Integer getReplicaCount() {
        return replicaCount;
    }
}
