package se;

import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f12295b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f12296c;

    /* renamed from: d, reason: collision with root package name */
    public int f12297d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12298e;

    @Override // se.f
    public final File a() {
        boolean z10 = this.f12298e;
        File file = this.f12303a;
        if (!z10 && this.f12296c == null) {
            File[] listFiles = file.listFiles();
            this.f12296c = listFiles;
            if (listFiles == null) {
                this.f12298e = true;
            }
        }
        File[] fileArr = this.f12296c;
        if (fileArr != null && this.f12297d < fileArr.length) {
            k.b(fileArr);
            int i6 = this.f12297d;
            this.f12297d = i6 + 1;
            return fileArr[i6];
        }
        if (!this.f12295b) {
            this.f12295b = true;
            return file;
        }
        return null;
    }
}
