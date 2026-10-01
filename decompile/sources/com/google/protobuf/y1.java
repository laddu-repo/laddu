package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y1 implements Internal.MapAdapter.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLiteMap f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLite f3122b;

    public y1(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.f3121a = enumLiteMap;
        this.f3122b = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite findValueByNumber = this.f3121a.findValueByNumber(((Integer) obj).intValue());
        if (findValueByNumber == null) {
            return this.f3122b;
        }
        return findValueByNumber;
    }
}
