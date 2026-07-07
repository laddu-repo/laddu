package t9;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i) {
        super(nVar);
        this.f12439e = i;
    }

    @Override // t9.o
    public void q() {
        switch (this.f12439e) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                n nVar = this.f12466b;
                nVar.J = null;
                CheckableImageButton checkableImageButton = nVar.B;
                checkableImageButton.setOnLongClickListener(null);
                u1.c.F(checkableImageButton, null);
                break;
        }
    }
}
