package fd;

import android.os.Build;
import android.widget.Toast;
import com.playfy.tv.activities.SplashActivity;
import java.util.ArrayList;
import java.util.List;
import od.n0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements f.b {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5164x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f5165y;

    public /* synthetic */ b0(SplashActivity splashActivity, int i6) {
        this.f5164x = i6;
        this.f5165y = splashActivity;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [he.f, java.lang.Object] */
    @Override // f.b
    public final void g(Object obj) {
        boolean canRequestPackageInstalls;
        int i6 = this.f5164x;
        SplashActivity splashActivity = this.f5165y;
        switch (i6) {
            case 0:
                f.a result = (f.a) obj;
                bf.o[] oVarArr = SplashActivity.K;
                kotlin.jvm.internal.k.e(result, "result");
                if (Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = splashActivity.getPackageManager().canRequestPackageInstalls();
                    if (canRequestPackageInstalls) {
                        splashActivity.W();
                        return;
                    } else {
                        Toast.makeText(splashActivity, "App install permission required, for installing update!", 0).show();
                        return;
                    }
                }
                return;
            case 1:
                ((Boolean) obj).getClass();
                bf.o[] oVarArr2 = SplashActivity.K;
                ((n0) splashActivity.D.getValue()).f10131d.c("permissionChecked", Boolean.TRUE);
                return;
            default:
                f.a it = (f.a) obj;
                bf.o[] oVarArr3 = SplashActivity.K;
                kotlin.jvm.internal.k.e(it, "it");
                i.h hVar = splashActivity.G;
                if (hVar != null) {
                    hVar.dismiss();
                }
                splashActivity.G = null;
                List list = splashActivity.F;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (splashActivity.Y((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    splashActivity.V();
                    return;
                } else {
                    splashActivity.Z(arrayList);
                    return;
                }
        }
    }
}
