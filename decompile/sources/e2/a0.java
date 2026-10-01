package e2;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f4549c;

    public a0(long j8) {
        this.f4549c = new LinkedHashMap(100, 0.75f, true);
        this.f4547a = j8;
    }

    public synchronized Object a(Object obj) {
        v6.i iVar;
        iVar = (v6.i) ((LinkedHashMap) this.f4549c).get(obj);
        return iVar != null ? iVar.f13225a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j8 = iB;
        if (j8 >= this.f4547a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f4548b += j8;
        }
        v6.i iVar = (v6.i) ((LinkedHashMap) this.f4549c).put(obj, obj2 == null ? null : new v6.i(iB, obj2));
        if (iVar != null) {
            this.f4548b -= (long) iVar.f13226b;
            if (!iVar.f13225a.equals(obj2)) {
                c(obj, iVar.f13225a);
            }
        }
        f(this.f4547a);
        return iVar != null ? iVar.f13225a : null;
    }

    public void e(Exception exc) {
        boolean z2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f4549c) == null) {
            this.f4549c = exc;
        }
        if (this.f4547a == -9223372036854775807L) {
            synchronized (d0.f4561n0) {
                z2 = d0.f4562p0 > 0;
            }
            if (!z2) {
                this.f4547a = 200 + jElapsedRealtime;
            }
        }
        long j8 = this.f4547a;
        if (j8 == -9223372036854775807L || jElapsedRealtime < j8) {
            this.f4548b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f4549c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f4549c;
        this.f4549c = null;
        this.f4547a = -9223372036854775807L;
        this.f4548b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void f(long j8) {
        while (this.f4548b > j8) {
            Iterator it = ((LinkedHashMap) this.f4549c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            v6.i iVar = (v6.i) entry.getValue();
            this.f4548b -= (long) iVar.f13226b;
            Object key = entry.getKey();
            it.remove();
            c(key, iVar.f13225a);
        }
    }

    public a0() {
        this.f4547a = -9223372036854775807L;
        this.f4548b = -9223372036854775807L;
    }

    public void c(Object obj, Object obj2) {
    }
}
