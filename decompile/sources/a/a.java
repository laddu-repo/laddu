package a;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.a1;
import com.google.android.gms.internal.measurement.a4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import df.m;
import fd.z;
import h8.c;
import he.n;
import ie.i;
import ie.r;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.f;
import jf.h;
import jf.k;
import jf.l;
import jf.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.x;
import o5.e0;
import okhttp3.HttpUrl;
import sf.d;
import u1.a0;
import uf.g;
import uf.j;
import wf.b1;
import wf.c1;
import wf.i1;
import wf.o0;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    public static int A(Parcel parcel, int i6) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String B(Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str = "null";
            } else {
                try {
                    str = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    str = "<" + str2 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i10] = str;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + 29);
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i6 >= length2 || (indexOf = "expected a non-null reference".indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) "expected a non-null reference", i11, indexOf);
            sb2.append(objArr[i6]);
            i6++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) "expected a non-null reference", i11, 29);
        if (i6 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void C(Parcel parcel, int i6) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(dataPosition - i6);
        parcel.setDataPosition(dataPosition);
    }

    public static void D(Parcel parcel, int i6, int i10) {
        parcel.writeInt(i6 | (i10 << 16));
    }

    public static h a(int i6, int i10, jf.a aVar) {
        int i11 = i10 & 2;
        jf.a aVar2 = jf.a.f7436x;
        if (i11 != 0) {
            aVar = aVar2;
        }
        if (i6 != -2) {
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != Integer.MAX_VALUE) {
                        if (aVar == aVar2) {
                            return new h(i6);
                        }
                        return new s(i6, aVar);
                    }
                    return new h(Integer.MAX_VALUE);
                }
                if (aVar == aVar2) {
                    return new h(0);
                }
                return new s(1, aVar);
            }
            if (aVar == aVar2) {
                return new s(1, jf.a.f7437y);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (aVar == aVar2) {
            l.f7473k.getClass();
            return new h(k.f7472b);
        }
        return new s(1, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = o(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = c(r8, r9, r10)
            boolean r1 = c(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = o(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean c(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final uf.h d(String str, g[] gVarArr, ve.l lVar) {
        if (!m.S(str)) {
            uf.a aVar = new uf.a(str);
            lVar.invoke(aVar);
            return new uf.h(str, j.f13136f, aVar.f13106b.size(), i.q0(gVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final uf.h e(String serialName, a8.a aVar, g[] gVarArr, ve.l lVar) {
        kotlin.jvm.internal.k.e(serialName, "serialName");
        if (!m.S(serialName)) {
            if (!aVar.equals(j.f13136f)) {
                uf.a aVar2 = new uf.a(serialName);
                lVar.invoke(aVar2);
                return new uf.h(serialName, aVar, aVar2.f13106b.size(), i.q0(gVarArr), aVar2);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static uf.h f(String serialName, a8.a aVar, g[] gVarArr) {
        kotlin.jvm.internal.k.e(serialName, "serialName");
        if (!m.S(serialName)) {
            if (!aVar.equals(j.f13136f)) {
                uf.a aVar2 = new uf.a(serialName);
                return new uf.h(serialName, aVar, aVar2.f13106b.size(), i.q0(gVarArr), aVar2);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static void g(int i6) {
        if (2 <= i6 && i6 < 37) {
            return;
        }
        StringBuilder n10 = c.n(i6, "radix ", " was not in valid range ");
        n10.append(new af.a(2, 36, 1));
        throw new IllegalArgumentException(n10.toString());
    }

    public static int h(char c10) {
        g(16);
        int digit = Character.digit((int) c10, 16);
        Integer valueOf = Integer.valueOf(digit);
        if (digit < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=16");
    }

    public static final boolean i(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static z j(a1 a1Var) {
        String str;
        Integer num;
        int i6;
        Boolean bool;
        Parcelable[] parcelableArr;
        Serializable serializable;
        String str2;
        Parcelable[] parcelableArr2;
        if (a1Var.a("slug")) {
            str = (String) a1Var.b("slug");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"slug\" is marked as non-null but was passed a null value");
            }
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = str;
        if (a1Var.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            num = (Integer) a1Var.b(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            if (num == null) {
                throw new IllegalArgumentException("Argument \"type\" of type integer does not support null values");
            }
        } else {
            num = 1;
        }
        if (a1Var.a("selected")) {
            i6 = (Integer) a1Var.b("selected");
            if (i6 == null) {
                throw new IllegalArgumentException("Argument \"selected\" of type integer does not support null values");
            }
        } else {
            i6 = 0;
        }
        if (a1Var.a("isLive")) {
            bool = (Boolean) a1Var.b("isLive");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isLive\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.FALSE;
        }
        String str4 = null;
        if (a1Var.a("related")) {
            Parcelable[] parcelableArr3 = (Parcelable[]) a1Var.b("related");
            if (parcelableArr3 != null) {
                ArrayList arrayList = new ArrayList(parcelableArr3.length);
                for (Parcelable parcelable : parcelableArr3) {
                    kotlin.jvm.internal.k.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                    arrayList.add(parcelable);
                }
                parcelableArr2 = (Parcelable[]) arrayList.toArray(new Parcelable[0]);
            } else {
                parcelableArr2 = null;
            }
            parcelableArr = parcelableArr2;
        } else {
            parcelableArr = null;
        }
        if (a1Var.a("headers")) {
            if (!Parcelable.class.isAssignableFrom(Serializable.class) && !Serializable.class.isAssignableFrom(Serializable.class)) {
                throw new UnsupportedOperationException(Serializable.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            serializable = (Serializable) a1Var.b("headers");
        } else {
            serializable = null;
        }
        if (a1Var.a("dt")) {
            str2 = (String) a1Var.b("dt");
        } else {
            str2 = null;
        }
        if (a1Var.a("dl")) {
            str4 = (String) a1Var.b("dl");
        }
        return new z(str3, num.intValue(), i6.intValue(), bool.booleanValue(), parcelableArr, serializable, str2, str4);
    }

    public static w1.l k(int i6) {
        String str = a0.f12750a;
        Locale locale = Locale.US;
        return new w1.l(Uri.parse("rtp://0.0.0.0:" + i6));
    }

    public static final int l(int i6, int i10, int i11) {
        if (i11 > 0) {
            if (i6 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i6 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else if (i11 < 0) {
            if (i6 > i10) {
                int i15 = -i11;
                int i16 = i6 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i10;
    }

    public static boolean m(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        int i10 = rect.top;
                        int i11 = rect2.top;
                        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 > i15 || rect.top >= i15) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if ((i16 > i17 || rect.left >= i17) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static boolean n(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static int o(int i6, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        i10 = rect2.top;
                        i11 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i10 = rect2.left;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect2.bottom;
            }
        } else {
            i10 = rect.left;
            i11 = rect2.right;
        }
        return Math.max(0, i10 - i11);
    }

    public static int p(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final Class q(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            kotlin.jvm.internal.k.d(rawType, "getRawType(...)");
            return q(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.k.d(upperBounds, "getUpperBounds(...)");
            Object l02 = i.l0(upperBounds);
            kotlin.jvm.internal.k.d(l02, "first(...)");
            return q((Type) l02);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.k.d(genericComponentType, "getGenericComponentType(...)");
            return q(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + x.a(type.getClass()));
    }

    public static final sf.a r(e0 e0Var, Class cls, List list) {
        sf.a[] aVarArr = (sf.a[]) list.toArray(new sf.a[0]);
        sf.a d10 = u0.d(cls, (sf.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (d10 != null) {
            return d10;
        }
        e a10 = x.a(cls);
        f fVar = b1.f14299a;
        sf.a aVar = (sf.a) b1.f14299a.get(a10);
        if (aVar == null) {
            e0Var.getClass();
            if (cls.isInterface()) {
                return new d(x.a(cls));
            }
            return null;
        }
        return aVar;
    }

    public static final sf.a s(e0 e0Var, Type type, boolean z10) {
        ArrayList arrayList;
        sf.a s;
        sf.a s7;
        bf.d dVar;
        int i6 = 0;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                kotlin.jvm.internal.k.d(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) i.l0(upperBounds);
            }
            kotlin.jvm.internal.k.b(genericComponentType);
            if (z10) {
                s7 = s1.c.v(e0Var, genericComponentType);
            } else {
                kotlin.jvm.internal.k.e(e0Var, "<this>");
                s7 = s(e0Var, genericComponentType, false);
                if (s7 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                kotlin.jvm.internal.k.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                dVar = x.a((Class) rawType);
            } else if (genericComponentType instanceof bf.d) {
                dVar = (bf.d) genericComponentType;
            } else {
                throw new IllegalStateException("unsupported type in GenericArray: " + x.a(genericComponentType.getClass()));
            }
            kotlin.jvm.internal.k.c(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new c1(dVar, s7);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
                Class<?> componentType = cls.getComponentType();
                kotlin.jvm.internal.k.d(componentType, "getComponentType(...)");
                if (z10) {
                    s = s1.c.v(e0Var, componentType);
                } else {
                    kotlin.jvm.internal.k.e(e0Var, "<this>");
                    s = s(e0Var, componentType, false);
                    if (s == null) {
                        return null;
                    }
                }
                return new c1(x.a(componentType), s);
            }
            return r(e0Var, cls, r.f6846x);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType2 = parameterizedType.getRawType();
            kotlin.jvm.internal.k.c(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls2 = (Class) rawType2;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.k.b(actualTypeArguments);
            if (z10) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    kotlin.jvm.internal.k.b(type2);
                    arrayList.add(s1.c.v(e0Var, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    kotlin.jvm.internal.k.b(type3);
                    kotlin.jvm.internal.k.e(e0Var, "<this>");
                    sf.a s10 = s(e0Var, type3, false);
                    if (s10 == null) {
                        return null;
                    }
                    arrayList.add(s10);
                }
            }
            if (Set.class.isAssignableFrom(cls2)) {
                sf.a elementSerializer = (sf.a) arrayList.get(0);
                kotlin.jvm.internal.k.e(elementSerializer, "elementSerializer");
                return new wf.c(elementSerializer, 1);
            }
            if (!List.class.isAssignableFrom(cls2) && !Collection.class.isAssignableFrom(cls2)) {
                if (Map.class.isAssignableFrom(cls2)) {
                    return a4.a((sf.a) arrayList.get(0), (sf.a) arrayList.get(1));
                }
                if (Map.Entry.class.isAssignableFrom(cls2)) {
                    sf.a keySerializer = (sf.a) arrayList.get(0);
                    sf.a valueSerializer = (sf.a) arrayList.get(1);
                    kotlin.jvm.internal.k.e(keySerializer, "keySerializer");
                    kotlin.jvm.internal.k.e(valueSerializer, "valueSerializer");
                    return new o0(keySerializer, valueSerializer, 0);
                }
                if (he.i.class.isAssignableFrom(cls2)) {
                    sf.a keySerializer2 = (sf.a) arrayList.get(0);
                    sf.a valueSerializer2 = (sf.a) arrayList.get(1);
                    kotlin.jvm.internal.k.e(keySerializer2, "keySerializer");
                    kotlin.jvm.internal.k.e(valueSerializer2, "valueSerializer");
                    return new o0(keySerializer2, valueSerializer2, 1);
                }
                if (n.class.isAssignableFrom(cls2)) {
                    sf.a aSerializer = (sf.a) arrayList.get(0);
                    sf.a bSerializer = (sf.a) arrayList.get(1);
                    sf.a cSerializer = (sf.a) arrayList.get(2);
                    kotlin.jvm.internal.k.e(aSerializer, "aSerializer");
                    kotlin.jvm.internal.k.e(bSerializer, "bSerializer");
                    kotlin.jvm.internal.k.e(cSerializer, "cSerializer");
                    return new i1(aSerializer, bSerializer, cSerializer);
                }
                ArrayList arrayList2 = new ArrayList(ie.l.x(arrayList, 10));
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    sf.a aVar = (sf.a) obj;
                    kotlin.jvm.internal.k.c(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(aVar);
                }
                return r(e0Var, cls2, arrayList2);
            }
            sf.a elementSerializer2 = (sf.a) arrayList.get(0);
            kotlin.jvm.internal.k.e(elementSerializer2, "elementSerializer");
            return new wf.c(elementSerializer2, 0);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.k.d(upperBounds2, "getUpperBounds(...)");
            Object l02 = i.l0(upperBounds2);
            kotlin.jvm.internal.k.d(l02, "first(...)");
            return s(e0Var, (Type) l02, true);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + x.a(type.getClass()));
    }

    public static void t(Parcel parcel, int i6, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int A = A(parcel, i6);
        parcel.writeBundle(bundle);
        C(parcel, A);
    }

    public static void u(Parcel parcel, int i6, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int A = A(parcel, i6);
        parcel.writeStrongBinder(iBinder);
        C(parcel, A);
    }

    public static void v(Parcel parcel, int i6, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int A = A(parcel, i6);
        parcelable.writeToParcel(parcel, i10);
        C(parcel, A);
    }

    public static void w(Parcel parcel, int i6, String str) {
        if (str == null) {
            return;
        }
        int A = A(parcel, i6);
        parcel.writeString(str);
        C(parcel, A);
    }

    public static void x(Parcel parcel, int i6, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int A = A(parcel, i6);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        C(parcel, A);
    }

    public static void y(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int A = A(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        C(parcel, A);
    }

    public static int z(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 != 4) {
            return 0;
        }
        return 5;
    }
}
