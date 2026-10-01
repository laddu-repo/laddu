package o9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.bumptech.glide.c {
    @Override // com.bumptech.glide.c
    public final void r(v vVar, float f, float f4) {
        float f10 = f4 * f;
        vVar.d(f10, 180.0f, 90.0f);
        double d10 = f10;
        vVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d10));
    }
}
