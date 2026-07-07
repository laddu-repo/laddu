package t7;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.mb;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends e implements r7.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Set f12353z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i, mb mbVar, r7.g gVar, r7.h hVar) {
        j0 j0VarA = j0.a(context);
        q7.e eVar = q7.e.f10906e;
        y.g(gVar);
        y.g(hVar);
        super(context, looper, j0VarA, eVar, i, new k4(gVar), new ka.c(hVar), (String) mbVar.f2891e);
        Set set = (Set) mbVar.f2889c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f12353z = set;
    }

    @Override // t7.e
    public final Account g() {
        return null;
    }

    @Override // t7.e
    public final Executor i() {
        return null;
    }

    @Override // t7.e
    public final Set l() {
        return this.f12353z;
    }
}
