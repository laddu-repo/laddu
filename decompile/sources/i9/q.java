package i9;

import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends ImageButton {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6584v;

    public final void a(int i, boolean z2) {
        super.setVisibility(i);
        if (z2) {
            this.f6584v = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f6584v;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
