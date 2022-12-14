/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.trivadis.kafka.poc.avro.v1;

@org.apache.avro.specific.AvroGenerated
public interface OrderCompletedEventProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"OrderCompletedEventProtocol\",\"namespace\":\"com.trivadis.kafka.poc.avro.v1\",\"types\":[{\"type\":\"record\",\"name\":\"Order\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"orderDate\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"customerId\",\"type\":\"long\"},{\"name\":\"orderLines\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderLine\",\"fields\":[{\"name\":\"lineId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"quantity\",\"type\":\"int\"}]}}}]},{\"type\":\"record\",\"name\":\"OrderCompletedEvent\",\"fields\":[{\"name\":\"order\",\"type\":\"Order\"}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends OrderCompletedEventProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.trivadis.kafka.poc.avro.v1.OrderCompletedEventProtocol.PROTOCOL;
  }
}