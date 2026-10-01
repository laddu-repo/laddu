package o;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9273v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f9275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9276y;

    public q0(TextView textView, Typeface typeface, int i) {
        this.f9275x = textView;
        this.f9276y = typeface;
        this.f9274w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9273v;
        int i10 = this.f9274w;
        View view = this.f9275x;
        Object obj = this.f9276y;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((TextView) view).setTypeface((Typeface) obj, i10);
                break;
            default:
                int i11 = BottomSheetBehavior.f3345g0;
                ((BottomSheetBehavior) obj).E(view, i10, false);
                break;
        }
    }

    public q0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f9276y = bottomSheetBehavior;
        this.f9275x = view;
        this.f9274w = i;
    }
}
