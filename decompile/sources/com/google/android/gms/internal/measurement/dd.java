package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc f2570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f2571b;

    public dd(qc qcVar, ke keVar) {
        this.f2570a = qcVar;
        this.f2571b = keVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dd) {
            dd ddVar = (dd) obj;
            qc qcVar = ddVar.f2570a;
            qc qcVar2 = this.f2570a;
            if (qcVar2 != null ? qcVar2.equals(qcVar) : qcVar == null) {
                if (this.f2571b.equals(ddVar.f2571b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        qc qcVar = this.f2570a;
        return (((qcVar == null ? 0 : qcVar.hashCode()) ^ 1000003) * 1000003) ^ this.f2571b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2570a);
        String string = this.f2571b.toString();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        j4.a.s(sb2, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb2.append("}");
        return sb2.toString();
    }
}
