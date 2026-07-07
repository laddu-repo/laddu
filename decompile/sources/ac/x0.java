package ac;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f466b;

    public x0(k1 k1Var, l1 l1Var) {
        de.i.e(k1Var, "timeProvider");
        de.i.e(l1Var, "uuidGenerator");
        this.f465a = k1Var;
        this.f466b = l1Var;
    }

    public final q0 a(q0 q0Var) {
        String str;
        this.f466b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        de.i.d(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        de.i.d(string, "toString(...)");
        String lowerCase = ke.p.z(string, "-", "").toLowerCase(Locale.ROOT);
        de.i.d(lowerCase, "toLowerCase(...)");
        return new q0(lowerCase, (q0Var == null || (str = q0Var.f438b) == null) ? lowerCase : str, q0Var != null ? q0Var.f439c + 1 : 0, this.f465a.a().f414b);
    }
}
