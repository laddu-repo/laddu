package sa;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k8.k2;
import va.s0;
import va.t0;
import va.u0;
import va.w0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f11668g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f11670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.g f11671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k2 f11672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ab.f f11673e;

    static {
        HashMap map = new HashMap();
        f = map;
        u5.a.e(5, map, "armeabi", 6, "armeabi-v7a");
        u5.a.e(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f11668g = "Crashlytics Android SDK/20.0.6";
    }

    public r(Context context, v vVar, ed.g gVar, k2 k2Var, ab.f fVar) {
        this.f11669a = context;
        this.f11670b = vVar;
        this.f11671c = gVar;
        this.f11672d = k2Var;
        this.f11673e = fVar;
    }

    public static t0 c(sb.p pVar, int i) {
        String str = (String) pVar.f11743x;
        String str2 = (String) pVar.f11742w;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVar.f11744y;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        sb.p pVar2 = (sb.p) pVar.f11745z;
        if (i >= 8) {
            sb.p pVar3 = pVar2;
            while (pVar3 != null) {
                pVar3 = (sb.p) pVar3.f11745z;
                i10++;
            }
        }
        int i11 = i10;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b9 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (pVar2 != null && i11 == 0) {
            t0VarC = c(pVar2, i + 1);
        }
        if (b9 == 1) {
            return new t0(str, str2, listD, t0VarC, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b9 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f13542e = i;
            w0Var.f = (byte) (w0Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f13538a = jMax;
            byte b9 = (byte) (w0Var.f | 1);
            w0Var.f = b9;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.f13539b = str;
            w0Var.f13540c = fileName;
            w0Var.f13541d = lineNumber;
            w0Var.f = (byte) (b9 | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b9 = (byte) 1;
        if (b9 == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b9 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }

    public final List a() {
        byte b9 = (byte) (((byte) (0 | 1)) | 2);
        ed.g gVar = this.f11671c;
        String str = (String) gVar.f4888e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = (String) gVar.f4885b;
        if (b9 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b9 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b9 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final va.b1 b(int r17) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.r.b(int):va.b1");
    }
}
