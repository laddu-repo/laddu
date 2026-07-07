package com.unity3d.services.core.extensions;

import gf.f0;
import gf.i0;
import he.j;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import le.c;
import qf.a;
import qf.d;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, i0> deferreds = new LinkedHashMap<Object, i0>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        public /* bridge */ boolean containsValue(i0 i0Var) {
            return super.containsValue((Object) i0Var);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, i0>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, i0>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<i0> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public /* bridge */ boolean remove(Object obj, i0 i0Var) {
            return super.remove(obj, (Object) i0Var);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, i0> eldest) {
            k.e(eldest, "eldest");
            if (size() > 100) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<i0> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof i0) {
                return containsValue((i0) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof i0)) {
                return remove(obj, (i0) obj2);
            }
            return false;
        }
    };
    private static final a mutex = new d();

    public static final LinkedHashMap<Object, i0> getDeferreds() {
        return deferreds;
    }

    public static final a getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, l lVar, c cVar) {
        return f0.j(new CoroutineExtensionsKt$memoize$2(obj, lVar, null), cVar);
    }

    public static final <R> Object runReturnSuspendCatching(ve.a block) {
        Object b10;
        k.e(block, "block");
        try {
            b10 = block.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (!(b10 instanceof j)) {
            return b10;
        }
        Throwable a10 = he.k.a(b10);
        if (a10 != null) {
            return he.a.b(a10);
        }
        return b10;
    }

    public static final <R> Object runSuspendCatching(ve.a block) {
        k.e(block, "block");
        try {
            return block.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            return he.a.b(th);
        }
    }
}
