package mc;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.PlayerActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8622w;

    public /* synthetic */ u(int i, Object obj) {
        this.f8621v = i;
        this.f8622w = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f8621v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w wVar = (w) this.f8622w;
                if (wVar.h() != null) {
                    wVar.h().finish();
                    break;
                }
                break;
            case 1:
                ((PlayerActivity) this.f8622w).finish();
                break;
            default:
                ((Activity) ((Context) this.f8622w)).finish();
                break;
        }
    }
}
