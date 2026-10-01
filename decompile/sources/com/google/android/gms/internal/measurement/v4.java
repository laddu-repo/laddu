package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = t5.f2444a;
        iterable.getClass();
        if (!(iterable instanceof j6)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof l6) {
                    l6 l6Var = (l6) list;
                    int i6 = l6Var.f2339z + size;
                    int length = l6Var.f2338y.length;
                    if (i6 > length) {
                        if (length != 0) {
                            while (length < i6) {
                                length = Math.max(((length * 3) / 2) + 1, 10);
                            }
                            l6Var.f2338y = Arrays.copyOf(l6Var.f2338y, length);
                        } else {
                            l6Var.f2338y = new Object[Math.max(i6, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size3 = list2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    Object obj = list2.get(i10);
                    if (obj != null) {
                        list.add(obj);
                    } else {
                        l5.a(size2, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    l5.a(size2, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public final byte[] a() {
        try {
            m5 m5Var = (m5) this;
            int k8 = m5Var.k();
            byte[] bArr = new byte[k8];
            d5 d5Var = new d5(k8, bArr);
            m5Var.d(d5Var);
            if (k8 - d5Var.f2186d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public abstract int b(n6 n6Var);
}
