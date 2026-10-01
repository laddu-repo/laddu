package o9;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10015a;

    public h(int i) {
        this.f10015a = i;
    }

    @Override // com.bumptech.glide.d
    public final void N(w wVar, float f) {
        i iVar = (i) wVar;
        float[] fArr = iVar.W;
        if (fArr != null) {
            int i = this.f10015a;
            if (fArr[i] != f) {
                fArr[i] = f;
                pa.a aVar = iVar.Y;
                if (aVar != null) {
                    float fI = iVar.i();
                    MaterialButton materialButton = (MaterialButton) aVar.f10443w;
                    int i10 = (int) (fI * 0.11f);
                    if (materialButton.S != i10) {
                        materialButton.S = i10;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final float w(w wVar) {
        float[] fArr = ((i) wVar).W;
        if (fArr != null) {
            return fArr[this.f10015a];
        }
        return 0.0f;
    }
}
