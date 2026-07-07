package se;

import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f12300b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f12301c;

    /* renamed from: d, reason: collision with root package name */
    public int f12302d;

    @Override // se.f
    public final File a() {
        boolean z10 = this.f12300b;
        File file = this.f12303a;
        if (!z10) {
            this.f12300b = true;
            return file;
        }
        File[] fileArr = this.f12301c;
        if (fileArr != null && this.f12302d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f12301c = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f12301c;
        k.b(fileArr2);
        int i6 = this.f12302d;
        this.f12302d = i6 + 1;
        return fileArr2[i6];
    }
}
