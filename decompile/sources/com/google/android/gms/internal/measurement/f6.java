package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2209a;

    static {
        char[] cArr = new char[80];
        f2209a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i6, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i6, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(sb2, i6);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            c5 c5Var = c5.f2166z;
            sb2.append(a8.f.W(new c5(((String) obj).getBytes(t5.f2444a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof c5) {
            sb2.append(": \"");
            sb2.append(a8.f.W((c5) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof m5) {
            sb2.append(" {");
            b((m5) obj, sb2, i6 + 2);
            sb2.append("\n");
            c(sb2, i6);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i11 = i6 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i11, "key", entry.getKey());
            a(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            c(sb2, i6);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    public static void b(m5 m5Var, StringBuilder sb2, int i6) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = m5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i6, substring.substring(0, substring.length() - 4), m5.n(method2, m5Var, new Object[0]));
                    i10 = 3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i6, substring.substring(0, substring.length() - 3), m5.n(method, m5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n10 = m5.n(method4, m5Var, new Object[0]);
                    if (method5 == null) {
                        if (n10 instanceof Boolean) {
                            if (!((Boolean) n10).booleanValue()) {
                            }
                            a(sb2, i6, substring, n10);
                        } else if (n10 instanceof Integer) {
                            if (((Integer) n10).intValue() == 0) {
                            }
                            a(sb2, i6, substring, n10);
                        } else if (n10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) n10).floatValue()) == 0) {
                            }
                            a(sb2, i6, substring, n10);
                        } else if (n10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) n10).doubleValue()) == 0) {
                            }
                            a(sb2, i6, substring, n10);
                        } else {
                            if (n10 instanceof String) {
                                equals = n10.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else if (n10 instanceof c5) {
                                equals = n10.equals(c5.f2166z);
                            } else if (n10 instanceof v4) {
                                if (n10 == ((m5) ((m5) ((v4) n10)).o(6))) {
                                }
                                a(sb2, i6, substring, n10);
                            } else {
                                if ((n10 instanceof Enum) && ((Enum) n10).ordinal() == 0) {
                                }
                                a(sb2, i6, substring, n10);
                            }
                            if (equals) {
                            }
                            a(sb2, i6, substring, n10);
                        }
                    } else {
                        if (!((Boolean) m5.n(method5, m5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i6, substring, n10);
                    }
                }
            }
            i10 = 3;
        }
        t6 t6Var = m5Var.zzc;
        if (t6Var != null) {
            for (int i12 = 0; i12 < t6Var.f2447a; i12++) {
                a(sb2, i6, String.valueOf(t6Var.f2448b[i12] >>> 3), t6Var.f2449c[i12]);
            }
        }
    }

    public static void c(StringBuilder sb2, int i6) {
        while (i6 > 0) {
            int i10 = 80;
            if (i6 <= 80) {
                i10 = i6;
            }
            sb2.append(f2209a, 0, i10);
            i6 -= i10;
        }
    }
}
