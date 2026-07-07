package me;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce.q f8715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f8717e;

    public o(Object obj, e eVar, ce.q qVar, Object obj2, Throwable th) {
        this.f8713a = obj;
        this.f8714b = eVar;
        this.f8715c = qVar;
        this.f8716d = obj2;
        this.f8717e = th;
    }

    public static o a(o oVar, e eVar, CancellationException cancellationException, int i) {
        Object obj = oVar.f8713a;
        if ((i & 2) != 0) {
            eVar = oVar.f8714b;
        }
        e eVar2 = eVar;
        ce.q qVar = oVar.f8715c;
        Object obj2 = oVar.f8716d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = oVar.f8717e;
        }
        return new o(obj, eVar2, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return de.i.a(this.f8713a, oVar.f8713a) && de.i.a(this.f8714b, oVar.f8714b) && de.i.a(this.f8715c, oVar.f8715c) && de.i.a(this.f8716d, oVar.f8716d) && de.i.a(this.f8717e, oVar.f8717e);
    }

    public final int hashCode() {
        Object obj = this.f8713a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f8714b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ce.q qVar = this.f8715c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f8716d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8717e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8713a + ", cancelHandler=" + this.f8714b + ", onCancellation=" + this.f8715c + ", idempotentResume=" + this.f8716d + ", cancelCause=" + this.f8717e + ')';
    }

    public /* synthetic */ o(Object obj, e eVar, ce.q qVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : eVar, (i & 4) != 0 ? null : qVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
