package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final CodedInputStream f2867a;

    /* renamed from: b, reason: collision with root package name */
    public int f2868b;

    /* renamed from: c, reason: collision with root package name */
    public int f2869c;

    /* renamed from: d, reason: collision with root package name */
    public int f2870d = 0;

    public b0(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.f2867a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static void A(int i6) {
        if ((i6 & 7) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void z(int i6) {
        if ((i6 & 3) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final int a() {
        int i6 = this.f2870d;
        if (i6 != 0) {
            this.f2868b = i6;
            this.f2870d = 0;
        } else {
            this.f2868b = this.f2867a.readTag();
        }
        int i10 = this.f2868b;
        if (i10 != 0 && i10 != this.f2869c) {
            return WireFormat.getTagFieldNumber(i10);
        }
        return Integer.MAX_VALUE;
    }

    public final void b(Object obj, q3 q3Var, ExtensionRegistryLite extensionRegistryLite) {
        int i6 = this.f2869c;
        this.f2869c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f2868b), 4);
        try {
            q3Var.b(obj, this, extensionRegistryLite);
            if (this.f2868b == this.f2869c) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.f2869c = i6;
        }
    }

    public final void c(Object obj, q3 q3Var, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream = this.f2867a;
        int readUInt32 = codedInputStream.readUInt32();
        if (codedInputStream.recursionDepth < codedInputStream.recursionLimit) {
            int pushLimit = codedInputStream.pushLimit(readUInt32);
            codedInputStream.recursionDepth++;
            q3Var.b(obj, this, extensionRegistryLite);
            codedInputStream.checkLastTagWas(0);
            codedInputStream.recursionDepth--;
            codedInputStream.popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final void d(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof j;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            j jVar = (j) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        jVar.addBoolean(codedInputStream.readBool());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                jVar.addBoolean(codedInputStream.readBool());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(codedInputStream.readBool()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final ByteString e() {
        x(2);
        return this.f2867a.readBytes();
    }

    public final void f(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.f2868b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(e());
            CodedInputStream codedInputStream = this.f2867a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void g(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof m0;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            m0 m0Var = (m0) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = codedInputStream.readUInt32();
                    A(readUInt32);
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                    do {
                        m0Var.addDouble(codedInputStream.readDouble());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                m0Var.addDouble(codedInputStream.readDouble());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = codedInputStream.readUInt32();
                A(readUInt322);
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(codedInputStream.readDouble()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void h(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        s1Var.addInt(codedInputStream.readEnum());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                s1Var.addInt(codedInputStream.readEnum());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream.readEnum()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final Object i(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        int i6 = a0.f2863a[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.f2867a;
        switch (i6) {
            case 1:
                x(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                x(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                x(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                x(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                x(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                x(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                x(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return o(cls, extensionRegistryLite);
            case 11:
                x(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                x(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                x(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                x(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                x(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                x(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                x(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    s1Var.addInt(codedInputStream.readFixed32());
                    if (!codedInputStream.isAtEnd()) {
                        readTag2 = codedInputStream.readTag();
                    } else {
                        return;
                    }
                } while (readTag2 == this.f2868b);
                this.f2870d = readTag2;
                return;
            }
            int readUInt32 = codedInputStream.readUInt32();
            z(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                s1Var.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (!codedInputStream.isAtEnd()) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == this.f2868b);
            this.f2870d = readTag;
            return;
        }
        int readUInt322 = codedInputStream.readUInt32();
        z(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(codedInputStream.readFixed32()));
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void k(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof k2;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            k2 k2Var = (k2) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = codedInputStream.readUInt32();
                    A(readUInt32);
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                    do {
                        k2Var.addLong(codedInputStream.readFixed64());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k2Var.addLong(codedInputStream.readFixed64());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = codedInputStream.readUInt32();
                A(readUInt322);
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(codedInputStream.readFixed64()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void l(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof l1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            l1 l1Var = (l1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    l1Var.addFloat(codedInputStream.readFloat());
                    if (!codedInputStream.isAtEnd()) {
                        readTag2 = codedInputStream.readTag();
                    } else {
                        return;
                    }
                } while (readTag2 == this.f2868b);
                this.f2870d = readTag2;
                return;
            }
            int readUInt32 = codedInputStream.readUInt32();
            z(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                l1Var.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (!codedInputStream.isAtEnd()) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == this.f2868b);
            this.f2870d = readTag;
            return;
        }
        int readUInt322 = codedInputStream.readUInt32();
        z(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(codedInputStream.readFloat()));
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void m(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        s1Var.addInt(codedInputStream.readInt32());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                s1Var.addInt(codedInputStream.readInt32());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream.readInt32()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void n(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof k2;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            k2 k2Var = (k2) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        k2Var.addLong(codedInputStream.readInt64());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k2Var.addLong(codedInputStream.readInt64());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(codedInputStream.readInt64()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final Object o(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        x(2);
        q3 a10 = i3.f2941c.a(cls);
        Object j = a10.j();
        c(j, a10, extensionRegistryLite);
        a10.c(j);
        return j;
    }

    public final void p(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    s1Var.addInt(codedInputStream.readSFixed32());
                    if (!codedInputStream.isAtEnd()) {
                        readTag2 = codedInputStream.readTag();
                    } else {
                        return;
                    }
                } while (readTag2 == this.f2868b);
                this.f2870d = readTag2;
                return;
            }
            int readUInt32 = codedInputStream.readUInt32();
            z(readUInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
            do {
                s1Var.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (!codedInputStream.isAtEnd()) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == this.f2868b);
            this.f2870d = readTag;
            return;
        }
        int readUInt322 = codedInputStream.readUInt32();
        z(readUInt322);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(codedInputStream.readSFixed32()));
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void q(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof k2;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            k2 k2Var = (k2) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = codedInputStream.readUInt32();
                    A(readUInt32);
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + readUInt32;
                    do {
                        k2Var.addLong(codedInputStream.readSFixed64());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k2Var.addLong(codedInputStream.readSFixed64());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = codedInputStream.readUInt32();
                A(readUInt322);
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(codedInputStream.readSFixed64()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void r(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        s1Var.addInt(codedInputStream.readSInt32());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                s1Var.addInt(codedInputStream.readSInt32());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream.readSInt32()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void s(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof k2;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            k2 k2Var = (k2) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        k2Var.addLong(codedInputStream.readSInt64());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k2Var.addLong(codedInputStream.readSInt64());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(codedInputStream.readSInt64()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void t(List list, boolean z10) {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f2868b) == 2) {
            boolean z11 = list instanceof LazyStringList;
            CodedInputStream codedInputStream = this.f2867a;
            if (z11 && !z10) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(e());
                    if (!codedInputStream.isAtEnd()) {
                        readTag2 = codedInputStream.readTag();
                    } else {
                        return;
                    }
                } while (readTag2 == this.f2868b);
                this.f2870d = readTag2;
                return;
            }
            do {
                if (z10) {
                    x(2);
                    readString = codedInputStream.readStringRequireUtf8();
                } else {
                    x(2);
                    readString = codedInputStream.readString();
                }
                list.add(readString);
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    readTag = codedInputStream.readTag();
                }
            } while (readTag == this.f2868b);
            this.f2870d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void u(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof s1;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            s1 s1Var = (s1) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        s1Var.addInt(codedInputStream.readUInt32());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                s1Var.addInt(codedInputStream.readUInt32());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream.readUInt32()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void v(List list) {
        int readTag;
        int readTag2;
        boolean z10 = list instanceof k2;
        CodedInputStream codedInputStream = this.f2867a;
        if (z10) {
            k2 k2Var = (k2) list;
            int tagWireType = WireFormat.getTagWireType(this.f2868b);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                    do {
                        k2Var.addLong(codedInputStream.readUInt64());
                    } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                    w(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k2Var.addLong(codedInputStream.readUInt64());
                if (!codedInputStream.isAtEnd()) {
                    readTag2 = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag2 == this.f2868b);
            this.f2870d = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f2868b);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
                w(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(codedInputStream.readUInt64()));
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                readTag = codedInputStream.readTag();
            }
        } while (readTag == this.f2868b);
        this.f2870d = readTag;
    }

    public final void w(int i6) {
        if (this.f2867a.getTotalBytesRead() == i6) {
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void x(int i6) {
        if (WireFormat.getTagWireType(this.f2868b) == i6) {
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean y() {
        int i6;
        CodedInputStream codedInputStream = this.f2867a;
        if (!codedInputStream.isAtEnd() && (i6 = this.f2868b) != this.f2869c) {
            return codedInputStream.skipField(i6);
        }
        return false;
    }
}
