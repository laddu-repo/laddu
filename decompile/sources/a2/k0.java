package a2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements w2.e0, c2.m, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0 f295x;

    public k0(n0 n0Var) {
        this.f295x = n0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i10) {
        Surface surface = new Surface(surfaceTexture);
        n0 n0Var = this.f295x;
        n0Var.z1(surface);
        n0Var.f341q0 = surface;
        n0Var.s1(i6, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n0 n0Var = this.f295x;
        n0Var.z1(null);
        n0Var.s1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i10) {
        this.f295x.s1(i6, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i10, int i11) {
        this.f295x.s1(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        n0 n0Var = this.f295x;
        if (n0Var.f344t0) {
            n0Var.z1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        n0 n0Var = this.f295x;
        if (n0Var.f344t0) {
            n0Var.z1(null);
        }
        n0Var.s1(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
