package rc;

import android.content.pm.PackageManager;
import com.livxow.tv.app.App;
import h.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f11362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f11363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f11364c = {"L29xNcm0kMGzLW5mjdehjMZi", "L29xNdDhfWScSYO=", "L29xNdZnjWPogBHhLW5ejc9qSF==", "L29xNck1g3DrfU5rkMVwL2PhLYZ5", "L29xNcPhSMZqSWyuNc11gMVqL2PskP9sgcncScIl", "fdFhL28hkBPij29ckMkmjcHhLW5ejc9qSJ5wLWDvSYVzLYG0kYZn", "L29xNc1qgcm1fU5hSYV3g3ZvL2PwkMIlSU5wjc8=", "L29xNc1qgcm1fU53fWSqLW5mgMn6SYO=", "L29xNc1qgcm1fU5hSYV3g3ZvL2PwkMIlST==", "L29xNdGmL2xmS2IsgcncScIlNcSlkMGmjcymfw==", "L29xNcI2LcPejc9qSJ53fWDmjBVngW8=", "LYGwNcklSYnsfBnlkMChj3DuL2PwkMIlST==", "L29xNck1g3DrfU5rkMVwL2PhLYZ5NdGlSW1qkW0=", "L29xNcIxLW51SWynSo5lSW1ikBIpL2PwkMIlST==", "L29xNcI2LcPejc9qSJ5wjc94aW1igb==", "L29xNc5nkMkijcuhjMZiaMe="};

    static {
        try {
            System.loadLibrary(a.a("45475a704a6e5a"));
            f11362a = false;
        } catch (UnsatisfiedLinkError unused) {
            f11363b = true;
        }
        try {
            System.loadLibrary(a.a("6e6c6d5a753932597545475a704a6e5a"));
            f11362a = false;
        } catch (UnsatisfiedLinkError unused2) {
            f11363b = true;
        }
        try {
            System.loadLibrary(a.a("30425861794e3263"));
            f11362a = false;
        } catch (UnsatisfiedLinkError unused3) {
            f11363b = true;
        }
    }

    public static void a(j jVar) {
        String string;
        App app = App.P;
        app.K = null;
        if (vc.a.j(jVar).getBoolean("is_tv", false)) {
            return;
        }
        PackageManager packageManager = jVar.getPackageManager();
        for (int i = 0; i < 16; i++) {
            try {
                string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(a.b(f11364c[i]), 0)).toString();
            } catch (PackageManager.NameNotFoundException unused) {
                string = null;
            }
            if (string != null) {
                app.K = string;
                return;
            }
        }
    }
}
