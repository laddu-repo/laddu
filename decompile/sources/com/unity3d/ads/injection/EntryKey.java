package com.unity3d.ads.injection;

import bf.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EntryKey {
    private final d instanceClass;
    private final String named;

    public EntryKey(String named, d instanceClass) {
        k.e(named, "named");
        k.e(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, d dVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i6 & 2) != 0) {
            dVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, dVar);
    }

    public final String component1() {
        return this.named;
    }

    public final d component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, d instanceClass) {
        k.e(named, "named");
        k.e(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        if (k.a(this.named, entryKey.named) && k.a(this.instanceClass, entryKey.instanceClass)) {
            return true;
        }
        return false;
    }

    public final d getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, d dVar, int i6, f fVar) {
        this((i6 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, dVar);
    }
}
