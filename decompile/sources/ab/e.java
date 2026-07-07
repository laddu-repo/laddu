package ab;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import j5.n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import sa.l;
import sa.q;
import vb.i;
import wb.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f297b;

    public /* synthetic */ e(int i, Object obj) {
        this.f296a = i;
        this.f297b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        wb.e eVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.f296a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f fVar = (f) ((sc.b) this.f297b).f11787x;
                a aVar = (a) fVar.f;
                h hVar = (h) fVar.f299b;
                String str = aVar.f286v;
                ta.c.b();
                try {
                    HashMap mapD = a.d(hVar);
                    xa.a aVar2 = new xa.a();
                    aVar2.f14308v = str;
                    aVar2.f14309w = mapD;
                    aVar2.f14310x = new HashMap();
                    aVar2.d("User-Agent", "Crashlytics Android SDK/20.0.6");
                    aVar2.d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    a.a(aVar2, hVar);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + mapD;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return aVar.e(aVar2.b());
                } catch (IOException e7) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
                    return null;
                }
            case 1:
                return n.d((ByteArrayInputStream) this.f297b, null);
            case 2:
                l lVar = ((q) this.f297b).f11660g;
                lVar.getClass();
                ta.c.a();
                p2.c cVar = lVar.f11631c;
                ya.c cVar2 = (ya.c) cVar.f10197x;
                String str4 = (String) cVar.f10196w;
                cVar2.getClass();
                boolean z2 = true;
                if (new File((File) cVar2.f14650x, str4).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ya.c cVar3 = (ya.c) cVar.f10197x;
                    cVar3.getClass();
                    new File((File) cVar3.f14650x, str4).delete();
                } else {
                    NavigableSet navigableSetC = ((ya.a) lVar.f11639m.f2889c).c();
                    String str5 = navigableSetC.isEmpty() ? null : (String) navigableSetC.first();
                    if (str5 == null || !lVar.f11636j.c(str5)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 3:
                return ((i) this.f297b).a();
            default:
                m mVar = (m) this.f297b;
                synchronized (mVar) {
                    eVarA = null;
                    try {
                        fileInputStreamOpenFileInput = mVar.f14016a.openFileInput(mVar.f14017b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th2) {
                        fileInputStreamOpenFileInput = null;
                        th = th2;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        eVarA = wb.e.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th;
                    }
                    break;
                }
                return eVarA;
        }
    }
}
