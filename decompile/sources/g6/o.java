package g6;

import android.content.Context;
import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5691b;

    public o(Context context, int i) {
        this.f5690a = i;
        switch (i) {
            case 1:
                this.f5691b = context.getApplicationContext();
                break;
            case 2:
                this.f5691b = context.getApplicationContext();
                break;
            default:
                this.f5691b = context;
                break;
        }
    }

    @Override // g6.s
    public final boolean a(Object obj) {
        switch (this.f5690a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return b8.h.B((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return b8.h.B(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return b8.h.B(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, a6.i iVar) {
        Long l10;
        switch (this.f5690a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Uri uri = (Uri) obj;
                return new r(new u6.b(uri), new n(0, this.f5691b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i > 512 || i10 > 384) {
                    return null;
                }
                u6.b bVar = new u6.b(uri2);
                Context context = this.f5691b;
                return new r(bVar, b6.d.c(context, uri2, new b6.c(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i > 512 || i10 > 384 || (l10 = (Long) iVar.c(j6.e0.f6935d)) == null || l10.longValue() != -1) {
                    return null;
                }
                u6.b bVar2 = new u6.b(uri3);
                Context context2 = this.f5691b;
                return new r(bVar2, b6.d.c(context2, uri3, new b6.c(context2.getContentResolver(), 1)));
        }
    }
}
