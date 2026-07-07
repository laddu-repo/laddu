package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k7.c;
import v5.f;
import v5.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends i {
    @Override // v5.i
    public final f a(ArrayList arrayList) {
        Object newInstance;
        Object newInstance2;
        c cVar = new c(29);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            for (Map.Entry entry : Collections.unmodifiableMap(((f) obj).f13319a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj2 = hashMap.get(str);
                if (obj2 == null) {
                    if (!cls.isArray()) {
                        newInstance2 = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance2, 0, value);
                        value = newInstance2;
                        hashMap.put(str, value);
                    } else {
                        hashMap.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj2);
                            int length2 = Array.getLength(value);
                            Object newInstance3 = Array.newInstance(obj2.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj2, 0, newInstance3, 0, length);
                            System.arraycopy(value, 0, newInstance3, length, length2);
                            value = newInstance3;
                        } else {
                            newInstance2 = Array.newInstance(obj2.getClass(), 2);
                            Array.set(newInstance2, 0, obj2);
                            Array.set(newInstance2, 1, value);
                            value = newInstance2;
                        }
                    } else {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length3 = Array.getLength(obj2);
                            newInstance = Array.newInstance(value.getClass(), length3 + 1);
                            System.arraycopy(obj2, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            int length4 = Array.getLength(value);
                            newInstance = Array.newInstance(obj2.getClass(), length4 + 1);
                            System.arraycopy(value, 0, newInstance, 0, length4);
                            Array.set(newInstance, length4, obj2);
                        } else {
                            throw new IllegalArgumentException();
                        }
                        value = newInstance;
                    }
                    hashMap.put(str, value);
                }
            }
        }
        cVar.B(hashMap);
        f fVar = new f((HashMap) cVar.f7745y);
        f.b(fVar);
        return fVar;
    }
}
