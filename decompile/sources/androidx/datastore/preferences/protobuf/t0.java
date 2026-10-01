package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f861d;

    public t0(v vVar, String str, Object[] objArr) {
        this.f858a = vVar;
        this.f859b = str;
        this.f860c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f861d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f861d = i | (cCharAt2 << i10);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i = this.f861d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
