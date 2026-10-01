package m;

import androidx.media3.decoder.DecoderInputBuffer;
import o.k3;
import p4.v;
import t0.r0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8411m;

    public i(j jVar) {
        this.f8408j = 0;
        this.f8411m = jVar;
        this.f8409k = false;
        this.f8410l = 0;
    }

    @Override // t0.r0
    public final void a() {
        switch (this.f8408j) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.f8410l + 1;
                this.f8410l = i;
                j jVar = (j) this.f8411m;
                if (i == jVar.f8412a.size()) {
                    r0 r0Var = jVar.f8415d;
                    if (r0Var != null) {
                        r0Var.a();
                    }
                    this.f8410l = 0;
                    this.f8409k = false;
                    jVar.f8416e = false;
                }
                break;
            default:
                if (!this.f8409k) {
                    ((k3) this.f8411m).f9199a.setVisibility(this.f8410l);
                }
                break;
        }
    }

    @Override // p4.v, t0.r0
    public void b() {
        switch (this.f8408j) {
            case 1:
                this.f8409k = true;
                break;
        }
    }

    @Override // p4.v, t0.r0
    public final void c() {
        switch (this.f8408j) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (!this.f8409k) {
                    this.f8409k = true;
                    r0 r0Var = ((j) this.f8411m).f8415d;
                    if (r0Var != null) {
                        r0Var.c();
                    }
                    break;
                }
                break;
            default:
                ((k3) this.f8411m).f9199a.setVisibility(0);
                break;
        }
    }

    public i(k3 k3Var, int i) {
        this.f8408j = 1;
        this.f8411m = k3Var;
        this.f8410l = i;
        this.f8409k = false;
    }
}
