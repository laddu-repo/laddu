package com.unity3d.ads.injection;

import he.f;
import he.i;
import ie.s;
import ie.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Registry {
    private final r0 _services = y0.c(s.f6847x);

    public static EntryKey factory$default(Registry registry, String named, a instance, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public static Object get$default(Registry registry, String named, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.j();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String named, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.j();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String named, a instance, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public final <T> void add(EntryKey key, f instance) {
        f1 f1Var;
        Object value;
        LinkedHashMap linkedHashMap;
        k.e(key, "key");
        k.e(instance, "instance");
        if (!getServices().containsKey(key)) {
            r0 r0Var = this._services;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
                Map map = (Map) value;
                Map x10 = w.x(new i(key, instance));
                k.e(map, "<this>");
                linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.putAll(x10);
            } while (!f1Var.f(value, linkedHashMap));
            return;
        }
        throw new IllegalStateException("Cannot have identical entries.");
    }

    public final <T> EntryKey factory(String named, a instance) {
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public final <T> T get(String named) {
        k.e(named, "named");
        k.j();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        k.e(named, "named");
        k.j();
        throw null;
    }

    public final Map<EntryKey, f> getServices() {
        return (Map) ((f1) this._services).getValue();
    }

    public final <T> EntryKey single(String named, a instance) {
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }
}
