package k6;

import a8.g;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import androidx.lifecycle.k1;
import androidx.lifecycle.p1;
import b7.j;
import cg.h;
import com.unity3d.ads.metadata.MediationMetaData;
import he.i;
import ic.s;
import ie.l;
import j1.r;
import j1.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import l7.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final Bundle b(i... iVarArr) {
        Bundle bundle = new Bundle(iVarArr.length);
        for (i iVar : iVarArr) {
            String str = (String) iVar.f6076x;
            Object obj = iVar.f6077y;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                k.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static long d(double d10) {
        jb.b.d("not a normal value", e(d10));
        int exponent = Math.getExponent(d10);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean e(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }

    public static String f(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i6 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder q9 = r4.a.q("<", str2, " threw ");
                    q9.append(e10.getClass().getName());
                    q9.append(">");
                    sb2 = q9.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i6 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i6]);
            i11 = indexOf + 2;
            i6++;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i6 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static h7.a g(m7.b bVar, j jVar) {
        return new h7.a(0, p.a(bVar, jVar, 1.0f, l7.f.f8267y, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.b, e3.e] */
    public static h7.b h(m7.a aVar, j jVar, boolean z10) {
        float f3;
        if (z10) {
            f3 = n7.i.c();
        } else {
            f3 = 1.0f;
        }
        return new e3.e(p.a(aVar, jVar, f3, l7.f.f8268z, false), 2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l7.d0, v5.o, java.lang.Object] */
    public static h7.a i(m7.b bVar, j jVar, int i6) {
        ?? obj = new Object();
        obj.f13330x = i6;
        ArrayList a10 = p.a(bVar, jVar, 1.0f, obj, false);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            o7.a aVar = (o7.a) a10.get(i10);
            i7.c cVar = (i7.c) aVar.f10013b;
            i7.c cVar2 = (i7.c) aVar.f10014c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f6630a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f6630a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f3 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f10 = fArr3[i12];
                        if (f10 != f3) {
                            fArr3[i11] = f10;
                            i11++;
                            f3 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new o7.a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a10.set(i10, aVar);
        }
        return new h7.a(1, a10);
    }

    public static h7.a j(m7.a aVar, j jVar) {
        return new h7.a(2, p.a(aVar, jVar, 1.0f, l7.f.A, false));
    }

    public static h7.a k(m7.b bVar, j jVar) {
        return new h7.a(3, p.a(bVar, jVar, n7.i.c(), l7.f.C, true));
    }

    public static final List l(g5.c cVar) {
        int k8 = jb.b.k(cVar, "id");
        int k9 = jb.b.k(cVar, "seq");
        int k10 = jb.b.k(cVar, "from");
        int k11 = jb.b.k(cVar, "to");
        je.c h4 = g.h();
        while (cVar.X()) {
            h4.add(new d5.d(cVar.M(k10), cVar.M(k11), (int) cVar.getLong(k8), (int) cVar.getLong(k9)));
        }
        return ie.j.S(g.c(h4));
    }

    public static final d5.g m(g5.a aVar, String str, boolean z10) {
        String str2;
        g5.c d02 = aVar.d0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int k8 = jb.b.k(d02, "seqno");
            int k9 = jb.b.k(d02, "cid");
            int k10 = jb.b.k(d02, MediationMetaData.KEY_NAME);
            int k11 = jb.b.k(d02, "desc");
            if (k8 != -1 && k9 != -1 && k10 != -1 && k11 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (d02.X()) {
                    if (((int) d02.getLong(k9)) >= 0) {
                        int i6 = (int) d02.getLong(k8);
                        String M = d02.M(k10);
                        if (d02.getLong(k11) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i6), M);
                        linkedHashMap2.put(Integer.valueOf(i6), str2);
                    }
                }
                List T = ie.j.T(linkedHashMap.entrySet(), new h(1));
                ArrayList arrayList = new ArrayList(l.x(T, 10));
                Iterator it = T.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List Z = ie.j.Z(arrayList);
                List T2 = ie.j.T(linkedHashMap2.entrySet(), new h(2));
                ArrayList arrayList2 = new ArrayList(l.x(T2, 10));
                Iterator it2 = T2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                d5.g gVar = new d5.g(str, z10, Z, ie.j.Z(arrayList2));
                c9.a.c(d02, null);
                return gVar;
            }
            c9.a.c(d02, null);
            return null;
        } finally {
        }
    }

    public static k1 n(kotlin.jvm.internal.e eVar, p1 viewModelStore, o1.c extras, tg.a scope) {
        k.e(viewModelStore, "viewModelStore");
        k.e(extras, "extras");
        k.e(scope, "scope");
        s sVar = new s(viewModelStore, new xg.b(eVar, scope), extras);
        eVar.b();
        String b10 = eVar.b();
        if (b10 != null) {
            return sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), eVar);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final j6.c o(y yVar, Class cls) {
        boolean z10 = true;
        h8.c.o(1, "createMethod");
        int c10 = y.e.c(1);
        if (c10 != 0) {
            if (c10 == 1) {
                boolean z11 = false;
                if (yVar instanceof r) {
                    return new j6.a(z11, new j6.e(cls, yVar, 1), 1);
                }
                return new j6.b(false, new j6.e(cls, yVar, 2));
            }
            throw new RuntimeException();
        }
        j6.e eVar = new j6.e(cls, yVar, 0);
        if (yVar instanceof r) {
            return new j6.a(z10, eVar, 1);
        }
        return new j6.b(true, eVar);
    }

    public abstract void c(o7.b bVar, float f3, float f10);
}
