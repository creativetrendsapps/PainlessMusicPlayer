// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.doctoror.commons.wear.nano;

@SuppressWarnings("hiding")
public interface WearPlaybackData {

  public static final class PlaybackState extends
      com.google.protobuf.nano.MessageNano {

    private static volatile PlaybackState[] _emptyArray;
    public static PlaybackState[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new PlaybackState[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 state = 1;
    public int state;

    public PlaybackState() {
      clear();
    }

    public PlaybackState clear() {
      state = 0;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.state != 0) {
        output.writeInt32(1, this.state);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.state != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.state);
      }
      return size;
    }

    @Override
    public PlaybackState mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.state = input.readInt32();
            break;
          }
        }
      }
    }

    public static PlaybackState parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new PlaybackState(), data);
    }

    public static PlaybackState parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new PlaybackState().mergeFrom(input);
    }
  }

  public static final class PlaybackPosition extends
      com.google.protobuf.nano.MessageNano {

    private static volatile PlaybackPosition[] _emptyArray;
    public static PlaybackPosition[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new PlaybackPosition[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int64 mediaId = 1;
    public long mediaId;

    // optional int64 position = 2;
    public long position;

    public PlaybackPosition() {
      clear();
    }

    public PlaybackPosition clear() {
      mediaId = 0L;
      position = 0L;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.mediaId != 0L) {
        output.writeInt64(1, this.mediaId);
      }
      if (this.position != 0L) {
        output.writeInt64(2, this.position);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.mediaId != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(1, this.mediaId);
      }
      if (this.position != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(2, this.position);
      }
      return size;
    }

    @Override
    public PlaybackPosition mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.mediaId = input.readInt64();
            break;
          }
          case 16: {
            this.position = input.readInt64();
            break;
          }
        }
      }
    }

    public static PlaybackPosition parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new PlaybackPosition(), data);
    }

    public static PlaybackPosition parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new PlaybackPosition().mergeFrom(input);
    }
  }

  public static final class Media extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Media[] _emptyArray;
    public static Media[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Media[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 positionInPlaylist = 1;
    public int positionInPlaylist;

    // optional int64 id = 2;
    public long id;

    // optional string title = 3;
    public java.lang.String title;

    // optional int64 duration = 4;
    public long duration;

    // optional string artist = 5;
    public java.lang.String artist;

    // optional string album = 6;
    public java.lang.String album;

    public Media() {
      clear();
    }

    public Media clear() {
      positionInPlaylist = 0;
      id = 0L;
      title = "";
      duration = 0L;
      artist = "";
      album = "";
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.positionInPlaylist != 0) {
        output.writeInt32(1, this.positionInPlaylist);
      }
      if (this.id != 0L) {
        output.writeInt64(2, this.id);
      }
      if (!this.title.equals("")) {
        output.writeString(3, this.title);
      }
      if (this.duration != 0L) {
        output.writeInt64(4, this.duration);
      }
      if (!this.artist.equals("")) {
        output.writeString(5, this.artist);
      }
      if (!this.album.equals("")) {
        output.writeString(6, this.album);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.positionInPlaylist != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.positionInPlaylist);
      }
      if (this.id != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(2, this.id);
      }
      if (!this.title.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.title);
      }
      if (this.duration != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(4, this.duration);
      }
      if (!this.artist.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(5, this.artist);
      }
      if (!this.album.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(6, this.album);
      }
      return size;
    }

    @Override
    public Media mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.positionInPlaylist = input.readInt32();
            break;
          }
          case 16: {
            this.id = input.readInt64();
            break;
          }
          case 26: {
            this.title = input.readString();
            break;
          }
          case 32: {
            this.duration = input.readInt64();
            break;
          }
          case 42: {
            this.artist = input.readString();
            break;
          }
          case 50: {
            this.album = input.readString();
            break;
          }
        }
      }
    }

    public static Media parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Media(), data);
    }

    public static Media parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Media().mergeFrom(input);
    }
  }

  public static final class Playlist extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Playlist[] _emptyArray;
    public static Playlist[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Playlist[0];
          }
        }
      }
      return _emptyArray;
    }

    // repeated .Media media = 1;
    public com.doctoror.commons.wear.nano.WearPlaybackData.Media[] media;

    public Playlist() {
      clear();
    }

    public Playlist clear() {
      media = com.doctoror.commons.wear.nano.WearPlaybackData.Media.emptyArray();
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.media != null && this.media.length > 0) {
        for (int i = 0; i < this.media.length; i++) {
          com.doctoror.commons.wear.nano.WearPlaybackData.Media element = this.media[i];
          if (element != null) {
            output.writeMessage(1, element);
          }
        }
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.media != null && this.media.length > 0) {
        for (int i = 0; i < this.media.length; i++) {
          com.doctoror.commons.wear.nano.WearPlaybackData.Media element = this.media[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(1, element);
          }
        }
      }
      return size;
    }

    @Override
    public Playlist mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 10);
            int i = this.media == null ? 0 : this.media.length;
            com.doctoror.commons.wear.nano.WearPlaybackData.Media[] newArray =
                new com.doctoror.commons.wear.nano.WearPlaybackData.Media[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.media, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.doctoror.commons.wear.nano.WearPlaybackData.Media();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.doctoror.commons.wear.nano.WearPlaybackData.Media();
            input.readMessage(newArray[i]);
            this.media = newArray;
            break;
          }
        }
      }
    }

    public static Playlist parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Playlist(), data);
    }

    public static Playlist parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Playlist().mergeFrom(input);
    }
  }
}
