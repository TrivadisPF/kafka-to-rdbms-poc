/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.trivadis.kafka.poc.avro.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderCompletedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7544244683327999244L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderCompletedEvent\",\"namespace\":\"com.trivadis.kafka.poc.avro.v1\",\"fields\":[{\"name\":\"order\",\"type\":{\"type\":\"record\",\"name\":\"Order\",\"fields\":[{\"name\":\"guid\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"orderDate\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"customerId\",\"type\":\"long\"},{\"name\":\"orderLines\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderLine\",\"fields\":[{\"name\":\"lineId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"quantity\",\"type\":\"int\"}]}}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<OrderCompletedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderCompletedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderCompletedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderCompletedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderCompletedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderCompletedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderCompletedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderCompletedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderCompletedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.trivadis.kafka.poc.avro.v1.Order order;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderCompletedEvent() {}

  /**
   * All-args constructor.
   * @param order The new value for order
   */
  public OrderCompletedEvent(com.trivadis.kafka.poc.avro.v1.Order order) {
    this.order = order;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return order;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: order = (com.trivadis.kafka.poc.avro.v1.Order)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'order' field.
   * @return The value of the 'order' field.
   */
  public com.trivadis.kafka.poc.avro.v1.Order getOrder() {
    return order;
  }


  /**
   * Sets the value of the 'order' field.
   * @param value the value to set.
   */
  public void setOrder(com.trivadis.kafka.poc.avro.v1.Order value) {
    this.order = value;
  }

  /**
   * Creates a new OrderCompletedEvent RecordBuilder.
   * @return A new OrderCompletedEvent RecordBuilder
   */
  public static com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder newBuilder() {
    return new com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder();
  }

  /**
   * Creates a new OrderCompletedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderCompletedEvent RecordBuilder
   */
  public static com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder newBuilder(com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder other) {
    if (other == null) {
      return new com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder();
    } else {
      return new com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder(other);
    }
  }

  /**
   * Creates a new OrderCompletedEvent RecordBuilder by copying an existing OrderCompletedEvent instance.
   * @param other The existing instance to copy.
   * @return A new OrderCompletedEvent RecordBuilder
   */
  public static com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder newBuilder(com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent other) {
    if (other == null) {
      return new com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder();
    } else {
      return new com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderCompletedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderCompletedEvent>
    implements org.apache.avro.data.RecordBuilder<OrderCompletedEvent> {

    private com.trivadis.kafka.poc.avro.v1.Order order;
    private com.trivadis.kafka.poc.avro.v1.Order.Builder orderBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.order)) {
        this.order = data().deepCopy(fields()[0].schema(), other.order);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasOrderBuilder()) {
        this.orderBuilder = com.trivadis.kafka.poc.avro.v1.Order.newBuilder(other.getOrderBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing OrderCompletedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.order)) {
        this.order = data().deepCopy(fields()[0].schema(), other.order);
        fieldSetFlags()[0] = true;
      }
      this.orderBuilder = null;
    }

    /**
      * Gets the value of the 'order' field.
      * @return The value.
      */
    public com.trivadis.kafka.poc.avro.v1.Order getOrder() {
      return order;
    }


    /**
      * Sets the value of the 'order' field.
      * @param value The value of 'order'.
      * @return This builder.
      */
    public com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder setOrder(com.trivadis.kafka.poc.avro.v1.Order value) {
      validate(fields()[0], value);
      this.orderBuilder = null;
      this.order = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'order' field has been set.
      * @return True if the 'order' field has been set, false otherwise.
      */
    public boolean hasOrder() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'order' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.trivadis.kafka.poc.avro.v1.Order.Builder getOrderBuilder() {
      if (orderBuilder == null) {
        if (hasOrder()) {
          setOrderBuilder(com.trivadis.kafka.poc.avro.v1.Order.newBuilder(order));
        } else {
          setOrderBuilder(com.trivadis.kafka.poc.avro.v1.Order.newBuilder());
        }
      }
      return orderBuilder;
    }

    /**
     * Sets the Builder instance for the 'order' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder setOrderBuilder(com.trivadis.kafka.poc.avro.v1.Order.Builder value) {
      clearOrder();
      orderBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'order' field has an active Builder instance
     * @return True if the 'order' field has an active Builder instance
     */
    public boolean hasOrderBuilder() {
      return orderBuilder != null;
    }

    /**
      * Clears the value of the 'order' field.
      * @return This builder.
      */
    public com.trivadis.kafka.poc.avro.v1.OrderCompletedEvent.Builder clearOrder() {
      order = null;
      orderBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderCompletedEvent build() {
      try {
        OrderCompletedEvent record = new OrderCompletedEvent();
        if (orderBuilder != null) {
          try {
            record.order = this.orderBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("order"));
            throw e;
          }
        } else {
          record.order = fieldSetFlags()[0] ? this.order : (com.trivadis.kafka.poc.avro.v1.Order) defaultValue(fields()[0]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderCompletedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderCompletedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderCompletedEvent>
    READER$ = (org.apache.avro.io.DatumReader<OrderCompletedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









