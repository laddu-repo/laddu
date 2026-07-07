package gc;

import android.view.View;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.MainActivity;
import mc.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5802v;

    public /* synthetic */ d(int i) {
        this.f5802v = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5802v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = MainActivity.f3631i0;
                break;
            case 1:
                break;
            case 2:
                String string = view.getContext().getString(fc.q.app_name);
                c9.b bVarD = new c9.b(view.getContext(), 0).d("Copyright Alert");
                bVarD.f5918a.f = string + " Does not stream any of the channels included in this Application, all the streaming links are available on third party websites freely on internet. " + string + " just giving way to stream and all content is the copyright of their owner.";
                bVarD.c("OK", null);
                bVarD.a();
                break;
            default:
                vc.a.z(view.getContext());
                break;
        }
    }

    public /* synthetic */ d(w wVar) {
        this.f5802v = 2;
    }

    private final void a(View view) {
    }
}
