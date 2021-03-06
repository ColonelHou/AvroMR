/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avroMR.pojo;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LongList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LongList\",\"namespace\":\"org.apache.avroMR.pojo\",\"fields\":[{\"name\":\"value\",\"type\":\"long\"},{\"name\":\"next\",\"type\":[\"LongList\",\"null\"]}],\"aliases\":[\"LinkedLongs\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long value;
  @Deprecated public org.apache.avroMR.pojo.LongList next;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LongList() {}

  /**
   * All-args constructor.
   */
  public LongList(java.lang.Long value, org.apache.avroMR.pojo.LongList next) {
    this.value = value;
    this.next = next;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return next;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Long)value$; break;
    case 1: next = (org.apache.avroMR.pojo.LongList)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.Long getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Long value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'next' field.
   */
  public org.apache.avroMR.pojo.LongList getNext() {
    return next;
  }

  /**
   * Sets the value of the 'next' field.
   * @param value the value to set.
   */
  public void setNext(org.apache.avroMR.pojo.LongList value) {
    this.next = value;
  }

  /** Creates a new LongList RecordBuilder */
  public static org.apache.avroMR.pojo.LongList.Builder newBuilder() {
    return new org.apache.avroMR.pojo.LongList.Builder();
  }
  
  /** Creates a new LongList RecordBuilder by copying an existing Builder */
  public static org.apache.avroMR.pojo.LongList.Builder newBuilder(org.apache.avroMR.pojo.LongList.Builder other) {
    return new org.apache.avroMR.pojo.LongList.Builder(other);
  }
  
  /** Creates a new LongList RecordBuilder by copying an existing LongList instance */
  public static org.apache.avroMR.pojo.LongList.Builder newBuilder(org.apache.avroMR.pojo.LongList other) {
    return new org.apache.avroMR.pojo.LongList.Builder(other);
  }
  
  /**
   * RecordBuilder for LongList instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LongList>
    implements org.apache.avro.data.RecordBuilder<LongList> {

    private long value;
    private org.apache.avroMR.pojo.LongList next;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.avroMR.pojo.LongList.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.avroMR.pojo.LongList.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next)) {
        this.next = data().deepCopy(fields()[1].schema(), other.next);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LongList instance */
    private Builder(org.apache.avroMR.pojo.LongList other) {
            super(org.apache.avroMR.pojo.LongList.SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next)) {
        this.next = data().deepCopy(fields()[1].schema(), other.next);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'value' field */
    public java.lang.Long getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public org.apache.avroMR.pojo.LongList.Builder setValue(long value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'value' field */
    public org.apache.avroMR.pojo.LongList.Builder clearValue() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'next' field */
    public org.apache.avroMR.pojo.LongList getNext() {
      return next;
    }
    
    /** Sets the value of the 'next' field */
    public org.apache.avroMR.pojo.LongList.Builder setNext(org.apache.avroMR.pojo.LongList value) {
      validate(fields()[1], value);
      this.next = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'next' field has been set */
    public boolean hasNext() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'next' field */
    public org.apache.avroMR.pojo.LongList.Builder clearNext() {
      next = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public LongList build() {
      try {
        LongList record = new LongList();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Long) defaultValue(fields()[0]);
        record.next = fieldSetFlags()[1] ? this.next : (org.apache.avroMR.pojo.LongList) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
