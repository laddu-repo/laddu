package nd;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import androidx.lifecycle.d1;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import od.j0;
import od.k0;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements f.b {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PlaylistsFragment f9675x;

    public /* synthetic */ a0(PlaylistsFragment playlistsFragment) {
        this.f9675x = playlistsFragment;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [he.f, java.lang.Object] */
    @Override // f.b
    public void g(Object obj) {
        Uri data;
        f.a result = (f.a) obj;
        bf.o[] oVarArr = PlaylistsFragment.D0;
        kotlin.jvm.internal.k.e(result, "result");
        int i6 = result.f4587x;
        PlaylistsFragment playlistsFragment = this.f9675x;
        if (i6 == -1) {
            Intent intent = result.f4588y;
            if (intent != null && (data = intent.getData()) != null) {
                try {
                    String str = HttpUrl.FRAGMENT_ENCODE_SET;
                    Cursor query = playlistsFragment.E().getContentResolver().query(data, null, null, null, null);
                    if (query != null) {
                        try {
                            query.moveToFirst();
                            str = query.getString(query.getColumnIndex("_display_name"));
                            kotlin.jvm.internal.k.d(str, "getString(...)");
                            query.close();
                        } finally {
                        }
                    }
                    if (!df.u.z(str, ".m3u", false)) {
                        Toast.makeText(playlistsFragment.F(), "Invalid Playlist File", 0).show();
                        return;
                    }
                    File file = new File(playlistsFragment.E().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str);
                    InputStream openInputStream = playlistsFragment.E().getContentResolver().openInputStream(data);
                    if (openInputStream != null) {
                        e9.f.b(openInputStream, new FileOutputStream(file), 8192);
                    }
                    k0 k0Var = (k0) playlistsFragment.A0.getValue();
                    String uri = Uri.fromFile(file).toString();
                    kotlin.jvm.internal.k.d(uri, "toString(...)");
                    kd.d0 d0Var = new kd.d0(1, str, uri);
                    k0Var.getClass();
                    gf.f0.w(d1.g(k0Var), null, new j0(k0Var, d0Var, null, 1), 3);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Toast.makeText(playlistsFragment.F(), "No file chosen", 0).show();
            return;
        }
        Toast.makeText(playlistsFragment.F(), "No file chosen", 0).show();
    }
}
