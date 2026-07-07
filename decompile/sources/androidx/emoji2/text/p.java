package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f926a;

    public p(Context context, int i) {
        switch (i) {
            case 1:
                t7.y.g(context);
                Context applicationContext = context.getApplicationContext();
                t7.y.g(applicationContext);
                this.f926a = applicationContext;
                break;
            case 2:
                this.f926a = context;
                break;
            default:
                this.f926a = context.getApplicationContext();
                break;
        }
    }

    @Override // androidx.emoji2.text.l
    public void a(p4.v vVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n(this, vVar, threadPoolExecutor, 0));
    }

    public ApplicationInfo b(int i, String str) {
        return this.f926a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return this.f926a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f926a;
        if (callingUid == iMyUid) {
            return z7.b.F(context);
        }
        if (!x7.b.d() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
