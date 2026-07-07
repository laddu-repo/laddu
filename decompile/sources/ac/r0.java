package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f443b;

    public r0(y0 y0Var, b bVar) {
        this.f442a = y0Var;
        this.f443b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f442a.equals(r0Var.f442a) && this.f443b.equals(r0Var.f443b);
    }

    public final int hashCode() {
        return this.f443b.hashCode() + ((this.f442a.hashCode() + (n.f429w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.f429w + ", sessionData=" + this.f442a + ", applicationInfo=" + this.f443b + ')';
    }
}
