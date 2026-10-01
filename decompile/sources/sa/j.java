package sa;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.mb;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import k8.k2;
import va.c2;
import va.o0;
import va.p0;
import va.q0;
import va.r0;
import va.t0;
import va.u0;
import va.v0;
import va.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f11621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f11622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab.f f11623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11624e;

    public j(l lVar, long j8, Throwable th, Thread thread, ab.f fVar) {
        this.f11624e = lVar;
        this.f11620a = j8;
        this.f11621b = th;
        this.f11622c = thread;
        this.f11623d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Thread thread;
        long j8 = this.f11620a;
        long j9 = j8 / 1000;
        l lVar = this.f11624e;
        NavigableSet navigableSetC = ((ya.a) lVar.f11639m.f2889c).c();
        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return b8.h.o(null);
        }
        lVar.f11631c.b();
        mb mbVar = lVar.f11639m;
        mbVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        r rVar = (r) mbVar.f2888b;
        Context context = rVar.f11669a;
        int i = context.getResources().getConfiguration().orientation;
        k2 k2Var = rVar.f11672d;
        Stack stack = new Stack();
        for (Throwable cause = this.f11621b; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        sb.p pVar = null;
        while (!stack.isEmpty()) {
            Throwable th = (Throwable) stack.pop();
            pVar = new sb.p(th.getLocalizedMessage(), th.getClass().getName(), k2Var.m(th.getStackTrace()), pVar, 5);
        }
        sb.p pVar2 = pVar;
        o0 o0Var = new o0();
        o0Var.f13466b = "crash";
        o0Var.f13465a = j9;
        o0Var.f13470g = (byte) (o0Var.f13470g | 1);
        c2 c2VarD = pa.d.f10449b.d(context);
        int i10 = ((z0) c2VarD).f13564c;
        Boolean boolValueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList arrayListC = pa.d.c(context);
        byte b9 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVar2.f11744y;
        Thread thread2 = this.f11622c;
        String name = thread2.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b10 = (byte) 1;
        List listD = r.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b10 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
        }
        String str2 = str;
        arrayList.add(new v0(name, 4, listD));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key.equals(thread2)) {
                thread = thread2;
            } else {
                StackTraceElement[] stackTraceElementArrM = k2Var.m(entry.getValue());
                String name2 = key.getName();
                if (name2 == null) {
                    throw new NullPointerException("Null name");
                }
                List listD2 = r.d(stackTraceElementArrM, 0);
                if (listD2 == null) {
                    throw new NullPointerException("Null frames");
                }
                if (b10 != 1) {
                    StringBuilder sb3 = new StringBuilder();
                    if (b10 == 0) {
                        sb3.append(" importance");
                    }
                    throw new IllegalStateException(d0.d.m("Missing required properties:", sb3));
                }
                thread = thread2;
                arrayList.add(new v0(name2, 0, listD2));
            }
            thread2 = thread;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        t0 t0VarC = r.c(pVar2, 0);
        u0 u0VarE = r.e();
        List listA = rVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        r0 r0Var = new r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b9 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b9 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(d0.d.m("Missing required properties:", sb4));
        }
        o0Var.f13467c = new q0(r0Var, null, null, boolValueOf, c2VarD, arrayListC, i);
        o0Var.f13468d = rVar.b(i);
        p0 p0VarA = o0Var.a();
        ua.e eVar = (ua.e) mbVar.f2891e;
        ya.c cVar = (ya.c) mbVar.f;
        ((ya.a) mbVar.f2889c).d(mb.b(mb.a(p0VarA, eVar, cVar, pd.q.f10552v), cVar), str2, true);
        try {
            ya.c cVar2 = lVar.f11634g;
            String str3 = ".ae" + j8;
            cVar2.getClass();
            if (!new File((File) cVar2.f14650x, str3).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        ab.f fVar = this.f11623d;
        lVar.b(false, fVar, false);
        lVar.c(new d().f11607a, Boolean.FALSE);
        if (!lVar.f11630b.b()) {
            return b8.h.o(null);
        }
        o8.o oVar = ((o8.h) ((AtomicReference) fVar.i).get()).f9963a;
        ta.b bVar = lVar.f11633e.f12520a;
        ka.c cVar3 = new ka.c();
        cVar3.f7872v = this;
        return oVar.k(bVar, cVar3);
    }
}
