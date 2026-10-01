package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum b5 extends d5 {
    public b5() {
        super("STRICT", 1);
    }

    @Override // com.google.protobuf.d5
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
