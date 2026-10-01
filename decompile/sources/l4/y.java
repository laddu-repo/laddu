package l4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.internal.measurement.j5;
import java.io.Serializable;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f8206c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8207a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f8208b;

    public y(Context context, k0 navigatorProvider) {
        kotlin.jvm.internal.k.e(navigatorProvider, "navigatorProvider");
        this.f8207a = context;
        this.f8208b = navigatorProvider;
    }

    public static g c(TypedArray typedArray, Resources resources, int i6) {
        boolean z10;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        Class cls;
        g0 g0Var4;
        Object obj;
        g0 g0Var5;
        boolean z11;
        String str;
        boolean z12;
        g0 g0Var6;
        boolean z13 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f8206c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        g0 g0Var7 = g0.f8125c;
        g0 g0Var8 = g0.j;
        g0 g0Var9 = g0.f8137p;
        g0 g0Var10 = g0.f8134m;
        g0 g0Var11 = g0.f8129g;
        g0 g0Var12 = g0.f8126d;
        g0 g0Var13 = g0.f8128f;
        g0 g0Var14 = g0.f8133l;
        g0 g0Var15 = g0.f8136o;
        g0 g0Var16 = g0.f8131i;
        g0 g0Var17 = g0.f8124b;
        if (string != null) {
            g0Var2 = g0Var10;
            String resourcePackageName = resources.getResourcePackageName(i6);
            if ("integer".equals(string)) {
                z10 = z13;
                g0Var3 = g0Var17;
            } else {
                z10 = z13;
                if ("integer[]".equals(string)) {
                    g0Var3 = g0Var12;
                } else if ("List<Int>".equals(string)) {
                    g0Var3 = g0.f8127e;
                } else if ("long".equals(string)) {
                    g0Var3 = g0Var13;
                } else if ("long[]".equals(string)) {
                    g0Var3 = g0Var11;
                } else if ("List<Long>".equals(string)) {
                    g0Var3 = g0.f8130h;
                } else if ("boolean".equals(string)) {
                    g0Var3 = g0Var14;
                } else if ("boolean[]".equals(string)) {
                    g0Var3 = g0Var2;
                } else if ("List<Boolean>".equals(string)) {
                    g0Var3 = g0.f8135n;
                } else if ("string".equals(string)) {
                    g0Var3 = g0Var15;
                } else if ("string[]".equals(string)) {
                    g0Var3 = g0Var9;
                } else if ("List<String>".equals(string)) {
                    g0Var3 = g0.f8138q;
                } else if ("float".equals(string)) {
                    g0Var3 = g0Var16;
                } else if ("float[]".equals(string)) {
                    g0Var3 = g0Var8;
                } else if ("List<Float>".equals(string)) {
                    g0Var3 = g0.f8132k;
                } else {
                    g0Var3 = null;
                }
            }
            if (g0Var3 == null) {
                if ("reference".equals(string)) {
                    g0Var = g0Var13;
                    g0Var3 = g0Var7;
                } else if (string.length() == 0) {
                    g0Var3 = g0Var15;
                } else {
                    try {
                        g0Var = g0Var13;
                        if (df.u.H(string, ".", false) && resourcePackageName != null) {
                            str = resourcePackageName.concat(string);
                        } else {
                            str = string;
                        }
                        boolean z14 = df.u.z(string, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false);
                        if (z14) {
                            z12 = z14;
                            str = str.substring(0, str.length() - 2);
                            kotlin.jvm.internal.k.d(str, "substring(...)");
                        } else {
                            z12 = z14;
                        }
                        Class<?> cls2 = Class.forName(str);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            if (z12) {
                                g0Var6 = new c0(cls2);
                            } else {
                                g0Var6 = new d0(cls2);
                            }
                        } else if (Enum.class.isAssignableFrom(cls2) && !z12) {
                            g0Var6 = new b0(cls2);
                        } else if (Serializable.class.isAssignableFrom(cls2)) {
                            if (z12) {
                                g0Var6 = new e0(cls2);
                            } else {
                                g0Var6 = new f0(cls2);
                            }
                        } else {
                            g0Var6 = null;
                        }
                        if (g0Var6 != null) {
                            g0Var3 = g0Var6;
                        } else {
                            throw new IllegalArgumentException((str + " is not Serializable or Parcelable.").toString());
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
            g0Var = g0Var13;
        } else {
            z10 = z13;
            g0Var = g0Var13;
            g0Var2 = g0Var10;
            g0Var3 = null;
        }
        boolean z15 = true;
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (g0Var3 == g0Var7) {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    obj = Integer.valueOf(i10);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    obj = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + g0Var3.b() + ". Must be a reference to a resource.");
                }
                g0Var7 = g0Var3;
            } else {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    if (g0Var3 == null) {
                        obj = Integer.valueOf(i11);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + g0Var3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else {
                    if (g0Var3 == g0Var15) {
                        z15 = true;
                        obj = typedArray.getString(1);
                        g0Var7 = g0Var3;
                    } else {
                        z15 = true;
                        int i12 = typedValue.type;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    if (i12 != 18) {
                                        if (i12 >= 16 && i12 <= 31) {
                                            if (g0Var3 == g0Var16) {
                                                g0Var7 = j5.d(typedValue, g0Var3, g0Var16, string, "float");
                                                obj = Float.valueOf(typedValue.data);
                                            } else {
                                                g0Var7 = j5.d(typedValue, g0Var3, g0Var17, string, "integer");
                                                obj = Integer.valueOf(typedValue.data);
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        g0Var7 = j5.d(typedValue, g0Var3, g0Var14, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        obj = Boolean.valueOf(z11);
                                    }
                                } else {
                                    g0Var7 = j5.d(typedValue, g0Var3, g0Var17, string, "dimension");
                                    obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                                }
                            } else {
                                g0Var7 = j5.d(typedValue, g0Var3, g0Var16, string, "float");
                                obj = Float.valueOf(typedValue.getFloat());
                            }
                        } else {
                            String value = typedValue.string.toString();
                            if (g0Var3 == null) {
                                kotlin.jvm.internal.k.e(value, "value");
                                try {
                                    g0Var17.d(value);
                                    g0Var3 = g0Var17;
                                } catch (IllegalArgumentException unused) {
                                    g0Var4 = g0Var;
                                    try {
                                        try {
                                            try {
                                                g0Var4.d(value);
                                                g0Var3 = g0Var4;
                                            } catch (IllegalArgumentException unused2) {
                                                g0Var16.d(value);
                                                g0Var3 = g0Var16;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            g0Var14.d(value);
                                            g0Var3 = g0Var14;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        g0Var3 = g0Var15;
                                    }
                                }
                            }
                            g0Var4 = g0Var;
                            g0Var7 = g0Var3;
                            obj = g0Var7.d(value);
                        }
                    }
                    g0Var4 = g0Var;
                }
            }
            g0Var4 = g0Var;
            z15 = true;
        } else {
            cls = Serializable.class;
            g0Var4 = g0Var;
            g0Var7 = g0Var3;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z15 = false;
        }
        if (g0Var7 == null) {
            g0Var7 = null;
        }
        if (g0Var7 == null) {
            if (obj instanceof Integer) {
                g0Var16 = g0Var17;
            } else if (obj instanceof int[]) {
                g0Var16 = g0Var12;
            } else if (obj instanceof Long) {
                g0Var16 = g0Var4;
            } else if (obj instanceof long[]) {
                g0Var16 = g0Var11;
            } else if (!(obj instanceof Float)) {
                if (obj instanceof float[]) {
                    g0Var16 = g0Var8;
                } else if (obj instanceof Boolean) {
                    g0Var16 = g0Var14;
                } else if (obj instanceof boolean[]) {
                    g0Var16 = g0Var2;
                } else if (!(obj instanceof String) && obj != null) {
                    g0Var16 = null;
                } else {
                    g0Var16 = g0Var15;
                }
            }
            if (g0Var16 == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    g0Var5 = g0Var9;
                } else {
                    kotlin.jvm.internal.k.b(obj);
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.k.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            kotlin.jvm.internal.k.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            g0Var5 = new c0(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.k.b(componentType3);
                        if (cls.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            kotlin.jvm.internal.k.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            g0Var5 = new e0(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        g0Var5 = new d0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        g0Var5 = new b0(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        g0Var5 = new f0(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            } else {
                g0Var5 = g0Var16;
            }
            g0Var7 = g0Var5;
        }
        return new g(g0Var7, z10, obj, z15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0293, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l4.u a(android.content.res.Resources r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.y.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):l4.u");
    }

    public final v b(int i6) {
        int next;
        Resources resources = this.f8207a.getResources();
        XmlResourceParser xml = resources.getXml(i6);
        kotlin.jvm.internal.k.d(xml, "getXml(...)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i6) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            kotlin.jvm.internal.k.b(asAttributeSet);
            u a10 = a(resources, xml, asAttributeSet, i6);
            if (a10 instanceof v) {
                return (v) a10;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
