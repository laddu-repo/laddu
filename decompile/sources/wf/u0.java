package wf;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final uf.g[] f14398a = new uf.g[0];

    /* renamed from: b, reason: collision with root package name */
    public static final sf.a[] f14399b = new sf.a[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14400c = new Object();

    public static final a0 a(String str, sf.a aVar) {
        return new a0(str, new b0(aVar));
    }

    public static final Set b(uf.g gVar) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        if (gVar instanceof j) {
            return ((j) gVar).b();
        }
        HashSet hashSet = new HashSet(gVar.e());
        int e10 = gVar.e();
        for (int i6 = 0; i6 < e10; i6++) {
            hashSet.add(gVar.f(i6));
        }
        return hashSet;
    }

    public static final uf.g[] c(List list) {
        uf.g[] gVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (gVarArr = (uf.g[]) list.toArray(new uf.g[0])) != null) {
            return gVarArr;
        }
        return f14398a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:112|113))|(5:107|108|109|(8:81|82|(1:(3:84|(1:102)(1:(1:90)(2:87|88))|89)(2:103|(1:105)))|91|(1:101)(1:95)|96|(1:98)|100)|(1:70)(2:71|(1:77)(2:79|80)))|65|(1:67)|81|82|(2:(0)(0)|89)|91|(1:93)|101|96|(0)|100|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0100, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00b6, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a A[Catch: NoSuchFieldException -> 0x0182, TryCatch #1 {NoSuchFieldException -> 0x0182, blocks: (B:82:0x015c, B:84:0x016a, B:93:0x0189, B:95:0x018f, B:96:0x0195, B:98:0x0199, B:89:0x017f), top: B:81:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199 A[Catch: NoSuchFieldException -> 0x0182, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x0182, blocks: (B:82:0x015c, B:84:0x016a, B:93:0x0189, B:95:0x018f, B:96:0x0195, B:98:0x0199, B:89:0x017f), top: B:81:0x015c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final sf.a d(java.lang.Class r17, sf.a... r18) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.u0.d(java.lang.Class, sf.a[]):sf.a");
    }

    public static final int e(uf.g gVar, uf.g[] typeParams) {
        int i6;
        kotlin.jvm.internal.k.e(typeParams, "typeParams");
        int hashCode = (gVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        he.p pVar = new he.p(gVar);
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!pVar.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String a10 = ((uf.g) pVar.next()).a();
            if (a10 != null) {
                i12 = a10.hashCode();
            }
            i11 = i13 + i12;
        }
        he.p pVar2 = new he.p(gVar);
        while (pVar2.hasNext()) {
            int i14 = i10 * 31;
            a8.a kind = ((uf.g) pVar2.next()).getKind();
            if (kind != null) {
                i6 = kind.hashCode();
            } else {
                i6 = 0;
            }
            i10 = i14 + i6;
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }

    public static final sf.a f(Object obj, sf.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i6 = 0; i6 < length; i6++) {
                    clsArr2[i6] = sf.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof sf.a) {
                return (sf.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e10.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e10;
        }
    }

    public static final String g(bf.d dVar) {
        kotlin.jvm.internal.k.e(dVar, "<this>");
        String c10 = ((kotlin.jvm.internal.e) dVar).c();
        if (c10 == null) {
            c10 = "<local class name not available>";
        }
        return h8.c.m("Serializer for class '", c10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void h(int i6, int i10, uf.g descriptor) {
        String str;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i6) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.f(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.k.e(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        throw new sf.b(arrayList, str, null);
    }

    public static final void i(String str, kotlin.jvm.internal.e eVar) {
        String sb2;
        String str2 = "in the polymorphic scope of '" + eVar.c() + '\'';
        if (str == null) {
            sb2 = w8.k.b('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sb3 = new StringBuilder("Serializer for subclass '");
            sb3.append(str);
            sb3.append("' is not found ");
            sb3.append(str2);
            sb3.append(".\nCheck if class with serial name '");
            r4.a.u(sb3, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb3.append(eVar.c());
            sb3.append("' has to be sealed and '@Serializable'.");
            sb2 = sb3.toString();
        }
        throw new IllegalArgumentException(sb2);
    }

    public static final String j(uf.g gVar) {
        return ie.j.L(android.support.v4.media.session.b.w(0, gVar.e()), ", ", gVar.a() + '(', ")", new cf.n(gVar, 18), 24);
    }
}
