package m6;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8641x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f8642y;

    public /* synthetic */ b0(Context context, int i6) {
        this.f8641x = i6;
        this.f8642y = context;
    }

    @Override // ve.a
    public final Object invoke() {
        int i6 = this.f8641x;
        Context context = this.f8642y;
        switch (i6) {
            case 0:
                Bitmap.Config[] configArr = a7.f.f595a;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                throw new IllegalStateException("cacheDir == null");
            default:
                Bitmap.Config[] configArr2 = a7.f.f595a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                throw new IllegalStateException("cacheDir == null");
        }
    }
}
