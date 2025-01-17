// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: billno.proto

// Protobuf Java Version: 3.25.3
package com.seezoon.stub.billno;

/**
 * Protobuf type {@code com.seezoon.billno.GetBillnoReq}
 */
public final class GetBillnoReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.seezoon.billno.GetBillnoReq)
    GetBillnoReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBillnoReq.newBuilder() to construct.
  private GetBillnoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBillnoReq() {
    bizCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBillnoReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.seezoon.stub.billno.BillnoOuterClass.internal_static_com_seezoon_billno_GetBillnoReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.seezoon.stub.billno.BillnoOuterClass.internal_static_com_seezoon_billno_GetBillnoReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.seezoon.stub.billno.GetBillnoReq.class, com.seezoon.stub.billno.GetBillnoReq.Builder.class);
  }

  public static final int BIZ_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bizCode_ = "";
  /**
   * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
   * @return The bizCode.
   */
  @java.lang.Override
  public java.lang.String getBizCode() {
    java.lang.Object ref = bizCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bizCode_ = s;
      return s;
    }
  }
  /**
   * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for bizCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBizCodeBytes() {
    java.lang.Object ref = bizCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bizCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bizCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bizCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bizCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bizCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.seezoon.stub.billno.GetBillnoReq)) {
      return super.equals(obj);
    }
    com.seezoon.stub.billno.GetBillnoReq other = (com.seezoon.stub.billno.GetBillnoReq) obj;

    if (!getBizCode()
        .equals(other.getBizCode())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BIZ_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getBizCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.seezoon.stub.billno.GetBillnoReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.seezoon.stub.billno.GetBillnoReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.seezoon.stub.billno.GetBillnoReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.seezoon.stub.billno.GetBillnoReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.seezoon.billno.GetBillnoReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.seezoon.billno.GetBillnoReq)
      com.seezoon.stub.billno.GetBillnoReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.seezoon.stub.billno.BillnoOuterClass.internal_static_com_seezoon_billno_GetBillnoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.seezoon.stub.billno.BillnoOuterClass.internal_static_com_seezoon_billno_GetBillnoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.seezoon.stub.billno.GetBillnoReq.class, com.seezoon.stub.billno.GetBillnoReq.Builder.class);
    }

    // Construct using com.seezoon.stub.billno.GetBillnoReq.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bizCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.seezoon.stub.billno.BillnoOuterClass.internal_static_com_seezoon_billno_GetBillnoReq_descriptor;
    }

    @java.lang.Override
    public com.seezoon.stub.billno.GetBillnoReq getDefaultInstanceForType() {
      return com.seezoon.stub.billno.GetBillnoReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.seezoon.stub.billno.GetBillnoReq build() {
      com.seezoon.stub.billno.GetBillnoReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.seezoon.stub.billno.GetBillnoReq buildPartial() {
      com.seezoon.stub.billno.GetBillnoReq result = new com.seezoon.stub.billno.GetBillnoReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.seezoon.stub.billno.GetBillnoReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bizCode_ = bizCode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.seezoon.stub.billno.GetBillnoReq) {
        return mergeFrom((com.seezoon.stub.billno.GetBillnoReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.seezoon.stub.billno.GetBillnoReq other) {
      if (other == com.seezoon.stub.billno.GetBillnoReq.getDefaultInstance()) return this;
      if (!other.getBizCode().isEmpty()) {
        bizCode_ = other.bizCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              bizCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object bizCode_ = "";
    /**
     * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
     * @return The bizCode.
     */
    public java.lang.String getBizCode() {
      java.lang.Object ref = bizCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bizCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for bizCode.
     */
    public com.google.protobuf.ByteString
        getBizCodeBytes() {
      java.lang.Object ref = bizCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bizCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
     * @param value The bizCode to set.
     * @return This builder for chaining.
     */
    public Builder setBizCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bizCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBizCode() {
      bizCode_ = getDefaultInstance().getBizCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string biz_code = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for bizCode to set.
     * @return This builder for chaining.
     */
    public Builder setBizCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bizCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.seezoon.billno.GetBillnoReq)
  }

  // @@protoc_insertion_point(class_scope:com.seezoon.billno.GetBillnoReq)
  private static final com.seezoon.stub.billno.GetBillnoReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.seezoon.stub.billno.GetBillnoReq();
  }

  public static com.seezoon.stub.billno.GetBillnoReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBillnoReq>
      PARSER = new com.google.protobuf.AbstractParser<GetBillnoReq>() {
    @java.lang.Override
    public GetBillnoReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetBillnoReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBillnoReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.seezoon.stub.billno.GetBillnoReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

