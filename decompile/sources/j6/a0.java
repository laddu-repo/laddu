package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements c6.b0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f6924w;

    public /* synthetic */ a0(int i, Object obj) {
        this.f6923v = i;
        this.f6924w = obj;
    }

    @Override // c6.b0
    public final int b() {
        switch (this.f6923v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return v6.m.c((Bitmap) this.f6924w);
            case 1:
                return ((byte[]) this.f6924w).length;
            case 2:
                return v6.m.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f6924w).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f6924w).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // c6.b0
    public final Class d() {
        switch (this.f6923v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f6924w).getClass();
        }
    }

    @Override // c6.b0
    public final void e() {
        switch (this.f6923v) {
            case 2:
                ((AnimatedImageDrawable) this.f6924w).stop();
                ((AnimatedImageDrawable) this.f6924w).clearAnimationCallbacks();
                break;
        }
    }

    @Override // c6.b0
    public final Object get() {
        switch (this.f6923v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return (Bitmap) this.f6924w;
            case 1:
                return (byte[]) this.f6924w;
            case 2:
                return (AnimatedImageDrawable) this.f6924w;
            default:
                return (File) this.f6924w;
        }
    }

    public a0(byte[] bArr) {
        this.f6923v = 1;
        v6.f.c(bArr, "Argument must not be null");
        this.f6924w = bArr;
    }

    public a0(File file) {
        this.f6923v = 3;
        v6.f.c(file, "Argument must not be null");
        this.f6924w = file;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}
