package com.unity3d.ads.core.extensions;

import cf.c;
import cf.d;
import cf.e;
import cf.j;
import cf.l;
import cf.o;
import com.unity3d.services.SDKErrorHandler;
import df.m;
import java.io.PrintWriter;
import java.io.StringWriter;
import jb.b;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i6) {
        j cVar;
        k.e(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    k.d(stringWriter2, "stringWriter.toString()");
                    String obj = m.n0(stringWriter2).toString();
                    k.e(obj, "<this>");
                    j oVar = new o(obj, 1);
                    if (i6 >= 0) {
                        if (i6 == 0) {
                            cVar = e.f2054a;
                        } else if (oVar instanceof d) {
                            cVar = ((d) oVar).a(i6);
                        } else {
                            cVar = new c(oVar, i6, 1);
                        }
                        String N = l.N(cVar, "\n");
                        printWriter.close();
                        stringWriter.close();
                        return N;
                    }
                    throw new IllegalArgumentException(h8.c.j(i6, "Requested element count ", " is less than zero.").toString());
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.j(printWriter, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    b.j(stringWriter, th4);
                    throw th5;
                }
            }
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 15;
        }
        return getShortenedStackTrace(th, i6);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z10;
        String className;
        k.e(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        k.d(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                stackTraceElement = stackTrace[i6];
                if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                    z10 = m.I(className, SDKErrorHandler.UNITY_PACKAGE, false);
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i6++;
            } else {
                stackTraceElement = null;
                break;
            }
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}
