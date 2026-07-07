package c6;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Exception {
    public static final StackTraceElement[] A = new StackTraceElement[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f2245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a6.f f2246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Class f2248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f2249z;

    public w(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof w) {
            Iterator it = ((w) th).f2245v.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void b(List list, v vVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            vVar.append("Cause (");
            int i10 = i + 1;
            vVar.append(String.valueOf(i10));
            vVar.append(" of ");
            vVar.append(String.valueOf(size));
            vVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof w) {
                ((w) th).e(vVar);
            } else {
                c(th, vVar);
            }
            i = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i));
            i = i10;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f2245v, new v(appendable));
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f2249z);
        String str2 = "";
        if (this.f2248y != null) {
            str = ", " + this.f2248y;
        } else {
            str = "";
        }
        sb2.append(str);
        int i = this.f2247x;
        sb2.append(i != 0 ? ", ".concat(j4.a.w(i)) : "");
        if (this.f2246w != null) {
            str2 = ", " + this.f2246w;
        }
        sb2.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Throwable th = (Throwable) obj;
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public w(String str, List list) {
        this.f2249z = str;
        setStackTrace(A);
        this.f2245v = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
