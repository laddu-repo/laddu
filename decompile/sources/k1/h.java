package k1;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.media3.decoder.DecoderInputBuffer;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7271a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f7272b;

    public h(EditText editText) {
        this.f7272b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.j
    public void a() {
        switch (this.f7271a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f7272b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.j
    public final void b() {
        switch (this.f7271a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                i.a((EditText) this.f7272b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f7272b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f7272b = new WeakReference(switchCompat);
    }
}
