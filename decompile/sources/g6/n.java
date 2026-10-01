package g6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f5686y = {"_data"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f5688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f5689x;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f5687v = i;
        this.f5688w = obj;
        this.f5689x = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f5687v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return File.class;
            default:
                return ((c) this.f5689x).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f5687v;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f5687v;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f5687v) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        Object objWrap;
        switch (this.f5687v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Cursor cursorQuery = ((Context) this.f5688w).getContentResolver().query((Uri) this.f5689x, f5686y, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    cVar.q(new File(string));
                    return;
                }
                cVar.k(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f5689x)));
                return;
            default:
                c cVar2 = (c) this.f5689x;
                byte[] bArr = (byte[]) this.f5688w;
                switch (cVar2.f5653v) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                cVar.q(objWrap);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
