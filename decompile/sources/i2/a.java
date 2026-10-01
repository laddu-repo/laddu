package i2;

import android.graphics.Bitmap;
import y1.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f6276x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f6277y;

    public a(b bVar) {
        this.f6277y = bVar;
    }

    @Override // y1.j, y1.a
    public final void clear() {
        this.f6276x = null;
        super.clear();
    }

    @Override // y1.j
    public final void release() {
        this.f6277y.o(this);
    }
}
