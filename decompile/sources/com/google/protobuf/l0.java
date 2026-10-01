package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 implements e5 {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f2978a;

    public l0(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.f2978a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i6, ByteString byteString) {
        this.f2978a.writeBytes(i6, byteString);
    }

    public final void b(int i6, int i10) {
        this.f2978a.writeFixed32(i6, i10);
    }

    public final void c(int i6, long j) {
        this.f2978a.writeFixed64(i6, j);
    }

    public final void d(int i6, Object obj, q3 q3Var) {
        this.f2978a.writeGroup(i6, (MessageLite) obj, q3Var);
    }

    public final void e(int i6, int i10) {
        this.f2978a.writeInt32(i6, i10);
    }

    public final void f(int i6, long j) {
        this.f2978a.writeInt64(i6, j);
    }

    public final void g(int i6, Object obj, q3 q3Var) {
        this.f2978a.writeMessage(i6, (MessageLite) obj, q3Var);
    }

    public final void h(int i6, Object obj) {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f2978a;
        if (z10) {
            codedOutputStream.writeRawMessageSetExtension(i6, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i6, (MessageLite) obj);
        }
    }
}
