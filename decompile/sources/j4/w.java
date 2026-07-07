package j4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class w extends v {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, j4.d0] */
    @Override // j4.u
    public final d0 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo;
        String packageName;
        String packageName2;
        int pid;
        int uid;
        currentControllerInfo = this.f7208a.getCurrentControllerInfo();
        ?? obj = new Object();
        packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                packageName2 = currentControllerInfo.getPackageName();
                pid = currentControllerInfo.getPid();
                uid = currentControllerInfo.getUid();
                obj.f7163a = new f0(packageName2, pid, uid);
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override // j4.u
    public final void d(d0 d0Var) {
    }
}
