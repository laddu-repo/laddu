package i9;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f6583w;

    public /* synthetic */ o(View view, int i) {
        this.f6582v = i;
        this.f6583w = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6582v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                View view = this.f6583w;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                View view2 = this.f6583w;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                break;
        }
    }
}
