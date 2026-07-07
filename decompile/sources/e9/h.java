package e9;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4501a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4501a) {
            case 0:
                return 0L;
            case 1:
                return new PathMeasure();
            case 2:
                return new Path();
            case 3:
                return new Path();
            case 4:
                return new float[4];
            default:
                return new Random();
        }
    }
}
