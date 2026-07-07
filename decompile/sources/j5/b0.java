package j5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f6813b;

    public b0(j jVar) {
        this.f6812a = jVar;
        this.f6813b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        j jVar = this.f6812a;
        if (jVar != null && jVar.equals(b0Var.f6812a)) {
            return true;
        }
        Throwable th = this.f6813b;
        if (th == null || b0Var.f6813b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6812a, this.f6813b});
    }

    public b0(Throwable th) {
        this.f6813b = th;
        this.f6812a = null;
    }
}
