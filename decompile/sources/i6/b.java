package i6;

import a6.h;
import a6.i;
import a6.j;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import j6.n;
import j6.p;
import j6.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6510a = w.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a6.a f6513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f6514e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f6515g;

    public b(int i, int i10, i iVar) {
        this.f6511b = i;
        this.f6512c = i10;
        this.f6513d = (a6.a) iVar.c(p.f);
        this.f6514e = (n) iVar.c(n.f6955g);
        h hVar = p.i;
        this.f = iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue();
        this.f6515g = (j) iVar.c(p.f6958g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f6510a.c(this.f6511b, this.f6512c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f6513d == a6.a.f151w) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f6511b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f6512c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f6514e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        j jVar = this.f6515g;
        if (jVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((jVar == j.f162v && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
