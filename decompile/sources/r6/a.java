package r6;

import java.io.File;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11839a;

    public a(boolean z10) {
        this.f11839a = z10;
    }

    @Override // r6.b
    public final String a(Object obj, o oVar) {
        File file = (File) obj;
        if (this.f11839a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
