package com.google.gcloud.datastore;

import static com.google.api.services.datastore.DatastoreV1.Value.DOUBLE_VALUE_FIELD_NUMBER;

import com.google.api.services.datastore.DatastoreV1;

public final class DoubleValue extends Value<Double, DoubleValue, DoubleValue.Builder> {

  private static final long serialVersionUID = -5096238337676649540L;

  static final BaseMarshaller<Double, DoubleValue, Builder> MARSHALLER =
      new BaseMarshaller<Double, DoubleValue, Builder>() {

    @Override
    public int getProtoFieldId() {
      return DOUBLE_VALUE_FIELD_NUMBER;
    }

    @Override
    public Builder newBuilder(Double value) {
      return new Builder(value);
    }

    @Override
    protected Double getValue(DatastoreV1.Value from) {
      return from.getDoubleValue();
    }

    @Override
    protected void setValue(DoubleValue from, DatastoreV1.Value.Builder to) {
      to.setDoubleValue(from.get());
    }
  };

  public static final class Builder extends Value.BaseBuilder<Double, DoubleValue, Builder> {

    public Builder(double value) {
      super(Type.DOUBLE);
      set(value);
    }

    @Override
    public DoubleValue build() {
      return new DoubleValue(this);
    }
  }

  public DoubleValue(double value) {
    this(new Builder(value));
  }

  DoubleValue(Builder builder) {
    super(builder);
  }
}