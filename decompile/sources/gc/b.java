package gc;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.v;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.LandscapeActivity;
import com.livxow.tv.activities.PlayerActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h.j f5800w;

    public /* synthetic */ b(h.j jVar, int i) {
        this.f5799v = i;
        this.f5800w = jVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f5799v;
        h.j jVar = this.f5800w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i10 = LandscapeActivity.f3630a0;
                new Handler(Looper.getMainLooper()).postDelayed(new v(16, (LandscapeActivity) jVar), 20L);
                break;
            default:
                int i11 = PlayerActivity.J0;
                new Handler(Looper.getMainLooper()).postDelayed(new h((PlayerActivity) jVar, 5), 20L);
                break;
        }
    }
}
