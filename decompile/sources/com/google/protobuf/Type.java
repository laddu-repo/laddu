package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private Internal.ProtobufList<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = HttpUrl.FRAGMENT_ENCODE_SET;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public /* synthetic */ Builder(g4 g4Var) {
            this();
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllFields(iterable);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOneofs(iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addFields(Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(field);
            return this;
        }

        public Builder addOneofs(String str) {
            copyOnWrite();
            ((Type) this.instance).addOneofs(str);
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString) {
            copyOnWrite();
            ((Type) this.instance).addOneofsBytes(byteString);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(option);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((Type) this.instance).clearEdition();
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            ((Type) this.instance).clearFields();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Type) this.instance).clearName();
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            ((Type) this.instance).clearOneofs();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Type) this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Type) this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Type) this.instance).clearSyntax();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getEdition() {
            return ((Type) this.instance).getEdition();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getEditionBytes() {
            return ((Type) this.instance).getEditionBytes();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Field getFields(int i6) {
            return ((Type) this.instance).getFields(i6);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type) this.instance).getName();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getOneofs(int i6) {
            return ((Type) this.instance).getOneofs(i6);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int i6) {
            return ((Type) this.instance).getOneofsBytes(i6);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Option getOptions(int i6) {
            return ((Type) this.instance).getOptions(i6);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder removeFields(int i6) {
            copyOnWrite();
            ((Type) this.instance).removeFields(i6);
            return this;
        }

        public Builder removeOptions(int i6) {
            copyOnWrite();
            ((Type) this.instance).removeOptions(i6);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            ((Type) this.instance).setEdition(str);
            return this;
        }

        public Builder setEditionBytes(ByteString byteString) {
            copyOnWrite();
            ((Type) this.instance).setEditionBytes(byteString);
            return this;
        }

        public Builder setFields(int i6, Field field) {
            copyOnWrite();
            ((Type) this.instance).setFields(i6, field);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Type) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Type) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOneofs(int i6, String str) {
            copyOnWrite();
            ((Type) this.instance).setOneofs(i6, str);
            return this;
        }

        public Builder setOptions(int i6, Option option) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i6, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            ((Type) this.instance).setSyntax(syntax);
            return this;
        }

        public Builder setSyntaxValue(int i6) {
            copyOnWrite();
            ((Type) this.instance).setSyntaxValue(i6);
            return this;
        }

        private Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        public Builder addFields(int i6, Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(i6, field);
            return this;
        }

        public Builder addOptions(int i6, Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i6, option);
            return this;
        }

        public Builder setFields(int i6, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setFields(i6, builder.build());
            return this;
        }

        public Builder setOptions(int i6, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i6, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(builder.build());
            return this;
        }

        public Builder addFields(Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addFields(int i6, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(i6, builder.build());
            return this;
        }

        public Builder addOptions(int i6, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i6, builder.build());
            return this;
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureOneofsIsMutable();
        this.oneofs_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureFieldsIsMutable() {
        Internal.ProtobufList<Field> protobufList = this.fields_;
        if (!protobufList.isModifiable()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureOneofsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.oneofs_;
        if (!protobufList.isModifiable()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (!protobufList.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom((SourceContext.Builder) sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i6) {
        ensureFieldsIsMutable();
        this.fields_.remove(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i6) {
        ensureOptionsIsMutable();
        this.options_.remove(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(String str) {
        str.getClass();
        this.edition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.edition_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i6, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i6, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int i6, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i6, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i6, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i6, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i6) {
        this.syntax_ = i6;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        g4 g4Var = null;
        switch (g4.f2926a[methodToInvoke.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new Builder(g4Var);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Type> parser2 = PARSER;
                if (parser2 == null) {
                    synchronized (Type.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return parser;
                }
                return parser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Field getFields(int i6) {
        return this.fields_.get(i6);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int i6) {
        return this.fields_.get(i6);
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getOneofs(int i6) {
        return this.oneofs_.get(i6);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int i6) {
        return ByteString.copyFromUtf8(this.oneofs_.get(i6));
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Option getOptions(int i6) {
        return this.options_.get(i6);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i6) {
        return this.options_.get(i6);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax forNumber = Syntax.forNumber(this.syntax_);
        if (forNumber == null) {
            return Syntax.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i6, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i6, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i6, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i6, option);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] bArr) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
