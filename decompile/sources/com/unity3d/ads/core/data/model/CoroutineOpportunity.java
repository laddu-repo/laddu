package com.unity3d.ads.core.data.model;

import cf.m;
import com.google.protobuf.ByteString;
import kotlin.jvm.internal.k;
import le.f;
import le.g;
import le.h;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CoroutineOpportunity implements f {
    public static final Key Key = new Key(null);
    private final ByteString value;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Key implements g {
        public /* synthetic */ Key(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineOpportunity(ByteString value) {
        k.e(value, "value");
        this.value = value;
    }

    @Override // le.h
    public <R> R fold(R r10, p pVar) {
        return (R) m.l(this, r10, pVar);
    }

    @Override // le.h
    public <E extends f> E get(g gVar) {
        return (E) m.o(this, gVar);
    }

    @Override // le.f
    public g getKey() {
        return Key;
    }

    public final ByteString getValue() {
        return this.value;
    }

    @Override // le.h
    public h minusKey(g gVar) {
        return m.x(this, gVar);
    }

    @Override // le.h
    public h plus(h hVar) {
        return m.A(this, hVar);
    }
}
