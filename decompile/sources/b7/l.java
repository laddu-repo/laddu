package b7;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1562b;

    public /* synthetic */ l(Object obj, int i6) {
        this.f1561a = i6;
        this.f1562b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        nc.g gVar;
        FileInputStream fileInputStream;
        Throwable th;
        switch (this.f1561a) {
            case 0:
                return o.d((ByteArrayInputStream) this.f1562b, null);
            case 1:
                return ((mc.l) this.f1562b).c();
            default:
                nc.p pVar = (nc.p) this.f1562b;
                synchronized (pVar) {
                    gVar = null;
                    try {
                        fileInputStream = pVar.f9671a.openFileInput(pVar.f9672b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        fileInputStream = null;
                        th = th2;
                    }
                    try {
                        int available = fileInputStream.available();
                        byte[] bArr = new byte[available];
                        fileInputStream.read(bArr, 0, available);
                        gVar = nc.g.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStream.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return gVar;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
