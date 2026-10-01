package e1;

import a2.e1;
import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4172a;

    public m(Context context, int i6) {
        switch (i6) {
            case 1:
                this.f4172a = context;
                return;
            default:
                this.f4172a = context.getApplicationContext();
                return;
        }
    }

    @Override // e1.j
    public void a(a8.e eVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new e1(this, eVar, threadPoolExecutor, 6));
    }
}
