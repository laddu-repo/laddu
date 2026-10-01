package q7;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f10940d = new t(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f10943c;

    public t(boolean z2, String str, Exception exc) {
        this.f10941a = z2;
        this.f10942b = str;
        this.f10943c = exc;
    }

    public static t b(String str) {
        return new t(false, str, null);
    }

    public static t c(String str, Exception exc) {
        return new t(false, str, exc);
    }

    public String a() {
        return this.f10942b;
    }
}
