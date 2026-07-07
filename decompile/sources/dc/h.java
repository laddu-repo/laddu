package dc;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f4480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f4481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f4482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f4484e;

    public /* synthetic */ h(int i, Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        if (31 != (i & 31)) {
            af.k.a(i, 31, f.f4479a.d());
            throw null;
        }
        this.f4480a = bool;
        this.f4481b = d10;
        this.f4482c = num;
        this.f4483d = num2;
        this.f4484e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return de.i.a(this.f4480a, hVar.f4480a) && de.i.a(this.f4481b, hVar.f4481b) && de.i.a(this.f4482c, hVar.f4482c) && de.i.a(this.f4483d, hVar.f4483d) && de.i.a(this.f4484e, hVar.f4484e);
    }

    public final int hashCode() {
        Boolean bool = this.f4480a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f4481b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f4482c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4483d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f4484e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f4480a + ", sessionSamplingRate=" + this.f4481b + ", sessionTimeoutSeconds=" + this.f4482c + ", cacheDurationSeconds=" + this.f4483d + ", cacheUpdatedTimeSeconds=" + this.f4484e + ')';
    }

    public h(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f4480a = bool;
        this.f4481b = d10;
        this.f4482c = num;
        this.f4483d = num2;
        this.f4484e = l10;
    }
}
